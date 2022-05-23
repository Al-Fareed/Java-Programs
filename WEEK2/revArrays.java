//Name:Al-Fareed
//Reg No:210970049
//Date Of Creation:11-March-2022
//program to Input an array of n integers. Reverse all elements of the array and store them in another array.
//------------------------------------------------------------------
import java.util.Scanner;
import java.lang.Math;
class revArrays
{
	public static void main(String args[])
	{
		int arr[]=new int[10];
		int rev[]=new int[10];
		int n,re=0,rem=0,a;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number elements:");
		n=sc.nextInt();
		System.out.println("Enter the elements:");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.print("Contents are:\n");
		for(int i=0;i<n;i++)
		{
			a=arr[i];
			re=0;
			while(a!=0)
			{
				rem=a%10;
				re=re*10+rem;
				a=a/10;
			}
			System.out.println(arr[i]+"  "+re);
		}

	}
}