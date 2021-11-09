package com.functional_program;

import java.util.Scanner;

public class TwoDarray {

	static Scanner scan = new Scanner(System.in);
	int i = 0;
	int j = 0;
	
	public void IntArray(int row, int col) {
		
		int [][] array = new int [row][col];
		for (i = 0; i < row ; i++) {
			
			for (j = 0; j < col; j++) {
				
				System.out.println("Enter the value");
				array[i][j] = scan.nextInt(); 
			}
						
		}
		
		System.out.println("The matrix:");
		
		for (i = 0; i < row ; i++) {
			
			for (j = 0; j < col; j++) {
		
				System.out.print(array[i][j]);
			}
			System.out.println();
		}	
	}	
	
	public void DoubleTwoArray(int row, int col) {
		
		double[][] array = new double[row][col]; 		
		
		for ( i = 0; i < row; i++) {
			
			for ( j = 0; j < col; j++) {
				
				System.out.print(" Please enter value: ");
				array[i][j] = scan.nextDouble();
			}
		}
		
		System.out.println(" The matrix: ");
		
		for ( i = 0; i < row; i++) {
			
			for ( j = 0; j < col; j++) {
				
				System.out.println(array[i][j]);
			}
			System.out.println();
		}
	}
	
	public void Boolean(int row, int col) {
		
		boolean[][] array = new boolean[row][col]; 		
		
		for ( i = 0; i < row; i++) {
			
			for ( j = 0; j < col; j++) {
				
				System.out.print(" Please enter value: ");
				array[i][j] = scan.nextBoolean();
			}
		}
		
		System.out.println(" The matrix: ");
		
		for ( i = 0; i < row; i++) {
			
			for ( j = 0; j < col; j++) {
				
				System.out.println(array[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void main( String[ ] args) {
		
		TwoDarray obj = new TwoDarray();
		System.out.println("Enter number of rows :");
		int row = scan.nextInt();
		System.out.println("Enter number of rows :");
		int col = scan.nextInt();
		System.out.println("Enter your choice of operation \n1.Integer\n2.Double\n3Boolean");
		int choice = scan.nextInt();
		switch(choice) {
		
		case 1 :
			obj.IntArray(row, col);
			break;
		
		case 2:
			obj.DoubleTwoArray(row, col);
			break;
		
		case 3:
			obj.Boolean(row, col);
			break;
		}

	}
}
