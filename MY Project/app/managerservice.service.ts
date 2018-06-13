import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable} from 'rxjs';
import { EmployeeSkillDetails } from './EmployeeSkillDetails';


@Injectable({providedIn: 'root'})

export class ManagerserviceService {

  private restServiceUrl = 'http://localhost:8080/SkillMapperRest/api/Master';

  constructor(private http: HttpClient) { }

  getEmployees(jobrole:String): Observable<EmployeeSkillDetails[]> 
  {
    const url=`${this.restServiceUrl}/${jobrole}`;
    return this.http.get<EmployeeSkillDetails[]>(url);
  }
}
