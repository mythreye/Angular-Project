package com.niit.NewSkillMapper.DAO;
import java.util.List;

import com.niit.NewSkillMapper.Model.Employee;
import com.niit.NewSkillMapper.Model.Skill;

public interface SkillDAO
{
	public boolean newSkill(Skill skill);
	public List<Skill> showAllSkills(int employee_id);
}
