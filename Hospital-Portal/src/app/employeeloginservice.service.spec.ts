import { TestBed } from '@angular/core/testing';

import { EmployeeloginserviceService } from './employeeloginservice.service';

describe('EmployeeloginserviceService', () => {
  let service: EmployeeloginserviceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(EmployeeloginserviceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
