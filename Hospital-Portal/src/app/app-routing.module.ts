import { NgModule } from '@angular/core';
import { Router, RouterModule, Routes } from '@angular/router';
import { CreatePatientportalComponent } from './createpatient/createpatient.component';
import { UpdatepatientComponent } from './updatepatient/updatepatient.component';
import { DeletepatientComponent } from './deletepatient/deletepatient.component';
import { ReadpatientComponent } from './readpatient/readpatient.component';
import { PatientDetailsComponent } from './patientdetails/patientdetails.component';
import { PatientlistComponent } from './patientlist/patientlist.component'
import { PatientLoginComponent } from './patient-login/patient-login.component';
import { PatientregisterComponent } from './patientregister/patientregister.component';

const routes: Routes = [ {path: 'listpatient', component: PatientlistComponent},
{path: 'create-patientportal', component: CreatePatientportalComponent},
{path: 'update-patientportal', component: UpdatepatientComponent},
{path: 'update-patientportal/:id', component: UpdatepatientComponent},
{path: 'api/patient/patientportal/:id', component: PatientDetailsComponent},{path: 'api/auth/patient/login', component: PatientLoginComponent
},{path: 'api/auth/patient/register', component: PatientregisterComponent
}];
// ng-if-patient-details
//
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { 

}
