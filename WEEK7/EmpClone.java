import java.util.*;
class Employee implements Cloneable
{
    Scanner sc=new Scanner(System.in);
    String name,des;
    int id;
    double sal;
    Employee cloning() throws CloneNotSupportedException{
        return (Employee) super.clone();  
    }
    void getData()
    {
        System.out.print("Enter Employee ID:");
        id=sc.nextInt();
        System.out.print("Enter Employee Name:");
        name=sc.next();
        System.out.print("Enter Employee's Salary:");
        sal=sc.nextDouble();
        System.out.print("Enter Employee's Designation:");
        des=sc.next();
    }
    void dispData()
    {
        System.out.println("Employee ID:"+id);
        System.out.println("Employee Name:"+name);
        System.out.println("Salary:"+sal);
        System.out.println("Designation:"+des);
    }
}
class EmpClone{
    public static void main(String[] args) throws CloneNotSupportedException {
        Employee e=new Employee();
        e.getData();
        e.dispData();
        Employee e1=(Employee) e.cloning();
        e1.getData();
        e1.dispData();
    }
}