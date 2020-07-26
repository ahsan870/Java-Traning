package inputScannerDemo;

import java.util.Scanner;

public class InputDemo {

	public static void main(String[] args) {
		
		// creating object of Scanner class
		Scanner input = new Scanner(System.in);
		/*
		
		String name;
		int age;
		float weight;
		double height;

		System.out.println("Please fill out the below form");
		System.out.println("Enter your name: ");
		name = input.nextLine();
		
		System.out.println("Enter your age: ");
		age = input.nextInt();
		
		System.out.println("Enter your weight: ");
		weight = input.nextFloat();
		
		System.out.println("Enter your height :");
		height = input.nextDouble();

		System.out.println("\nYour Information\n----------------------------");
		System.out.println("Name: " + name + ", \nAge: " + age + " Years Old" + ", \nWeight: " + weight + " LBS "
				+ ", \nHeight " + height);

		*/
		//Company financial Statement 
		//revenue  10000
		//Expenses 4500
		//output
		// Your net Income are $5500
		double revenue;
		double expenses;
		double netIncome;
		
		System.out.println("Enter your Revenue ");
		revenue = input.nextDouble();
		System.out.println("Enter your Expenses");
		expenses = input.nextDouble();
		netIncome = revenue - expenses;
		System.out.println("Your financial Statement is below ;" +netIncome);
		
		

	}

}
