package cgAssignment1;

import java.util.Scanner;

public class question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float num1;
		float num2;
		String operator;
		Scanner sc= new Scanner(System.in);
		System.out.println("Input 2 numbers then operator");
		num1=sc.nextFloat();
		num2=sc.nextFloat();
		operator=sc.next();
		switch(operator){
		case "+":
			System.out.println(num1+num2);
			break;
		case "-":
			System.out.println(num1-num2);
			break;
		case "/":
			System.out.println(num1/num2);
			break;
		case "*":
			System.out.println(num1*num2);
			break;
		default:
			System.out.println("Please add valid operator");
		}
	}

}
