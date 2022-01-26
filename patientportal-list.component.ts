import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { PatientPortal } from '../patientportal';
import { PatientportalService } from '../patientportal.service';


@Component({
  selector: 'app-patientportal-list',
  templateUrl: './patientportal-list.component.html',
  styleUrls: ['./patientportal-list.component.css']
})
export class PatientportalListComponent implements OnInit {

  patientportals: PatientPortal[];


  constructor(private patientportalService:  PatientportalService, private router: Router) { }

  ngOnInit(): void {
    this.getPatientPortal();
  }

  private getPatientPortal(){
    this.patientportalService.getPatientPortalList().subscribe(data => {
      this.patientportals = data;
    });
  }

  patientPortalDetails(id: number){
    this.router.navigate(['patientportal-detials', id]);
  }

  updatePatientPortal(id: number){
    this.router.navigate(['update-patientportal', id]);
  }

  deletePatientPortal(id: number){
    this.patientportalService.deletePatientPortal(id).subscribe(data => {
      console.log(data);
      this.getPatientPortal();
    })
  }

}
