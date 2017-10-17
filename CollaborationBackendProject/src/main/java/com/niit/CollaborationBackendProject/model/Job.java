package com.niit.CollaborationBackendProject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="job_s180015")
public class Job 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
private int Job_Id;
private String JobTitle;
private String JobDescription;
private String SkillsRequired;
private String Salary;
private String location;
private String Companyname;
private String PostedOn;
public int getJob_Id() {
	return Job_Id;
}
public void setJob_Id(int job_Id) {
	Job_Id = job_Id;
}
public String getJobTitle() {
	return JobTitle;
}
public void setJobTitle(String jobTitle) {
	JobTitle = jobTitle;
}
public String getJobDescription() {
	return JobDescription;
}
public void setJobDescription(String jobDescription) {
	JobDescription = jobDescription;
}
public String getSkillsRequired() {
	return SkillsRequired;
}
public void setSkillsRequired(String skillsRequired) {
	SkillsRequired = skillsRequired;
}
public String getSalary() {
	return Salary;
}
public void setSalary(String salary) {
	Salary = salary;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getCompanyname() {
	return Companyname;
}
public void setCompanyname(String companyname) {
	Companyname = companyname;
}
public String getPostedOn() {
	return PostedOn;
}
public void setPostedOn(String postedOn) {
	PostedOn = postedOn;
}


}
