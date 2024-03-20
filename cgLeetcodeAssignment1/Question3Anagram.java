package cgLeetcodeAssignment1;

import java.util.Hashtable;

public class Question3Anagram {
	public static void main(String[] args) {
	String string1= "listen";
	String string2="silent";
	Hashtable<Character,Integer> hash1= new Hashtable<>();
	Hashtable<Character,Integer> hash2= new Hashtable<>();
	if(string1.length()==string2.length()) {
		
		for(int i=0;i<string1.length();i++) {
			if(hash1.contains(string1.charAt(i))) {
				int num= hash1.get(string1.charAt(i));
				hash1.put(string1.charAt(i),num+1);
			}
			else {
				hash1.put(string1.charAt(i),1);
			}
			if(hash2.contains(string2.charAt(i))) {
				int num2= hash2.get(string2.charAt(i));
				hash2.put(string2.charAt(i),num2+1);
			}
			else {
				hash2.put(string2.charAt(i),1);
			}
			
		}
		System.out.println(hash1.toString());
		System.out.println(hash2.toString());
		if(hash1.equals(hash2)) {
			System.out.println("True");
		}
		else {
			System.out.println("False");
		}
	}
	else {
		System.out.println("False");
	}
	
}

}