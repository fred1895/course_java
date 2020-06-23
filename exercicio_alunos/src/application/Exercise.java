package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Students;

public class Exercise {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Students students = new Students();
		
		System.out.println("Enter the student datas: ");
		System.out.print("Name: ");
		students.name = sc.nextLine();
		
		System.out.println("Enter the student notes: ");
		System.out.print("First note: ");
		students.firstNote = sc.nextDouble();
		System.out.println();
		
		System.out.print("Second note: ");
		students.secondNote = sc.nextDouble();
		System.out.println();
		
		System.out.print("Third note: ");
		students.thirdNote = sc.nextDouble();
		System.out.println();
		
		System.out.println(students);
		sc.close();
	}

}
