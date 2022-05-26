
import java.util.Scanner;
import java.io.*;

public class Bank {

    static void add(int accno, String name, int age, Double bal) throws Exception {
        File empFile = new File("account_info.txt");
        empFile.createNewFile();
        FileWriter writes = new FileWriter(empFile, true);
        BufferedWriter bf = new BufferedWriter(writes);
        bf.append("" + accno);
        bf.append("\t\t" + name);
        bf.append("\t" + age);
        bf.append("\t" + bal);
        bf.append("\n");
        bf.close();
    }

    static void display() throws Exception {
        FileReader ob1 = new FileReader("account_info.txt");
        Scanner reader = new Scanner(ob1);
        System.out.println("Account No\tName\t\tAge\tbal");
        while (reader.hasNextLine()) {
            String str = reader.nextLine();
            System.out.println(str);
        }
        reader.close();
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String name = new String();
        int age, ch, accno;
        double bal;
        do {
            System.out.println("Options\n1.Add Customers\n2.Display Customers\nEnter your choice(Press 0 to quit):");
            ch = sc.nextInt();
            switch (ch) {
                case 0:
                    return;
                case 1:
                    System.out.println("Enter Account Number:");
                    accno = sc.nextInt();
                    System.out.println("Enter Customer Name:");
                    name = sc.next();
                    System.out.println("Enter Age:");
                    age = sc.nextInt();
                    System.out.println("Enter Bank balance:");
                    bal = sc.nextDouble();
                    add(accno, name, age, bal);

                    break;
                case 2:
                    display();
                    break;
                default:
                    System.out.println("Invalid choice..!");
            }
        } while (ch != 0);
        sc.close();
    }
}
