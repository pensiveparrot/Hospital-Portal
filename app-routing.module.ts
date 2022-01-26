import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CreatePatientportalComponent } from './create-patientportal/create-patientportal.component';
import { PatientportalListComponent } from './patientportal-list/patientportal-list.component';
import { UpdatePatientportalComponent } from './update-patientportal/update-patientportal.component';
import { PatientportalDetailsComponent } from './patientportal-details/patientportal-details.component';

const routes: Routes = [
  {path: 'patientportal', component: PatientportalListComponent},
  {path: 'create-patientportal', component: CreatePatientportalComponent},
  {path: '', redirectTo: 'patientportal', pathMatch: 'full'},
  {path: 'update-patientportal/:id', component: UpdatePatientportalComponent},
  {path: 'patientportal-details/:id', component: PatientportalDetailsComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
