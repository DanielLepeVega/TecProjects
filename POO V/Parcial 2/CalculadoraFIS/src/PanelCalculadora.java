//A01209423 - Miguel Angel Grimaldo
//A01633986 - Daniel Lepe Vega
//POO
//23-06-2018
// 50-50

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.*;

public class PanelCalculadora extends JPanel implements ActionListener{
	
	private JTextField tfShow;
	private JButton btDig0,
					btDig1,
					btDig2,
					btDig3,
					btDig4,
					btDig5,
					btDig6,
					btDig7,
					btDig8,
					btDig9,
					btOperPoint,
					btOperSuma,
					btOperResta,
					btOperMult,
					btOperDiv,
					btOperIgual,
					btOperPow,
					btOperAC,
					btMenu;

	private String stValor="";
	private String operador="";
	private String valorGuardado="";
					
	
	public PanelCalculadora() {
		super();
		this.setPreferredSize(new Dimension(450,700));
		this.setLayout(null);
		
		this.btMenu = new JButton("Menu");
		this.btMenu.setBounds(355, 10, 80, 20);
		this.btMenu.addActionListener(new ActionListener() {		
			public void actionPerformed(ActionEvent evt) {
				new VentanaPrincipal();
				close();
			}
		});
		this.add(this.btMenu);
		
		this.tfShow = new JTextField();
		this.tfShow.setEditable(false);
		this.tfShow.setBounds(20, 40, 400, 100);
		this.tfShow.setFont(new Font("Arial", Font.PLAIN, 40));
		this.tfShow.setHorizontalAlignment(SwingConstants.RIGHT);
		this.add(this.tfShow);
		
		this.btDig0 = new JButton("0");
		this.btDig0.setName("0");
		this.btDig0.setBounds(120, 570, 80, 80);
		this.btDig0.setFont(new Font("Arial", Font.PLAIN, 40));
		this.btDig0.addActionListener(this);
		this.add(this.btDig0);
		
		this.btDig1 = new JButton("1");
		this.btDig1.setName("1");
		this.btDig1.setBounds(20, 470, 80, 80);
		this.btDig1.setFont(new Font("Arial", Font.PLAIN, 40));
		this.btDig1.addActionListener(this);
		this.add(this.btDig1);

		this.btDig2 = new JButton("2");
		this.btDig2.setName("2");
		this.btDig2.setBounds(120, 470, 80, 80);
		this.btDig2.setFont(new Font("Arial", Font.PLAIN, 40));
		this.btDig2.addActionListener(this);
		this.add(this.btDig2);

		this.btDig3 = new JButton("3");
		this.btDig3.setName("3");
		this.btDig3.setBounds(220, 470, 80, 80);
		this.btDig3.setFont(new Font("Arial", Font.PLAIN, 40));
		this.btDig3.addActionListener(this);
		this.add(this.btDig3);

		this.btDig4 = new JButton("4");
		this.btDig4.setName("4");
		this.btDig4.setBounds(20, 370, 80, 80);
		this.btDig4.setFont(new Font("Arial", Font.PLAIN, 40));
		this.btDig4.addActionListener(this);
		this.add(this.btDig4);

		this.btDig5 = new JButton("5");
		this.btDig5.setName("5");
		this.btDig5.setBounds(120, 370, 80, 80);
		this.btDig5.setFont(new Font("Arial", Font.PLAIN, 40));
		this.btDig5.addActionListener(this);
		this.add(this.btDig5);

		this.btDig6 = new JButton("6");
		this.btDig6.setName("6");
		this.btDig6.setBounds(220, 370, 80, 80);
		this.btDig6.setFont(new Font("Arial", Font.PLAIN, 40));
		this.btDig6.addActionListener(this);
		this.add(this.btDig6);

		this.btDig7 = new JButton("7");
		this.btDig7.setName("7");
		this.btDig7.setBounds(20, 270, 80, 80);
		this.btDig7.setFont(new Font("Arial", Font.PLAIN, 40));
		this.btDig7.addActionListener(this);
		this.add(this.btDig7);

		this.btDig8 = new JButton("8");
		this.btDig8.setName("8");
		this.btDig8.setBounds(120, 270, 80, 80);
		this.btDig8.setFont(new Font("Arial", Font.PLAIN, 40));
		this.btDig8.addActionListener(this);
		this.add(this.btDig8);

		this.btDig9 = new JButton("9");
		this.btDig9.setName("9");
		this.btDig9.setBounds(220, 270, 80, 80);
		this.btDig9.setFont(new Font("Arial", Font.PLAIN, 40));
		this.btDig9.addActionListener(this);
		this.add(this.btDig9);
		
		this.btOperSuma = new JButton("+");
		this.btOperSuma.setName("+");
		this.btOperSuma.setBounds(340, 270, 80, 80);
		this.btOperSuma.setFont(new Font("Arial", Font.PLAIN, 40));
		this.btOperSuma.addActionListener(this);
		this.add(this.btOperSuma);

		this.btOperResta = new JButton("-");
		this.btOperResta.setName("-");
		this.btOperResta.setBounds(340, 370, 80, 80);
		this.btOperResta.setFont(new Font("Arial", Font.PLAIN, 40));
		this.btOperResta.addActionListener(this);
		this.add(this.btOperResta);
		
		this.btOperMult = new JButton("x");
		this.btOperMult.setName("x");
		this.btOperMult.setBounds(340, 470, 80, 80);
		this.btOperMult.setFont(new Font("Arial", Font.PLAIN, 40));
		this.btOperMult.addActionListener(this);
		this.add(this.btOperMult);

		this.btOperDiv = new JButton("/");
		this.btOperDiv.setName("/");
		this.btOperDiv.setBounds(340, 570, 80, 80);
		this.btOperDiv.setFont(new Font("Arial", Font.PLAIN, 40));
		this.btOperDiv.addActionListener(this);
		this.add(this.btOperDiv);
		
		this.btOperIgual = new JButton("=");
		this.btOperIgual.setName("=");
		this.btOperIgual.setBounds(220, 570, 80, 80);
		this.btOperIgual.setFont(new Font("Arial", Font.PLAIN, 40));
		this.btOperIgual.addActionListener(this);
		this.add(this.btOperIgual);
		
		this.btOperPow = new JButton("^");
		this.btOperPow.setName("^");
		this.btOperPow.setBounds(340, 170, 80, 80);
		this.btOperPow.setFont(new Font("Arial", Font.PLAIN, 40));
		this.btOperPow.addActionListener(this);
		this.add(this.btOperPow);
		
		this.btOperPoint = new JButton(".");
		this.btOperPoint.setName(".");
		this.btOperPoint.setBounds(20, 570, 80, 80);
		this.btOperPoint.setFont(new Font("Arial", Font.PLAIN, 40));
		this.btOperPoint.addActionListener(this);
		this.add(this.btOperPoint);
		
		this.btOperAC = new JButton("AC");
		this.btOperAC.setName("AC");
		this.btOperAC.setBounds(20, 170, 280, 80);
		this.btOperAC.setFont(new Font("Arial", Font.PLAIN, 40));
		this.btOperAC.addActionListener(this);
		this.add(this.btOperAC);
	}
	
	public void close() {
		((JFrame) SwingUtilities.getWindowAncestor(this)).dispose();
	}

	public void actionPerformed(ActionEvent evt) {
//		String operador="";
		Double resultado=0.0;
		JButton btSelected = (JButton)evt.getSource();
		switch(btSelected.getName()) {
			case "0":
				this.stValor+="0";
				this.tfShow.setText(this.stValor);
				break;
			case "1":
				this.stValor+="1";
				this.tfShow.setText(this.stValor);
				break;
			case "2":
				this.stValor+="2";
				this.tfShow.setText(this.stValor);
				break;
			case "3":
				this.stValor+="3";
				this.tfShow.setText(this.stValor);
				break;
			case "4":
				this.stValor+="4";
				this.tfShow.setText(this.stValor);
				break;
			case "5":
				this.stValor+="5";
				this.tfShow.setText(this.stValor);
				break;
			case "6":
				this.stValor+="6";
				this.tfShow.setText(this.stValor);
				break;
			case "7":
				this.stValor+="7";
				this.tfShow.setText(this.stValor);
				break;
			case "8":
				this.stValor+="8";
				this.tfShow.setText(this.stValor);
				break;
			case "9":
				this.stValor+="9";
				this.tfShow.setText(this.stValor);
				break;
			case ".":
				this.stValor+=".";
				this.tfShow.setText(this.stValor);
				break;
			case "AC":
				this.tfShow.setText("0");
				this.stValor = "";
				this.valorGuardado="";
				this.operador="";
				resultado=0.0;
				break;
			case "+":
				this.operador = "+";
				this.tfShow.setText("");
				this.valorGuardado = this.stValor;
				this.stValor = "";
				break;
			case "-":
				this.operador="-";
				this.tfShow.setText("");
				this.valorGuardado = this.stValor;
				this.stValor = "";
				break;
			case "x":
				this.operador="x";
				this.tfShow.setText("");
				this.valorGuardado = this.stValor;
				this.stValor = "";
				break;
			case "/":
				this.operador="/";
				this.tfShow.setText("");
				this.valorGuardado = this.stValor;
				this.stValor = "";
				break;
			case "^":
				this.operador="^";
				this.tfShow.setText("");
				this.valorGuardado = this.stValor;
				this.stValor = "";
				break;
			case "=":
				if(this.operador == "+") {
					DecimalFormat df = new DecimalFormat("#.00");
					resultado = Double.parseDouble(valorGuardado) + Double.parseDouble(stValor);
					this.tfShow.setText(""+df.format(resultado));
				
				}
				else if(this.operador == "-") {
					DecimalFormat df = new DecimalFormat("#.00");
					resultado = Double.parseDouble(valorGuardado) - Double.parseDouble(stValor);
					this.tfShow.setText(""+df.format(resultado));
			
				}
				else if(this.operador == "x") {
					DecimalFormat df = new DecimalFormat("#.00");
					resultado = Double.parseDouble(valorGuardado) * Double.parseDouble(stValor);
					this.tfShow.setText(""+df.format(resultado));
					
				}
				else if(this.operador == "/") {
					DecimalFormat df = new DecimalFormat("#.00");
					resultado = Double.parseDouble(valorGuardado) / Double.parseDouble(stValor);
					this.tfShow.setText(""+df.format(resultado));
			
				}
				else if(this.operador == "^") {
					DecimalFormat df = new DecimalFormat("#.00");
					resultado = Math.pow(Double.parseDouble(valorGuardado), Double.parseDouble(stValor));
					this.tfShow.setText(""+df.format(resultado));
					
				}
				
				this.stValor = ""+resultado;
				break;
				
		}
//		if(evt.getSource()==this.btDig9) {
//			this.tfShow.setText("9");
//			this.valorActual = 9;
//		}
	}	
	
	
}
