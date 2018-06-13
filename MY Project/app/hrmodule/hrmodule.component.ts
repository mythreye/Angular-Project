import { Component, OnInit } from '@angular/core';
import { Employee } from '../Employee';
import {HrserviceService} from '../hrservice.service'

@Component({
  selector: 'app-hrmodule',
  templateUrl: './hrmodule.component.html',
  styleUrls: ['./hrmodule.component.css']
})
export class HrmoduleComponent implements OnInit {
employees:Employee[];
  constructor(private hrservice:HrserviceService) { }

  ngOnInit() 
  {
    this.hrservice.getEmployees().subscribe(employee=>this.employees=employee);
  }
  onApprove(employee:Employee)
  {
    this.hrservice.updateEmployee(employee).subscribe();
  }

}
