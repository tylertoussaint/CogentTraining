package cgAssignment2;

import java.util.Scanner;

public class EngineeringBook extends Book  {
	public EngineeringBook(int bookNo,String title, String author, float price) {
	super(bookNo,title,author,price);
	}
	 

	void setter() {
		
		System.out.println("Give Category of Book:");
		Scanner sc= new Scanner(System.in);
		category= sc.nextLine();
		
	}
	
	private String category;
	
	void getCat() {
		
	        System.out.println("Category: " + category);

		
	
}
}
