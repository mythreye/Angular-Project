import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdateskillmasterComponent } from './updateskillmaster.component';

describe('UpdateskillmasterComponent', () => {
  let component: UpdateskillmasterComponent;
  let fixture: ComponentFixture<UpdateskillmasterComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ UpdateskillmasterComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UpdateskillmasterComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
