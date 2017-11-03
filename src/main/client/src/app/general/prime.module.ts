import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {DataTableModule, InputTextModule, SharedModule} from 'primeng/primeng';

@NgModule({
  imports: [
    CommonModule,
    SharedModule,
    DataTableModule,
    InputTextModule
  ],
  exports: [
    SharedModule,
    DataTableModule,
    InputTextModule
  ],
  declarations: []
})
export class PrimeModule {
}
