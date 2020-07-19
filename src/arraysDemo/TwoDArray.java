package arraysDemo;

import java.util.Arrays;

public class TwoDArray {

	public static void main(String[] args) {
		System.out.println("------------2D Array -----------");
		int[][] myTwoD = { { 10, 20 }, { 20, 30 }, { 30, 40 } };

		//System.out.println(Arrays.toString(myTwoD));
		System.out.println(Arrays.deepToString(myTwoD));
		
		System.out.println("------------using loop -----------");
		for(int[] td : myTwoD) {
			for (int y: td) {
				System.out.println(y);
			}
			System.out.println();
		}
		
		
		System.out.println("------------2D Array String-----------");
		String[][] myString = { { "Ahsan", "Ahmed" }, { "Tareq", "Talukder" }, { "Raju", "Kyum" } };

		//System.out.println(Arrays.toString(myTwoD));
		System.out.println(Arrays.deepToString(myString));
		
		
		System.out.println("------------using loop -----------");
		for(String[] td : myString) {
			for (String y: td) {
				System.out.println(y);
			}
			System.out.println();
		}

	}

}
