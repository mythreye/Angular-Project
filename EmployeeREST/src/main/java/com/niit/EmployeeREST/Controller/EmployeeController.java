package com.niit.EmployeeREST.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niit.SkillMapper.Model.Employee;
import com.niit.SkillMapper.Service.EmployeeService;

@RestController
@RequestMapping("/api/employee")
@CrossOrigin(origins="http://localhost:4200")
public class EmployeeController {

	@Autowired
	private EmployeeService empserve;

	@GetMapping
	public List<Employee> showEmployee()
	{
		return empserve.showAllEmployee();
	}

	@GetMapping("/{id}")
	public Employee showOneEmployee(@PathVariable("id") int id) 
	{

		return empserve.showOneEmployee(id);
	}
	
	@PostMapping
	public ResponseEntity<Void> addEmployee(@RequestBody Employee employee) 
	{
		System.out.println(employee.getEmail_id()+""+employee.getBirth_date()+""+employee.getGender()+""+employee.getAddress());
		if (employee.getEmployee_id() != 0) 
		{
			System.out.println("1");
			if (empserve.newEmployee(employee))
			{
				
				return new ResponseEntity<Void>(HttpStatus.OK); 
			}
			else 
			{
				System.out.println("2");
				return new ResponseEntity<Void>(HttpStatus.CONFLICT);
			}
		}
		else
		{
			System.out.println("3");
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
		
	}

	@DeleteMapping("/{empid}")
	public ResponseEntity<Void> deleteEmployee(@PathVariable("empid") int empid) 
	{
		if (empserve.deleteEmployee(empid))
		{
			return new ResponseEntity<Void>(HttpStatus.OK); 
		}
		else 
		{
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}
	}
	
	@PutMapping	
	public ResponseEntity<Void> editEmployee(@RequestBody Employee employee) 
	{
		if (employee.getEmployee_id() != 0) 
		{
			
			if (empserve.updateEmployee(employee))
			{
				return new ResponseEntity<Void>(HttpStatus.OK); 
			}
			else 
			{
				return new ResponseEntity<Void>(HttpStatus.CONFLICT);
			}
		}
		else
		{
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
		
	}
}
