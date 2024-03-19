package cgLeetcodeAssignment1;

public class question3TempVal {
	
	public static void main(String[] args) {
		int num1=5;
		int num2=10;
		int tmp;
		System.out.println("Num1: "+ num1+ " Num2: "+ num2);
		tmp=num1;
		num1=num2;
		num2=tmp;
		System.out.println("Num1: "+ num1+ " Num2: "+ num2);
	}
}
