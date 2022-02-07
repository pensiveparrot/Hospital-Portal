import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { AdminLoginComponent } from './admin-login/admin-login.component';
import { EmployeeLoginComponent } from './employee-login/employee-login.component';
import { PatientLoginComponent } from './patient-login/patient-login.component';
import { NgIfElseComponent } from './ng-if-else/ng-if-else.component';
import { NgIfSimpleComponent } from './ng-if-simple/ng-if-simple.component';
import { FormsModule } from '@angular/forms';
import {  HttpClientModule } from '@angular/common/http';
import { CreatePatientportalComponent } from './createpatient/createpatient.component';
import { UpdatepatientComponent } from './updatepatient/updatepatient.component';
import { DeletepatientComponent } from './deletepatient/deletepatient.component';
import { ReadpatientComponent } from './readpatient/readpatient.component';
import { PatientDetailsComponent } from './patientdetails/patientdetails.component';
import { PatientlistComponent } from './patientlist/patientlist.component';
import { PatientregisterComponent } from './patientregister/patientregister.component';

@NgModule({
  declarations: [
    AppComponent,
    AdminLoginComponent,
    EmployeeLoginComponent,
    PatientLoginComponent,
    NgIfElseComponent,
    NgIfSimpleComponent,
    CreatePatientportalComponent,
    UpdatepatientComponent,
    DeletepatientComponent,
    ReadpatientComponent,
    PatientDetailsComponent,
    PatientDetailsComponent,
    PatientlistComponent,
    PatientregisterComponent,
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,FormsModule,HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
