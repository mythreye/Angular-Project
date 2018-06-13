import { Component, OnInit } from '@angular/core';
import { ManagerserviceService } from '../managerservice.service';
import { EmployeeSkillDetails } from '../EmployeeSkillDetails';


@Component({
  selector: 'app-searchempmgr',
  templateUrl: './searchempmgr.component.html',
  styleUrls: ['./searchempmgr.component.css']
})
export class SearchempmgrComponent implements OnInit {

  jobrole:String;
  myemployees:EmployeeSkillDetails[];
  constructor(private mservice:ManagerserviceService) { }

  ngOnInit() {
  }

  onSearch(jobrole:String):void
      {
        this.jobrole=jobrole;
       this.mservice.getEmployees(jobrole).subscribe(employee=>this.myemployees=employee);
      }

}
