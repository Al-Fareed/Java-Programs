//Name:Al-Fareed
//Reg No:210970049
//Date Of Creation:11-March-2022
//program to o find the largest and smallest element in a two-dimensional array.
//------------------------------------------------------------------
import java.util.Scanner;
import java.lang.Math;
class largeSmall
{
	public static void main(String args[])
	{
		int i,j=0,m=0,n=0,p=0,q=0,l=0,k=0;
		float a[][]=new float[10][10];
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of rows and columns:");
		int row=sc.nextInt();
		int col=sc.nextInt();
		System.out.print("Enter the array:\n");
		for( i=0;i<row;i++)
		{
			for( j=0;j<col;j++)
			{
				a[i][j]=sc.nextFloat();
			}
		}
		System.out.println("Entered 2D matrix is:");
		for( i=0;i<row;i++)
		{
			for( j=0;j<col;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println("\n");
		}
		//Finding Largest Number
		float large=a[0][0];
		float  small=a[0][0];
		for( i=0;i<row;i++)
		{
			for( j=0;j<col;j++)
			{

				if(a[i][j]>large)
				{
					large=a[i][j];
					m=i;
					n=j;

				}
				//Finding Smallest Number

					if(a[i][j]<small)
						{
							small=a[i][j];
							p=i;
							q=j;

						}
				}
		}


		System.out.println("The largest number is="+large+", location= ("+m+","+n+")");
		System.out.println("The Smalllest number is="+small+", location= ("+p+","+q+")");
		//System.out.print("\n");
	}
}
