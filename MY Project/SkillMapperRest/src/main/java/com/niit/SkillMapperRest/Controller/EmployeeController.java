package com.niit.SkillMapperRest.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niit.NewSkillMapper.Model.Employee;
import com.niit.NewSkillMapper.Model.Skill;
import com.niit.NewSkillMapper.Model.SkillMaster;
import com.niit.NewSkillMapper.Service.EmployeeService;

@RestController
@RequestMapping("/api/employee")
@CrossOrigin(origins = "http://localhost:4200")
public class EmployeeController {

	@Autowired
	private EmployeeService empserve;
	
	@GetMapping("/{id}")
	public Employee showOneEmployee(@PathVariable("id") int id) {
		return empserve.showOneEmployee(id);
	}
	@PostMapping
	public ResponseEntity<Void> addEmployee(@RequestBody Employee employee) {
		System.out.println(employee.getEmailid() + "" + employee.getBirthdate() + "" + employee.getGender() + ""
				+ employee.getAddress());
		if (employee.getEmployeeid() != 0) {
			System.out.println("1");
			if (empserve.newEmployee(employee)) {

				return new ResponseEntity<Void>(HttpStatus.OK);
			} else {
				System.out.println("2");
				return new ResponseEntity<Void>(HttpStatus.CONFLICT);
			}
		} else {
			System.out.println("3");
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}

	}
	@PutMapping
	public ResponseEntity<Void> editEmployee(@RequestBody Employee employee) {
		if (employee.getEmployeeid() != 0) {

			if (empserve.updateEmployee(employee)) {
				return new ResponseEntity<Void>(HttpStatus.OK);
			} else {
				return new ResponseEntity<Void>(HttpStatus.CONFLICT);
			}
		} else {
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
		}
	}
	@GetMapping("/skill/{id}")
	public List<Skill> showOneEmployeeSkill(@PathVariable("id") int id) {

		return empserve.showAllSkills(id);

	}
	@PostMapping("/skill")
	public ResponseEntity<Void> addskill(@RequestBody Skill skill) 
	{
			if (empserve.newSkill(skill))
			{
				return new ResponseEntity<Void>(HttpStatus.OK); 
			}
			else 
			{
				return new ResponseEntity<Void>(HttpStatus.CONFLICT);
			}
	}
	@GetMapping("/skillmaster/{id}")
	public SkillMaster showOneEmployeeSkillMaster(@PathVariable("id") int id) 
	{
		System.out.println(id);

		return empserve.showSkill(id);
	}
	@PostMapping("/skillmaster")
	public ResponseEntity<Void> addskill(@RequestBody SkillMaster skill) 
	{
			if (empserve.newSkillMaster(skill))
			{
				return new ResponseEntity<Void>(HttpStatus.OK); 
			}
			else 
			{
				return new ResponseEntity<Void>(HttpStatus.CONFLICT);
			}
	}
	@PutMapping("/skillmaster")
	public ResponseEntity<Void> updateskill(@RequestBody SkillMaster skill) 
	{
			if (empserve.updateSkill(skill))
			{
				return new ResponseEntity<Void>(HttpStatus.OK); 
			}
			else 
			{
				return new ResponseEntity<Void>(HttpStatus.CONFLICT);
			}
	}
}
