package com.niit.NewSkillMapper.DAO;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.NewSkillMapper.Model.Skill;


@Repository("skilldao")
@Transactional
public class SkillDAOImpl implements SkillDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public boolean newSkill(Skill skill) {
		try {
			System.out.println(skill.getEmployeeid());
			sessionFactory.getCurrentSession().save(skill);
			return true;
		} catch (Exception exception) {
			return false;
		}
	}

	public List<Skill> showAllSkills(int employeeid) 
	{
		try 
		{
			List<Skill> skilldetails = (List<Skill>) sessionFactory.getCurrentSession().
			createQuery("from Skill where employeeid = " + employeeid).list();
			System.out.println(skilldetails.size());
			return skilldetails;
		} 
		catch (Exception exception) {
			return null;
		}
	}

}
