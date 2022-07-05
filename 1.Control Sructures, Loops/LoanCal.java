//Name:Al-Fareed
//Reg No:210970049
//Date Of Creation:4-March-2022
//Program to calculate  monthly and total payments for each interest rate
//------------------------------------------------------------------
import java.util.Scanner;
import java.util.*;
class LoanCal
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		float loan,rate,years,mpayment;
		System.out.println("Loan Amount:");
		loan=sc.nextInt();
		System.out.println("Number Of Years:");
		years=sc.nextInt();
		System.out.print("Interest Rate\tMonthly payment\tTotal Payment\n");
		for(rate=5;rate<=8;)
		{
			float mir=(rate/100)/12;

		mpayment=(float)((loan*mir)/(1-(1/Math.pow((1+mir),years*12))));
		float tpay=(float)mpayment*12*5;
		System.out.print(rate+"\t\t");
		System.out.print(mpayment+"\t");
		System.out.print(tpay+"\t");
		System.out.println("  ");
		rate+=0.125;
		}
}
}