import { TestBed } from '@angular/core/testing';

import { PatientloginserviceService } from './patientloginservice.service';

describe('PatientloginserviceService', () => {
  let service: PatientloginserviceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(PatientloginserviceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
