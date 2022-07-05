import java.util.*;
class Thread1 extends Thread{
    int n;
    Thread1(int n)
    {
        this.n=n;
    }
public void run()
{
    String name=getName();
    if(name.equals("Thread-0"))
    {
        for (int i = 1; i <=n; i++) 
        {
            System.out.println("Square of"+i+" is : "+(i*i));
        }
    }
    else if(name.equals("Thread-1"))
    {
        for (int i = 1; i <=n; i++) 
        {
            System.out.println("Cube of"+i+" is   : "+(i*i*i));
        }
    }
    else
    {
        System.out.println("couldnt compare");
    }
}
}
public class sqrCube {
    public static void main(String[] args) {
        System.out.println("Enter the limit:");
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        Thread1 t1=new Thread1(n);
        Thread1 t2=new Thread1(n);
        t1.start();
        t2.start();
        sc.close();
    }
}
