import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NgIfSimpleComponent } from './ng-if-simple.component';

describe('NgIfSimpleComponent', () => {
  let component: NgIfSimpleComponent;
  let fixture: ComponentFixture<NgIfSimpleComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NgIfSimpleComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(NgIfSimpleComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
