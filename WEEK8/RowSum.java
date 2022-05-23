import java.util.Scanner;
class FirstRow implements Runnable
{
	int[][] frow=new int[3][3];
	int i=0;
	static int fsum=0;
	FirstRow(int[][] arr)
	{
		frow=arr;

	}

	public void run()
	{
		for(int j=0;j<3;j++)
		{
			fsum+=frow[i][j];
		}



	}
}
class SecondRow extends FirstRow implements Runnable
{
	int[][] srow=new int[3][3];
	int i=1;
	static int ssum=0;
	SecondRow(int[][] arr)
	{
		super(arr);
		srow=arr;
	}
	public void run()
	{

		for(int j=0;j<3;j++)
		{
			ssum+=srow[i][j];
		}




	}
}
class ThirdRow  extends SecondRow implements Runnable
{
	int[][] trow=new int[3][3];
	int i=2,tsum=0, total=0;
	ThirdRow(int[][] arr)
	{
		super(arr);
		trow=arr;
	}
	public void run()
	{

			for(int j=0;j<3;j++)
			{
				 tsum+=trow[i][j];
			}
			total=fsum+ssum+tsum;
		System.out.print("\nSum of elements in the array: "+total);
		System.out.println();
	}
}

class RowSum
{
	public static void main(String args[])
	{
		try
		{
			Scanner sc=new Scanner(System.in);
			int[][] arr=new int[3][3];
			System.out.println("Enter the 3x3 matrix");
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					arr[i][j]=sc.nextInt();
				}
			}

			FirstRow fr=new FirstRow(arr);
			SecondRow sr=new SecondRow(arr);
			ThirdRow thr=new ThirdRow(arr);
			Thread t1=new Thread(fr);
			Thread t2=new Thread(sr);
			Thread t3=new Thread(thr);
			t1.start();
			t2.start();
			t1.join();
			t2.join();
			t3.start();

		}
		catch(InterruptedException e)
		{
			System.out.println( " interrupted.");
		}
	}
}