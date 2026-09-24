//write a java program to print Fibonacci series using methods

import java.util.Scanner;
public class fibonacci2
{
	static void fibonacci(int n)// a man who defies the world of bl 
	{
		int a = 0, b = 1, c;
		
		System.out.print("Enter a Number : ");
		for(int i=1; i<=n; i++)
		{
			System.out.print(a+" ");
                                                                                                                                                                                                                                       
			c=a+b;
			a=b;
			b=c;
		}
	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter number of terms : ");
		int n = sc.nextInt();

		fibonacci(n);
	sc.close();	
	}
}






