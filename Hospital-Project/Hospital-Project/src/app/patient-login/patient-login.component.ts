import { Component, OnInit } from '@angular/core';
import { PatientloginserviceService } from '../patientloginservice.service';
import { Patient } from './patient';

@Component({
  selector: 'app-patient-login',
  templateUrl: './patient-login.component.html',
  styleUrls: ['./patient-login.component.css']
})
export class PatientLoginComponent implements OnInit {

  patient:Patient = new Patient();
  constructor(private patientloginservice:PatientloginserviceService) { }

  ngOnInit(): void {
  }
patientlogin(){
  console.log(this.patient);
  this.patientloginservice.loginPatient(this.patient).subscribe(data=>{alert("logged in successfully")},error=>{alert("error with id or pass, try again")});

}
}
