package com.hospitalportal.base.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import com.hospitalportal.base.auth.User;
import com.hospitalportal.base.repository.UserRepository;
import com.hospitalportal.base.service.LoginExistsException;
import com.hospitalportal.base.service.UserService;

@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    UserService service;


    @GetMapping("/register")
    public String registerForm(Model model, WebRequest request){
        User user = new User();
        model.addAttribute("userentity", user);
        return "signinPage";
    }

    @PostMapping("/register")
    public ModelAndView registerUserAccount(@ModelAttribute("userentity") @Valid User user,
                                            BindingResult result, WebRequest request, Errors errors){

        User registered = new User();
        if(!result.hasErrors()){
            registered = createUserAccount(user, result); //java:61
        }
        if(registered == null){
            result.rejectValue("login", "message.regError");
        }
        if(result.hasErrors()){
            return  new ModelAndView("signinPage", "userentity", user);
        }
        else{
            return new ModelAndView("homePage", "userentity", user);
        }
    }
    
    	@GetMapping("/login")
    	public User authenicate(String login, String password){
    		return userRepository.findByLoginAndPassword(login, password).orElse(null);
    }
    

    private User createUserAccount(@Valid User accountDto, BindingResult result) {
        User registered = null;
        try{
            registered = service.registerNewUserAccount(accountDto); //java:78
        }catch (LoginExistsException e) {
            return null;
        }
        return registered;
    }
}