import java.util.*;
// import java.lang.Exception;
class OneDmArray
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        int b[]=new int[5];
        int c[]=new int[5];
        int n;
        try
        {
            System.out.println("Enter the number of elements in arrays:");
            n=sc.nextInt();
            if(n>5)
               { 
                sc.close();
                throw new ArrayIndexOutOfBoundsException();
            }
            System.out.println("Enter the array 1:");
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            System.out.println("Enter the array 2:");
            for(int i=0;i<n;i++){
                b[i]=sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                c[i]=a[i]/b[i];
                System.out.print(" "+c[i]);
            }
    }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Naal'dh jaasti aapuji anna..!");
        }
        catch(ArithmeticException e)
        {
            System.out.println("\n0'd divide malpare aapuji");

        }
        sc.close();
    }
}