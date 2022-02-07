import { Component, OnInit } from '@angular/core';
import { PatientPortal } from '../patientportal';
import { PatientService } from '../patientservice.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-create-patient',
  templateUrl: './createpatient.component.html',
  styleUrls: ['./createpatient.component.css']
})
export class CreatePatientportalComponent implements OnInit {

  patientportal: PatientPortal = new PatientPortal();

  constructor(private patientservice: PatientService, private router: Router) { }

  ngOnInit(): void {
  }

  savePatientPortal(){
    this.patientservice.createPatientPortal(this.patientportal).subscribe(data => {
      console.log(data);
      this.goToPatientPortalList();
    }, error => console.log(error));
  }

  goToPatientPortalList(){
    this.router.navigate(['/patientportal']);
  }

  onSubmit(){
    console.log(this.patientportal);
    this.savePatientPortal();
  }

}
