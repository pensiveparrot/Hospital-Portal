import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Injectable({
    providedIn: 'root'
  })
  export class SchedulerService{
      constructor(private http:HttpClient){}
      rootURL='/api';
      getAppointments()
      {
          return this.http.get(this.rootURL+'/appointment')
      }
      addAppointment(appointment:any, id:number)
      {
        appointment.id = id;
        return this.http.post(this.rootURL + '/appointment', appointment);

      }
      

  }