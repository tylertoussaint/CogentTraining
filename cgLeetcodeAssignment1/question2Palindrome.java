package cgLeetcodeAssignment1;

public class question2Palindrome {
	static String word="racecar";
	static int l=0;
	static int r=word.length()-1;
	static boolean result= true;
	public static void main(String[] args) {
		while(l<r) {
			if(word.charAt(l)!=word.charAt(r)) {
				result= false;
				System.out.println("Not palindrome");
				break;
			}
		l+=1;
		r-=1;
		}
		if(result) {
		System.out.println("Is palindrome");
		}
	}


}
