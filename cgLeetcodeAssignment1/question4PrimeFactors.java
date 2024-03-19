package cgLeetcodeAssignment1;

import java.util.Scanner;

public class question4PrimeFactors {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num= sc.nextInt();
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				Boolean result=true;
				for(int j=2;j<i;j++) {
					if(i%j==0) {
						result=false;
					}
				}
			if(result) {
				System.out.println(i);
			}
			}
		}

	}

}
