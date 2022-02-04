import { TestBed } from '@angular/core/testing';

import { PatientService } from './patientservice.service';

describe('PatientserviceService', () => {
  let service: PatientService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PatientService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
