package licence_eligibility;

import java.util.Scanner;

public class checkEligibility {
	void check() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age :");
		int age = sc.nextInt();
		if(age>=18) {
			if (age<=75) {
			System.out.println("You are eligible for licence");
			}
			else {
				System.out.println("You are age barred and not eligible for licence.");
			}		
		}
		else {
			int waitingYears = 18 - age;
			System.out.println("You should wait for "+waitingYears+" years for your licence");
			
		}
	}

}
