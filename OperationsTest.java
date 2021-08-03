import java.util.Scanner;
public class OperationsTest {
	//To check for palindrome
	public void checkPalindrome(int num)
	{
		int rev=0,sum=0,temp;
		temp=num;
		while(temp>0)
		{
			rev=temp%10;
			sum=(sum*10)+rev;
			temp=temp/10;
		}
		System.out.println("The reversed number is :"+sum);
		if(sum==num)
			System.out.println("The number is a palindrome");
		else
			System.out.println("The number is not a palindrome");
		
	}
	
	//to print * pattern
	public void printPattern(int num)
	{
		for(int i=num;i>=0;i--)
		{
			for(int j=i;j>=0;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	//to check for prime number
	public void checkPrimeNumber(int num)
	{
		boolean flag=false;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0)
				flag=true;
			else
				flag=false;
		}
		if(!flag)
			System.out.println("The number is a prime number");
		else
			System.out.println("The number is not a prime number");
	}
	
	//to print fibonacci series
	public void printFibonacciSeries(int num) 
	{
		int first=0,second=1,n=0;
		System.out.print(" "+first);
		System.out.print(" "+second);
		for(int i=2;i<=num;i++)
		{
			n=first+second;
			System.out.print(" "+n);
			first=second;
			second=n;
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice,n;
		Scanner sc=new Scanner(System.in);
		OperationsTest ob=new OperationsTest();
		do
		{
			System.out.println("\nEnter your choice from below list.\n" + "1. Find palindrome of number.\n"
							+ "2. Print Pattern for a given no.\n" + "3. Check whether the no is a  prime number.\n"
							+ "4. Print Fibonacci series.\n" + "--> Enter 0 to Exit.\n");
			choice=sc.nextInt();
			switch(choice)
			{
			case 0:
				choice=0;
				System.out.println("Thank you! Goodbye!");
				break;
			case 1:
				System.out.println("Enter the number");
				n=sc.nextInt();
				ob.checkPalindrome(n);
				break;
			case 2:
				System.out.println("Enter the number");
				n=sc.nextInt();
				ob.printPattern(n);
				break;
			case 3:
				System.out.println("Enter the number");
				n=sc.nextInt();
				ob.checkPrimeNumber(n);
				break;
			case 4:
				System.out.println("Enter the number");
				n=sc.nextInt();
				ob.printFibonacciSeries(n);
				break;
			default : System.out.println("Invalid option entered");
			}
			
		}while(choice!=0);

	}

}
