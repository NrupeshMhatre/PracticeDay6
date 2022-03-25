package practice;

import java.util.Scanner;

public class PrimeNumber 
{
public static void main(String [] args)
{
	int num,sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.print("enter the number : ");
	num=sc.nextInt();
	for(int i=2;i<num-1;i++)
	{
		if(num%i==0)
		{
			sum=sum+1;
		}
	}
	if(sum>0)
	{
		System.out.print("Not prime number");
	}
	else
	{
		System.out.print("Prime number");
	}
		
}
}
