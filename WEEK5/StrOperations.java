import java.util.Scanner;

public class StrOperations {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two Strings:");
        String str1=sc.next();
        String str2=sc.next();
        int lenstr=str1.length();
        System.out.print("Input Position : ");
        int pos=sc.nextInt();
        System.out.print("Input length : ");
        int len=sc.nextInt();
        System.out.println("Uppercase of "+str1+" is "+str1.toUpperCase());
        System.out.println("Lowercase of "+str2+" is "+str2.toLowerCase());
        System.out.println("Substring of "+str1+" from position "+pos+" with length "+len+" = "+str1.substring(pos,pos+len) );
        System.out.print("After Inserting "+str2+" into "+str1+" at position "+pos+" = ");
        String stringins=str1.substring(0,pos);
        String laststr=str1.substring(pos,lenstr);
        System.out.println((stringins+str2+laststr));
        System.err.println("Afetr appending "+str2+" to "+str1+" = "+(str1+str2));
    }
    
}
