package Geekster_Test;

import java.util.Scanner;

public class FirstSecondDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num,temp;
		int firstD=0, secondD=0;
		System.out.println("Enter numbers:");
		do
		{
		   num = sc.nextInt();
		   temp = num;
		   if(num>0)
		   {
			  while(num!=0)
			  {
			     firstD=num%10;
			     num=num/10;
			   }
			  System.out.println("First digit:"+firstD);
			  
	          while(temp>=10)
	          {
	        	  secondD=temp%10;
	        	  temp=temp/10;
	          }
			  System.out.println("Second digit:"+secondD);
		   }
	    
		 }while(num!=-1);
	}

}
