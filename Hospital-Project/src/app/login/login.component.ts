import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import {  HttpClient } from '@angular/common/http';
import { Employee } from './employee';
import { map } from "rxjs/operators"; 
import { Observable } from 'rxjs';

@Component({
  selector: 'app-login',
  templateUrl:'./login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  employee_id= 'employee_id'
  id = 'patient_id'
  id3 = 'admin_id'
  password = ''
  invalidLogin = false

  constructor(private router: Router,
    private http: HttpClient,private emodel: Employee) { }

  ngOnInit() {
    sessionStorage.setItem('token', '');
  }
  login(){
    let url = 'http://localhost:8082/login';
    let result = this.http.post<Observable<boolean>>(url, {
      userName: this.emodel.employee_id,
      password: this.emodel.password
  }).subscribe(isValid => {
      if (isValid) {
          sessionStorage.setItem(
            'token', 
            btoa(this.emodel.employee_id + ':' + this.emodel.password)
          );
    this.router.navigate(['']);
      } else {
          alert("Authentication failed.")
      }
  });
}

}