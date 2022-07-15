package com.ds;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List<Employee> arrayList=new ArrayList<>();
		arrayList.add(new Employee(1, "Kishor", "Software Engineer"));
		arrayList.add(new Employee(2,"Sandy","Software Engineer"));
		arrayList.add(new Employee(3,"Reshma","Software Engineer"));
//		System.out.println(arrayList);
		arrayList.add(null);
		arrayList.add(null);
//		arrayList.forEach(employee->{System.out.println(employee);});
//		System.out.println(arrayList.isEmpty());
//		Object[] empArray=arrayList.toArray();
//		arrayList.remove(3);
//		System.out.println(arrayList.contains(new Employee(2,"Sandy","Software Engineer")));
//		Employee[] empArray=arrayList.toArray(new Employee[arrayList.size()]);
//		for(Employee e:empArray)
//			System.out.println(e);
		ArrayList<Employee> arr2=new ArrayList<>(arrayList);
//		arr2.forEach(employee->{System.out.println(employee);});
		System.out.println();
		arrayList.addAll(arr2);
		arrayList.forEach(employee->{System.out.println(employee);});
		
		
		

	}

}
