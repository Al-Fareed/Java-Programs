//Name:Al-Fareed
//Reg No:210970049
//Date Of Creation:4-March-2022
//Program to calculate fee after each year
//------------------------------------------------------------------
import java.util.Scanner;
class Fees
{
public static void main(String args[])
{
	float fee=50000,f;

	f=(float)(fee*0.05); //5% of fees

	for(int i=1;i<=10;i++)
	{
		fee=(float)(fee+f); //add 5% to the fees
		System.out.println("The Fee after "+i+" year =" +fee);
	}
}
}