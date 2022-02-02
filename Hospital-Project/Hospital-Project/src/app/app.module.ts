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
import {  HttpClientModule } from '@angular/common/http'
@NgModule({
  declarations: [
    AppComponent,
    AdminLoginComponent,
    EmployeeLoginComponent,
    PatientLoginComponent,
    NgIfElseComponent,
    NgIfSimpleComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,FormsModule,HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
