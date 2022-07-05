//Name:Al-Fareed
//Reg No:210970049
//Date Of Creation:4-March-2022
//Program to calculate BMI of a person
//------------------------------------------------------------------
import java.util.Scanner;
class BMI
{
public static void main(String args[])
{
	int height,weight;
	float bmi,h;
	Scanner sc=new Scanner(System.in);

	System.out.println("Enter your Weight in KG:"); //Input for Weight
	weight=sc.nextInt();

	System.out.println("Enter your Height cm:"); //Input for Height
	height=sc.nextInt();

	h=height;
	h=(h/100);

	bmi=(weight/(h*h)); //Calculate BMI
 	System.out.println("BMI :" +bmi);
	if(bmi<18.5)
	{
			System.out.println("Underweight?");
	}
	else if(bmi>=18.5 && bmi<=24.9)
	{
		System.out.println("Normal :)");
	}
	else if(bmi>=25 && bmi<=29.9)
	{
			System.out.println("Overweight !");
	}
	else
	{
		System.out.println("Obese :(");
	}
}
}

