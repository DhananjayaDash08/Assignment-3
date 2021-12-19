package Geekster_Test;

import java.util.Scanner;

public class maxAmongThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter three numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("Max of 3:"+a);
			}
			else
			{
				System.out.println("Max of 3:"+c);
			}
		}
		else
		{
			if(b>c)
			{
			    System.out.println("Max of 3:"+b);
			}
			else
			{
				System.out.println("Max of 3:"+c);
			}
		}
	}

}
