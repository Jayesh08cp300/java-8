package com.example.stream;

import java.util.Arrays;
import java.util.List;

class Employee {

	private String name;
	private int age;

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee{" + "name='" + name + '\'' + ", age=" + age + '}';
	}
}

public class Example4 {
	public static void main(String[] args) {
		List<Employee> myList = Arrays.asList(new Employee("Ram", 25), new Employee("Kumar", 40), new Employee("Rakesh", 35));

		myList.parallelStream()
				.filter(employee -> employee.getAge() >= 35)
				.forEach(System.out::println);
	}
}
