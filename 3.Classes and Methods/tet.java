import java.util.Scanner;
class tet{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int count=0,total=0;
System.out.print("Enter a limt");
int n=sc.nextInt();
for(int i=0;i<=n;i++)
{
	if(i%5==0)
	{
		total=total+i;
	}
	if(i%2==0)
	{
		count++;
	}

}
System.out.print("Total of number divisible by 5: "+total+"\nNumber of even numbers: "+count);
}
}