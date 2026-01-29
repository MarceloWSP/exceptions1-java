package exPropList.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exPropList.entities.Employee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<>();

		System.out.print("How many employees will be registered?: ");

		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.println("Employee #" + i);

			System.out.print("Id: ");
			int id = sc.nextInt();
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();

			System.out.println();

			Employee e = new Employee(id, name, salary);

			list.add(e);
		}

		Employee employee = null;
		do {
			System.out.print("Enter the employee id that will have salary increase : ");
			int id = sc.nextInt();
			employee = list.stream().filter(emp -> emp.getId() == id).findFirst().orElse(null);

			if (employee != null) {
				System.out.print("Enter the percentage: ");
				double salary = sc.nextDouble();
				employee.increaseSalary(salary);

			} else {
				System.out.printf("%nThis ID doesn't exist! Please try again%n");
			}
		} while (employee == null);

		System.out.println();
		System.out.println("List of employees:");
		for (Employee x : list) {
			System.out.println(x.toString());
		}

		sc.close();
	}
}
