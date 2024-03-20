package cgLeetcodeAssignment1;

import java.util.Arrays;
import java.util.Scanner;

public class Question8NoVowelsnCons {
	public static void main(String[] args) {
		String arr[]= {"a","e","i","o","u","A","E","I","O","U"};
		String arr2[]= {"0","1","2","3","4","5","6","7","8","9","/"," ","","?",".","!"};
		String string; 
		int countVowel=0;
		int countCons=0;
		System.out.println("word: ");
		Scanner sc= new Scanner(System.in);
		string=sc.nextLine();
		for(int i=0;i<string.length();i++) {
			
			if(Arrays.asList(arr).contains(String.valueOf(string.charAt(i)))) {
				countVowel+=1;
			}
			else if(Arrays.asList(arr2).contains(String.valueOf(string.charAt(i)))) {
				continue;
			}
			else {
				countCons+=1;
			}
			
		}
		System.out.println("Number of Vowels: "+ countVowel);
		System.out.println("Number of Consonants: "+ countCons);
	}

}
