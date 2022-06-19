/*Author Name:Al-Fareed
Reg No:210970049
Date Of Creation:6-Mat-22
Program to calculate and store details of students using Inheritance
--------------------------------------------------------------------------*/
import java.util.Scanner;
 class Student
{
	Scanner sc=new Scanner(System.in);
	long regNo;
	String name,course,sem;
	void get_data()
	{
		System.out.print("Enter Student Register Number:");
		regNo=sc.nextLong();
		System.out.print("Enter Name:");
		name=sc.next();
		System.out.print("Enter Course Name:");
		course=sc.next();
		System.out.print("Enter Semester:");
		sem=sc.next();
	}
	void display()
	{
		System.out.println("Register Number: "+regNo);
		System.out.println("Name: "+name);
		System.out.println("Course: "+course);
		System.out.println("Semester: "+sem);
	}
}
 class Exam extends Student
{
	Scanner sc=new Scanner(System.in);
	int m1,m2,m3;
	void get_data()
	{
		super.get_data();
			System.out.print("Enter Marks in 3 Subjects:");
			m1=sc.nextInt();
			m2=sc.nextInt();
			m3=sc.nextInt();
	}
		void display()
	{
		super.display();
		System.out.println("Marks in 3 Subjects :"+m1+" "+m2+" "+m3);
	}
}
 class Result extends Exam
{
	Scanner sc=new Scanner(System.in);
	double totMarks;
	String grade;
	void get_data() 
	{
		super.get_data();
		totMarks=m1+m2+m3;

	}
	void display()
	{
		super.display();
		double per=totMarks/3;
		System.out.println("Total Marks: "+totMarks);
		if(m1>=35 && m2>=35 && m3>=35 )
		{
			if(per>85)
				grade="Distinction";
			else if(per>70 && per<85)
				grade="First Class";
			else if(per>50 && per<=70)
				grade="Second Class";
			else if(per>35 && per <= 50)
				grade="Third Class";
			else 
				grade="Fail";
		}
		else
		{
			grade="Fail";
		}
		System.out.println("Grade: "+grade);
	}
}
public class Academic
{
	public static void main(String[] args) {
		Result res=new Result();
		res.get_data();
		res.display();

	}
}