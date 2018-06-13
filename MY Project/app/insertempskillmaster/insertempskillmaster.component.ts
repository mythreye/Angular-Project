import { Component, OnInit } from '@angular/core';
import {EmployeeserviceService} from '../employeeservice.service';
import { ActivatedRoute } from '@angular/router';
import { Location } from '@angular/common';
import { SkillMaster } from '../SkillMaster';

@Component({
  selector: 'app-insertempskillmaster',
  templateUrl: './insertempskillmaster.component.html',
  styleUrls: ['./insertempskillmaster.component.css']
})
export class InsertempskillmasterComponent implements OnInit {

  constructor(private empskillmasterservice:EmployeeserviceService,private route: ActivatedRoute,  private location: Location) { }

  empid:number
  empskillmaster:SkillMaster;

  ngOnInit() 
  {
    this.empid = +this.route.snapshot.paramMap.get('id');
  }



onInsert(noofbatches,noofstudents,noplaced,experience,proposeddesignation)
{
  
  this.empskillmaster=new SkillMaster();
  this.empskillmaster.employeeid=this.empid;
  this.empskillmaster.noofbatches=noofbatches;
  this.empskillmaster.noofstudents=noofstudents;
  this.empskillmaster.noplaced=noplaced;
  this.empskillmaster.experience=experience;
  this.empskillmaster.proposeddesignation=proposeddesignation;
  this.empskillmaster.approval="Not Approved";

  this.empskillmasterservice.addEmployeeskillmaster(this.empskillmaster).subscribe();
  this.goBack();

}
goBack(): void {
  this.location.back();
}


}
