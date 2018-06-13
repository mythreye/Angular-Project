package com.niit.EmployeeREST.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niit.SkillMapper.Model.Skill;
import com.niit.SkillMapper.Service.SkillService;


@RestController
@RequestMapping("/api/skill")
@CrossOrigin(origins="http://localhost:4200")
public class SkillController {

	@Autowired
	private SkillService skillservice ;

	@GetMapping("/{id}")
	public List<Skill> showOneEmployee(@PathVariable("id") int id) 
	{

		return skillservice.showAllSkills(id);
				
	}


	@PostMapping
	public ResponseEntity<Void> addskill(@RequestBody Skill skill) 
	{
		
			System.out.println("1");
			if (skillservice.newSkill(skill))
			{
				
				return new ResponseEntity<Void>(HttpStatus.OK); 
			}
			else 
			{
				System.out.println("2");
				return new ResponseEntity<Void>(HttpStatus.CONFLICT);
			}
	}
}
