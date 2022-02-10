import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';
import { Patient } from '../patient-login/patient'
import { PatientloginserviceService } from '../patientloginservice.service';
import { PatientPortal } from '../patientportal';
// import { PatientPortal } from '../patientportal';
@Component({
  selector: 'app-patientregister',
  templateUrl: './patientregister.component.html',
  styleUrls: ['./patientregister.component.css']
})
export class PatientregisterComponent implements OnInit {
  patient:Patient = new Patient();
  id!: number;
  patientportal:PatientPortal = new PatientPortal();

  // patientportal:PatientPortal=new PatientPortal();
    constructor(private patientloginservice:PatientloginserviceService,private route:Router, private myForm:FormsModule) { }
  ngOnInit(): void {
    // this.id = this.route.snapshot.params['id'];

    // this.patientportalservice.getPatientPortalById(this.id).subscribe(data => {
      // this.patientportal = data;
  }
  patientregister(id:string)
  {
    // console.log(this.patientloginservice.registerpatient(this.patient.patientId,this.patient.password));
   
  
    this.patientloginservice.registerpatient(this.patient.patientId,this.patient.password,this.patientportal.appointmentTime,this.patientportal.appointmentType,this.patientportal.summary,this.patient).subscribe(data=>(this.route.navigate(['api/patient/patientportal/:id'])),error=>console.log('error'));
}
}