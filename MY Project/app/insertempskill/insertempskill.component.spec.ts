import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { InsertempskillComponent } from './insertempskill.component';

describe('InsertempskillComponent', () => {
  let component: InsertempskillComponent;
  let fixture: ComponentFixture<InsertempskillComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ InsertempskillComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(InsertempskillComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
