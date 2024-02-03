import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;

public class QuizTest extends JFrame implements ActionListener {
	
	JLabel label;
	JRadioButton radioButtons[] = new JRadioButton[5]; 
	JButton btnNext,btnResult;
	ButtonGroup bg;
	int count = 0, current = 0, x = 1, y = 1, now = 0;
	int m[]= new int [10];
	
		
	QuizTest(String s){
		   super(s);
		   label = new JLabel();
		   add(label);
		   bg = new ButtonGroup();
		   for(int i=0; i<5; i++) {
			   radioButtons[i] = new JRadioButton();
			   add(radioButtons[i]);
			   bg.add(radioButtons[i]);
			
		   }
		   btnNext = new JButton("Next");
		   btnResult = new JButton("result");
		   btnResult.setVisible(false);
		   btnResult.addActionListener(this);
		   btnNext.addActionListener(this);
		   add(btnNext);
		   add(btnResult);setData();
		   label.setBounds(30,40,450,20);
		   radioButtons[0].setBounds(50,80,480,20);
		   radioButtons[1].setBounds(50,110,200,20);
		   radioButtons[2].setBounds(50,140,200,20);
		   radioButtons[3].setBounds(50,170,200,20);
		   btnNext.setBounds(100,240,100,30);
		   btnResult.setBounds(270,240,100,30);
		   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		   setLayout(null);
		   setLocation(250,100);
		   setVisible(true); 
		   setSize(600,350);
		   
		   
		   
		 
	}
	
	void setData() {
		radioButtons[4].setSelected(true);
		
		if(current == 0) {
			label.setText("Q1: Which of the following is not a Java features?");
			radioButtons[0].setText("Dynamic");
			radioButtons[1].setText("Architecture Neutral");
			radioButtons[2].setText("Use of pointers"); //ans
			radioButtons[3].setText("Object-oriented");	     	
		}
		if(current == 1) {
			label.setText("Q2: _____ is used to find and fix bugs in the Java programs.");
			radioButtons[0].setText("JVM");
			radioButtons[1].setText("JRE");
			radioButtons[2].setText("JDK");
			radioButtons[3].setText("JDB");	//ans
			
		}
		if(current == 2) {
			label.setText("Q3: Which of the following is a valid long literal?");
			radioButtons[0].setText("ABH8097");
			radioButtons[1].setText("L990023");
			radioButtons[2].setText("904423");
			radioButtons[3].setText("0xnf029L"); //ans	
			
		}
		if(current == 3) {
			label.setText("Q4: Which of the following is a valid declaration of a char?");
			radioButtons[0].setText("char ch = '\\utea';"); //ans
			radioButtons[1].setText("char ca = 'tea';");
			radioButtons[2].setText("char cr = \\u0223;");
			radioButtons[3].setText("char cc = '\\itea';");	     	
		}
		if(current == 4) {
			/*
			 */
			label.setText("Q5: What is the return type of the hashCode() method in the Object class?\r\n"
					+ "");
			radioButtons[0].setText("Object");
			radioButtons[1].setText("int"); //ans
			radioButtons[2].setText("long");
			radioButtons[3].setText("void");	     	
		}
		if(current == 5) {
		
			label.setText("Q6: What does the expression float a = 35 / 0 return?");
			radioButtons[0].setText("0");
			radioButtons[1].setText("Not a Number");
			radioButtons[2].setText("Infinity");  //ans
			radioButtons[3].setText("Run time exception");	     	
		}
		if(current == 6) {
	
			label.setText("Q7:  Evaluate the following Java expression, if x=3, y=5, and z=10:\r\n"
					+ "\r\n"
					+ "++z + y - y + z + x++\r\n");
			radioButtons[0].setText("24");
			radioButtons[1].setText("20");
			radioButtons[2].setText("25"); //ans
			radioButtons[3].setText("23");	     	
		}
		if(current == 7) {
			
			label.setText("Q8: Which package contains the Random class?");
			radioButtons[0].setText("java.util package"); //ans
			radioButtons[1].setText("java.lang package");
			radioButtons[2].setText("java.awt package");
			radioButtons[3].setText("java.io package");	     	
		}
		if(current == 8) {
			label.setText("Q9: Which of the following is a reserved keyword in Java?");
			radioButtons[0].setText("object");
			radioButtons[1].setText("strictfp"); //ans
			radioButtons[2].setText("main");
			radioButtons[3].setText("system");	     	
		}
		if(current == 9) {
			
			label.setText("Q10: An interface with no fields or methods is known as a ______.");
			radioButtons[0].setText("Runnable Interface");
			radioButtons[1].setText("Marker Interface"); //ans
			radioButtons[2].setText("Abstract Interface");
			radioButtons[3].setText("CharSequence Interface");	     	
		}
		
		label.setBounds(30,40,450,20);
		for(int i=0,j=0; i<=90; i+=30, j++) {
			radioButtons[j].setBounds(50,80+i,200,20);
		}
		
	} 
	
	boolean checkAns() {
		if(current == 0) {
			return(radioButtons[2].isSelected()); 
		}
		if(current == 1) {
			return(radioButtons[3].isSelected()); 
		}
		if(current == 2) {
			return(radioButtons[3].isSelected()); 
		}
		if(current == 3) {
			return(radioButtons[0].isSelected()); 
		}
		if(current == 4) {
			return(radioButtons[1].isSelected()); 
		}
		if(current == 5) {
			return(radioButtons[2].isSelected()); 
		}
		if(current == 6) {
			return(radioButtons[2].isSelected()); 
		}
		if(current == 7) {
			return(radioButtons[0].isSelected()); 
		}
		if(current == 8) {
			return(radioButtons[1].isSelected()); 
		}
		if(current == 9) {
			return(radioButtons[1].isSelected()); 
		}
		
		return false;
	}
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource () == btnNext) {
			if(checkAns()) {
				count = count + 1;
			current++;
			setData();
			if(current == 9) {
				btnNext.setEnabled(false);
				btnResult.setVisible(true);
				btnResult.setText("Result");
			}
		    }
		}
		
		if(e.getActionCommand().equals("Result")) {
			if(checkAns())
				count = count + 1;
			current++;
			JOptionPane.showMessageDialog(this,"Correct answer are"+count);
			System.exit(0);
		}	
	}
	
	
	public static void main(String [] args) {
		
		new QuizTest("Simple Quiz App");
	
	}

}
