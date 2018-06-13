package com.niit.NewSkillMapper.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.NewSkillMapper.DAO.EmployeeDao;
import com.niit.NewSkillMapper.DAO.SkillDAO;
import com.niit.NewSkillMapper.DAO.SkillMasterDAO;
import com.niit.NewSkillMapper.Model.Employee;
import com.niit.NewSkillMapper.Model.Skill;
import com.niit.NewSkillMapper.Model.SkillMaster;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
	@Autowired
	private EmployeeDao employeedao;
	@Autowired
	private SkillDAO skilldao;
	@Autowired
	private SkillMasterDAO skillmasterdao;
	

	@Override
	public boolean newEmployee(Employee employee)
	{
		return employeedao.newEmployee(employee);
	}

	@Override
	public boolean updateEmployee(Employee newemployee)
	{
		return employeedao.updateEmployee(newemployee);
	}

	@Override
	public boolean newSkill(Skill skill)
	{
	
		return skilldao.newSkill(skill);
	}

	@Override
	public List<Skill> showAllSkills(int id) 
	{
		return skilldao.showAllSkills(id);
	}


	public boolean updateSkill(SkillMaster skill) {
		// TODO Auto-generated method stub
		return skillmasterdao.updateSkill(skill);
	}

		@Override
	public boolean newSkillMaster(SkillMaster skill) {
		// TODO Auto-generated method stub
			return skillmasterdao.newSkillMaster(skill);
	}

	@Override
	public SkillMaster showSkill(int employeeid) {
		// TODO Auto-generated method stub
		return skillmasterdao.showSkill(employeeid);
	}

	@Override
	public Employee showOneEmployee(int employeeid) {
		// TODO Auto-generated method stub
		return employeedao.showOneEmployee(employeeid);
	}
}
