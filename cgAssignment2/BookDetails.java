package cgAssignment2;

import java.util.Scanner;

public class BookDetails {
	
	static void search(Book arr[]){
		System.out.println("Enter book number to search");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=0;i<3;i++) {
			if (arr[i].getBookNumber()==num) {
				  System.out.println("Book found!");
	              arr[i].getter();
	              return;
	              
			}
		}
		System.out.println("No book found!");
			
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book ob = new Book();
		Book ob3 = new Book();
		Book ob2= new Book(1,"title","author",12.0f);
		Book arr[]= new Book[3];
		
		//ob.setter();
		//ob.getter();
		for(int i=0;i<arr.length;i++) {
			arr[i]= new Book();
			arr[i].setter();
			
		}
		for(Book i:arr) {
			i.getter();
			
		}
		search(arr);
		System.out.println(ob2.toString());
		System.out.println(Book.getBookCount());
		
		System.out.println("Enter book number:");
		Scanner sc= new Scanner(System.in);
        int bookNumber = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.println("Enter book title:");
    	sc= new Scanner(System.in);
        String title = sc.nextLine();
        System.out.println("Enter book author:");
        String author = sc.nextLine();
        System.out.println("Enter book price:");
        sc= new Scanner(System.in);
        float price = sc.nextFloat();
        sc.nextLine(); // Consume newline
      
        
        EngineeringBook engBook= new EngineeringBook(bookNumber, title, author, price);
        engBook.setter();
        engBook.getCat();
        engBook.getter();

	}
		
}
