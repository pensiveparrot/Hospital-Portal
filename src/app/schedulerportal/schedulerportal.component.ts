import { Component, OnInit,OnDestroy } from '@angular/core';
import { FormGroup, FormControl, Validators } from '@angular/forms';
import { takeUntil } from 'rxjs/operators';
import { SchedulerService } from '../scheduler.service';
import { Subject } from 'rxjs';

export interface schedulerPortalInfo
{
  id:number;
  apptName:string;
  apptType:string;
  paitentID:number;
  apptDate:Date;
  summary:string;
  confirmed:string;
  
}
@Component({
  selector: 'app-schedulerportal',
  templateUrl: './schedulerportal.component.html',
  styleUrls: ['./schedulerportal.component.css']
})
export class SchedulerportalComponent implements OnInit , OnDestroy{

  constructor( service:SchedulerService ) { }

  apptForm=new FormGroup({
    id:new FormControl('',Validators.required),
    apptName:new FormControl('',Validators.required),
    paitentID:new FormControl('',Validators.required),
    apptDate:new FormControl('', Validators.required),
    summary:new FormControl('', Validators.required ) 

  });
  appts:any[]=[];
  apptsCount=0;
  destroy$: Subject<boolean> = new Subject<boolean>();
  onSubmit()
  {
    this.service.addAppointment(this.apptForm,this.apptsCount+1).pipe(takeUntil this.destroy$)).subscribe(data=>{
      this.apptsCount=this.apptsCount+1;
      this.apptForm.reset();
      
    })
  }
  getAllAppts()
  {
    this.service.getAppointments().pipe(takeUntil(this.destroy$)).subscribe((users:any[])=>{
      this.apptsCount=appts.length();
      this.appts=this.appts;
    })
  }
  ngOnInit(): void {
    
  }
ngOnDestroy(): void {
    this.destroy$.next(true);
    this.destroy$.unsubscribe()
}
}
