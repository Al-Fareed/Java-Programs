import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class currConversion extends JFrame implements ActionListener {
    
    JTextField inr,dollar;
    JButton con;
    JFrame frame;
    JLabel lb1,lb2;
    currConversion()
    {
        frame=new JFrame("Money Conversion");
        //Rupees Label
        lb1=new JLabel("Rupees:");
        lb1.setBounds(10,20,100,30);
        frame.add(lb1);
        //Rupess text field
        inr=new JTextField(3); 
        inr.setBounds(210,20,100,30);
        frame.add(inr);

        //Conversion Button
        con=new JButton("Convert");
        con.setBounds(210,60,100,30);
        frame.add(con);

        con.addActionListener(this);
        //Dollar label
        lb2=new JLabel("Dollar:");
        
        lb2.setBounds(10,100,100,30);
        frame.add(lb2);
        //Dollar text field
        dollar=new JTextField(3);
        dollar.setBounds(210,100,100,30);
        frame.add(dollar);


        frame.setLayout(null);
        frame.setSize(500, 400);
        frame.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        double a = Double.parseDouble(inr.getText());
        double c = a*0.13;
        dollar.setText(String.valueOf(c));
        
    }
    public static void main(String[] args) {
        new currConversion();
    }
}
