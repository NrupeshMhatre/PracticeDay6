package practice;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args)
	{
		int num,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.print("enter number :");
		num=sc.nextInt();
		for(int i=1;i<num;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
			if(num==sum)
			{
				System.out.println("perfect number ");
			}
			else
			{
				System.out.println("Not Perfect number ");
			}
		}
		
	

	}


