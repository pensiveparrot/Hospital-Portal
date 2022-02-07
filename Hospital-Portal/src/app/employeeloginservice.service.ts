import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Employee } from './employee-login/employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeloginserviceService {
  private baseURL="http://localhost:8081/api/auth/employee/login";

  constructor(private httpClient: HttpClient) { }


  loginEmployee(employee:Employee): Observable<object>{
    console.log(employee);
    return this.httpClient.post(`${this.baseURL}`,employee);
  }
}
