import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'ng-if-else',
  template: `
    <button (click)="show = !show">{{show ? 'show' : 'hide'}}</button>
    show = {{!show}}
    <br>
    <div *ngIf="show; else elseBlock"><app-admin-login></app-admin-login></div>
    <ng-template #elseBlock><app-employee-login></app-employee-login></ng-template>
`
})
export class NgIfElseComponent {
  show = true;
}
