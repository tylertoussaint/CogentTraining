package cgLeetcodeAssignment1;

import java.util.Arrays;
import java.util.Scanner;

public class Question6IsDigit {

	public static void main(String[] args) {
		String arr[]= {"0","1","2","3","4","5","6","7","8","9"};
		String character;
		System.out.println("Enter a character: ");
		Scanner sc= new Scanner(System.in);
		character=sc.next();
		if(character.length()>1) {
			System.out.println("Too many characters entered");
		}
		else {
			if(Arrays.asList(arr).contains(character)) {
				System.out.println("This is a digit");
			}
			else {
				System.out.println("This is not a digit");
			}
		 }

	}
}
