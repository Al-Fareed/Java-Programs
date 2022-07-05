import java.util.Scanner;
import java.io.*;
public class fileCopy 
{
    public static void main(String[] args) throws IOException 
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the source file name:");   
        String src=new String();
        src=sc.next();
        File OneObj=new File(src);
        OneObj.createNewFile();

        System.out.println("Enter the destination file name to be copied:");
        String des=new String();
        des=sc.next();
        File secObj=new File(des);
        secObj.createNewFile();

        FileReader oneRead=new FileReader(OneObj);
        Scanner oneScan=new Scanner(oneRead);
        FileWriter secWrite=new FileWriter(secObj);
        while (oneScan.hasNextLine()) 
        {
            String str=oneScan.nextLine();
            secWrite.write(str);
        }
        oneScan.close();
        secWrite.close();
        System.out.println("--Copied Successfully--");
        FileReader twoRead=new FileReader(secObj);
        Scanner twoScan=new Scanner(twoRead);
        while (twoScan.hasNextLine()) 
        {
            String str2=twoScan.nextLine();
            System.out.println(str2);
        }
       
        twoScan.close();
        sc.close();
    }
    
}
