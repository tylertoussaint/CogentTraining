package cgAssignment2;

import java.util.Scanner;

public class Book {
		private int bookNo;
		private String title;
		private String author;
		private float price;
		private static int bookCount;
		
		public Book() {
			
			bookCount+=1;
		
		}
		public Book(int bookNo,String title, String author, float price) {
			this.bookNo=bookNo;
			this.title= title;
			this.author=author;
			this.price=price;
			bookCount+=1;
			if(title.length()<4) {
				System.out.println("Error title must at least 4 characters");
			}
			if(price<1 || price>5000) {
				System.out.println("Error price must be between 1 and 5000");
			}
		}
		static {
			bookCount=0;
		}
		
		static int getBookCount() {
			return bookCount;
		}
		 
		void getter() {
			System.out.println(bookNo);
			System.out.println(title);
			System.out.println(author);
			System.out.println(price);
		}
		void setter() {
			System.out.println("Give book No");
			Scanner sc= new Scanner(System.in);
			bookNo= sc.nextInt();
			System.out.println("Give Title of Book:");
			sc= new Scanner(System.in);
			title= sc.nextLine();
			System.out.println("Give author of Book:");
			author= sc.nextLine();
			System.out.println("Give price of Book:");
			sc= new Scanner(System.in);
			price=sc.nextFloat();
			
		}
		public int getBookNumber() {
		        return bookNo;
		    }
		
		@Override
		public String toString() {

		        return this.bookNo + "\n" + this.title + "\n"+ this.author +"\n"+ this.price;
		       
		    }

}
