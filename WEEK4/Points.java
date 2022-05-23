import java.util.*;
import java.lang.Math;

class coOrd {
    Scanner sc = new Scanner(System.in);
    int x, y;

    void input() {
        x = sc.nextInt();
        y = sc.nextInt();
    }
    void display() {
        System.out.println("("+ x + ", " + y+")");
    }
    void cal(coOrd p1, coOrd p2, coOrd p3){
        double a, b, c , add,addn , d, e;
        a = ((p2.x - p1.x) * (p2.x - p1.x));
        b = ((p2.y - p1.y) * (p2.y - p1.y));
        c= ((p3.y - p1.y) * (p3.y - p1.y));
        add = a + b;
        addn = a + c;
        System.out.print("Distance between p1 and p2 = ");
        d = Math.sqrt(add);
        System.out.println(d);
        System.out.print("Distance between p1 and p3 = ");
        e = Math.sqrt(addn);
        System.out.println(e);
    } 
}

class Points {
    public static void main(String[] args) {
        coOrd p1 = new coOrd();
        coOrd p2 = new coOrd();
        coOrd p3 = new coOrd();
        System.out.print("Enter the coordinates for p1: ");
        p1.input();
        System.out.print("Enter the coordinates for p2: ");
        p2.input();
        System.out.print("Enter the coordinates for p32: ");
        p3.input();
        System.out.print("p1:");
        p1.display();
        System.out.print("p2:");
        p2.display();
        System.out.print("p3:");
        p3.display();
        p1.cal(p1,p2,p3); 
    }
}