//Name:Al-Fareed
//Reg No:210970049
//Date Of Creation:4-March-2022
//Program to calculate gross pay for an employee
//------------------------------------------------------------------
import java.util.Scanner;
class EmpSal
{
	public static void main(String args[])
	{
		float hrs,pay=0,rate,diff;
		Scanner sc=new Scanner(System.in);

		 System.out.print("Enter the number of hours worked:");
		 hrs=sc.nextInt();

		 System.out.print("Enter the hourly rate:");
		 rate=sc.nextInt();

		 if(hrs<=40)
		 {
		 	pay=(hrs*rate);
	 	  }
	 	  else if(hrs>40)
	 	  {
			  diff=(hrs-40);
		 		float addn=(float)((diff*rate)*0.5);
			  pay=(hrs*rate)+addn;
		  }
		  else
		  {
			  System.out.println("Invalid input!");
		  }
		  System.out.println("The total pay="+pay);
	}
}