package com.functional_program;

import java.util.Scanner;

public class Quadratic {	
	
	public static void main(String[] args) {
		Quadratic obj = new Quadratic();
		obj.quadratic();
	}
	
	public void quadratic() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print(" Please enter the value of a: ");
		int a = scan.nextInt();
		
		System.out.print(" Please enter the value of b: ");
		int b = scan.nextInt();
		
		System.out.print(" Please enter the value of c: ");
		int c = scan.nextInt();
		
		int delta = b*b - 4*a*c;
		double x1 = (-b + Math.sqrt(delta)) / 2*a;
		double x2 = (-b - Math.sqrt(delta)) / 2*a;
		
		System.out.println(" The two roots are: " + x1 + " and " + x2);
		scan.close();
	}
}
