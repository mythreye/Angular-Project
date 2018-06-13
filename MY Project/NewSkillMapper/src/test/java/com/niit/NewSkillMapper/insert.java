package com.niit.NewSkillMapper;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.niit.NewSkillMapper.MapperConfigaration.MapperConfig;
import com.niit.NewSkillMapper.Model.Employee;
import com.niit.NewSkillMapper.Service.EmployeeService;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringJUnitConfig(MapperConfig.class)
public class insert 
{
	@Autowired
	EmployeeService empserve;
	Employee employee=new  Employee();

	@Before
	public void setUp() throws Exception
	{
		empserve.newEmployee(employee);
		
	}

	@After
	public void tearDown() throws Exception 
	{
		empserve.newEmployee(employee);

	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
