package com.subhashis.vulnerabilities;

@SqlInjectionValidation
public class Department {
	
	private String deptName;
	private String deptLoc;
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public String getDeptLoc() {
		return deptLoc;
	}
	public void setDeptLoc(String deptLoc) {
		this.deptLoc = deptLoc;
	}
	
}
