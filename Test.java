package IT232;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Test {

	public static void main(String[] args) {
	
		
		
		//create a JFrame to contain all the buttons 
		calcBuilder calculator = new calcBuilder();
		
		
		
			
		
			
			
}//end main method
}//end class IT232_Unit2_McCann

		class calcBuilder extends JFrame{
			
			JTextField textField1;
			JButton clear;
			JButton num9;
			JButton num8;
			JButton num7;
			JButton num6;
			JButton num5;
			JButton num4;
			JButton num3;
			JButton num2;
			JButton num1;
			JButton addition;
			JButton subtraction;
			JButton multiply;
			JButton divide;
			
			public calcBuilder() {
			
			
			textField1 = new JTextField(16);
			add(textField1);
			
			
			num9 = new JButton("9");
			add(num9);
			num8 = new JButton("8");
			add(num8);
			num7 = new JButton("7");
			add(num7);
			clear = new JButton("C");
			add(clear);
			num6 = new JButton("6");
			add(num6);
			num5 = new JButton("5");
			add(num5);
			num4 = new JButton("4");
			add(num4);
			num3 = new JButton("3");
			addition = new JButton("+");
			add(addition);
			add(num3);
			num2 = new JButton("2");
			add(num2);
			num1 = new JButton("1");
			add(num1);
			
			
			subtraction = new JButton("-");
			add(subtraction);
			multiply = new JButton("*");
			add(multiply);
			divide = new JButton("/");
			add(divide);
			
			calculations handler = new calculations();
			num1.addActionListener(handler);
			num2.addActionListener(handler);
			
			
			
			setVisible(true);
			setSize(230,250);
			setLayout(new FlowLayout());
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
				
			}
			
			class calculations implements ActionListener{
				
				public void actionPerformed(ActionEvent event) {
					
				
					
					
					
					
				}
			}
			
			
			
			
			
			
		}
		
		
		
		
		// keep a running total(one variable for the total and one variable to indicate the last operator clicked
		
		
		
		//use events to add events to the buttons 
		
		
		
		//operator buttons(+,-,*,/) should call for currently displayed value to be used per the last operator called 
		
		
		
		//set the operator flag variable to indicate what was just clicked. 
		
		
		
		
		
		
		
	


