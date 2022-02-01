import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
<<<<<<< Updated upstream:src/app/app.module.ts

@NgModule({
  declarations: [
    AppComponent
=======
import { LoginComponent } from './login/login.component';
import { FormsModule } from '@angular/forms';
import { SchedulerportalComponent } from './schedulerportal/schedulerportal.component';
@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    SchedulerportalComponent,
>>>>>>> Stashed changes:Hospital-Project/src/app/app.module.ts
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
