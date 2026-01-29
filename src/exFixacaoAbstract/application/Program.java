package exFixacaoAbstract.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exFixacaoAbstract.entities.Company;
import exFixacaoAbstract.entities.Individual;
import exFixacaoAbstract.entities.TaxPayer;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();

		List<TaxPayer> list = new ArrayList<>();

		for (int i = 1; i <= n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company(i/c)? ");
			char ans = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual Income: ");
			Double income = sc.nextDouble();

			if (ans == 'i') {
				System.out.print("Health expenditures: ");
				Double healthExpenses = sc.nextDouble();
				list.add(new Individual(name, income, healthExpenses));
			} else if (ans == 'c') {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();
				list.add(new Company(name, income, numberOfEmployees));
			}
		}
		System.out.println();
		System.out.println("TAXES PAID:");

		double sum = 0.0;
		for (TaxPayer t : list) {
			System.out.println(t.getName() + ": $ " + String.format("%.2f", t.tax()));
			sum += t.tax();
		}
		
		System.out.println();
		System.out.print("TOTAL TAXES: $ " + String.format("%.2f", sum));
		sc.close();
	}

}
