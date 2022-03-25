package practice;

import java.util.Scanner;

public class Fibonacci
{

public static void main(String[] args) 
{
	int n,a=0,b=1,c;
	Scanner sc=new Scanner(System.in);
	System.out.print("enter number");
	n=sc.nextInt();
	for(int i=0;i<=n;i++)
	{
		c=a+b;
		System.out.print(c+" ");
	    a=b;
	    b=c;
		
			
     	}

		}



}
