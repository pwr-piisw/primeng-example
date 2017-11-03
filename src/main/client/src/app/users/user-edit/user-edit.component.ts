import {Component, Input, OnInit} from '@angular/core';
import {User} from '../model/user';

@Component({
  selector: 'app-user-edit',
  templateUrl: './user-edit.component.html',
  styleUrls: ['./user-edit.component.scss']
})
export class UserEditComponent implements OnInit {

  constructor() { }

  @Input() user:User;

  ngOnInit() {
  }

}
