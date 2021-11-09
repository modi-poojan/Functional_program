package com.functional_program;

import java.util.Scanner;

public class WindChill {
	
	public static void main(String[] args) {
		WindChill obj = new WindChill();
		obj.solution();
	}

	public void solution() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print(" Please enter the value of t(F): ");
		double t = scan.nextDouble();
		if(t > 50) {
			System.out.println(" Please enter a temp value that is less than 50");
			scan.close();
			return;
		}
		System.out.print(" Please enter the value of v(Mph): ");
		
		double v = scan.nextDouble();
		if(v > 120 || v < 3) {
			System.out.println(" Please enter a velocity value that is between 3 and 120");
			scan.close();
			return;
		}
		double wind = 35.74 + 0.6215*t + (0.4275*t - 35.75)*Math.pow(v, 0.16);
		
		System.out.println(" The wind speed is: " + wind);
		scan.close();
	}
}

