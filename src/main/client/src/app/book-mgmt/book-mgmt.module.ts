import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {BookDetailsComponent} from './book-details/book-details.component';
import {BookOverviewComponent} from './book-overview/book-overview.component';
import {FormsModule} from '@angular/forms';
import {RouterModule} from '@angular/router';
import { FooComponent } from './foo/foo.component';

@NgModule({
  imports: [
    CommonModule,
    FormsModule,
    RouterModule
  ],
  declarations: [BookDetailsComponent, BookOverviewComponent, FooComponent]
})
export class BookMgmtModule {
}
