package com.forloop.example;

public class TriangleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j;
		int row = 6;
		// Outer loop work for rows
		for (i = 0; i < row; i++) {
			// inner loop work for space
			for (j = row - i; j > 1; j--) {
				// prints space between 2 stars
				System.out.print(" ");
			}
			// inner loop for columns
			for (int k = 0; k <= i; k++) {
				//prints star
				System.out.print("* ");
			}
			// moves cursor to the next line
			System.out.println();
		}

	}

}
