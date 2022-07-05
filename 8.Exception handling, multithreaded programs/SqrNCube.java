import java.util.*;
public class SqrNCube {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n;
        int a[]=new int[10];
        int b[]=new int[10];
        System.out.println("Enter the limit:");
        n=sc.nextInt();
        for (int i = 1; i <= n; i++)
        {
            a[i]=i*i;
            b[i]=i*i*i;    
        }
        for(int i=1;i<=n;i++)
        {
            System.out.println(a[i]+" "+b[i]);
        }
    }
}
