import java.util.*;
public class vectorOp 
{
	static Scanner sc=new Scanner(System.in);
	static void display(Vector<Integer> v)
	{
		Iterator<Integer> itr = v.iterator();
		System.out.println("\nElements in vector:");
		 while(itr.hasNext())
		 System.out.print(itr.next() + " ");
		 System.out.println();
	}
	static void insert(Vector<Integer> v)throws Exception
	{
		try {
		System.out.println("Enter the position where you want to insert:");
		int pos,ele;
		pos=sc.nextInt();
		System.out.print("Enter the value to be inserted at that position:");
		ele=sc.nextInt();
		v.add(pos, ele);
		}
		catch(Exception e)
		{
			System.out.print("Entha bvc size nodi haaku!");
		}
	}
	static void insEnd(Vector<Integer> v)
	{
		int ele;
		System.out.print("Enter the value to be inserted at end:\n");
		ele=sc.nextInt();
		v.add(ele);
	}
	static void delete(Vector<Integer> v)
	{
		int end=v.size()-1;
		System.out.println("Size:"+end);
		v.remove(end);
		System.out.println("Deleted an Element");
	}
	public static void main(String args[]) throws Exception
	{
		
		Vector<Integer> v=new Vector<Integer>(4,2);
		int n,ch;
		int ele;
		System.out.println("Cpacity:"+v.capacity());
		System.out.println("Enter the number of limits:");
		n=sc.nextInt();
		System.out.println("Enter "+n+" values:");
		for(int i=0;i<n;i++)
		{
			ele=sc.nextInt();
			v.addElement(ele);
		}
		do
		{
			System.out.println("Options:\n1.Insert element at specified position\n2.Insert an element at the end\n3.Delete an element\n4.Display the contents");
			System.out.println("Enter your Options:");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1:insert(v);
				break;
				case 2:insEnd(v);
				break;
				case 3:delete(v);
				break;
				case 4:display(v);
				break;
			}
		}while(ch!=0);
		
		
	}
	
}

