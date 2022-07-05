import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Exception;
class MarksOutOfBoundException extends Exception{
	MarksOutOfBoundException()
	{
		super();
	}
}
 class Marks extends MarksOutOfBoundException
{
	Scanner sc=new Scanner(System.in);
	int rollNo,m1,m2,m3,total;
	double per;
	String grade,name;
	
	void getData() throws NumberFormatException
	{
		System.out.println("Enter the Roll No of the Student:");
		rollNo=sc.nextInt();
		System.out.println("Enter the Name of the Student:");
		name=sc.next();
	}
	void getMarks()
	{
		System.out.println("Enter the Marks in 3 subjects:");
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
	}
	
	void checkData() throws MarksOutOfBoundException 
	{
			
		if(m1>100 || m2>100 || m3>100 || m1<0 || m2<0 || m3<0)
		{
			throw new MarksOutOfBoundException();
		}
		total=m1+m2+m3;
		per=total/3;
		if(m1<35 || m2<35 || m3<35)
		{
			grade="Fail";
		}
		else if(per>=85 && per<=100)
		{
			grade="Distinction";
		}
		else if(per>=70 && per<85)
		{
			grade="First Class";
		}
		else if(per>=60 && per<70)
		{
			grade="Second Class";
		}
		else if(per>=60 && per<70)
		{
			grade="Second Class";
		}
		else if(per>=35 && per<60)
		{
			grade="Third Class";
		}
		else
		{
			grade="Fail";
		}
	}
	void display()
	{
		System.out.println("Roll No : "+rollNo);
		System.out.println("Name : "+name);
		System.out.println("Marks in 3 subjects : \nM1: "+m1+"\nM2: "+m2+"\nM3: "+m3);
		System.out.print("Total :"+total);
		System.out.println("\tPercentage : "+per);
		System.out.println("Grade : "+grade);
	}
	}
	

public class Student {
	public static void main(String[] args) throws MarksOutOfBoundException {
		Marks m=new Marks();
		
		try {
			m.getData();
			m.getMarks();
			m.checkData();
			m.display();	
		}
		catch(NumberFormatException e)
		{
			System.out.println("Number Format Exception!");
			m.getMarks();
			m.checkData();
			m.display();
		}
		catch(MarksOutOfBoundException e)
		{
			System.out.print("Marks must be between 0-100!\n");
			m.getMarks();
			m.checkData();
			m.display();
		}
		catch(InputMismatchException e)
		{
			System.out.println("Invalid type of entry..");
		}
}
}
