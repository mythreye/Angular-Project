package com.niit.NewSkillMapper.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.NewSkillMapper.DAO.EmployeeDao;
import com.niit.NewSkillMapper.DAO.SkillDAO;
import com.niit.NewSkillMapper.DAO.SkillMasterDAO;
import com.niit.NewSkillMapper.Model.EmployeeSkillDetails;
import com.niit.NewSkillMapper.Model.Skill;
import com.niit.NewSkillMapper.Model.SkillMaster;

@Service
public class MasterServiceImpl implements MasterService
{
	@Autowired
	private SkillDAO skilldao;
	@Autowired
	private SkillMasterDAO skillmasterdao;
	@Autowired
	private EmployeeDao employeedao;
	
	@Override
	public List<EmployeeSkillDetails> searchEmployee(String skill) 
	{
		return employeedao.searchEmployee(skill);
	}

	@Override
	public SkillMaster showSkill(int employeeid) {
		// TODO Auto-generated method stub
		return skillmasterdao.showSkill(employeeid);
	}

	@Override
	public List<Skill> showAllSkills(int employeeid) {
		// TODO Auto-generated method stub
		return skilldao.showAllSkills(employeeid);
	}

}
