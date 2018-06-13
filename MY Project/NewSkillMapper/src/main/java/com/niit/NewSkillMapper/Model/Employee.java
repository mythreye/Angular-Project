package com.niit.NewSkillMapper.Model;

import javax.persistence.*;

@Entity
@Table(name = "EmployeeTable")
public class Employee {

	@Id

	int employeeid;

	@Column(nullable = false)
	String employeeName;

	@Column(nullable = false)
	String emailid;

	@Column(nullable = false)
	String gender;

	@Column(nullable = false)
	long phno;

	@Column(nullable = false)
	String address;

	@Column(nullable = false)
	String birthdate;

	@Column(nullable = false)
	String joiningdate;

	@Column(nullable = false)
	String role;

	@Column
	String mypassword;

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

	public String getJoiningdate() {
		return joiningdate;
	}

	public void setJoiningdate(String joiningdate) {
		this.joiningdate = joiningdate;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getMypassword() {
		return mypassword;
	}

	public void setMypassword(String mypassword) {
		this.mypassword = mypassword;
	}
}
