package com.mycom.collections.list;

public class Employee implements Comparable {
	
	private int empId;
	private String empName;
	private int empAge;
	
	Employee(int empId, String empName, int empAge) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empAge = empAge;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	
	//compareTo to perform sorting
	@Override
	public int compareTo(Object emp2) {
		int compareId = ((Employee) emp2).getEmpId(); //reference casting
		//return a positive value if current object's id is greater than emp2 object's id
		//return a negative value if current object's id is lesser than emp2 object's id
		return this.empId - compareId;
	}
	
}
