import {async, ComponentFixture, TestBed} from '@angular/core/testing';

import {UsersListComponent} from './users-list.component';
import {PrimeModule} from '../../general/prime.module';

describe('UsersListComponent', () => {
  let component: UsersListComponent;
  let fixture: ComponentFixture<UsersListComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      imports: [PrimeModule],
      declarations: [UsersListComponent]
    })
      .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UsersListComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
