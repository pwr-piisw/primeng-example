import {Routes} from "@angular/router";
import {BookOverviewComponent} from "./book-mgmt/book-overview/book-overview.component";
import {BookDetailsComponent} from "./book-mgmt/book-details/book-details.component";
import {FooComponent} from './book-mgmt/foo/foo.component';

export const APP_ROUTES: Routes = [
  {
    path: 'app',
    children: [
      {
        path: 'books',
        component: BookOverviewComponent
      },
      {
        path: 'book',
        component: BookDetailsComponent
      },
      {
        path: 'book/:bookId',
        component: BookDetailsComponent
      },
      {
        path: 'foo',
        component: FooComponent
      }
    ]
  },
  {
    path: '',
    redirectTo: '/app/books',
    pathMatch: 'full'
  }
];
