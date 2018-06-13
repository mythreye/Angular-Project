package com.niit.NewSkillMapper.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.NewSkillMapper.DAO.EmployeeDao;
import com.niit.NewSkillMapper.DAO.SkillDAO;
import com.niit.NewSkillMapper.DAO.SkillMasterDAO;
import com.niit.NewSkillMapper.Model.Employee;
import com.niit.NewSkillMapper.Model.EmployeeSkillDetails;
import com.niit.NewSkillMapper.Model.Skill;
import com.niit.NewSkillMapper.Model.SkillMaster;

@Service
public class HRServiceImpl implements HRService 
{
	@Autowired
	private EmployeeDao employeedao;
	@Autowired
	private SkillDAO skilldao;
	@Autowired
	private SkillMasterDAO skillmasterdao;

	

	@Override
	public boolean approveSkillMaster(int employeeid, String status) 
	{
		return  skillmasterdao.approveSkillMaster(employeeid, status);
	}

	@Override
	public List<Skill> showAllSkills(int employeeid) {
		// TODO Auto-generated method stub
		return skilldao.showAllSkills(employeeid);
	}

	@Override
	public List<Employee> unapprovedEmployee() {
		// TODO Auto-generated method stub
		return employeedao.unapprovedEmployee();
	}

}
