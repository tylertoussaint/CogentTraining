package cgLeetcodeAssignment1;

import java.util.Arrays;
import java.util.Scanner;

public class Question7DeleteVowel {

	public static void main(String[] args) {
		String arr[]= {"a","e","i","o","u","A","E","I","O","U"};
		String string; 
		String result="";
		System.out.println("Enter a word: ");
		Scanner sc= new Scanner(System.in);
		string=sc.nextLine();
		for(int i=0;i<string.length();i++) {
			
			if(!Arrays.asList(arr).contains(String.valueOf(string.charAt(i)))) {
				result+=string.charAt(i);
			}
			
		}
		System.out.println(result);
	}
}
