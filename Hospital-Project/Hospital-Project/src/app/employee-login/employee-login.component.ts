import { Component, OnInit } from '@angular/core';
import { EmployeeloginserviceService } from '../employeeloginservice.service';
import { Employee } from './employee';

@Component({
  selector: 'app-employee-login',
  templateUrl: './employee-login.component.html',
  styleUrls: ['./employee-login.component.css']
})
export class EmployeeLoginComponent implements OnInit {
  employee:Employee = new Employee();
  constructor(private employeeloginservice:EmployeeloginserviceService) { }

  ngOnInit(): void {
  }
  employeelogin(){
    console.log(this.employee);
    this.employeeloginservice.loginEmployee(this.employee).subscribe(data=>{alert("logged in successfully")},error=>{alert("error with id or pass, try again")});
  }
}
