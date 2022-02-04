import { Component, OnInit } from '@angular/core';
import { Admin } from './admin';
import { AdminloginserviceService } from '../adminloginservice.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-admin-login',
  templateUrl: './admin-login.component.html',
  styleUrls: ['./admin-login.component.css']
})
export class AdminLoginComponent implements OnInit {

  admin:Admin = new Admin();
  constructor(private adminloginservice:AdminloginserviceService,private route:Router) { }

  ngOnInit(): void {
  }
  adminlogin(){
    console.log(this.admin);
    this.adminloginservice.loginAdmin(this.admin).subscribe(data=>{alert("logged in successfully")},error=>{alert("error with id or pass, try again")});

  }

}
