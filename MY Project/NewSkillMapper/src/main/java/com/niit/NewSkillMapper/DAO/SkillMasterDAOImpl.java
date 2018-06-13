package com.niit.NewSkillMapper.DAO;



import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.NewSkillMapper.DAO.SkillMasterDAO;
import com.niit.NewSkillMapper.Model.SkillMaster;

@Repository("skillmasterdao")
@Transactional
public class SkillMasterDAOImpl implements SkillMasterDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public boolean newSkillMaster(SkillMaster skill) {
		try {
			sessionFactory.getCurrentSession().save(skill);
			return true;
		} catch (Exception exception) {
			return false;
		}
	}


	public boolean approveSkillMaster(int employeeid,String status) 
	{
		try
		{
			
			String query="update SkillMaster set  approval='"+status+" ' where employeeid="+employeeid;
			int result=sessionFactory.getCurrentSession().createQuery(query).executeUpdate();
			if(result!=0)
				return true;
			else
				return false;
		}
		catch(Exception exception)
		{
			return false;
		}
	}
 
	public boolean updateSkill(SkillMaster skill) 
	{
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(skill);
			return true;
		} catch (Exception exception) {
			return false;
		}}

	@Override
	public SkillMaster showSkill(int employeeid) 
	{
		System.out.println(employeeid);
		try 
		{
			System.out.println(employeeid);
			SkillMaster skilldetails = (SkillMaster) sessionFactory.getCurrentSession()
					.createQuery("from SkillMaster where employeeid = " + employeeid).uniqueResult();
			return skilldetails;
		} catch (Exception exception) 
		{
			return null;
		}
	}

}
