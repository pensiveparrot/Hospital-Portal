import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PatientportalDetailsComponent } from './patientportal-details.component';

describe('PatientportalDetailsComponent', () => {
  let component: PatientportalDetailsComponent;
  let fixture: ComponentFixture<PatientportalDetailsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PatientportalDetailsComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PatientportalDetailsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
