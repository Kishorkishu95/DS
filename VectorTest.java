package com.ds;

import java.util.List;
import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> vector = new Vector<>();
		vector.add(new Employee(1, "Kishor", "Software Engineer"));
		vector.add(new Employee(2,"Sandy","Software Engineer"));
		vector.forEach(e->System.out.println(e));

	}

}
