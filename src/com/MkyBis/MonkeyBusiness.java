/*--------------------------------------------------------------------
Name: Jaime Palencia
Student ID: U94665425
COP 2805C - Java Programming 2
Spring /2017
Assignment # 0

Plagiarism Statement

I certify that this assignment is my own work and that I
have not copied in part or whole or otherwise plagiarized 
the work of other students and/or persons.
--------------------------------------------------------------------*/
package com.MkyBis;

import java.util.Scanner;

public class MonkeyBusiness {
	public static void main(String[] args) {
		// Variables
		final int numOfMnks = 4;
		final int numOfDays = 7;
		int avgWeekly = 0;
		int total = 0;
		int least = 0;
		int most = 0;

		// X * X 2D Array
		int[][] monkeyArray = new int[numOfMnks][numOfDays];

		// Keyboard Scanner
		Scanner keyIn = new Scanner(System.in);

		System.out.println("Enter How Much Food Is Eaten For Each Monkey.");

		try {
			for (int row = 0; row < numOfMnks; row++) {
				for (int col = 0; col < numOfDays; col++) {
					do {
						System.out.printf("Monkey %d, Day %d: ", (row + 1), (col + 1));
						monkeyArray[row][col] = keyIn.nextInt();
						if (monkeyArray[row][col] <= -1 || monkeyArray[row][col] >= 50) {
							System.out.println("Number can't be negative, Or greater than 50.");
							monkeyArray[row][col] = keyIn.nextInt();
						}

					} while (monkeyArray[row][col] <= -1 || monkeyArray[row][col] >= 50);
				}
			}

			for (int row = 0; row < numOfMnks; row++) {
				for (int col = 0; col < numOfDays; col++) {
					if (monkeyArray[row][col] < least) {
						least = monkeyArray[row][col];
					}
					if (monkeyArray[row][col] > most) {
						most = monkeyArray[row][col];
					}
					total += monkeyArray[row][col];
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		keyIn.close();

		System.out.println("Total: " + total + " Pounds");
		System.out.println("Weekly Average: " + avgWeekly / 21.0 + " Pounds");
		System.out.println("Least Amount: " + least + " Pounds");
		System.out.println("Most Amount: " + most + " Pounds");
	}

}
