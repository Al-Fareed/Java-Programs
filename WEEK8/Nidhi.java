import java.util.Scanner;

class MarksOutofBound extends Exception {
    MarksOutofBound(String s) {
        super(s);
    }
}

class Nidhi {
    public static void main(String args[]) throws MarksOutofBound {
        Scanner sc = new Scanner(System.in);
        String name;
        long rno = 0;
        double m1, m2, m3, avg;
        char grade;

        System.out.println("----Enter the details of student----");
        System.out.print("\nName: ");
        name = sc.nextLine();

        while (true) {
            try {
                System.out.print("\nRegistration no: ");
                rno = Long.parseLong(sc.next());
                break;

            } catch (NumberFormatException n) {
                System.out.println("Registration number must be only numeric");

                continue;
            }
        }

        while (true) {

            try {
                System.out.print("\nMarks in 3 subjects: ");
                m1 = sc.nextDouble();
                m2 = sc.nextDouble();
                m3 = sc.nextDouble();
                if (m1 < 0 || m1 > 100 || m2 < 0 || m2 > 100 || m3 < 0 || m3 > 100)
                    throw new MarksOutofBound("Marks should be in the range of 0 and 100");
                break;

            } catch (Exception e) {
                System.out.println(e);
                continue;

            }
        }
        avg = (m1 + m2 + m3) / 3;
        if (m1 >= 35 && m2 >= 35 && m3 >= 35) {
            if (avg >= 90)
                grade = 'A';
            else if (avg >= 80 && avg < 90)
                grade = 'B';
            else if (avg >= 60 && avg < 80)
                grade = 'C';
            else if (avg >= 33 && avg < 60)
                grade = 'D';
            else
                grade = 'F';
        } else
            grade = 'F';

        System.out.println("---Student details----");
        System.out.println("Name: " + name);
        System.out.println("Registration no: " + rno);
        System.out.println("Mark1: " + m1);
        System.out.println("Mark2: " + m2);
        System.out.println("Mark3: " + m3);
        System.out.println("Average: " + avg);
        System.out.println("Grade: " + grade);

    }
}
