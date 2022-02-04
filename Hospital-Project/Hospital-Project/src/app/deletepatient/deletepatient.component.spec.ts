import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DeletepatientComponent } from './deletepatient.component';

describe('DeletepatientComponent', () => {
  let component: DeletepatientComponent;
  let fixture: ComponentFixture<DeletepatientComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ DeletepatientComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(DeletepatientComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
