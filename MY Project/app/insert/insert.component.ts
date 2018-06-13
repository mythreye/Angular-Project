import { Component, OnInit } from '@angular/core';
import { Employee } from '../Employee';
import { Location } from '@angular/common';
import { EmployeeserviceService } from '../employeeservice.service';
import { ActivatedRoute } from '@angular/router';


@Component({
  selector: 'app-insert',
  templateUrl: './insert.component.html',
  styleUrls: ['./insert.component.css']
})
export class InsertComponent implements OnInit {

  constructor(private dbservice:EmployeeserviceService,  private route: ActivatedRoute,  private location: Location) { }

  ngOnInit() 
  {
    
  }

  newemployee:Employee;


  onInsert(employeeid,employeeName,emailid,gender,phno,address,birthdate,joiningdate,role):void
  {
   
    this.newemployee=new Employee();
    this.newemployee.employeeid=employeeid;
    this.newemployee.employeeName=employeeName;
    this.newemployee.emailid=emailid;
    this.newemployee.phno=phno;
    this.newemployee.address=address;
    this.newemployee.birthdate=birthdate;
    this.newemployee.joiningdate=joiningdate;
    this.newemployee.role=role;
    this.newemployee.gender=gender
    this.newemployee.EPassword="login@123"
    this.dbservice.addEmployee(this.newemployee).subscribe();
    this.goBack();
  }

  goBack(): void {
    this.location.back();
  }
}
