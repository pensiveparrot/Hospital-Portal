import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Observable } from 'rxjs'
import { PatientPortal } from './patientportal';

@Injectable({
  providedIn: 'root'
})
export class PatientportalService {

  private baseURL = "http://localhost:8080/api/patientportal";

  constructor(private httpClient: HttpClient) { }

  getPatientPortalList(): Observable<PatientPortal[]> {
    return this.httpClient.get<PatientPortal[]>(`${this.baseURL}`);
  }

  createPatientPortal(patientportal: PatientPortal): Observable<Object>{
    return this.httpClient.post<Object>(`${this.baseURL}`, patientportal);
  }

  getPatientPortalById(id: number): Observable<PatientPortal>{
    return this.httpClient.get<PatientPortal>(`${this.baseURL}/{id}`);
  }

  updatePatientPortal(id: number, patientportal: PatientPortal): Observable<Object>{
    return this.httpClient.put(`${this.baseURL}/{id}`, patientportal);
  }

  deletePatientPortal(id: number): Observable<Object>{
    return this.httpClient.delete(`${this.baseURL}/{id}`);
  }
}
