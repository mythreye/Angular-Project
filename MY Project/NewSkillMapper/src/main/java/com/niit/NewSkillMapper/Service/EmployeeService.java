package com.niit.NewSkillMapper.Service;

import java.util.List;

import com.niit.NewSkillMapper.Model.*;

public interface EmployeeService 
{
	public boolean newEmployee(Employee employee);
	public boolean updateEmployee(Employee newemployee);
	public Employee showOneEmployee(int employeeid);
	public boolean newSkill(Skill skill);
	public List<Skill> showAllSkills(int id);
	public boolean newSkillMaster(SkillMaster skill);
	public boolean updateSkill(SkillMaster skill);
	public SkillMaster showSkill(int employeeid);
}
