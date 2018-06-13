package com.niit.NewSkillMapper.DAO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.NewSkillMapper.Model.Employee;
import com.niit.NewSkillMapper.Model.EmployeeSkillDetails;
import com.niit.NewSkillMapper.Model.Skill;
import com.niit.NewSkillMapper.Model.SkillMaster;

@Repository("employeedao")
@Transactional
public class EmployeeDaoImpl implements EmployeeDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public boolean newEmployee(Employee employee) 
	{
		try
		{
			sessionFactory.getCurrentSession().save(employee);
			return true;
		}
		catch(Exception exception)
		{
			return false;
		}
	}

	public Employee showOneEmployee(int employeeid) 
	{
		Employee employee;
		try
		{
			employee=(Employee)sessionFactory.getCurrentSession().createQuery("from Employee where employeeid="+employeeid).uniqueResult();
			return employee;
		}
		catch(Exception exception)
		{
			return null;
		}
	}

	public boolean deleteEmployee(int employeeid) 
	{
		try
		{
			 sessionFactory.getCurrentSession().delete(showOneEmployee(employeeid));
			return true;
		}
		catch(Exception exception)
		{
			return false;
		}
	}

	public boolean updateEmployee(Employee newemployee) {
		
		Employee employee;
		try
		{
			employee=showOneEmployee(newemployee.getEmployeeid());
			employee.setPhno(newemployee.getPhno());
			employee.setEmailid(newemployee.getEmailid());
			employee.setAddress(newemployee.getAddress());
			sessionFactory.getCurrentSession().update(employee);
			return true;
		}
		catch(Exception exception)
		{
			return false;
		}

	}

	public List<Employee> showAllEmployee() 
	{
		ArrayList<Employee> employeearray=new ArrayList<Employee>();
		try
		{
			employeearray= (ArrayList<Employee>)sessionFactory.getCurrentSession().createQuery("from Employee").list();
			return employeearray;
		}
		catch(Exception exception)
		{
			return null;
		}
	}
	
	@Override
	public List<EmployeeSkillDetails> searchEmployee(String skill) 
	{
		try
		{
			ArrayList<EmployeeSkillDetails> empskilldetail=new ArrayList<EmployeeSkillDetails>();
			ArrayList<Skill> s=(ArrayList<Skill>)sessionFactory.getCurrentSession().createQuery("from Skill where Skillname='"+skill+"'").list();
			Iterator<Skill> i=s.listIterator();
			while(i.hasNext())
			{
				System.out.println("1");
				Skill empskill=i.next();
				Employee emp=(Employee)sessionFactory.getCurrentSession().createQuery("from Employee where employeeid="+empskill.getEmployeeid()).uniqueResult();
				SkillMaster sm=(SkillMaster)sessionFactory.getCurrentSession().createQuery("from SkillMaster where employeeid="+empskill.getEmployeeid()).uniqueResult();
				if(sm.getApproval().trim().equalsIgnoreCase("approved"))
					empskilldetail.add(new EmployeeSkillDetails(emp.getEmployeeid(), emp.getEmployeeName(),emp.getEmailid(),emp.getGender(),emp.getPhno(),emp.getAddress(), emp.getBirthdate(), emp.getRole(),sm.getNoofbatches(),sm.getNoofstudents(),sm.getNoplaced(),sm.getExperience(),sm.getProposeddesignation()));
			}
			System.out.println(empskilldetail);
			return empskilldetail;
		}
		catch(Exception exception)
		{
			return null;
		}
	}

	@Override
	public List<Employee> unapprovedEmployee() {
		try
		{
			
			ArrayList<Employee> empskilldetail=new ArrayList<Employee>();
			ArrayList<SkillMaster> s=(ArrayList<SkillMaster>)sessionFactory.getCurrentSession().createQuery("from SkillMaster where approval='Not Approved'").list();
			Iterator<SkillMaster> i=s.listIterator();
			while(i.hasNext())
			{
				System.out.println("1");
				SkillMaster empskill=i.next();
				Employee emp=(Employee)sessionFactory.getCurrentSession().createQuery("from Employee where employeeid="+empskill.getEmployeeid()).uniqueResult();
				empskilldetail.add(emp);
			}
			return empskilldetail;
		}
		catch(Exception exception)
		{
			return null;
		}
	}
}