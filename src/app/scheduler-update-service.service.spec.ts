import { TestBed } from '@angular/core/testing';

import { SchedulerUpdateServiceService } from './scheduler-update-service.service';

describe('SchedulerUpdateServiceService', () => {
  let service: SchedulerUpdateServiceService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(SchedulerUpdateServiceService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
