import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'ng-if-simple',
  template: `
    <button (click)="show = !show">{{show ? 'show' : 'hide'}}</button>
    show = {{!show}}
    <br>
    <div *ngIf="!show"><app-patient-login></app-patient-login></div>
`
})
export class NgIfSimpleComponent {
  show = true;
}