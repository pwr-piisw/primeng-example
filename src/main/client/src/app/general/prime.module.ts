import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {DataTableModule, SharedModule} from 'primeng/primeng';

@NgModule({
  imports: [
    CommonModule,
    SharedModule,
    DataTableModule
  ],
  exports: [
    SharedModule,
    DataTableModule
  ],
  declarations: []
})
export class PrimeModule {
}
