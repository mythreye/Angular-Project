import { NgModule }       from '@angular/core';
import { BrowserModule }  from '@angular/platform-browser';
import { FormsModule }    from '@angular/forms';
import { HttpClientModule }    from '@angular/common/http';
import { AppComponent } from './app.component';
import { InsertComponent } from './insert/insert.component';
import { UpdateComponent } from './update/update.component';
import { SelectComponent } from './select/select.component';
import { AppRoutingModule }     from './app-routing/app-routing.module';
import { EmployeeserviceService } from './employeeservice.service';
import { InsertempskillComponent } from './insertempskill/insertempskill.component';
import { InsertempskillmasterComponent } from './insertempskillmaster/insertempskillmaster.component';
import { ShowempskillmasterComponent } from './showempskillmaster/showempskillmaster.component';
import { UpdateskillmasterComponent } from './updateskillmaster/updateskillmaster.component';
import { ShowemployeeComponent } from './showemployee/showemployee.component';
import { SearchempmgrComponent } from './searchempmgr/searchempmgr.component';
import { HrmoduleComponent } from './hrmodule/hrmodule.component';



@NgModule({
  declarations: [
    AppComponent,
    InsertComponent,
    UpdateComponent,
    SelectComponent,
    InsertempskillComponent,
    InsertempskillmasterComponent,
    ShowempskillmasterComponent,
    UpdateskillmasterComponent,
    ShowemployeeComponent,
    SearchempmgrComponent,
    HrmoduleComponent,
  ],
  imports: [
    BrowserModule,
    FormsModule,
    AppRoutingModule,
    HttpClientModule,

  ],
  providers: [EmployeeserviceService],
  bootstrap: [AppComponent]
})
export class AppModule { }
