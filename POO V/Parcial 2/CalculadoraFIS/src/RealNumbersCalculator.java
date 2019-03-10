import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class RealNumbersCalculator implements ActionListener {

	private String firstValue = "";
	private String secondValue = "";
	private String operator = "";
	private double result = 0;
	private JTextField display;
	private boolean firstPositive = true;
	private boolean first = true;
	
	public RealNumbersCalculator() {
		
		JFrame frame = new JFrame("Real Numbers Calculator");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setPreferredSize(new Dimension(600,700));
		frame.setLayout(null);
		
		JButton boton0 = new JButton("0");
		boton0.setName("0");
		boton0.addActionListener(this);
		boton0.setBounds(120, 570, 80, 80);
		boton0.setFont(new Font("Arial", Font.PLAIN, 40));
		frame.add(boton0);
		
		JButton boton1 = new JButton("1");
		boton1.setName("1");
		boton1.addActionListener(this);
		boton1.setBounds(20, 470, 80, 80);
		boton1.setFont(new Font("Arial", Font.PLAIN, 40));
		frame.add(boton1);
		
		JButton boton2 = new JButton("2");
		boton2.setName("2");
		boton2.addActionListener(this);
		boton2.setBounds(120, 470, 80, 80);
		boton2.setFont(new Font("Arial", Font.PLAIN, 40));
		frame.add(boton2);
		
		JButton boton3 = new JButton("3");
		boton3.setName("3");
		boton3.addActionListener(this);
		boton3.setBounds(220, 470, 80, 80);
		boton3.setFont(new Font("Arial", Font.PLAIN, 40));
		frame.add(boton3);
		
		JButton boton4 = new JButton("4");
		boton4.setName("4");
		boton4.addActionListener(this);
		boton4.setBounds(20, 370, 80, 80);
		boton4.setFont(new Font("Arial", Font.PLAIN, 40));
		frame.add(boton4);
		
		JButton boton5 = new JButton("5");
		boton5.setName("5");
		boton5.addActionListener(this);
		boton5.setBounds(120, 370, 80, 80);
		boton5.setFont(new Font("Arial", Font.PLAIN, 40));
		frame.add(boton5);
		
		JButton boton6 = new JButton("6");
		boton6.setName("6");
		boton6.addActionListener(this);
		boton6.setBounds(220, 370, 80, 80);
		boton6.setFont(new Font("Arial", Font.PLAIN, 40));
		frame.add(boton6);
		
		JButton boton7 = new JButton("7");
		boton7.setName("7");
		boton7.addActionListener(this);
		boton7.setBounds(20, 270, 80, 80);
		boton7.setFont(new Font("Arial", Font.PLAIN, 40));
		frame.add(boton7);
		
		JButton boton8 = new JButton("8");
		boton8.setName("8");
		boton8.addActionListener(this);
		boton8.setBounds(120, 270, 80, 80);
		boton8.setFont(new Font("Arial", Font.PLAIN, 40));
		frame.add(boton8);
		
		JButton boton9 = new JButton("9");
		boton9.setName("9");
		boton9.addActionListener(this);
		boton9.setBounds(220, 270, 80, 80);
		boton9.setFont(new Font("Arial", Font.PLAIN, 40));
		frame.add(boton9);
		
		JButton boton10 = new JButton("+");
		boton10.setName("+");
		boton10.addActionListener(this);
		boton10.setBounds(340, 270, 80, 80);
		boton10.setFont(new Font("Arial", Font.PLAIN, 40));
		frame.add(boton10);
		
		JButton boton11 = new JButton("-");
		boton11.setName("-");
		boton11.addActionListener(this);
		boton11.setBounds(340, 370, 80, 80);
		boton11.setFont(new Font("Arial", Font.PLAIN, 40));
		frame.add(boton11);
		
		JButton boton12 = new JButton("x");
		boton12.setName("x");
		boton12.addActionListener(this);
		boton12.setBounds(340, 470, 80, 80);
		boton12.setFont(new Font("Arial", Font.PLAIN, 40));
		frame.add(boton12);
		
		JButton boton13 = new JButton("/");
		boton13.setName("/");
		boton13.addActionListener(this);
		boton13.setBounds(340, 570, 80, 80);
		boton13.setFont(new Font("Arial", Font.PLAIN, 40));
		frame.add(boton13);
		
		JButton boton14 = new JButton("=");
		boton14.setName("=");
		boton14.addActionListener(this);
		boton14.setBounds(460, 270, 100, 380);
		boton14.setFont(new Font("Arial", Font.PLAIN, 40));
		frame.add(boton14);
		
		JButton boton15 = new JButton("AC");
		boton15.setName("AC");
		boton15.addActionListener(this);
		boton15.setBounds(340, 170, 220, 80);
		boton15.setFont(new Font("Arial", Font.PLAIN, 40));
		frame.add(boton15);
		
		JButton boton16 = new JButton(".");
		boton16.setName(".");
		boton16.addActionListener(this);
		boton16.setBounds(220, 570, 80, 80);
		boton16.setFont(new Font("Arial", Font.PLAIN, 40));
		frame.add(boton16);
		
		JButton boton17 = new JButton("+/-");
		boton17.setName("+/-");
		boton17.addActionListener(this);
		boton17.setBounds(20, 570, 80, 80);
		boton17.setFont(new Font("Arial", Font.PLAIN, 30));
		frame.add(boton17);
		
		JButton boton18 = new JButton("^");
		boton18.setName("^");
		boton18.addActionListener(this);
		boton18.setBounds(220, 170, 80, 80);
		boton18.setFont(new Font("Arial", Font.PLAIN, 40));
		frame.add(boton18);
		
		display = new JTextField();
		display.setBounds(80, 40, 440, 100);
		display.setFont(new Font("Arial", Font.PLAIN, 40));
		display.setText(firstValue + " " + operator + " " + secondValue + "=" + result);
		frame.add(display);
		
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton tmpBtn = (JButton)e.getSource();	
		
		if(operator == "+" || operator == "-" || operator == "x" || operator == "/" || operator == "^") {
			switch(tmpBtn.getName()) {
				case "0":
					secondValue += "0";
					break;
				case "1":
					secondValue += "1";
					break;
				case "2":
					secondValue += "2";
					break;
				case "3":
					secondValue += "3";
					break;
				case "4":
					secondValue += "4";
					break;
				case "5":
					secondValue += "5";
					break;
				case "6":
					secondValue += "6";
					break;
				case "7":
					secondValue += "7";
					break;
				case "8":
					secondValue += "8";
					break;
				case "9":
					secondValue += "9";
					break;
				case ".":
					secondValue += ".";
					break;
			}
		}
		else if(operator == "") {
			switch(tmpBtn.getName()) {
				case "0":
					firstValue += "0";
					break;
				case "1":
					firstValue += "1";
					break;
				case "2":
					firstValue += "2";
					break;
				case "3":
					firstValue += "3";
					break;
				case "4":
					firstValue += "4";
					break;
				case "5":
					firstValue += "5";
					break;
				case "6":
					firstValue += "6";
					break;
				case "7":
					firstValue += "7";
					break;
				case "8":
					firstValue += "8";
					break;
				case "9":
					firstValue += "9";
					break;
				case ".":
					firstValue += ".";
					break;
			}
		}
		
		if(tmpBtn.getName() == "+/-") {
			firstPositive = !firstPositive;
			if(!firstPositive && first) {
				firstValue = "-" + firstValue;
				firstPositive = !firstPositive;
			}
			else if(!firstPositive && !first) {
				secondValue = "-" + secondValue;
			}
		}
		
		if(tmpBtn.getName() == "+" || tmpBtn.getName() == "-" || tmpBtn.getName() == "x" || tmpBtn.getName() == "/" || tmpBtn.getName() == "^") {
			operator = tmpBtn.getName();
			first = !first;
		}
		
		if(tmpBtn.getName() == "=") {
			switch(operator) {
			case "+":
				result = Double.parseDouble(firstValue) + Double.parseDouble(secondValue);
				break;
			case "-":
				result = Double.parseDouble(firstValue) - Double.parseDouble(secondValue);
				break;
			case "x":
				result = Double.parseDouble(firstValue) * Double.parseDouble(secondValue);
				break;
			case "/":
				result = Double.parseDouble(firstValue) / Double.parseDouble(secondValue);
				break;
			case "^":
				result = Math.pow(Double.parseDouble(firstValue), Double.parseDouble(secondValue)); 
			}
		}
		
		if(tmpBtn.getName() == "AC") {
			firstValue = "";
			secondValue = "";
			operator = "";
			result = 0;
			first = true;
			firstPositive = true;
		}
		
		display.setText(firstValue + " " + operator + " " + secondValue + "=" + result);
	}

	public static void main(String[] args) {
		RealNumbersCalculator obj = new RealNumbersCalculator();	
	}
}
