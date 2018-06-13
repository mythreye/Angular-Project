import { Component, OnInit,Input } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Location } from '@angular/common';
import { EmployeeserviceService } from '../employeeservice.service';
import { Employee } from '../Employee';
import { Skill } from '../Skill';
import { SkillMaster } from '../SkillMaster';

@Component({
  selector: 'app-showemployee',
  templateUrl: './showemployee.component.html',
  styleUrls: ['./showemployee.component.css']
})
export class ShowemployeeComponent implements OnInit {

  myemployee:Employee;
  empskillmaster:SkillMaster;
  empskill:Skill[];
  id:number;
  name:string
  
  constructor(private dbservice:EmployeeserviceService,  private route: ActivatedRoute,  private location: Location) { }

  ngOnInit() 
  {
    this.id = +this.route.snapshot.paramMap.get('id');
    this.getemployeebyid(this.id);    
    this.getempskill(this.id);
    this.getempskillmaster(this.id);
  }

  getemployeebyid(id:number):void
  {
    this.dbservice.getOneEmployee(this.id).subscribe(employee=>this.myemployee=employee);
  }

  getempskill(id:number)
  {
    this.dbservice.getOneEmployeeSkills(this.id).subscribe(myskill=>this.empskill=myskill);
  }

  getempskillmaster(id:number)
  {
    this.dbservice.getOneEmployeeskillmaster(this.id).subscribe(myskillmaster=>this.empskillmaster=myskillmaster);
  }
}
