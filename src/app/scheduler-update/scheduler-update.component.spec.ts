import { ComponentFixture, TestBed } from '@angular/core/testing';

import { SchedulerUpdateComponent } from './scheduler-update.component';

describe('SchedulerUpdateComponent', () => {
  let component: SchedulerUpdateComponent;
  let fixture: ComponentFixture<SchedulerUpdateComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ SchedulerUpdateComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(SchedulerUpdateComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
