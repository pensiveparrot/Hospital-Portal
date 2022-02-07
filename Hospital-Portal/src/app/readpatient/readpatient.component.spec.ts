import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ReadpatientComponent } from './readpatient.component';

describe('ReadpatientComponent', () => {
  let component: ReadpatientComponent;
  let fixture: ComponentFixture<ReadpatientComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ReadpatientComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ReadpatientComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
