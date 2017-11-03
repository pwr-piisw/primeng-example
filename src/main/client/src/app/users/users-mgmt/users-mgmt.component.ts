import { Component, OnInit } from '@angular/core';
import {User} from '../model/user';

@Component({
  selector: 'app-users-mgmt',
  templateUrl: './users-mgmt.component.html',
  styleUrls: ['./users-mgmt.component.scss']
})
export class UsersMgmtComponent implements OnInit {

  users: User[] = [
    {
      id: 1,
      login: 'johndoe',
      firstName: 'John',
      lastName: 'Doe'
    },
    {
      id: 2,
      login: 'johnybravo',
      lastName: 'Bravo'
    },
    {
      id: 3,
      login: 'yattaman'
    }
  ];

  constructor() { }

  ngOnInit() {
  }

}
