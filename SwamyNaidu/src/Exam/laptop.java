package Exam;
import java.util.Scanner;

public class laptop {
	public static void main(String[] args) {
		Scanner price = new Scanner(System.in);
		System.out.println("Enter the Laptop price");
		int n = price.nextInt();
		
		System.out.println("Price before Discount " + n);
		System.out.println();
		
		float cashd = (5*n)/100;
		System.out.println("Dicount Amount with Cash " + cashd);
		float cashp=n-cashd;
		System.out.println ("price if paid using cash " + cashp );
		System.out.println();
		
		float cardd=(10*n)/100;
		System.out.println("Discount if paid using Card " + cardd);
		
		float cardp=n-cardd;
		System.out.println("Price if paid using Card " +cardp);
	

	}

}
