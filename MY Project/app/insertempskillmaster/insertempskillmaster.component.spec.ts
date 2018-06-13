import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { InsertempskillmasterComponent } from './insertempskillmaster.component';

describe('InsertempskillmasterComponent', () => {
  let component: InsertempskillmasterComponent;
  let fixture: ComponentFixture<InsertempskillmasterComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ InsertempskillmasterComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(InsertempskillmasterComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
