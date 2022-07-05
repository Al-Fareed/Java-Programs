import java.util.*;
class Employee {
    static Scanner sc=new Scanner(System.in);
    static ArrayList<Integer> idList = new ArrayList<>();
    static ArrayList<Integer> ageList = new ArrayList<>();
    static ArrayList<String> nameList = new ArrayList<>();
    static ArrayList<String> desList = new ArrayList<>();
    static ArrayList<Double>  salList= new ArrayList<>();
    static int id,age;
    static String name=new String();
    static String des=new String();
    static double sal;
    static void Add()
    {
        System.out.println("Enter Employee details below:");
        System.out.print("ID:");
        id=sc.nextInt();
        idList.add(id);
        System.out.print("Name:");
        name=sc.next();
        nameList.add(name);
        System.out.print("Designation:");
        des=sc.next();
        desList.add(des);
        System.out.print("Age:");
        age=sc.nextInt();
        ageList.add(age);
        System.out.print("Salary:");
        sal=sc.nextDouble();
        salList.add(sal);
    }
    static void Remove()
    {
        if(idList.size()==0)
        {
            System.out.println("No Employees to remove..!");
        }
        else
        {
            System.out.println("Enter the Employee ID to be removed:");
            int eid=sc.nextInt();
            for(int i=0;i<idList.size();i++)
            {
                if(eid==idList.get(i))
                {
                    System.out.println("Employee "+nameList.get(i)+" has been removed..");
                    idList.remove(i);
                    nameList.remove(i);
                    desList.remove(i);
                    ageList.remove(i);
                    salList.remove(i);
                }
                else
                {
                    System.out.println("No Employee records found..");
                }
            }
        }
    }
    // static void Display()
    {
        if(idList.size()==0)
        {
            System.out.println("0 Employee records..!");
        }
        else
        // {
            for (int i = 0; i < idList.size(); i++) 
            {
                System.out.println("----------------------------------------------");
                System.out.println("ID:"+idList.get(i));
                System.out.println("Name:"+nameList.get(i));
                System.out.println("Age:"+ageList.get(i));
                System.out.println("Designation:"+desList.get(i));
                System.out.println("Salary:"+salList.get(i));
                System.out.println("----------------------------------------------");
            }
        }
    }
    public static void main(String[] args) {
        int ch;
        do{
            System.out.println("\nOptions\n1.Add Employee\n2.Remove Employee\n3.Display Employee details");
            System.out.print("Enter your choice(Press 0 to quit):");
            ch=sc.nextInt();
            switch (ch) {
                case 1:Add();
                        break;
                case 2:Remove();
                        break;
                case 3:Display();
                        break;
            }
        }while(ch!=0);
    sc.close();
    }
}