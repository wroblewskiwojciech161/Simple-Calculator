package com.TP;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.JPanel;


public class GUICalculator implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextArea textArea = new JTextArea();
	
	
	JButton button1 = new JButton("button1");
	JButton button2 = new JButton("button2");
	JButton button3 = new JButton("button3");
	JButton button4 = new JButton("button4");
	JButton button5 = new JButton("button5");
	JButton button6 = new JButton("button6");
	JButton button7 = new JButton("button7");
	JButton button8 = new JButton("button8");
	JButton button9 = new JButton("button9");
	JButton button0 = new JButton("button0");
	JButton buttonAdd = new JButton("buttonAdd");
	JButton buttonSub = new JButton("buttonSub");
	JButton buttonMult = new JButton("buttonMult");
	JButton buttonDiv = new JButton("buttonDiv");
	JButton buttonClear = new JButton("buttonClear");
	JButton buttonDot = new JButton("buttonDot");
	JButton buttonEqual = new JButton("buttonEqual");
	JButton buttonBack = new JButton("buttonBack");
	
	public GUICalculator() {
		frame.setSize(400,850);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Calculator");
		frame.setResizable(false);
		frame.add(panel);
		frame.setVisible(true);
		
		panel.setBackground(Color.LIGHT_GRAY);
		panel.add(textArea);
		panel.setVisible(true);
		
		Font font = new Font ("arial",Font.BOLD,40);
		Color myColor = Color.decode("#2153C2");
		
		textArea.setBackground(myColor);
		textArea.setFont(font);
		textArea.setForeground(Color.WHITE);
		textArea.setPreferredSize(new Dimension (340,100));
		textArea.setLineWrap(true); 
		
	
		button1.setPreferredSize(new Dimension(110,110));
		button1.setIcon(new ImageIcon("src\\main\\resources\\button1.png"));
		
		
		button2.setPreferredSize(new Dimension(110,110));
		button2.setIcon(new ImageIcon("src\\main\\resources\\button2.png"));
		
		button3.setPreferredSize(new Dimension(110,110));
		button3.setIcon(new ImageIcon("src\\main\\resources\\button3.png"));
		
		button4.setPreferredSize(new Dimension(110,110));
		button4.setIcon(new ImageIcon("src\\main\\resources\\button4.png"));
		
		button5.setPreferredSize(new Dimension(110,110));
		button5.setIcon(new ImageIcon("src\\main\\resources\\button5.png"));
		
		button6.setPreferredSize(new Dimension(110,110));
		button6.setIcon(new ImageIcon("src\\main\\resources\\button6.png"));
		
		button7.setPreferredSize(new Dimension(110,110));
		button7.setIcon(new ImageIcon("src\\main\\resources\\button7.png"));
		
		button8.setPreferredSize(new Dimension(110,110));
		button8.setIcon(new ImageIcon("src\\main\\resources\\button8.png"));
		
		button9.setPreferredSize(new Dimension(110,110));
		button9.setIcon(new ImageIcon("src\\main\\resources\\button9.png"));
		
		button0.setPreferredSize(new Dimension(110,110));
		button0.setIcon(new ImageIcon("src\\main\\resources\\button0.png"));
		
		buttonAdd.setPreferredSize(new Dimension(110,110));
		buttonAdd.setIcon(new ImageIcon("src\\main\\resources\\add.png"));
		
		buttonSub.setPreferredSize(new Dimension(110,110));
		buttonSub.setIcon(new ImageIcon("src\\main\\resources\\sub.png"));
		
		buttonDiv.setPreferredSize(new Dimension(110,110));
		buttonDiv.setIcon(new ImageIcon("src\\main\\resources\\div.png"));
		
		buttonMult.setPreferredSize(new Dimension(110,110));
		buttonMult.setIcon(new ImageIcon("src\\main\\resources\\mult.png"));
		
		buttonDot.setPreferredSize(new Dimension(110,110));
		buttonDot.setIcon(new ImageIcon("src\\main\\resources\\dot.png"));
		
		buttonEqual.setPreferredSize(new Dimension(110,110));
		buttonEqual.setIcon(new ImageIcon("src\\main\\resources\\equal.png"));
		
		buttonClear.setPreferredSize(new Dimension(110,110));
		buttonClear.setIcon(new ImageIcon("src\\main\\resources\\clear.png"));
		
		buttonBack.setPreferredSize(new Dimension(110,110));
		buttonBack.setIcon(new ImageIcon("src\\main\\resources\\backspace.png"));

		panel.add(button1);  panel.add(button2);  panel.add(button3);  panel.add(button4); panel.add(button5);
		panel.add(button6);  panel.add(button7);  panel.add(button8);  panel.add(button9); panel.add(buttonClear);
		panel.add(button0);  panel.add(buttonBack); 
		
		panel.add(buttonAdd);  panel.add(buttonSub);  panel.add(buttonMult);
		panel.add(buttonDiv);  panel.add(buttonDot);  panel.add(buttonEqual);
		
		
		button1.addActionListener((ActionListener) this);
		button2.addActionListener((ActionListener) this);
		button3.addActionListener((ActionListener) this);
		button4.addActionListener((ActionListener) this);
		button5.addActionListener((ActionListener) this);
		button6.addActionListener((ActionListener) this);
		button7.addActionListener((ActionListener) this);
		button8.addActionListener((ActionListener) this);
		button9.addActionListener((ActionListener) this);
		button0.addActionListener((ActionListener) this);
		buttonAdd.addActionListener((ActionListener) this);
		buttonSub.addActionListener((ActionListener) this);
		buttonDiv.addActionListener((ActionListener) this);
		buttonMult.addActionListener((ActionListener) this);
		buttonDot.addActionListener((ActionListener) this);
		buttonEqual.addActionListener((ActionListener) this);
		buttonClear.addActionListener((ActionListener) this);
		buttonBack.addActionListener((ActionListener) this);
		
		
		frame.setVisible(true);
			
	}
	
	static int calculation;
	static double firstNumber;
	static double secondNumber;
	static double result;
	static String operations;
	static String answer;
	static boolean equalPressed =false;
	
	
	public void disabled() {
		Border textBorder= BorderFactory.createLineBorder(Color.RED,4);
		
		button1.setBorder(textBorder);
		button2.setBorder(textBorder);
		button3.setBorder(textBorder);
		button4.setBorder(textBorder);
		button5.setBorder(textBorder);
		button6.setBorder(textBorder);
		button7.setBorder(textBorder);
		button8.setBorder(textBorder);
		button9.setBorder(textBorder);
		button0.setBorder(textBorder);
		buttonBack.setBorder(textBorder);
		buttonAdd.setBorder(textBorder);
		buttonDiv.setBorder(textBorder);
		buttonMult.setBorder(textBorder);
		buttonSub.setBorder(textBorder);
		buttonDot.setBorder(textBorder);
		buttonEqual.setBorder(textBorder);

	}
	public void enabled() {
		
		button1.setBorder(null);
		button2.setBorder(null);
		button3.setBorder(null);
		button4.setBorder(null);
		button5.setBorder(null);
		button6.setBorder(null);
		button7.setBorder(null);
		button8.setBorder(null);
		button9.setBorder(null);
		button0.setBorder(null);
		buttonBack.setBorder(null);
		buttonAdd.setBorder(null);
		buttonDiv.setBorder(null);
		buttonMult.setBorder(null);
		buttonSub.setBorder(null);
		buttonDot.setBorder(null);
		buttonEqual.setBorder(null);

	}
	
	
	public void clear() {
		
		 textArea.setText("");
		 firstNumber=0;
		 secondNumber=0;
		 answer="0";
		 equalPressed=false;
		 textArea.setText("");
		 enabled();
	}
	
	
	public void actionPerformed(ActionEvent e) {
	
		 if(e.getActionCommand().contentEquals("buttonClear")) {
			
			 clear();
			 
		}
		
		else if(e.getActionCommand().contentEquals("button1")) {
			if(equalPressed==true)textArea.setText("");
			
		
			String append = textArea.getText() + 1;
			textArea.setText(append);
		
		}
		else if(e.getActionCommand().contentEquals("button2")) {
			if(equalPressed==true)textArea.setText("");
			
			
			String append = textArea.getText() + 2;
			textArea.setText(append);
		}
		else if(e.getActionCommand().contentEquals("button3")) {
			if(equalPressed==true)textArea.setText("");
			
			String append = textArea.getText() + 3;
			textArea.setText(append);
			
		}
		else if(e.getActionCommand().contentEquals("button4")) {
			if(equalPressed==true)textArea.setText("");
			 
			String append = textArea.getText() + 4;
			textArea.setText(append);
			
		}
		else if(e.getActionCommand().contentEquals("button5")) {
			if(equalPressed==true)textArea.setText("");
			
			String append = textArea.getText() + 5;
			textArea.setText(append);
			
		}
		
		else if(e.getActionCommand().contentEquals("button6")) {
			if(equalPressed==true)textArea.setText("");
			 
			String append = textArea.getText() + 6;
			textArea.setText(append);
				
		}
		else if(e.getActionCommand().contentEquals("button7")) {
			if(equalPressed==true)textArea.setText("");
			 
			String append = textArea.getText() + 7;
			textArea.setText(append);
		
		}
		else if(e.getActionCommand().contentEquals("button8")) {
			if(equalPressed==true)textArea.setText("");
			
			String append = textArea.getText() + 8;
			textArea.setText(append);
		}
			
		else if(e.getActionCommand().contentEquals("button9")) {
			if(equalPressed==true)textArea.setText("");
			
			String append = textArea.getText() + 9;
			textArea.setText(append);
		}
			
		else if(e.getActionCommand().contentEquals("button0")) {
			
			if(equalPressed==true)textArea.setText("");
			
			String append = textArea.getText() + 0;
			textArea.setText(append);
			
		}
		
		else if(e.getActionCommand().contentEquals("buttonAdd")) {
			

			firstNumber =  Double.parseDouble(textArea.getText());
			textArea.setText("");
			operations="+";
			
			 
		}
		else if(e.getActionCommand().contentEquals("buttonDiv")) {
			
			
			firstNumber =  Double.parseDouble(textArea.getText());
			textArea.setText("");
			operations="/";
			
		}
		else if(e.getActionCommand().contentEquals("buttonMult")) {
			 
			firstNumber =  Double.parseDouble(textArea.getText());
			textArea.setText("");
			operations="*";
			
		}
		else if(e.getActionCommand().contentEquals("buttonSub")) {
			firstNumber =  Double.parseDouble(textArea.getText());
			textArea.setText("");
			operations="-";
			
		}
		else if(e.getActionCommand().contentEquals("buttonDot")) {
			
			 textArea.setText(textArea.getText()+".");
			 
		}
		else if(e.getActionCommand().contentEquals("buttonEqual")) {
			equalPressed=true;
			String answer;
			secondNumber = Double.parseDouble(textArea.getText());
			if(operations == "+") {
				
				result = firstNumber + secondNumber;
				answer = String.format("%.4f",result);
				textArea.setText(answer);
			}
			else if(operations == "-") {
				
				result = firstNumber - secondNumber;
				answer = String.format("%.4f",result);//  4 decimal places
				textArea.setText(answer);
			}
			else if(operations == "*") {
				
				result = firstNumber * secondNumber;
				answer = String.format("%.4f",result);
				textArea.setText(answer);
			}
			else if(operations =="/" ) {
				
				result = firstNumber / secondNumber;
				answer = String.format("%.4f",result);
				textArea.setText(answer);
			}
			disabled();
			 
			 
			 
		}
		else if(e.getActionCommand().contentEquals("buttonBack")) {
			
			
			 
			 int length= textArea.getText().length();
			 int number=textArea.getText().length()-1;
			 String store;
			 
			 if(length>0) {
				 
				 StringBuilder back= new StringBuilder(textArea.getText());
				 back.deleteCharAt(number);
				 store=back.toString();
				 textArea.setText(store);
				 
				 
			 }
			 	 
			 
		}
		 
		 
	}
	
}