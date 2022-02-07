import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';
import { Patient } from '../patient-login/patient'
import { PatientloginserviceService } from '../patientloginservice.service';
import { PatientService } from '../patientservice.service';

@Component({
  selector: 'app-patientregister',
  templateUrl: './patientregister.component.html',
  styleUrls: ['./patientregister.component.css']
})
export class PatientregisterComponent implements OnInit {
  patient:Patient = new Patient();
    constructor(private patientloginservice:PatientloginserviceService,private route:Router, private myForm:FormsModule,private patientportalservice:PatientService) { }
  ngOnInit(): void {
  }
  patientregister(id:string)
  {
    // console.log(this.patientloginservice.registerpatient(this.patient.patientId,this.patient.password));
   
  
    this.patientloginservice.registerpatient(this.patient.patientId,this.patient.password,this.patient).subscribe(data=>(this.route.navigate(['api/patient/patientportal/:id'])),error=>console.log('error'));
}
}