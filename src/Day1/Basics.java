package Day1;

import java.util.Scanner;

public class Basics {
	public static void main(String[] args){
		int a  = 10;
		double b = 11.0;
		String str = "Nikhil";
		boolean isEnabled = false;

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();

		if(x % 2 == 0){
			System.out.println("it is even");
		}
		else{
			System.out.println("it is odd");
		}
	}
}
