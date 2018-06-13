import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable} from 'rxjs';
import {Employee} from './Employee'


const httpOptions = { headers: new HttpHeaders({ 'Content-Type': 'application/json' }) };


@Injectable({
  providedIn: 'root'
})

export class HrserviceService {

  
  private restServiceUrl = 'http://localhost:8080/SkillMapperRest/api/HRService';
  constructor(private http: HttpClient) { }

  getEmployees(): Observable<Employee[]> 
  {    
    return this.http.get<Employee[]>(this.restServiceUrl);
  }

    
  updateEmployee(employee:Employee) : Observable<void>
  {
    return this.http.put<void>(this.restServiceUrl,employee,httpOptions);
  }
}
