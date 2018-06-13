package com.niit.SkillMapperRest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niit.NewSkillMapper.Model.Employee;
import com.niit.NewSkillMapper.Model.EmployeeSkillDetails;
import com.niit.NewSkillMapper.Model.Skill;
import com.niit.NewSkillMapper.Service.HRService;


@RestController
@RequestMapping("/api/HRService")
@CrossOrigin(origins="http://localhost:4200")
public class HRController
{
	@Autowired
	private HRService hrservice;
	
	@GetMapping
	public List<Employee> searchEmployee() 
	{
		System.out.println("1");
		return hrservice.unapprovedEmployee();
	}
	
	@GetMapping("/id")
	public List<Skill> showAllSkills(int employeeid)
	{
		return hrservice.showAllSkills(employeeid);
	}
	
	@PutMapping
	public ResponseEntity<Void> approveSkillMaster(@RequestBody Employee employee)
	{
			if (hrservice.approveSkillMaster(employee.getEmployeeid(),"Approved"))
			{
				return new ResponseEntity<Void>(HttpStatus.OK); 
			}
			else 
			{
				return new ResponseEntity<Void>(HttpStatus.CONFLICT);
			}
	}
	
}
