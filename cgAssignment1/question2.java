package cgAssignment1;

import java.util.Scanner;

public class question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= new int [5];
		int sum=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 numbers into array");
		for(int i=0;i<5;i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		System.out.println("The sum is: "+ sum +"\n"+ "The average is: "+ sum/arr.length);
	}

}
