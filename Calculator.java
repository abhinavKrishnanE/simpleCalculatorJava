import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.nio.file.attribute.PosixFileAttributes;

import javax.imageio.plugins.tiff.GeoTIFFTagSet;
import javax.swing.JButton;

public class Calculator implements ActionListener{
	
	JFrame jf;
	JLabel displayLabel;
	JButton sevenButton,eightButton,nineButton,sixButton,fiveButton,fourButton,threeButton,twoButton,oneButton,zeroButton;
	JButton plusButton,diffButton,mulButton,divButton,dotButton,equalButton,clearButton;
	
	boolean isOperatorClicked=false;
	String oldValue;
	String operator;
	
		public Calculator() {

			jf=new JFrame("Calculator");
			jf.setLayout(null);
			jf.setSize(450,700);
			jf.setLocation(550,280);
			jf.getContentPane().setBackground(Color.lightGray);
			displayLabel = new JLabel();
			displayLabel.setBounds(30,40,390,60);
			displayLabel.setBackground(Color.black);
			displayLabel.setOpaque(true);
			displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
			displayLabel.setForeground(Color.white);
			jf.add(displayLabel);
		
				
			
			sevenButton=new JButton("7");
			sevenButton.setBounds(30,240,80,80);
			sevenButton.setFont(new Font("Arial",Font.ITALIC,28));
			sevenButton.addActionListener(this);
			jf.add(sevenButton);
			
			eightButton=new JButton("8");
			eightButton.setBounds(130,240,80,80);
			eightButton.setFont(new Font("Arial",Font.ITALIC,28));
			eightButton.addActionListener(this);
			jf.add(eightButton);
			
			nineButton=new JButton("9");
			nineButton.setBounds(230,240,80,80);
			nineButton.setFont(new Font("Arial",Font.ITALIC,28));
			nineButton.addActionListener(this);
			jf.add(nineButton);
			
			fourButton=new JButton("4");
			fourButton.setBounds(30,340,80,80);
			fourButton.setFont(new Font("Arial",Font.ITALIC,28));
			fourButton.addActionListener(this);
			jf.add(fourButton);
			
			fiveButton=new JButton("5");
			fiveButton.setBounds(130,340,80,80);
			fiveButton.setFont(new Font("Arial",Font.ITALIC,28));
			fiveButton.addActionListener(this);
			jf.add(fiveButton);
			
			sixButton=new JButton("6");
			sixButton.setBounds(230,340,80,80);
			sixButton.setFont(new Font("Arial",Font.ITALIC,28));
			sixButton.addActionListener(this);
			jf.add(sixButton);
			
			oneButton=new JButton("1");
			oneButton.setBounds(30,440,80,80);
			oneButton.setFont(new Font("Arial",Font.ITALIC,28));
			oneButton.addActionListener(this);
			jf.add(oneButton);
			
			twoButton=new JButton("2");
			twoButton.setBounds(130,440,80,80);
			twoButton.setFont(new Font("Arial",Font.ITALIC,28));
			twoButton.addActionListener(this);
			jf.add(twoButton);
			
			threeButton=new JButton("3");
			threeButton.setBounds(230,440,80,80);
			threeButton.setFont(new Font("Arial",Font.ITALIC,28));
			threeButton.addActionListener(this);
			jf.add(threeButton);
			
			dotButton=new JButton(".");
			dotButton.setBounds(30,540,80,80);
			dotButton.setFont(new Font("Arial",Font.ITALIC,40));
			dotButton.addActionListener(this);
			jf.add(dotButton);
			
			zeroButton=new JButton("0");
			zeroButton.setBounds(130,540,80,80);
			zeroButton.addActionListener(this);
			zeroButton.setFont(new Font("Arial",Font.ITALIC,28));
			jf.add(zeroButton);
			
			equalButton=new JButton("=");
			equalButton.setBounds(230,540,80,80);
			equalButton.addActionListener(this);
			equalButton.setFont(new Font("Arial",Font.ITALIC,28));
			jf.add(equalButton);
			
			divButton=new JButton("/");
			divButton.setBounds(330,240,80,80);
			divButton.addActionListener(this);
			divButton.setFont(new Font("Arial",Font.ITALIC,28));
			jf.add(divButton);
			
			mulButton=new JButton("x");
			mulButton.setBounds(330,340,80,80);
			mulButton.addActionListener(this);
			mulButton.setFont(new Font("Arial",Font.ITALIC,28));
			jf.add(mulButton);
			
			diffButton=new JButton("-");
			diffButton.setBounds(330,440,80,80);
			diffButton.addActionListener(this);
			diffButton.setFont(new Font("Arial",Font.ITALIC,28));
			jf.add(diffButton);
			
			plusButton=new JButton("+");
			plusButton.setBounds(330,540,80,80);
			plusButton.addActionListener(this);
			plusButton.setFont(new Font("Arial",Font.ITALIC,28));
			jf.add(plusButton);
			
			clearButton=new JButton("CLR");
			clearButton.setBounds(30,140,80,50);
			clearButton.addActionListener(this);
			clearButton.setFont(new Font("Arial",Font.ITALIC,20));
			clearButton.setBackground(Color.red);
			jf.add(clearButton);
			
			jf.setVisible(true);
			jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
		public static void main(String[] args) {
			new Calculator();
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			
			
			if(e.getSource()==sevenButton) {
				if(isOperatorClicked) {
					displayLabel.setText("7");
					isOperatorClicked=false;
				}
				else {
				displayLabel.setText(displayLabel.getText()+"7");
				}
			}
			else if(e.getSource()==eightButton){
				if(isOperatorClicked) {
					displayLabel.setText("8");
					isOperatorClicked=false;
				}
				else {
				displayLabel.setText(displayLabel.getText()+"8");
			}
			}
				
			else if(e.getSource()==nineButton){
				if(isOperatorClicked) {
					displayLabel.setText("9");
					isOperatorClicked=false;
				}
				else {
				
				displayLabel.setText(displayLabel.getText()+"9");
			}
			}
			else if(e.getSource()==fourButton){
				if(isOperatorClicked) {
					displayLabel.setText("4");
					isOperatorClicked=false;
				}
				else {
				displayLabel.setText(displayLabel.getText()+"4");
				}
			}
			else if(e.getSource()==fiveButton){
				if(isOperatorClicked) {
					displayLabel.setText("5");
					isOperatorClicked=false;
				}
				else {
				displayLabel.setText(displayLabel.getText()+"5");
			}
			}
			else if(e.getSource()==sixButton){
				if(isOperatorClicked) {
					displayLabel.setText("6");
					isOperatorClicked=false;
				}
				else {
				
				displayLabel.setText(displayLabel.getText()+"6");
				}
			}
			else if(e.getSource()==oneButton){
				if(isOperatorClicked) {
					displayLabel.setText("1");
					isOperatorClicked=false;
				}
				else {
				
				displayLabel.setText(displayLabel.getText()+"1");
			}
			}
			else if(e.getSource()==twoButton){
				if(isOperatorClicked) {
					displayLabel.setText("2");
					isOperatorClicked=false;
				}
				else {
				displayLabel.setText(displayLabel.getText()+"2");
			}
			}
			else if(e.getSource()==threeButton){
				if(isOperatorClicked) {
					displayLabel.setText("3");
					isOperatorClicked=false;
				}
				else {
				
				displayLabel.setText(displayLabel.getText()+"3");
			}
			}
			else if(e.getSource()==zeroButton){
				if(isOperatorClicked) {
					displayLabel.setText("0");
					isOperatorClicked=false;
				}
				else {
				
				displayLabel.setText(displayLabel.getText()+"0");
			}
			}
			else if(e.getSource()==dotButton){
				displayLabel.setText(displayLabel.getText()+".");
			}
			else if(e.getSource()==clearButton) {
				displayLabel.setText("");
			}
			else if(e.getSource()==plusButton){
				isOperatorClicked=true;
				oldValue=displayLabel.getText();
				operator="+";
			}
			else if(e.getSource()==diffButton){
				isOperatorClicked=true;
				oldValue=displayLabel.getText();
				operator="-";
				
			}
			else if(e.getSource()==mulButton){
				isOperatorClicked=true;
				oldValue=displayLabel.getText();
				operator="x";
			}
			
			else if(e.getSource()==divButton) {
				isOperatorClicked=true;
				oldValue=displayLabel.getText();
				operator="/";
				
			}
			else if(e.getSource()==equalButton) {
				float oldValue1=Float.parseFloat(oldValue);
				float newValue=Float.parseFloat(displayLabel.getText());
				if(operator=="+") {
					displayLabel.setText((oldValue1+newValue)+"");
				}	
				else if(operator=="-") {
					displayLabel.setText((oldValue1-newValue)+"");
				}
				else if(operator=="x" ) {
					displayLabel.setText((oldValue1*newValue)+"");
				}
				else if(operator=="/") {
						if(newValue==0) {
							displayLabel.setText("Division by zero not possible");
						}
						else {
							displayLabel.setText((oldValue1/newValue)+"");
						}
					}
		
				}
				else {
				displayLabel.setText("Error");
				}
			}
		
		
			
			
		
    }	

