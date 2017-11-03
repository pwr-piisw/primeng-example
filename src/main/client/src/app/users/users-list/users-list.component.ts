import {Component, EventEmitter, Input, OnInit, Output} from '@angular/core';
import {User} from '../model/user';

@Component({
  selector: 'app-users-list',
  templateUrl: './users-list.component.html',
  styleUrls: ['./users-list.component.scss']
})
export class UsersListComponent implements OnInit {

  constructor() { }

  @Input() users: User[];

  @Output() onSelected = new EventEmitter<number>();

  ngOnInit() {
  }

  onRowSelect(event) {
    this.onSelected.emit(event.data.id);
  }

}
