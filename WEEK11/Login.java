import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
class Login extends JFrame implements ActionListener
{
    JButton sub;
    JTextField jt1, jt2;
    JLabel lb1,lb2;
    JFrame frame;
    Login()
    {
        frame=new JFrame("Login");

        lb1=new JLabel("Username:");
        lb1.setBounds(10,50,90,30);
        frame.add(lb1);

        jt1= new JTextField();
        jt1.setBounds(110, 50, 150, 30);
        frame.add(jt1);

        lb2=new JLabel("Password:");
        lb2.setBounds(10, 80, 70, 30);
        frame.add(lb2);

        jt2 = new JTextField();
        jt2.setBounds(110, 80, 150, 30);
        frame.add(jt2);

        JButton sub=new JButton("Submit");
        sub.setBounds(80, 140, 100, 30);
        frame.add(sub);
        sub.addActionListener(this);

        frame.setLayout(null);
        frame.setSize(300, 400);
        frame.setVisible(true);  

    }
    public void actionPerformed(ActionEvent e) 
    {
        String txt1=jt1.getText();
        String txt2=jt2.getText();
            if(txt1.equals("User") && txt2.equals("user"))
            {
                frame.dispose();
                new welcome();
            }
            else
            {
                JOptionPane.showMessageDialog(frame, " Invalid ID and Password" , "ERROR",JOptionPane.ERROR_MESSAGE);
            }
    }
    public static void main(String[] args) {
        new Login();
    }
}
