package com.niit.NewSkillMapper.DAO;

import java.util.List;

import com.niit.NewSkillMapper.Model.Employee;
import com.niit.NewSkillMapper.Model.EmployeeSkillDetails;

public interface EmployeeDao 
{
	public boolean newEmployee(Employee employee);
	public Employee showOneEmployee(int employeeid);
	public boolean deleteEmployee(int employeeid);
	public boolean updateEmployee(Employee employee);
	List<EmployeeSkillDetails> searchEmployee(String skill);	
	List<Employee> unapprovedEmployee();

}
