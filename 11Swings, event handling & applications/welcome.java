import javax.swing.*;

public class welcome {
    JFrame f = new JFrame("New Window");

    public welcome() {
        JLabel lb1 = new JLabel("Welcome User");
        lb1.setBounds(100, 100, 100, 50);
        f.add(lb1);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(300, 300);
        f.setVisible(true);
    }
}
