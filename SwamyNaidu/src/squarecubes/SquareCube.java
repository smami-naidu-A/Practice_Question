package squarecubes;

import java.util.Scanner;
public class SquareCube {
	public static void main(String[] args) {
				Scanner Sc = new Scanner(System.in);
				System.out.println("enter number:");
			    int num = Sc.nextInt();
			    int add = num+num;
			    int square = num * num;
			    int cube   = num * num * num;
			    System.out.println("square of"+square
			    		);
			    System.out.println("cube of " + num + "is : " + cube);
			}
			}
