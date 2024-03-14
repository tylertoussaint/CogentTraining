package cgAssignment1;

import java.util.Scanner;

public class question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr []= {8,22,17,45,38};
		boolean bingo= false;
		while(bingo==false) {
		System.out.println("Enter a number between 1-50");
		Scanner sc= new Scanner(System.in);
		int num=sc.nextInt();
		if(num<1 || num>50) {
			System.out.println("Number is out of bounds");
	}	else {
			for(int i=0;i<arr.length;i++) {
				if(arr[i]==num) {
					System.out.println("BINGO!!!");
					bingo=true;
			}
	}}

}
}}
