package com.mycom.collections.list;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeListSorter {

	public static void main(String[] args) {
		ArrayList<Employee> empList = new ArrayList<Employee>();

		// Employee emp = new Employee(111, "Krishna", 24);
		// empList.add(emp);

		empList.add(new Employee(333, "Ajeet", 32));
		empList.add(new Employee(222, "Chaitanya", 26));
		empList.add(new Employee(444, "Rahul", 24));
		empList.add(new Employee(111, "Krishna", 24));

		System.out.println("Employee objects before sorting:");

		for (Employee emp : empList) {
			System.out.println(emp);
		}

		Collections.sort(empList);

		System.out.println("Employee objects after sorting:");

		for (Employee emp : empList) {
			System.out.println(emp);
		}

		// Sorting collection in reverse order

		Collections.sort(empList, Collections.reverseOrder());

		System.out.println("Employee objects after sorting in descending order:");

		for (Employee emp : empList) {
			System.out.println(emp);
		}
	}

}
