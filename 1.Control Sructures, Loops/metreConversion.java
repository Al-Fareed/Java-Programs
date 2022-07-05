//Name:Al-Fareed
//Reg No:210970049
//Date Of Creation:4-March-2022
//program to convert the input speed from kilometre per hour to meters per
//second and vice versa.
//------------------------------------------------------------------
import java.util.Scanner;
import java.lang.Math;
class metreConversion
{
	public static void main(String args[])
	{
		float km,mtr;
		int ch;
		Scanner sc=new Scanner(System.in);
		do
		{

			System.out.println("1. km_per_hr to mtr_per_sec");
			System.out.println("2.mtr_per_sec to km_per_hr");
			System.out.println("Enter your choice(0 to Stop):");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:System.out.println("Enter the speed in km_per_hr:");
						km=sc.nextInt();
						mtr=(km*1000)/3600;
						System.out.println("Speed in mtr_per_sec: "+mtr);
						break;
				case 2:System.out.println("Enter the speed in mtr_per_sec:" );
						mtr=sc.nextInt();
						km=(mtr*3600)/1000;
						System.out.println("Speed in km_per_hr: "+km);
						break;

			}
		}while(ch!=0);
	}
}

