import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {PrimeModule} from '../general/prime.module';
import {UsersListComponent} from './users-list/users-list.component';
import {UsersMgmtComponent} from './users-mgmt/users-mgmt.component';
import {UserEditComponent} from './user-edit/user-edit.component';
import {FormsModule} from '@angular/forms';

@NgModule({
  imports: [
    CommonModule,
    PrimeModule,
    FormsModule
  ],
  exports: [
    UsersMgmtComponent
  ],
  declarations: [
    UsersListComponent,
    UsersMgmtComponent,
    UserEditComponent
  ]
})
export class UsersModule {
}
