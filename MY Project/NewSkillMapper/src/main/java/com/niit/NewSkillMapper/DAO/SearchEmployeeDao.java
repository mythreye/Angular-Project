//package com.niit.NewSkillMapper.DAO;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.transaction.Transactional;
//
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import com.niit.NewSkillMapper.Model.EmployeeSkillDetails;
//
//@Repository("searchdao")
//@Transactional
//public class SearchEmployeeDao implements  SearchEmployee
//{
//	@Autowired
//	private SessionFactory sessionFactory;
//
//	@Override
//	public List<EmployeeSkillDetails> searchEmployee(String skill) 
//	{
//		
//		ArrayList<EmployeeSkillDetails> employeearray=new ArrayList<EmployeeSkillDetails>();
//		try
//		{
//			
//			String query="select e.employeeid, employeeName, emailid, gender, phno, address, birthdate, Role, "
//					+ "noofbatches, noofstudents, noplaced, experience, proposeddesignation from employee e join skillmaster sm"
//					+ "on e.employeeid=sm.employeeid join skill s  on e.employeeid=s.employeeid"
//					+ "where s.Skillname='%"+skill+"%' and sm.approval='Approved'";
//			employeearray= (ArrayList<EmployeeSkillDetails>)sessionFactory.getCurrentSession().createQuery(query).list();
//			return employeearray;
//		}
//		catch(Exception exception)
//		{
//			return null;
//		}
//		
//	}
//
//}
