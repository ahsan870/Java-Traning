package arraysDemo;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

public class ArrayDemo {

	public static void main(String[] args) {
		// both are valid declarations

		// var-name = new type [size];
		// int intArray[];

		int intArray[]; // declaring array
		intArray = new int[20]; // allocating memory to array
		// int[] intArray = new int[20]; // combining both statements in one

		byte byteArray[];
		short shortsArray[];
		boolean booleanArray[];
		long longArray[];
		float floatArray[];
		double doubleArray[];
		char charArray[];

		String myS[] = { "Ahsan", "Ahmed", "Riyad"};

		for (String i : myS) {
			System.out.println("This is String from direct initilizing-- for loop " + i);
		}
		
	System.out.println("This is String from direct initilizing " + Arrays.toString(myS));
// 1 2 3 4 5
//		String[] myString = new String[5];
//		myString[0] = "Ahsan";
//		myString[1] = "Ahmed";
//		myString[2] = "Tareq";
//		myString[3] = "Raju";
//		myString[4] = "Riju";
//
//		for (int i = 0; i < myString.length; i++) {
//			System.out.println(i + " Index of " + myString[i]);
//		}
//
//		for (String i : myString) {
//			System.out.println(i);
//		}
////
//		// reverse array
//		System.out.println("Revers Array");
//		for (int i = myString.length - 1; i >= 0; i--) {
//			System.out.println("Index of " + i + " Array" + " " + myString[i]);
//		}
//
//		int myArray[] = new int[6];
//		myArray[0] = 10;
//		myArray[1] = 20;
//		myArray[2] = 30;
//		myArray[3] = 40;
//		myArray[4] = 50;
//		myArray[5] = 60;
//		System.out.println(Arrays.toString(myArray));
//		// System.out.println(myArray[i]);
//
//		System.out.println("Array lenght "+myArray.length);
//		
//		
//		for (int i = 0; i < myArray.length; i++) {
//			System.out.println(i + " " + myArray[i]);
//		}
//		// reverse array
//		System.out.println("Reverse Array");
//		for (int i = myArray.length - 1; i >= 0; i--) {
//			System.out.println("Index of " + i + " Array" + " " + myArray[i]);
//		}
//
//		System.out.println("--------- For Each------------");
//		for (int ar : myArray) {
//			System.out.println(ar);
//
//		}
//
//		
		System.out.println("---------------------");
		byteArray = new byte[5];
		byteArray[0] = 10;
		byteArray[1] = 20;
		byteArray[2] = 30;
		byteArray[3] = 40;
		byteArray[4] = 40;
		
		for( byte i: byteArray) {
			System.out.println(i);
		}
		System.out.println("------------Clone byte Array---------");
		byte cloneByte[] = byteArray.clone();
		
		
		
		for(byte i: cloneByte) {
			System.out.println("Clone Array " +i);
		}
		
		boolean isEqual = byteArray.equals(byteArray);
		System.out.println("Is it Equal = "+isEqual);
		
		System.out.println(byteArray.getClass());
		int lengthArray = byteArray.length;
		System.out.println(lengthArray);
	}

}
