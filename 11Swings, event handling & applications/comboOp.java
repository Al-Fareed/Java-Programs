import javax.swing.*;
public class comboOp {    
JFrame f;  
JTextField text1=new JTextField();
JTextField text2=new JTextField();
JLabel lb1=new JLabel();
String country[]={"Addition","Subtraction","Multiplication","Division"};        
JComboBox cb=new JComboBox();
comboOp(){    
    f=new JFrame("ComboBox Example");   

    JTextField text1=new JTextField(3);
    text1.setBounds(50,90,100,30);
    f.add(text1);

    JTextField text2 =new JTextField(3);
    text2.setBounds(150,90,100,30);
    f.add(text2);
  
    cb.setBounds(50, 50,90,20);    
    f.add(cb);     
    
    JComboBox cb=new JComboBox(country);

     cb.addActionListener(this);
    
    JLabel lb1=new JLabel("Result:");
    f.add(lb1);

    f.setLayout(null);    
    f.setSize(400,500);    
    f.setVisible(true);         
}  
public void actionPerformed(Action e )
{
    int a=Integer.parseInt(text1.getText());
    int b=Integer.parseInt(text2.getText());
    int c;
    if(cb.getSelectedIndex()==1)
    {
        c=a+b;
        lb1.setText(String.valueOf(c));
    }
}  

public static void main(String[] args) {    
    new comboOp();         
}    
}   