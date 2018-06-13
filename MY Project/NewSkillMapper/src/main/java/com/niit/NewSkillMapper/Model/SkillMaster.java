package com.niit.NewSkillMapper.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "SkillMaster")
public class SkillMaster
{
	@Id
	int employeeid;
	
	@Column(nullable = false)
	int noofbatches;
	
	@Column(nullable = false)
	int noofstudents;
	
	@Column(nullable = false)
	int noplaced;
	
	@Column(nullable = false)
	int experience;
	
	@Column(nullable = false)
	String proposeddesignation;
	
	@Column(nullable = false)
	String approval;

	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	public int getNoofbatches() {
		return noofbatches;
	}

	public void setNoofbatches(int noofbatches) {
		this.noofbatches = noofbatches;
	}

	public int getNoofstudents() {
		return noofstudents;
	}

	public void setNoofstudents(int noofstudents) {
		this.noofstudents = noofstudents;
	}

	public int getNoplaced() {
		return noplaced;
	}

	public void setNoplaced(int noplaced) {
		this.noplaced = noplaced;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public String getProposeddesignation() {
		return proposeddesignation;
	}

	public void setProposeddesignation(String proposeddesignation) {
		this.proposeddesignation = proposeddesignation;
	}

	public String getApproval() {
		return approval;
	}

	public void setApproval(String approval) {
		this.approval = approval;
	}
	
	
}
