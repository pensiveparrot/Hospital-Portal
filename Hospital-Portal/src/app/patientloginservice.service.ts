import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Patient } from './patient-login/patient';
import { PatientPortal } from './patientportal';

@Injectable({
  providedIn: 'root'
})
export class PatientloginserviceService {
  private baseURL="http://localhost:8081/api/auth/patient/login";
  private baseRegisterURL="http://localhost:8081/api/auth/patient/register"; // private baseURL="http://localhost:8081/api/auth/patient";

  constructor(private httpClient: HttpClient) { }

  // getPatientPortalById(id: number): Observable<PatientPortal>{
  //   return this.httpClient.get<PatientPortal>(`${this.baseURL}/${id}`);
  // }
  loginPatient(patient:Patient): Observable<object>{
    console.log(patient);
    return this.httpClient.post(`${this.baseURL}`,patient);
  }
  registerpatient(id:string,password:string,patientappttime:Date,patientappttype:String,patientapptsummary:String,patient:Patient): Observable<object>{
    return this.httpClient.post(`${this.baseRegisterURL}/${id}${password}${patientappttime}${patientappttype}${patientapptsummary}`,patient);
  }
}
