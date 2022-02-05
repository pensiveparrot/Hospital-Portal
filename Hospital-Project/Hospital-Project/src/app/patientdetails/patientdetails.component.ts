import { Component, OnInit } from '@angular/core';
import { PatientPortal } from '../patientportal';
import { ActivatedRoute } from '@angular/router';
import { PatientService } from '../patientservice.service';

@Component({
  selector: 'app-patientportal-details',
  templateUrl: './patientdetails.component.html',
  styleUrls: ['./patientdetails.component.css']
})
export class PatientDetailsComponent implements OnInit {

  id!: number;
  patientportal!: PatientPortal;

  constructor(private route: ActivatedRoute, private patientportalservice: PatientService) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];

    this.patientportal = new PatientPortal();
    this.patientportalservice.getPatientPortalById(1).subscribe(data => {
      this.patientportal = data;
    });
  }

}
