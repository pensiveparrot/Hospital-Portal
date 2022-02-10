import { Component, OnInit } from '@angular/core';
import { PatientloginserviceService } from '../patientloginservice.service';
import { Patient } from './patient';
import {Router} from '@angular/router';
import { FormsModule } from '@angular/forms';
import { PatientDetailsComponent } from '../patientdetails/patientdetails.component';
import { PatientService } from '../patientservice.service';
import { PatientPortal } from '../patientportal';

@Component({
  selector: 'app-patient-login',
  templateUrl: './patient-login.component.html',
  styleUrls: ['./patient-login.component.css']
})
export class PatientLoginComponent implements OnInit {

  patient:Patient = new Patient();
 patientportal:PatientPortal=new PatientPortal();
  constructor(private patientloginservice:PatientloginserviceService,private route:Router, private myForm:FormsModule,private patientportalservice:PatientService) { }

  ngOnInit(): void {
  }
patientlogin(id:bigint){
  console.log(this.patient);
 

  this.patientloginservice.loginPatient(this.patient).subscribe(data=>(this.route.navigate(['api/patient/patientportal/:id'])),error=>console.log('error'));
  //this.patientloginservice.loginPatient(this.patient).subscribe(data=>(this.route.navigate(['api/patient/patientportal/1'])),error=>console.log('error'));
  // .subscribe(data=>{alert("logged in successfully")},error=>{alert("error with id or pass, try again")});
  // this.patientloginservice.loginPatient(this.patient).subscribe(this.patientportalservice.getPatientPortalById(this.patientportal.id)
  // data:(this.patientportalservice.getPatientPortalById(this.patientportal.id)));

}
}
// ["patientportal-details/:id",this.patientportalservice.getPatientPortalById(this.patientportal.id)]
// data=>{},error=>{alert("error with id or pass, try again")}
// this.route.navigate(['patientportal-details/:id']
// <a routerLink="['patientportal-details/:id']" routerLinkActive="active">

// @Component({
//   selector: 'app-patient-login',
//   templateUrl: './patient-login.component.html',
//   styleUrls: ['./patient-login.component.css']
// })
// export class PatientLoginComponent implements OnInit {

//   patient:Patient = new Patient();
//  patientportal:PatientPortal=new PatientPortal();
//   constructor(private patientloginservice:PatientloginserviceService,private route:Router, private myForm:FormsModule,private patientportalservice:PatientService) { }

//   ngOnInit(): void {
//   }
// patientlogin(id:bigint){
//   console.log(this.patient);
 

//   this.patientloginservice.loginPatient(this.patient).subscribe(data=>(this.route.navigate(['api/patient/patientportal/1'])),error=>console.log('error'));
//   // .subscribe(data=>{alert("logged in successfully")},error=>{alert("error with id or pass, try again")});
//   // this.patientloginservice.loginPatient(this.patient).subscribe(this.patientportalservice.getPatientPortalById(this.patientportal.id)
//   // data:(this.patientportalservice.getPatientPortalById(this.patientportal.id)));

// }