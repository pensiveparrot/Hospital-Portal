import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdatePatientportalComponent } from './update-patientportal.component';

describe('UpdatePatientportalComponent', () => {
  let component: UpdatePatientportalComponent;
  let fixture: ComponentFixture<UpdatePatientportalComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ UpdatePatientportalComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(UpdatePatientportalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
