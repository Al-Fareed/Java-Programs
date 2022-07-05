//Author : Nagesh Shenoy
//Reg. no : 210970134
//Date : 04-06-2022
//Program to implement simple calculator using combo box

package week11;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class CalculatorComboBox implements ItemListener {

	private JFrame frame;
	JLabel l1,l2,l3,l4,res;	
	JTextField op1,op2;
	JComboBox cb;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorComboBox window = new CalculatorComboBox();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalculatorComboBox() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Simple Calculator");
		frame.setBounds(100, 100, 450, 300);
		frame.setSize(300,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		l1 = new JLabel("Enter the First Operand  ");
		l2 = new JLabel("Enter the Second Operand ");
		l3 = new JLabel("Result ");
		l4 = new JLabel("Select an Operation ");
		res = new JLabel("0");
		
		op1 = new JTextField(5);
		op2 = new JTextField(5);
		
		String operation[] = {"Addition","Subtraction","Multiply","Divide"};
		cb = new JComboBox(operation);
		
		frame.setLayout(new GridLayout(4,2));
		
		frame.add(l1);
		frame.add(op1);
		frame.add(l2);
		frame.add(op2);
		frame.add(l3);
		frame.add(res);
		frame.add(l4);
		frame.add(cb);
		
		cb.addItemListener(this);
		frame.setVisible(true);
	}
	
	public void itemStateChanged(ItemEvent ie) {
		int act = cb.getSelectedIndex();
		if("".equals(op1.getText()) || "".equals(op2.getText())) {
			res.setText("Enter all fields");
		} else {
			Double result = 0.0;
			double operand1 = Double.parseDouble(op1.getText());
			double operand2 = Double.parseDouble(op2.getText());
			if(act == 0) {
				result = operand1 + operand2;
			} else if(act == 1) {
				result = operand1 - operand2;
			} else if(act == 2) {
				result = operand1 * operand2;
			} else if(act == 3) {
				result = operand1 / operand2;
			}
			res.setText(String.valueOf(result));
		}
	}
}
