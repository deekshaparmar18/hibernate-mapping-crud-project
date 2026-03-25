package com.map1;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Project {
	@Id
private int pid;
private String name;
@ManyToMany(mappedBy="projects")
private List<Emp> emps;
public Project() {
	super();
	// TODO Auto-generated constructor stub
}
public Project(int pid, String name, List<Emp> emps) {
	super();
	this.pid = pid;
	this.name = name;
	this.emps = emps;
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<Emp> getEmps() {
	return emps;
}
public void setEmps(List<Emp> emps) {
	this.emps = emps;
}
}
