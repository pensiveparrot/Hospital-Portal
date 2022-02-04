import { ComponentFixture, TestBed } from '@angular/core/testing';

import { CreatePatientportalComponent } from './createpatient.component';

describe('CreatePatientportalComponent', () => {
  let component: CreatePatientportalComponent;
  let fixture: ComponentFixture<CreatePatientportalComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ CreatePatientportalComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(CreatePatientportalComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
