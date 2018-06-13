import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SearchempmgrComponent } from './searchempmgr.component';

describe('SearchempmgrComponent', () => {
  let component: SearchempmgrComponent;
  let fixture: ComponentFixture<SearchempmgrComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SearchempmgrComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SearchempmgrComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
