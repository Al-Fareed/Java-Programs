//Author Name:Al-Fareed
//Reg No:210970049
//Date Of Creation:25-Mar-22
//Program to store items details and bill the items
//--------------------------------------------------
import java.util.Scanner;
class Shop
{
	public static void main(String args[])
	{
		int ch,n=0;
		Bill b[]=new Bill[10];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Items:");
		n=sc.nextInt();
		while(true)
		{
			System.out.println("1.Insert Item Data\n2.Display bill\n3.Exit\nEnter your choice: ");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:for(int i=0;i<n;i++)
						{

							b[i]=new Bill();
							b[i].read();

						}
						break;
				case 2:for(int i=0;i<n;i++)
						{

							b[i].display();
							
						}
						b[n-1].calculate();
						break;
				case 3:return;
			}
		}
	}
}


class Bill
{

	Scanner sc=new Scanner(System.in);
	private int itemId,qty;
	String itemName=new String();
	double price,discount,finalBill;
	static double bill=0;
	public void read()
	{
		System.out.print("Enter Item ID: ");
		itemId=sc.nextInt();
		System.out.print("Enter Item Name: ");
		itemName=sc.next();
		System.out.print("Enter the price: ");
		price=sc.nextDouble();
		System.out.print("Enter the Quantity: ");
		qty=sc.nextInt();
		bill=price*qty+bill;

	}
	public void display()
	{
		System.out.println("-------------------------------------");
		System.out.println("Item ID: " +itemId);
		System.out.println("Item Name: " +itemName);
		System.out.println("Item Price: " +price);
		System.out.println("Quantity: " +qty);
		System.out.println("-------------------------------------");
	}

public void calculate()
{
		if(bill<500)
		{
			discount=0;
		}
		else if(bill>=500 && bill<1000)
		{
			discount=0.1*bill;
		}
		else if(bill>=1000 && bill<2000)
		{
			discount=0.12*bill;
		}
		else
		{
			discount=0.15*bill;
		}
		System.out.println("Total Bill: "+bill+"\nDiscount: "+discount);
		finalBill=bill-discount;
		System.out.println("Amount to be payed: "+finalBill);
		System.out.println("-------------------------------------");
}
}



