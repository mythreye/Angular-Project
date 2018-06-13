import { Component, OnInit } from '@angular/core';
import {EmployeeserviceService} from '../employeeservice.service';
import { ActivatedRoute } from '@angular/router';
import { Location } from '@angular/common';
import { SkillMaster } from '../SkillMaster';


@Component({
  selector: 'app-updateskillmaster',
  templateUrl: './updateskillmaster.component.html',
  styleUrls: ['./updateskillmaster.component.css']
})
export class UpdateskillmasterComponent implements OnInit {

  constructor(private empskillmasterservice:EmployeeserviceService,private route: ActivatedRoute,  private location: Location) { }

  empskillmaster:SkillMaster;
  empid:number;

  ngOnInit() 
  {
    this.empid = +this.route.snapshot.paramMap.get('id');
    this.getMyEmployeeskillMaster(this.empid)
  }

  getMyEmployeeskillMaster(empid:number): void 
  {
    this.empskillmasterservice.getOneEmployeeskillmaster(empid).subscribe(skillmaster=>this.empskillmaster=skillmaster)
  }


  onUpdate(newempskillmaster:SkillMaster):void
  {
    this.empskillmasterservice.updateEmployeeskillmaster(newempskillmaster).subscribe(()=>this.goBack());
  }

  goBack(): void {
    this.location.back();
  }
  

}
