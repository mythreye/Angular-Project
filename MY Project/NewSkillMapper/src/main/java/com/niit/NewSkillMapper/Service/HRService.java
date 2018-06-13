package com.niit.NewSkillMapper.Service;

import java.util.List;

import com.niit.NewSkillMapper.Model.Employee;
import com.niit.NewSkillMapper.Model.EmployeeSkillDetails;
import com.niit.NewSkillMapper.Model.Skill;

public interface HRService
{
	boolean approveSkillMaster(int employeeid,String status);
	List<Skill> showAllSkills(int employeeid);
	List<Employee> unapprovedEmployee();
	
}
