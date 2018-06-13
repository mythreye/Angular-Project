package com.niit.SkillMapperRest.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.niit.NewSkillMapper.Model.EmployeeSkillDetails;
import com.niit.NewSkillMapper.Service.MasterService;

@RestController
@RequestMapping("/api/Master")
@CrossOrigin(origins = "http://localhost:4200")
public class MasterController {
	@Autowired
	MasterService mserve;

	@GetMapping("/{skillname}")
	public List<EmployeeSkillDetails> searchEmployee(@PathVariable("skillname") String skillname) 
	{
		System.out.println( mserve.searchEmployee(skillname));
		return (ArrayList<EmployeeSkillDetails>) mserve.searchEmployee(skillname);
	}

	// @GetMapping("/{id}")
	// public List<Skill> showAllSkills(int employeeid)
	// {
	// return mserve.showAllSkills(employeeid);
	// }

}
