import { TestBed, inject } from '@angular/core/testing';

import { HrserviceService } from './hrservice.service';

describe('HrserviceService', () => {
  beforeEach(() => {
    TestBed.configureTestingModule({
      providers: [HrserviceService]
    });
  });

  it('should be created', inject([HrserviceService], (service: HrserviceService) => {
    expect(service).toBeTruthy();
  }));
});
