package com.niit.NewSkillMapper.Service;

import java.util.List;

import com.niit.NewSkillMapper.Model.EmployeeSkillDetails;
import com.niit.NewSkillMapper.Model.Skill;
import com.niit.NewSkillMapper.Model.SkillMaster;

public interface MasterService 
{
	List<EmployeeSkillDetails> searchEmployee(String skill);	
	SkillMaster showSkill(int employeeid);
	public List<Skill> showAllSkills(int employeeid);
}
