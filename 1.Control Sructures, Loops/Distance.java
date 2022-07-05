//Name:Al-Fareed
//Reg No:210970049
//Date Of Creation:4-March-2022
//Program to calculate Distance travelled in Km
//------------------------------------------------------------------
import java.util.Scanner;
class Distance
{
	public static void main(String args[])
	{
		float fuel,dist,mileage,l,d,est_f,est_d;
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the distance(in KM) :");
		dist=sc.nextInt();

		System.out.print("Enter the fuel consumed(in Litre) :");
		fuel=sc.nextInt();

		mileage=dist/fuel;
		System.out.println("Average fuel economy is = " +mileage);
		boolean flag=true;
		while(flag)
		{

			// System.out.println("");
			int ch;
			System.out.println("1.Distance Estimation");
			System.out.println("2.Fuel Estimation");
			System.out.println("Press 0 to exit");
			ch=sc.nextInt();
			switch(ch)
			{
				case 0:flag=false;
						break;
				case 1: System.out.println("Enter the fuel consumed (in Litre):");
						l=sc.nextInt();
						est_d=(l*mileage);
						System.out.println("Estimated distance = "+est_d);
						break;
				case 2: System.out.println("Enter the distance(in KM) :");
						d=sc.nextInt();
						est_f=(d/mileage);
						System.out.println("Estimated fuel = "+est_f);
						break;

		}
	}
}

}
