package cgLeetcodeAssignment1;

import java.util.Scanner;

public class Question1RemoveString {

	public static void main(String[] args) {
		char character;
		String string="daaaaaang";
		String result="";
		System.out.println("Enter a character: ");
		Scanner sc= new Scanner(System.in);
		character=sc.next().charAt(0);
		
		for(int i=0;i<string.length();i++) {
			if( string.charAt(i)!=character) {
				result+=string.charAt(i);
			}
		}
		System.out.println(result);
	}

}
