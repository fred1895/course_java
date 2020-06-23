package exercicio_salario;

import java.util.Locale;
import java.util.Scanner;

import entites.Salario;

public class application {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Salario salario = new Salario();
		
		System.out.println("Entre the employee datas: ");
		System.out.println("Name: ");
		salario.name = sc.nextLine();
		
		System.out.println("Salary: ");
		salario.salary = sc.nextDouble();
		
		System.out.println("Tax: ");
		salario.tax = sc.nextDouble();
		System.out.println();
		
		System.out.println("Employee: " + salario);
		System.out.println();
		
		System.out.println("Enter the porcent to increase the salary: ");
		double porcentage = sc.nextDouble();
		salario.increaseSalary(porcentage);
		
		System.out.println("Update salary " + salario);
		System.out.println();
		
		sc.close();
	}

}
