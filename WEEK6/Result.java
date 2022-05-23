/*Author Name:Al-Fareed
Reg No:210970049
Date Of Creation:6-Mat-22
Program to calculate and store details of students using Inheritance
--------------------------------------------------------------------------*/
import java.util.Scanner;
public class Student
{
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
		System.out.print();
	}
	void display()
	{

	}
}
public class Exam extends Student
{
	int m1,m2,m3;
	void get_data()
	{
			System.out.print("Enter Marks in 3 Subjects:");
			m1=sc.nextInt();
			m2=sc.nextInt();
			m3=sc.nextInt();
	}
		void display()
	{

	}
}
public class Result extends Exam
{
	double totMarks;
	String grade;
	void get_data()
	{

	}
	void display()
	{

	}
}