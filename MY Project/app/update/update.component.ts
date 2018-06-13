import { Component, OnInit,Input } from '@angular/core';
import { ActivatedRoute,Router } from '@angular/router';
import { Location } from '@angular/common';
import { EmployeeserviceService } from '../employeeservice.service';
import { Employee } from '../Employee';

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent implements OnInit {
  
  myemployee:Employee;

  constructor(private dbservice:EmployeeserviceService,  private route: ActivatedRoute,  private location: Location,private router:Router) 
  { }

  ngOnInit() 
  {
    this.getOnemployees();
  }

  getOnemployees(): void 
  {
    const id = +this.route.snapshot.paramMap.get('id');
    this.dbservice.getOneEmployee(id).subscribe(employee=>this.myemployee=employee);
  }

  onUpdate(employee:Employee):void
  {
    this.dbservice.updateEmployee(employee).subscribe(() => this.goBack());
  }

  goBack(): void {
    this.location.back();
  }
  empid:number;
  onback()
  {
    this.empid=this.myemployee.employeeid;
    this.router.navigateByUrl('showemployee/'+this.empid);
  }

}