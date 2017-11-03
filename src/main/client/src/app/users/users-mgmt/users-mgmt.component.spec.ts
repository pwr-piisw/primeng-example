import {async, ComponentFixture, TestBed} from '@angular/core/testing';

import {UsersMgmtComponent} from './users-mgmt.component';
import {UsersListComponent} from '../users-list/users-list.component';
import {PrimeModule} from '../../general/prime.module';
import {UserEditComponent} from '../user-edit/user-edit.component';
import {FormsModule} from '@angular/forms';

describe('UsersMgmtComponent', () => {
  let component: UsersMgmtComponent;
  let fixture: ComponentFixture<UsersMgmtComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      imports: [PrimeModule, FormsModule],
      declarations: [UsersMgmtComponent, UsersListComponent, UserEditComponent]
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
