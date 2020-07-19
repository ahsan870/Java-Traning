package arraysDemo;

import java.util.Arrays;

public class ThreeDArray {

	public static void main(String[] args) {

		int[][][] my3DArray = new int[2][2][2];
		my3DArray[0][0][0] = 1;
		my3DArray[0][0][1] = 2;
		my3DArray[0][1][0] = 3;
		my3DArray[0][1][1] = 4;
		my3DArray[1][0][0] = 5;
		my3DArray[1][0][1] = 6;
		my3DArray[1][1][0] = 7;
		my3DArray[1][1][1] = 8;

		for (int[][] array2d : my3DArray) {
			for (int[] array : array2d) {
				// Arrays.fill(array, "hello");
			}
		}

		System.out.println(Arrays.deepToString(my3DArray));
		System.out.println("-----------------\n");
		// -----------

		for (int i = 0; i < my3DArray.length; i++)
			for (int j = 0; j < 2; j++)
				for (int z = 0; z < 2; z++)
					System.out.println("arr[" + i + "][" + j + "][" + z + "] = " + my3DArray[i][j][z]);

		// ---------------------

		int[][][] threeDArray = { { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } },
			{ { 10, 11, 12 }, { 13, 14, 15 }, { 16, 17, 18 } },
				{ { 19, 20, 21 }, { 22, 23, 24 }, { 25, 26, 27 } } };

		for (int[][] array2d : threeDArray) {
			for (int[] array : array2d) {
				
			}
			System.out.println(Arrays.deepToString(threeDArray));
		}
		//System.out.println(Arrays.deepToString(threeDArray));
		
		
	}
}