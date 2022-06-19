import java.util.*;
import java.io.*;
import java.lang.Exception;
class newFile 
{
    public static void main(String[] args)throws Exception
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<String> newLines=new ArrayList<>();
        try {
            String newf=new String();
            System.out.println("Enter file name");
            newf=sc.next();                                 //input for new file name
            File fileobj=new File(newf);                    //creating new object for new file
            if(fileobj.createNewFile())                     //either file is created or checks for its existence
            {
                System.out.println("Successfully created file");
            }
            else
            {
                System.out.println("File Already exist");
            }
            // FileWriter writers=new FileWriter(fileobj);         
            // System.out.println("Give an input");
            // String chars=new String();            //takes input for new file
            // chars=sc.nextLine();
            // chars=sc.nextLine();
            // writers.write(chars);
            // writers.close();
            FileReader reads=new FileReader(fileobj); //Creating object to read from file
            Scanner scObj=new Scanner(reads);
            
            File secObj=new File("outputFile.txt");//Create another file
            secObj.createNewFile();
            System.out.println("--Contents in First file--");
            while(scObj.hasNextLine())
            {
                String lines=scObj.nextLine();
                newLines.add(lines);        //insert into array list while reading each lines
                System.out.println(lines);  //display the contents
            }
            
            Collections.sort(newLines);
            System.out.println("Sorting arraylist:"+newLines);
            scObj.close();
            //sort the contents inside arraylist
            //Write into another file
            FileWriter ryt=new FileWriter("outputFile.txt");
            for (String x : newLines)
            {
                ryt.write(x);
                
            }
            ryt.close();
           System.out.println("--After sorting--");
           File fread=new File("outputFile.txt");
            Scanner x=new Scanner(fread);
            System.out.println("--Contents in Output file--");
            while(x.hasNextLine())
            {
                String s=x.nextLine();
                System.out.println(s);
            }
           sc.close();

           x.close();
        } 
        catch (Exception e) 
        {
            System.out.println("Not created");
        }
    }
}