import {async, ComponentFixture, TestBed} from '@angular/core/testing';

import {UsersMgmtComponent} from './users-mgmt.component';
import {UsersListComponent} from '../users-list/users-list.component';
import {PrimeModule} from '../../general/prime.module';

describe('UsersMgmtComponent', () => {
  let component: UsersMgmtComponent;
  let fixture: ComponentFixture<UsersMgmtComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      imports: [PrimeModule],
      declarations: [UsersMgmtComponent, UsersListComponent]
    })
      .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(UsersMgmtComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should be created', () => {
    expect(component).toBeTruthy();
  });
});
