import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SchedulerportalComponent } from './schedulerportal.component';

describe('SchedulerportalComponent', () => {
  let component: SchedulerportalComponent;
  let fixture: ComponentFixture<SchedulerportalComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SchedulerportalComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SchedulerportalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
