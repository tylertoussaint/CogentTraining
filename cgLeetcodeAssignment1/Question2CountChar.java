package cgLeetcodeAssignment1;

import java.util.Scanner;

public class Question2CountChar {

	public static void main(String[] args) {
		char character;
		String string="daaaaaang";
		int result=0;
		System.out.println("Enter a character: ");
		Scanner sc= new Scanner(System.in);
		character=sc.next().charAt(0);
		
		for(int i=0;i<string.length();i++) {
			if( string.charAt(i)==character) {
				result+=1;
			}
		}
		System.out.println(result);
	}

}


