package com.niit.NewSkillMapper.DAO;
import com.niit.NewSkillMapper.Model.SkillMaster;

public interface SkillMasterDAO
{
	public boolean newSkillMaster(SkillMaster skill);
	public boolean updateSkill(SkillMaster skill);
	public SkillMaster showSkill(int employeeid);
	public boolean approveSkillMaster(int employeeid,String status);
}
