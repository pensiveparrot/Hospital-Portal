import { Component, OnInit } from '@angular/core';
import { PatientPortal } from '../patientportal';
import { PatientportalService } from '../patientportal.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-create-patientportal',
  templateUrl: './create-patientportal.component.html',
  styleUrls: ['./create-patientportal.component.css']
})
export class CreatePatientportalComponent implements OnInit {

  patientportal: PatientPortal = new PatientPortal();

  constructor(private patientPortalService: PatientportalService, private router: Router) { }

  ngOnInit(): void {
  }

  savePatientPortal(){
    this.patientPortalService.createPatientPortal(this.patientportal).subscribe(data => {
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
