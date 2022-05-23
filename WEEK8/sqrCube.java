import java.util.*;
class Thread1 extends Thread{
    int n;
    Thread1(int n)
    {
        this.n=n;
    }
public void run()
{
    for (int i = 1; i <=n; i++) {
        System.out.println("Square of"+i+" is : "+(i*i));
    }
}
}
class Thread2 extends Thread{
    int n;
    Thread2(int n)
    {
        this.n=n;
    }
    public void run()
    {
        for (int i = 1; i <=5; i++) {
            System.out.println("Cube of"+i+" is   : "+(i*i*i));
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
        Thread2 t2=new Thread2(n);
        t1.start();
        t2.start();
        sc.close();
    }
}
