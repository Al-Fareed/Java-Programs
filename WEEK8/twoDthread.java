import java.util.*;
import java.lang.Runnable;
 class Frow extends Thread{
    public 
    int Fsum=0;
    int[][] f=new int[10][10];
    Frow(int a[][])
    {
        f=a;
    }
    public void run()
    {
        for (int i = 0; i < 1; i++) 
        {
           for(int j=0;j<3;j++)
           {
                Fsum=f[i][j]+Fsum;
           }
           System.out.println("Sum of first row : "+Fsum);
        }
    }
}
 class Srow  implements Runnable{
    public 
    int[][] s=new int[10][10];
    int Ssum=0;
    public Srow(int a[][])
    {
       // super(a);
        s=a;
    }
    public void run()
    {
        for (int i = 1; i < 2; i++) 
        {
           for(int j=0;j<3;j++)
           {
                Ssum=s[i][j]+Ssum;
           }
           System.out.println("Sum of Second row : "+Ssum);
        }
    }
}
class Trow implements Runnable{
    int t[][]=new int[10][10];
    public 
    int Tsum=0;
    Trow(int a[][])
    {
       // super(a);
        t=a;
    }
    public void run()
    {
       
        for (int i = 2; i < 3; i++) 
        {
           for(int j=0;j<3;j++)
           {
                Tsum=t[i][j]+Tsum;
           }
           System.out.println("Sum of Third row : "+Tsum);
        }
    }
}
public class twoDthread extends Exception{
    public static void main(String[] args) {
        try{
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[10][10];
        System.out.println("Enter the 3X3 matrix:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Entered matrix is:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(a[i][j]+"\t"); 
            }
            System.out.print("\n");
        }
        Frow f=new Frow(a);
        Srow s=new Srow(a);
        Trow t=new Trow(a);
        Thread t1=new Thread(f);
        Thread t2=new Thread(s);
        Thread t3=new Thread(t);
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
        int total=f.Fsum+s.Ssum+t.Tsum;
        System.out.println("Total sum of elements in matrix is:"+total);
        sc.close();
    }
    catch(InterruptedException e)
    {
        System.out.println("Thread was Interrupted ");
    }
    }
}
