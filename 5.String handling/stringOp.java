import java.util.Scanner;
class Reverse
{
    void rev(String str){
        String rev=new String();
        int len=str.length();
        str=str.toUpperCase();
        for(int i=len-1;i>=0;i--){
                rev+=str.charAt(i);
            }
        System.out.println("Reverse Of the string is:"+rev);
        palindrome(rev, str);
    }
    void palindrome(String rev,String str){
        if(rev.equals(str))
        System.out.println("The given string is a palindrome");
        else
        System.out.println("The given string is not a palindrome");
    }
}
public class stringOp {
    public static void main(String[] args) {
        Reverse r=new Reverse();
        Scanner sc=new Scanner(System.in);
        String str=new String();
        System.out.print("Enter a string:");
        str=sc.next();
        r.rev(str);
        sc.close();
    }
}
