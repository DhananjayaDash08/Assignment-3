package Geekster_Test;

import java.util.Scanner;

public class Triangle180 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three sides of Triangle:");
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		int sum=0;
		if(a>0 && b>0 && c>0)
		{
			sum = a+b+c;
		   if(sum==180)
		   {
			  System.out.println("Valid Triangle");
		   }
		   else
		   {
			  System.out.println("Invalid Triangle");
		   }
		}
		else
		{
			System.out.println("Give valid input");
		}

	}

}
