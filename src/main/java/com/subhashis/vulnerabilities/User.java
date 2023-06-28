package com.subhashis.vulnerabilities;

import javax.validation.Valid;

@SqlInjectionValidation
public class User {
	
    private String name;
    private String address;
    private int age;
    
    @Valid
    private Department department;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
    
}

