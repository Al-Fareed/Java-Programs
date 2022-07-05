import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

class arithOp extends JFrame implements ActionListener {

    JButton addn,mul,div,sub;
    JTextField jt1, jt2;
    JTextField lbl;

    arithOp() {
        super("Calculator");
        jt1 = new JTextField();
        jt1.setBounds(90, 50, 150, 30);
        add(jt1);

        jt2 = new JTextField();
        jt2.setBounds(90, 80, 150, 30);
        add(jt2);

        lbl = new JTextField("Result :");
        lbl.setBounds(90, 140, 150, 30);
        add(lbl);

        addn = new JButton("+");
        addn.setBounds(90, 200, 100, 30);
        add(addn);

        mul = new JButton("*");
        mul.setBounds(90, 240, 100, 30);
        add(mul);

        sub = new JButton("-");
        sub.setBounds(90, 280, 100, 30);
        add(sub);

        div = new JButton("/");
        div.setBounds(90, 320, 100, 30);
        add(div);

        addn.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        sub.addActionListener(this);


        setLayout(null);
        setSize(600, 400);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {

        int a = Integer.parseInt(jt1.getText());
        int b = Integer.parseInt(jt2.getText());
        int c = 0;

        if (e.getSource().equals(addn)) {
            c = a + b;
            lbl.setText(String.valueOf(c));
        }
        else if (e.getSource().equals(mul)) {
            c = a * b;
            lbl.setText(String.valueOf(c));
        }
        else if (e.getSource().equals(sub)) {
            c = a - b;
            lbl.setText(String.valueOf(c));
        }
        else if (e.getSource().equals(div)) {
            c = a / b;
            lbl.setText(String.valueOf(c));
        }
        else
        {
            
        }
    }

    public static void main(String args[]) {
        arithOp t = new arithOp();
    }
}