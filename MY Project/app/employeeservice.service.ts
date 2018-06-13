import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable} from 'rxjs';
import { Employee } from './Employee';
import { Skill } from './Skill';
import {SkillMaster} from './SkillMaster'



const httpOptions = { headers: new HttpHeaders({ 'Content-Type': 'application/json' }) };



@Injectable({providedIn: 'root'})
export class EmployeeserviceService {

 private restServiceUrl = 'http://localhost:8080/SkillMapperRest/api/employee';

  constructor(private http: HttpClient) { }

  getOneEmployee(id:number): Observable<Employee> 
  {
    const url=`${this.restServiceUrl}/${id}`;
    return this.http.get<Employee>(url);
  }
  
  updateEmployee(employee:Employee) : Observable<void>
  {
    
    return this.http.put<void>(this.restServiceUrl, employee, httpOptions);
  }

  addEmployee(employee:Employee):Observable<void>
  {
      return this.http.post<void>(this.restServiceUrl, employee, httpOptions);
  }

  getOneEmployeeSkills(id:number): Observable<Skill[]> 
  {
    const url=`${this.restServiceUrl}/skill/${id}`;
    return this.http.get<Skill[]>(url);
  }
  addEmployeeSkill(skill:Skill):Observable<void>
  {
    const url=`${this.restServiceUrl}/skill`;
    return this.http.post<void>(url, skill, httpOptions);
  }
  
  getOneEmployeeskillmaster(id:number): Observable<SkillMaster> 
  {
    const url=`${this.restServiceUrl}/skillmaster/${id}`;
    return this.http.get<SkillMaster>(url);
  }


  addEmployeeskillmaster(skillmaster:SkillMaster):Observable<void>
  {
    const url=`${this.restServiceUrl}/skillmaster`;
    return this.http.post<void>(url, skillmaster, httpOptions);
  }

  updateEmployeeskillmaster(skillmaster:SkillMaster) : Observable<void>
  {
    const url=`${this.restServiceUrl}/skillmaster`;
    return this.http.put<void>(url, skillmaster, httpOptions);
  }
  
  }
