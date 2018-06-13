import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';


@Component({
  selector: 'app-select',
  templateUrl: './select.component.html',
  styleUrls: ['./select.component.css']
})
export class SelectComponent implements OnInit
 {
  
  empid:number;

  constructor(private router: Router) { }

  ngOnInit() {
      }
      onInsert(employeeid):void
      {
        this.empid=employeeid;
        this.router.navigateByUrl('showemployee/'+this.empid);
      }
}
