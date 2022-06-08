package IT232;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.BorderFactory;

//***** Be sure to open the IT232_Java_Swing_Calculator_Documentation.docx file to review comment references. 

public class Calculator{
	
	//Declaring all the object names for the controls in one location for easy reference. 
	private JFrame calcFrame;
	private JPanel calcContentPane;
	private JLabel lblDisplay;
	private JButton cmdClr;
	private JButton cmdAdd;
	private JButton cmdSub;
	private JButton cmdMul;
	private JButton cmdDiv;
	private JButton cmdEqual;
	private JButton cmdOne;
	private JButton cmdTwo;
	private JButton cmdThree;
	private JButton cmdFour;
	private JButton cmdFive;
	private JButton cmdSix;
	private JButton cmdSeven;
	private JButton cmdEight;
	private JButton cmdNine;
	private JButton cmdZero;
	
	
	//The calculator constructor will call the buildGUI() method to instantiate the above controlls and combine htem into a form.
	public Calculator() {
		buildGUI();
	}

//---> See document reference 1.a <-----
public static void main(String[] args) {
	
	
	Calculator simpleCalc = new Calculator();
}

private void buildGUI() {
	calcFrame = new JFrame("Simple Calculator"); //---> See document reference 2.a <---
	calcFrame.setBounds(200, 200,486,564); //---> See document reference 2.b <---
	calcFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //--->See document reference 2.c <---
	calcContentPane = new JPanel(new GridBagLayout()); //---> See document reference 2.d <---
	calcContentPane.setBounds(34, 37, 387, 470); //---> See document reference 2.e <---
	calcFrame.setContentPane(calcContentPane); //---> See document reference 2.f <---
	
	ButtonClickListener btnClickListener = new ButtonClickListener(); //--->See document reference 2.g <---
	
	lblDisplay = new JLabel("0", JLabel.RIGHT); //---> See document reference 2.h <---
	lblDisplay.setBorder(BorderFactory.createLineBorder(Color.black)); //--->See document reference 2.i <---
	lblDisplay.setFont(new Font("Serif", Font.BOLD, 34));
	
	GridBagConstraints c1 = new GridBagConstraints(); //---> See document reference 2.j <---
	c1.weightx = .25; //---> See document reference 2.j.i <---
	c1.weighty = .15; 
	c1.gridx = 0; //---> See document reference 2.j.ii <---
	c1.gridy = 0; 
	c1.gridwidth = 4; //---> See document reference 2.j.iii <---
	c1.insets = new Insets(10, 10, 10, 10); //---> See document reference 2.j.iv <---
	c1.fill = GridBagConstraints.BOTH; //---> See document reference 2.j.v <---
	calcContentPane.add(lblDisplay, c1); //---> See document reference 2.j.vi <---
	
	GridBagConstraints c2 = new GridBagConstraints(); //---> See document reference 2.j <---
	cmdClr = new JButton("CLR"); //---> See document reference 2.k <---
	cmdClr.setMargin(new Insets(-10,-10,-10,-10)); //---> See document reference 2.l <---
	cmdClr.setFont(new Font("Serif", Font.BOLD, 34)); //--->See document reference 2.m <---
	cmdClr.setActionCommand("Clr"); //--->See document reference 2.n <---
	cmdClr.addActionListener(btnClickListener); //---> See document reference 2.o <---
	c2.weightx = .25; //---> See document reference 2.j.i <---
	c2.weighty = .15; 
	c2.gridx = 0; //---> See document reference 2.j.ii <---
	c2.gridy = 1; 
	c2.gridwidth = 3; //---See document reference 2.j.iii <---
	c2.insets = new Insets(10,10,10,10); //---> See document reference 2.j.iv <---
	c2.fill = GridBagConstraints.BOTH; //---> See document reference 2.j.v <---
	calcContentPane.add(cmdClr, c2); //---> See document reference 2.j.vi <---
	
	GridBagConstraints c3 = new GridBagConstraints(); //---> See document reference 2.j <---
	cmdAdd =new JButton("+"); //See document reference 2.k <---
	cmdAdd.setMargin(new Insets(-10, -10, -10, -10)); //--->See document reference 2.l <---
	cmdAdd.setFont(new Font("Serif", Font.BOLD, 34)); //---> See document reference 2.m <---
	cmdAdd.setActionCommand("Add"); //---> See document reference 2.n <---
	cmdAdd.addActionListener(btnClickListener); //---> See document reference 2.o <---
	c3.weightx = .25; //---> See document reference 2.j.i <---
	c3.weighty = .15;
	c3.gridx = 3; //---> See document reference 2.j.ii <---
	c3.gridy = 1; 
	c3.gridwidth = 1; //---> See document reference 2.j.iii <---
	c3.fill = GridBagConstraints.BOTH; //---> See document reference 2.j.v <---
	c3.insets = new Insets(10, 10, 10, 10); //---> See document reference 2.j.iv <---
	calcContentPane.add(cmdAdd, c3); //---> See document reference 2.j.vi <---
	
	GridBagConstraints c4 = new GridBagConstraints(); //---> See document reference 2.j <---
	cmdOne =new JButton("1"); //See document reference 2.k <---
	cmdOne.setMargin(new Insets(-10, -10, -10, -10)); //--->See document reference 2.l <---
	cmdOne.setFont(new Font("Serif", Font.BOLD, 34)); //---> See document reference 2.m <---
	cmdOne.setActionCommand("One"); //---> See document reference 2.n <---
	cmdOne.addActionListener(btnClickListener); //---> See document reference 2.o <---
	//Uncomment the following two lines and the ButtonRed ActionListener below to see the button trigger two Event Listeners.
	//ButtonRed btnRed = new ButtonRed();
	//cmdOne.addActionListener(bntRed);
	c4.weightx = .25; //---> See document reference 2.j.i <---
	c4.weighty = .15;
	c4.gridx = 0; //---> See document reference 2.j.ii <---
	c4.gridy = 2; 
	c4.gridwidth = 1; //---> See document reference 2.j.iii <---
	c4.fill = GridBagConstraints.BOTH; //---> See document reference 2.j.v <---
	c4.insets = new Insets(10, 10, 10, 10); //---> See document reference 2.j.iv <---
	calcContentPane.add(cmdOne, c4); //---> See document reference 2.j.vi <---
	
	GridBagConstraints c5 = new GridBagConstraints(); //---> See document reference 2.j <---
	cmdTwo =new JButton("2"); //See document reference 2.k <---
	cmdTwo.setMargin(new Insets(-10, -10, -10, -10)); //--->See document reference 2.l <---
	cmdTwo.setFont(new Font("Serif", Font.BOLD, 34)); //---> See document reference 2.m <---
	cmdTwo.setActionCommand("Two"); //---> See document reference 2.n <---
	cmdTwo.addActionListener(btnClickListener); //---> See document reference 2.o <---
	c5.weightx = .25; //---> See document reference 2.j.i <---
	c5.weighty = .15;
	c5.gridx = 1; //---> See document reference 2.j.ii <---
	c5.gridy = 2; 
	c5.gridwidth = 1; //---> See document reference 2.j.iii <---
	c5.fill = GridBagConstraints.BOTH; //---> See document reference 2.j.v <---
	c5.insets = new Insets(10, 10, 10, 10); //---> See document reference 2.j.iv <---
	calcContentPane.add(cmdTwo, c5); //---> See document reference 2.j.vi <---
	
	GridBagConstraints c6 = new GridBagConstraints(); //---> See document reference 2.j <---
	cmdThree =new JButton("3"); //See document reference 2.k <---
	cmdThree.setMargin(new Insets(-10, -10, -10, -10)); //--->See document reference 2.l <---
	cmdThree.setFont(new Font("Serif", Font.BOLD, 34)); //---> See document reference 2.m <---
	cmdThree.setActionCommand("Three"); //---> See document reference 2.n <---
	cmdThree.addActionListener(btnClickListener); //---> See document reference 2.o <---
	c6.weightx = .25; //---> See document reference 2.j.i <---
	c6.weighty = .15;
	c6.gridx = 2; //---> See document reference 2.j.ii <---
	c6.gridy = 2; 
	c6.gridwidth = 1; //---> See document reference 2.j.iii <---
	c6.fill = GridBagConstraints.BOTH; //---> See document reference 2.j.v <---
	c6.insets = new Insets(10, 10, 10, 10); //---> See document reference 2.j.iv <---
	calcContentPane.add(cmdThree, c6); //---> See document reference 2.j.vi <---
	
	GridBagConstraints c7 = new GridBagConstraints(); //---> See document reference 2.j <---
	cmdSub =new JButton("-"); //See document reference 2.k <---
	cmdSub.setMargin(new Insets(-10, -10, -10, -10)); //--->See document reference 2.l <---
	cmdSub.setFont(new Font("Serif", Font.BOLD, 34)); //---> See document reference 2.m <---
	cmdSub.setActionCommand("Sub"); //---> See document reference 2.n <---
	cmdSub.addActionListener(btnClickListener); //---> See document reference 2.o <---
	c7.weightx = .25; //---> See document reference 2.j.i <---
	c7.weighty = .15;
	c7.gridx = 3; //---> See document reference 2.j.ii <---
	c7.gridy = 2; 
	c7.gridwidth = 1; //---> See document reference 2.j.iii <---
	c7.fill = GridBagConstraints.BOTH; //---> See document reference 2.j.v <---
	c7.insets = new Insets(10, 10, 10, 10); //---> See document reference 2.j.iv <---
	calcContentPane.add(cmdSub, c7); //---> See document reference 2.j.vi <---
	
	GridBagConstraints c8 = new GridBagConstraints(); //---> See document reference 2.j <---
	cmdFour =new JButton("4"); //See document reference 2.k <---
	cmdFour.setMargin(new Insets(-10, -10, -10, -10)); //--->See document reference 2.l <---
	cmdFour.setFont(new Font("Serif", Font.BOLD, 34)); //---> See document reference 2.m <---
	cmdFour.setActionCommand("Four"); //---> See document reference 2.n <---
	cmdFour.addActionListener(btnClickListener); //---> See document reference 2.o <---
	c8.weightx = .25; //---> See document reference 2.j.i <---
	c8.weighty = .15;
	c8.gridx = 0; //---> See document reference 2.j.ii <---
	c8.gridy = 3; 
	c8.gridwidth = 1; //---> See document reference 2.j.iii <---
	c8.fill = GridBagConstraints.BOTH; //---> See document reference 2.j.v <---
	c8.insets = new Insets(10, 10, 10, 10); //---> See document reference 2.j.iv <---
	calcContentPane.add(cmdFour, c8); //---> See document reference 2.j.vi <---
	
	GridBagConstraints c9 = new GridBagConstraints(); //---> See document reference 2.j <---
	cmdFive =new JButton("5"); //See document reference 2.k <---
	cmdFive.setMargin(new Insets(-10, -10, -10, -10)); //--->See document reference 2.l <---
	cmdFive.setFont(new Font("Serif", Font.BOLD, 34)); //---> See document reference 2.m <---
	cmdFive.setActionCommand("Five"); //---> See document reference 2.n <---
	cmdFive.addActionListener(btnClickListener); //---> See document reference 2.o <---
	c9.weightx = .25; //---> See document reference 2.j.i <---
	c9.weighty = .15;
	c9.gridx = 1; //---> See document reference 2.j.ii <---
	c9.gridy = 3; 
	c9.gridwidth = 1; //---> See document reference 2.j.iii <---
	c9.fill = GridBagConstraints.BOTH; //---> See document reference 2.j.v <---
	c9.insets = new Insets(10, 10, 10, 10); //---> See document reference 2.j.iv <---
	calcContentPane.add(cmdFive, c9); //---> See document reference 2.j.vi <---
	
	GridBagConstraints c10 = new GridBagConstraints(); //---> See document reference 2.j <---
	cmdSix =new JButton("6"); //See document reference 2.k <---
	cmdSix.setMargin(new Insets(-10, -10, -10, -10)); //--->See document reference 2.l <---
	cmdSix.setFont(new Font("Serif", Font.BOLD, 34)); //---> See document reference 2.m <---
	cmdSix.setActionCommand("Six"); //---> See document reference 2.n <---
	cmdSix.addActionListener(btnClickListener); //---> See document reference 2.o <---
	c10.weightx = .25; //---> See document reference 2.j.i <---
	c10.weighty = .15;
	c10.gridx = 2; //---> See document reference 2.j.ii <---
	c10.gridy = 3; 
	c10.gridwidth = 1; //---> See document reference 2.j.iii <---
	c10.fill = GridBagConstraints.BOTH; //---> See document reference 2.j.v <---
	c10.insets = new Insets(10, 10, 10, 10); //---> See document reference 2.j.iv <---
	calcContentPane.add(cmdSix, c10); //---> See document reference 2.j.vi <---
	
	GridBagConstraints c11 = new GridBagConstraints(); //---> See document reference 2.j <---
	cmdMul =new JButton("*"); //See document reference 2.k <---
	cmdMul.setMargin(new Insets(-10, -10, -10, -10)); //--->See document reference 2.l <---
	cmdMul.setFont(new Font("Serif", Font.BOLD, 34)); //---> See document reference 2.m <---
	cmdMul.setActionCommand("Mul"); //---> See document reference 2.n <---
	cmdMul.addActionListener(btnClickListener); //---> See document reference 2.o <---
	c11.weightx = .25; //---> See document reference 2.j.i <---
	c11.weighty = .15;
	c11.gridx = 3; //---> See document reference 2.j.ii <---
	c11.gridy = 3; 
	c11.gridwidth = 1; //---> See document reference 2.j.iii <---
	c11.fill = GridBagConstraints.BOTH; //---> See document reference 2.j.v <---
	c11.insets = new Insets(10, 10, 10, 10); //---> See document reference 2.j.iv <---
	calcContentPane.add(cmdMul, c11); //---> See document reference 2.j.vi <---
	
	GridBagConstraints c12 = new GridBagConstraints(); //---> See document reference 2.j <---
	cmdSeven =new JButton("7"); //See document reference 2.k <---
	cmdSeven.setMargin(new Insets(-10, -10, -10, -10)); //--->See document reference 2.l <---
	cmdSeven.setFont(new Font("Serif", Font.BOLD, 34)); //---> See document reference 2.m <---
	cmdSeven.setActionCommand("Seven"); //---> See document reference 2.n <---
	cmdSeven.addActionListener(btnClickListener); //---> See document reference 2.o <---
	c12.weightx = .25; //---> See document reference 2.j.i <---
	c12.weighty = .15;
	c12.gridx = 0; //---> See document reference 2.j.ii <---
	c12.gridy = 4; 
	c12.gridwidth = 1; //---> See document reference 2.j.iii <---
	c12.fill = GridBagConstraints.BOTH; //---> See document reference 2.j.v <---
	c12.insets = new Insets(10, 10, 10, 10); //---> See document reference 2.j.iv <---
	calcContentPane.add(cmdSeven, c12); //---> See document reference 2.j.vi <---
	
	GridBagConstraints c13 = new GridBagConstraints(); //---> See document reference 2.j <---
	cmdEight =new JButton("8"); //See document reference 2.k <---
	cmdEight.setMargin(new Insets(-10, -10, -10, -10)); //--->See document reference 2.l <---
	cmdEight.setFont(new Font("Serif", Font.BOLD, 34)); //---> See document reference 2.m <---
	cmdEight.setActionCommand("Eight"); //---> See document reference 2.n <---
	cmdEight.addActionListener(btnClickListener); //---> See document reference 2.o <---
	c13.weightx = .25; //---> See document reference 2.j.i <---
	c13.weighty = .15;
	c13.gridx = 1; //---> See document reference 2.j.ii <---
	c13.gridy = 4; 
	c13.gridwidth = 1; //---> See document reference 2.j.iii <---
	c13.fill = GridBagConstraints.BOTH; //---> See document reference 2.j.v <---
	c13.insets = new Insets(10, 10, 10, 10); //---> See document reference 2.j.iv <---
	calcContentPane.add(cmdEight, c13); //---> See document reference 2.j.vi <---
	
	GridBagConstraints c14 = new GridBagConstraints(); //---> See document reference 2.j <---
	cmdNine =new JButton("9"); //See document reference 2.k <---
	cmdNine.setMargin(new Insets(-10, -10, -10, -10)); //--->See document reference 2.l <---
	cmdNine.setFont(new Font("Serif", Font.BOLD, 34)); //---> See document reference 2.m <---
	cmdNine.setActionCommand("Nine"); //---> See document reference 2.n <---
	cmdNine.addActionListener(btnClickListener); //---> See document reference 2.o <---
	c14.weightx = .25; //---> See document reference 2.j.i <---
	c14.weighty = .15;
	c14.gridx = 2; //---> See document reference 2.j.ii <---
	c14.gridy = 4; 
	c14.gridwidth = 1; //---> See document reference 2.j.iii <---
	c14.fill = GridBagConstraints.BOTH; //---> See document reference 2.j.v <---
	c14.insets = new Insets(10, 10, 10, 10); //---> See document reference 2.j.iv <---
	calcContentPane.add(cmdNine, c14); //---> See document reference 2.j.vi <---
	
	GridBagConstraints c15 = new GridBagConstraints(); //---> See document reference 2.j <---
	cmdDiv =new JButton("/"); //See document reference 2.k <---
	cmdDiv.setMargin(new Insets(-10, -10, -10, -10)); //--->See document reference 2.l <---
	cmdDiv.setFont(new Font("Serif", Font.BOLD, 34)); //---> See document reference 2.m <---
	cmdDiv.setActionCommand("Div"); //---> See document reference 2.n <---
	cmdDiv.addActionListener(btnClickListener); //---> See document reference 2.o <---
	c15.weightx = .25; //---> See document reference 2.j.i <---
	c15.weighty = .15;
	c15.gridx = 3; //---> See document reference 2.j.ii <---
	c15.gridy = 4; 
	c15.gridwidth = 1; //---> See document reference 2.j.iii <---
	c15.fill = GridBagConstraints.BOTH; //---> See document reference 2.j.v <---
	c15.insets = new Insets(10, 10, 10, 10); //---> See document reference 2.j.iv <---
	calcContentPane.add(cmdDiv, c15); //---> See document reference 2.j.vi <---
	
	GridBagConstraints c16 = new GridBagConstraints(); //---> See document reference 2.j <---
	cmdZero =new JButton("0"); //See document reference 2.k <---
	cmdZero.setMargin(new Insets(-10, -10, -10, -10)); //--->See document reference 2.l <---
	cmdZero.setFont(new Font("Serif", Font.BOLD, 34)); //---> See document reference 2.m <---
	cmdZero.setActionCommand("Zero"); //---> See document reference 2.n <---
	cmdZero.addActionListener(btnClickListener); //---> See document reference 2.o <---
	c16.weightx = .25; //---> See document reference 2.j.i <---
	c16.weighty = .15;
	c16.gridx = 0; //---> See document reference 2.j.ii <---
	c16.gridy = 5; 
	c16.gridwidth = 1; //---> See document reference 2.j.iii <---
	c16.fill = GridBagConstraints.BOTH; //---> See document reference 2.j.v <---
	c16.insets = new Insets(10, 10, 10, 10); //---> See document reference 2.j.iv <---
	calcContentPane.add(cmdZero, c16); //---> See document reference 2.j.vi <---
	
	GridBagConstraints c17 = new GridBagConstraints(); //---> See document reference 2.j <---
	cmdEqual =new JButton("="); //See document reference 2.k <---
	cmdEqual.setMargin(new Insets(-10, -10, -10, -10)); //--->See document reference 2.l <---
	cmdEqual.setFont(new Font("Serif", Font.BOLD, 34)); //---> See document reference 2.m <---
	cmdEqual.setActionCommand("Equal"); //---> See document reference 2.n <---
	cmdEqual.addActionListener(btnClickListener); //---> See document reference 2.o <---
	c17.weightx = .25; //---> See document reference 2.j.i <---
	c17.weighty = .15;
	c17.gridx = 1; //---> See document reference 2.j.ii <---
	c17.gridy = 5; 
	c17.gridwidth = 1; //---> See document reference 2.j.iii <---
	c17.fill = GridBagConstraints.BOTH; //---> See document reference 2.j.v <---
	c17.insets = new Insets(10, 10, 10, 10); //---> See document reference 2.j.iv <---
	calcContentPane.add(cmdEqual, c17); //---> See document reference 2.j.vi <---
	
	//calcFram.pac(); //---> See document reference 2.p
	calcFrame.setVisible(true); //---> See document reference 2.q <---
	}//End of Class ButtonClickListener
	//Uncomment this ActionListener and the lines that add it to cmdOne button to see that button trigger both ActionListeners.
	/*private class ButtonRed implements ActionListener{
	 * public void actionPerformed(ActionEvent e)
	 * {
	 * cmdOne.setBackGround(Color.red);
	 * }
	 * }
	 */
	
	private class ButtonClickListener implements ActionListener{ //---> See document reference 3 <---
		 
		//---> See document reference 3.a <---
		private int total = 0;
		private char prevOperation = ' ';
		private int plusClicked = 0;
		private int minusClicked = 0;
		private int multiplyClicked = 0;
		private int divideClicked = 0;
		private int equalClicked = 0;
		
	public void actionPerformed(ActionEvent e){ //---> See document reference 3.b <---
	
		String command = e.getActionCommand(); //---> See document reference 3.c <---
		
		switch (command) {	//---> See document reference 3.d <---
		case "One": //---> See document reference 3.e <---
			if(lblDisplay.getText()== "0")
				lblDisplay.setText("");
			lblDisplay.setText(lblDisplay.getText() + "1");
			break;
		case "Two": //---> See document reference 3.e <---
			if(lblDisplay.getText() == "0")
				lblDisplay.setText("");
			lblDisplay.setText(lblDisplay.getText() + "2");
			break;
		case "Three": //---> See document reference 3.e <---
			if(lblDisplay.getText() == "0")
				lblDisplay.setText("");
			lblDisplay.setText(lblDisplay.getText() + "3");
			break;
		case "Four": //---> See document reference 3.e <---
			if(lblDisplay.getText() == "0")
				lblDisplay.setText("");
			lblDisplay.setText(lblDisplay.getText() + "4");
			break;
		case "Five": //---> See document reference 3.e <---
			if(lblDisplay.getText() == "0")
				lblDisplay.setText("");
			lblDisplay.setText(lblDisplay.getText() + "5");
			break;
		case "Six": //---> See document reference 3.e <---
			if(lblDisplay.getText() == "0")
				lblDisplay.setText("");
			lblDisplay.setText(lblDisplay.getText() + "6");
			break;
		case "Seven": //---> See document reference 3.e <---
			if(lblDisplay.getText() == "0")
				lblDisplay.setText("");
			lblDisplay.setText(lblDisplay.getText() + "7");
			break;
		case "Eight": //---> See document reference 3.e <---
			if(lblDisplay.getText() == "0")
				lblDisplay.setText("");
			lblDisplay.setText(lblDisplay.getText() + "8");
			break;
		case "Nine": //---> See document reference 3.e <---
			if(lblDisplay.getText() == "0")
				lblDisplay.setText("");
			lblDisplay.setText(lblDisplay.getText() + "9");
			break;
		case "Zero": //---> See document reference 3.e <---
			if(lblDisplay.getText() == "0")
				lblDisplay.setText("");
			lblDisplay.setText(lblDisplay.getText() + "0");
			break;
		case "Add": //--->See document reference 3.f <---
			plusClicked = 1;
			calculate();
			break;
		case "Sub": //--->See document reference 3.f <---
			minusClicked = 1;
			calculate();
			break;
		case "Mul": //--->See document reference 3.f <---
			multiplyClicked = 1;
			calculate();
			break;
		case "Div": //--->See document reference 3.f <---
			divideClicked = 1;
			calculate();
			break;
		case "Clr": //---> See document reference 3.f <---	
			lblDisplay.setText("0");
			total = 0;
			prevOperation = ' ';
			plusClicked = 0;
			minusClicked = 0;
			multiplyClicked = 0;
			divideClicked = 0;
			break;
		case "Equal": //---> See document reference 3.e <---
			equalClicked = 1;
			calculate();
			break;
	}
}//End of method actionPerformed
	
private void calculate(){ //---> See document reference 4 <---
//*** The calculate method check the previous operation, does the correct calculation for that 
// operation then sets the current operation to be the previous operation. It is invoked from all 
// operator control click events. the first if checks to see if this is the first value the user has 
// entered into the calculator because in this case the running total needs to be set to this value.
// ****** Separate if statements nested in the else clause calculated the new total per the previous
// ****** operator clicked, just like with a simple calculator. Note: Remember that the operation
// calculated is always the 
// ****** previous operator selected. 
	
	
	if (prevOperation == ' ') {
		total = Integer.parseInt(lblDisplay.getText());
		lblDisplay.setText("0");
	}
	else {
		if (prevOperation == '+') {
			total = total + Integer.parseInt(lblDisplay.getText());
			lblDisplay.setText("0");
		}
		if (prevOperation == '-') {
			total = total - Integer.parseInt(lblDisplay.getText());
			lblDisplay.setText("0");
		}
		if(prevOperation == '*') {
			total = total * Integer.parseInt(lblDisplay.getText());
			lblDisplay.setText("0");
		}
		if(prevOperation == '/') {
			total = total / Integer.parseInt(lblDisplay.getText());
			lblDisplay.setText("0");
		}
	}//End Else statement 
	
	
	//****** The following if statements set the prevOperation flag to the operation just click
	// which prompted the calling of this function. By making this an chain of else if's, if 
	// statements in the series yet to be tested will be skipped once a match is found. If one flag
	// variable had been used instead of one for each operation, then a switch statement would be good here.
	// Separate flag variable were chosen for clarity. 
	
	if(plusClicked == 1) {
		prevOperation = '+';
		plusClicked = 0;
	}
	else if (minusClicked == 1) {
		prevOperation = '-';
		minusClicked = 0;
	}
	else if (multiplyClicked == 1) {
		prevOperation = '*';
		multiplyClicked = 0;
	}
	else if (divideClicked == 1) {
		prevOperation = '/';
		divideClicked = 0;
	}
	else {
		//*** Operation must have been equal which resets the operation much like a clear button 
		//*** but does not clear the displayed total.
		prevOperation = ' ';
		equalClicked = 0;
		lblDisplay.setText(Integer.toString(total));
	}
	
	
}//End calculate method


	
}//End of method buildGUI
}//End of Class Calculator













