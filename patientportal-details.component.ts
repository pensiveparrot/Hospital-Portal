import { Component, OnInit } from '@angular/core';
import { PatientPortal } from '../patientportal';
import { ActivatedRoute } from '@angular/router';
import { PatientportalService } from '../patientportal.service';

@Component({
  selector: 'app-patientportal-details',
  templateUrl: './patientportal-details.component.html',
  styleUrls: ['./patientportal-details.component.css']
})
export class PatientportalDetailsComponent implements OnInit {

  id: number;
  patientportal: PatientPortal;

  constructor(private route: ActivatedRoute, private patientportalService: PatientportalService) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];

    this.patientportal = new PatientPortal();
    this.patientportalService.getPatientPortalById(this.id).subscribe(data => {
      this.patientportal = data;
    });
  }

}
