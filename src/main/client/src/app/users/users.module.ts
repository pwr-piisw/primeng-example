import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {PrimeModule} from '../general/prime.module';
import {UsersListComponent} from './users-list/users-list.component';
import {UsersMgmtComponent} from './users-mgmt/users-mgmt.component';
import {DataTableModule, SharedModule} from 'primeng/primeng';

@NgModule({
  imports: [
    CommonModule,
    PrimeModule
  ],
  exports: [
    UsersMgmtComponent
  ],
  declarations: [
    UsersListComponent,
    UsersMgmtComponent
  ]
})
export class UsersModule {
}
