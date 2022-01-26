import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PatientportalListComponent } from './patientportal-list.component';

describe('PatientportalListComponent', () => {
  let component: PatientportalListComponent;
  let fixture: ComponentFixture<PatientportalListComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ PatientportalListComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(PatientportalListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
