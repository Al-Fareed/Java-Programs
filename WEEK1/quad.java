//Name:Al-Fareed
//Reg No:210970049
//Date Of Creation:4-March-2022
//Program to find two roots of a quadratic equation.
//------------------------------------------------------------------
import java.lang.Math;
class quad
{
	public static void main(String args[])
	{
		double r1,r2,a,b,c;
		a=Double.parseDouble(args[0]);
		b=Double.parseDouble(args[1]);
		c=Double.parseDouble(args[2]);
		double roots=((b*b)-(4*a*c));  //Finding discriminant
		if(roots==0)
		{
			r1=(-(b)+Math.sqrt(roots))/(2*a);
			System.out.println("Only one roots:"+r1 );
		}
		else if(roots<0)
		{
			System.out.println("Roots are imaginary!");
		}
		else
		{
			r1=(-(b)+Math.sqrt(roots))/(2*a);
			r2=(-(b)-Math.sqrt(roots))/(2*a);
			System.out.println("Two roots");
			System.out.println("r1:"+r1 );
			System.out.println("r2:"+r2 );
		}
	}
}