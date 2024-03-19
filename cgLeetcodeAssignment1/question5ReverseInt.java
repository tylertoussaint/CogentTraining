package cgLeetcodeAssignment1;

import java.util.Scanner;

public class question5ReverseInt {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num= sc.nextInt();
		String result= new String();
		String newNum= String.valueOf(num);
		for(int i=newNum.length()-1;i>=0;i--) {
			result+=newNum.charAt(i);
		}
		int newResult=Integer.valueOf(result);
		System.out.println(Integer.valueOf(newResult));
	}

}
