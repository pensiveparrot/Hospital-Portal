import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Admin } from './admin-login/admin';

@Injectable({
  providedIn: 'root'
})
export class AdminloginserviceService {
  private baseURL="http://localhost:8081/api/auth/admin/login";

  constructor(private httpClient: HttpClient) { }


  loginAdmin(admin:Admin): Observable<object>{
    console.log(admin);
    return this.httpClient.post(`${this.baseURL}`,admin);
  }
}
