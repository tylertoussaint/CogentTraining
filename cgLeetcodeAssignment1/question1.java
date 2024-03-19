package cgLeetcodeAssignment1;

import java.util.Scanner;

public class question1 {
	
	public static void main(String[] args) {
		System.out.println("Enter number to check if prime");
		Scanner sc= new Scanner(System.in);
		boolean result=true;
		int num= sc.nextInt();
		for(int i=2;i<num;i++) {
			if (num%i==0) {
				System.out.println("Not prime");
				result=false;
				break;
			}
		}
		if(result) {
			System.out.println("Prime");
		}
		

	}

}
