import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Patient } from './patient-login/patient';

@Injectable({
  providedIn: 'root'
})
export class PatientloginserviceService {
  private baseURL="http://localhost:8081/api/auth/patient/login";

  constructor(private httpClient: HttpClient) { }


  loginPatient(patient:Patient): Observable<object>{
    console.log(patient);
    return this.httpClient.post(`${this.baseURL}`,patient);
  }
}
