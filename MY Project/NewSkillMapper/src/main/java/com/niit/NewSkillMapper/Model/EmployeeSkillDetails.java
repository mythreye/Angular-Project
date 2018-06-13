package com.niit.NewSkillMapper.Model;

import java.io.Serializable;

public class EmployeeSkillDetails implements Serializable
{

	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
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

	int employeeid;
	String employeeName;
	String emailid;
	String gender;
	long phno;
	String address;
	String birthdate;
	String Role;
	int noofbatches;
	int noofstudents;
	int noplaced;
	int experience;
	String proposeddesignation;
	
	public EmployeeSkillDetails(int employeeid, String employeeName, String emailid, String gender, long phno,
			String address, String birthdate, String role, int noofbatches, int noofstudents, int noplaced,
			int experience, String proposeddesignation) {
		this.employeeid = employeeid;
		this.employeeName = employeeName;
		this.emailid = emailid;
		this.gender = gender;
		this.phno = phno;
		this.address = address;
		this.birthdate = birthdate;
		Role = role;
		this.noofbatches = noofbatches;
		this.noofstudents = noofstudents;
		this.noplaced = noplaced;
		this.experience = experience;
		this.proposeddesignation = proposeddesignation;
	}
	
		
	
	}
