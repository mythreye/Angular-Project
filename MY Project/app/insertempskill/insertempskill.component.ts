import { Component, OnInit } from '@angular/core';
import { EmployeeserviceService } from '../employeeservice.service';
import { ActivatedRoute } from '@angular/router';
import { Location } from '@angular/common';
import { Skill } from '../Skill';


@Component({
  selector: 'app-insertempskill',
  templateUrl: './insertempskill.component.html',
  styleUrls: ['./insertempskill.component.css']
})
export class InsertempskillComponent implements OnInit {

  empskill:Skill;
  id:number;
  

 constructor(private empskillservice:EmployeeserviceService,private route: ActivatedRoute,  private location: Location) { }

 ngOnInit() 
 {
 this.id=+this.route.snapshot.paramMap.get('id');
  }



onInsert(empid,skid,skname,certification)
{
  this.empskill=new Skill();
  this.empskill.employeeid=this.id;
  this.empskill.skillid=skid;
  this.empskill.skillname=skname;
  this.empskill.certification=certification;

  this.empskillservice.addEmployeeSkill(this.empskill).subscribe();
  this.goBack();

}
goBack(): void {
  this.location.back();
}


}
