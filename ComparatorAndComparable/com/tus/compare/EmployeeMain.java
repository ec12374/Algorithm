import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

import java.util.*;

public class EmployeeMain {

	public static void main(String[] args) {

		Employee emp1 = new Employee(10, "Tushar", 25, 500000, 2);
		Employee emp2 = new Employee(11, "Saurabh", 27, 70000, 4);
		Employee emp3 = new Employee(13, "Govinda", 29, 95000, 7);
		Employee emp4 = new Employee(14, "Shefali", 35, 1500000, 12);
		Employee emp5 = new Employee(12, "Abhishek", 50, 500000, 25);
		Employee emp6 = new Employee(10, "Sanchari", 25, 50000, 26);

		ArrayList<Employee> empList = new ArrayList<>();
		empList.add(emp1);
		empList.add(emp2);
		empList.add(emp3);
		empList.add(emp4);
		empList.add(emp5);
		empList.add(emp6);
		
		List<Employee> empList1=  Arrays.asList(new Employee(20, "Azhar", 30, 18000000, 8),
				new Employee(21, "Vinay", 31, 1900000, 9));
		

		SalaryCompare salaryCompare = new SalaryCompare();
		NameCompare nameCompare = new NameCompare();
		AgeCompare ageCompare = new AgeCompare();
		ExperienceCompare expCompare = new ExperienceCompare();
		// Collections.sort(empList);
		// System.out.println(empList);

		/*
		 * HashMap<Employee, String> empMap = new HashMap<>(); empMap.put(emp1,
		 * "vermt"); empMap.put(emp2, "sings"); empMap.put(emp3, "guptg");
		 * empMap.put(emp4, "gosws"); empMap.put(emp5, "panda");
		 * empMap.put(emp6, "mukhs"); System.out.println(empMap.size());
		 * System.out.println(empMap);
		 */

		// with anonymous inner class
		/*Collections.sort(empList, new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {

				return (int) (o1.getExperience() - o2.getExperience());
			}

		});*/
       // using lambda expression
		Collections.sort(empList1, (p1, p2) -> p1.getAge() - p2.getAge());

		for (Employee emp : empList1) {

			System.out.print("[ " + "Employee id: " + emp.getId() + ", ");
			System.out.print("Employee Name: " + emp.getName() + ", ");
			System.out.print("Employee Age: " + emp.getAge() + ", ");
			System.out.print("Employee Salary: " + emp.getSalary() + ", ");
			System.out.print("Employee Experience: " + emp.getExperience() + " ] ");
			System.out.println();

		}

		// System.out.println(empList);

	}

}
