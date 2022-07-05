//Name:Al-Fareed
//Reg No:210970049
//Date Of Creation:11-March-2022
//program to read an array of n distinct numbers , and display all the pairs (x,y) such that x>y.
//------------------------------------------------------------------
import java.util.Scanner;
import java.lang.Math;
class x_yPair
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[10],n;
		System.out.print("Enter the number of elements:");
		n=sc.nextInt();
		System.out.println("Enter the elements:\n");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(a[i]>a[j])
				{
					System.out.print("("+a[i]+","+a[j]+") ");
				}
			}
		}
		System.out.print("\n");
	}
}