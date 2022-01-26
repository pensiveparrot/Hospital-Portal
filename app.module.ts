import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { CreatePatientportalComponent } from './create-patientportal/create-patientportal.component';
import { UpdatePatientportalComponent } from './update-patientportal/update-patientportal.component';
import { PatientportalListComponent } from './patientportal-list/patientportal-list.component';
import { PatientportalDetailsComponent } from './patientportal-details/patientportal-details.component';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';

@NgModule({
  declarations: [
    AppComponent,
    CreatePatientportalComponent,
    UpdatePatientportalComponent,
    PatientportalListComponent,
    PatientportalDetailsComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
