package practice;

import java.util.Scanner;

public class ReverseNumber 
{

	public static void main(String[] args) 
	{
		int num,rem,rev=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter numbers :");
		num=sc.nextInt();
		for(;num!=0;num=num/10)
		{
			rem=num%10;
			rev=rev*10+rem;
		}
		System.out.print("reverse number :"+rev);
	}

}
