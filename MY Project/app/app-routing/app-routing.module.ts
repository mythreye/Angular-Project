import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CommonModule } from '@angular/common';
import { InsertComponent } from '../insert/insert.component';
import { UpdateComponent } from '../update/update.component';
import { SelectComponent } from '../select/select.component';
import { InsertempskillComponent } from '../insertempskill/insertempskill.component';
import {InsertempskillmasterComponent} from '../insertempskillmaster/insertempskillmaster.component';
import{ShowempskillmasterComponent} from '../showempskillmaster/showempskillmaster.component';
import{UpdateskillmasterComponent} from '../updateskillmaster/updateskillmaster.component';
import{ShowemployeeComponent} from'../showemployee/showemployee.component';
import{SearchempmgrComponent} from '../searchempmgr/searchempmgr.component'
import{HrmoduleComponent} from '../hrmodule/hrmodule.component'


const routes: Routes = [
  { path: 'select', component: SelectComponent },
  { path: 'search', component: SearchempmgrComponent },
  { path: 'HR', component: HrmoduleComponent },
  { path: 'update/:id', component: UpdateComponent },
  { path: 'delete/:id', component: SelectComponent },
  { path: 'insert', component: InsertComponent },
  { path: 'insertskill/:id', component: InsertempskillComponent},
  { path: 'skillmaster/:id', component: ShowempskillmasterComponent },
  { path: 'insertskillmaster/:id', component: InsertempskillmasterComponent},
  { path: 'updateskillmaster/:id', component: UpdateskillmasterComponent},
  { path: 'showemployee/:id', component: ShowemployeeComponent}


];
 
@NgModule({
  imports: [ RouterModule.forRoot(routes) ],
  exports: [RouterModule]
})export class AppRoutingModule { }
