import java.util.*;
class test
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[][]=new int[10][10];
		int ar[]=new int[100];
		int i,j,r,c,temp;
		System.out.print("Enter the size of the matrix: ");
		r=sc.nextInt();
		c=sc.nextInt();
		System.out.println("Enter the elements");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Entered Matrix is: ");
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				System.out.print(a[i][j]+"\t");
			}
			System.out.println("\n");
		}
		max=a[0][0];
		large=a[0][0];
		int k=0;
		for(i=0;i<r;i++)
		{
			for(j=0;j<c;j++)
			{
				ar[k]=a[i][j];	
				k++;				
			}
		}
		System.out.print("\n");
		// System.out.println("Maximum: "+max+" 2nd Large: "+large);
		for(i=0;i<k;i++)
		{
			for(j=0;j<k;j++)
			{
				if(ar[i]<ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		for(i=0;i<k;i++)
		{
		System.out.print(ar[i]+" ");
		}
		System.out.print("\n");
		System.out.println("Maximum :"+ar[k-1]);
		System.out.println("2nd Maximum: "+ar[k-2]+" ");
	}
}
		