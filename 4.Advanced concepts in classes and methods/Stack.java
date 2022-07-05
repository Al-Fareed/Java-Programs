import java.util.*;
class Operations
{
    int top=-1,data;
    final int MAXSIZE=5;
    int Stack[]=new int[10];
    Scanner sc=new Scanner(System.in);
    void push()
    {
        if(isfull()==true)
        {
           System.out.println("Stack is Full..!");
            return;
        }
        else
        {
            System.out.print("Enter an Item:");
            data=sc.nextInt();
            top+=1;
            Stack[top]=data;
            System.out.println("Inserted Item "+data);
        }
    }
    void pop()
    {
        if(isempty()==true)
        {
            System.out.println("Stack is Empty..!");
            return;
        }
        else
        {
            data=Stack[top];
            top-=1;
            System.out.println("Deleted Item "+data);
        }
    }
    boolean isfull()
    {
        if(top==MAXSIZE)
            return true;
        else
            return false;
    }
    boolean isempty()
    {
        if(top==-1)
            return true;
        else
            return false;
    }
    void display()
    {
        if(isempty()==true)
        {
            System.out.println("Stack is Empty..!");
        }else
        {
            System.out.println("The Element at tha top is: "+Stack[top]);
            return;
        }
    }
}
class Stack
{
    public static void main(String args[])
    {
        Operations op=new Operations();
        Scanner sc=new Scanner(System.in);
        int ch;
        boolean flag=true;
        while(flag){
            System.out.print("Menu\n1.Insert\n2.Delete\n3.Display\nEnter your choice(Enter 0 to quit):");
            ch=sc.nextInt();
            switch(ch)
            {
                case 0:flag=false;
                        break;
                case 1:op.push();
                        break;
                case 2:op.pop();
                        break;
                case 3:op.display();
                        break;
                default : System.out.println("Invalid choice..!");
            }
        }
        sc.close();
    }
}