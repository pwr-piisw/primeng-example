import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-foo',
  templateUrl: './foo.component.html',
  styleUrls: ['./foo.component.scss']
})
export class FooComponent implements OnInit {

  persons: Person[];

  constructor() {
    this.persons = [
      {
        name: 'John Doe',
        age: 39
      },
      {
        name: 'Jim Morrison',
        age: 27
      }
    ];
  }

  ngOnInit() {
  }

}

export interface Person {
  name: string;
  age: number;
}
