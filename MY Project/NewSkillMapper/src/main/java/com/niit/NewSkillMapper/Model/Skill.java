package com.niit.NewSkillMapper.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SkillTable")
public class Skill 
{
	@Id
	int  skillid;
	@Column(nullable=false)
	int employeeid;
	@Column(nullable=false)
	String Skillname;
	
	@Column(nullable=false)
	String certification;

	
	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployee_id(int employeeid) {
		this.employeeid = employeeid;
	}

	public String getSkillname() {
		return Skillname;
	}

	public void setSkillname(String skillname) {
		Skillname = skillname;
	}

	public String getCertification() {
		return certification;
	}

	public void setCertification(String certification) {
		this.certification = certification;
	}
	
	public int getSkillid() {
		return skillid;
	}

	public void setSkillid(int skillid) {
		this.skillid = skillid;
	}
	

}
