package cgLeetcodeAssignment1;

import java.util.Arrays;
import java.util.Scanner;

public class Question5VowelorCon {

	public static void main(String[] args) {
		String arr[]= {"a","e","i","o","u","A","E","I","O","U"};
		String character;
		System.out.println("Enter a character: ");
		Scanner sc= new Scanner(System.in);
		character=sc.next();
		if(character.length()>1) {
			System.out.println("Too many characters entered");
		}
		else {
			if(Arrays.asList(arr).contains(character)) {
				System.out.println("This is a vowel");
			}
			else {
				System.out.println("This is a consonant");
			}
		 }

	}

}
