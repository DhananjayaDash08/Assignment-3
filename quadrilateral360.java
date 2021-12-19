package Geekster_Test;

import java.util.Scanner;

public class quadrilateral360 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter four sides of Quadrilateral:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int sum =0;
		if(a>0 && b>0 && c>0 && d>0)
		{
			sum= a+b+c+d;
			if(sum==360)
			{
				System.out.println("Valid Quadrilateral");
			}
			else
			{
				System.out.println("Invalid Quadrilateral");
			}
		}
		else
		{
			System.out.println("Give valid inputs");
		}
	}

}
