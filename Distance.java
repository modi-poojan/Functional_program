package com.functional_program;

import java.util.Scanner;

public class Distance {

	public static void main(String[] args) {
		Distance obj = new Distance();
		obj.distance();
	}
	public void distance() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print(" Please enter the x coordinate: ");
		int x = scan.nextInt();
		
		System.out.print(" Please enter the y coordinate: ");
		int y = scan.nextInt();
		
		double length = Math.sqrt( Math.pow(x, 2) + Math.pow(y, 2));
		
		System.out.println(" The distance of the point from the origin is: " + length);
		
		scan.close();
	}
}

