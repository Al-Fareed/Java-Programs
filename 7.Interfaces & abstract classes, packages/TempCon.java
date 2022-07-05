import java.util.*;
import CtoF.*;
import FtoC.*;
class TempCon
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        CelsToFahr a=new CelsToFahr();
        FahrToCels b=new FahrToCels();
        int ch;
        double cel,fah;
        do{
            System.out.println("Menu:\n1.Convert Celsius to Fahrenheit\n2.Convert Fahrenheit to Celsius\nEnter your choice(Press 0 to quit:)");
            ch=sc.nextInt();
            switch (ch) {
                case 1:System.out.println("Enter temperature in Celsius:");
                        cel=sc.nextDouble();
                        System.out.println("Temperature in Fahrenheit:"+a.ConvertCToF(cel));
                    break;
                case 2:System.out.println("Enter temperature in Fahrenheit:");
                         fah=sc.nextDouble();
                         System.out.println("Temperature in Celsius:"+b.ConvertFToC(fah));
            } 
        }while(ch!=0);
        sc.close();
    }
}