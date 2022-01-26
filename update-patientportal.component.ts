import { Component, OnInit } from '@angular/core';
import { PatientportalService } from '../patientportal.service';
import { ActivatedRoute, Router } from '@angular/router';
import { PatientPortal } from '../patientportal';


@Component({
  selector: 'app-update-patientportal',
  templateUrl: './update-patientportal.component.html',
  styleUrls: ['./update-patientportal.component.css']
})
export class UpdatePatientportalComponent implements OnInit {

  id: number;
  patientportal: PatientPortal;

  constructor(private route: ActivatedRoute, private patientportalService: PatientportalService, private router: Router) { }

  ngOnInit(): void {
    this.id = this.route.snapshot.params['id'];

    this.patientportalService.getPatientPortalById(this.id).subscribe(data => {
      this.patientportal = data;
    }, error => console.log(error));
  }

  onSubmit(){
    this.patientportalService.updatePatientPortal(this.id, this.patientportal).subscribe(data => {
      this.goToPatientPortalList();
    }, error => console.log(error));
  }

  goToPatientPortalList(){
    this.router.navigate(['/patientportal']);
  }

}
