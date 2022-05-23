/*Author Name:Al-Fareed
Reg No:210970049
Date Of Creation:6-May-22
Program to calculate volume of box through Inheritance
---------------------------------------------------------*/
import java.util.Scanner;
class Box
{
	int wd,l,h;
	Box(int l,int wd,int h)
	{
		this.l=l;
		this.wd=wd;
		this.h=h;
	}
	public int vol()
	{
		return (wd*l*h);
	}
}
class attr extends Box
{
	int wt;
	String col;
	attr(int l,int wd,int h,int wt,String col)
	{
		super(l,wd,h);
		this.wt=wt;
		this.col=col;
		System.out.println("Length:"+l);
		System.out.println("width:"+wd);
		System.out.println("Height:"+h);
	}
	public void display()
	{

		System.out.println("Volume:"+vol());
		System.out.println("Weight:"+wt);
		System.out.println("Color:"+col);
	}
}
 class Volume
{
	public static void main(String[] args) {
		int wid,len,h,wt;
		String col;
		Scanner sc=new Scanner(System.in);
		System.out.println("Length, Width,Height,Weight and Color ?");
		len=sc.nextInt();
		wid=sc.nextInt();
		h=sc.nextInt();
		wt=sc.nextInt();
		col=sc.next();
		Box b=new Box(len,wid,h);
		attr a=new attr(len,wid,h,wt, col);
		a.display();
		sc.close();
	}
}