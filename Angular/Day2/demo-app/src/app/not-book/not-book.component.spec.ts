import { ComponentFixture, TestBed } from '@angular/core/testing';

import { NotBookComponent } from './not-book.component';

describe('NotBookComponent', () => {
  let component: NotBookComponent;
  let fixture: ComponentFixture<NotBookComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ NotBookComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(NotBookComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
