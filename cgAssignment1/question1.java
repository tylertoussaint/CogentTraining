package cgAssignment1;

import java.util.Scanner;

public class question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter value: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0;i<n;i++) {
			if(i%2==0 && i!=0) {
				System.out.println(i);
			}
		}
	}

}
