import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class PanelControles extends JPanel implements MouseListener {
	private JTextField tfNombre;
	private JButton btSaluda;
	private JRadioButton rbRojo,
							rbVerde,
							rbAzul;
	private JButton btColor;
	private PanelDibujo pd;
	private JPanel PanelColor;
	
	public PanelControles(PanelDibujo pd) {
		super();
		this.pd=pd;
		this.setPreferredSize(new Dimension(150,800));
		this.tfNombre = new JTextField(10);
		this.tfNombre.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("Hola " + tfNombre.getText());
				pd.setNombre(tfNombre.getText());
			}
		});
		this.btSaluda = new JButton("Saluda");
		this.btSaluda.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(e.getSource()==btSaluda) {
					System.out.println("Hola " + tfNombre.getText());
					pd.setNombre(tfNombre.getText());
				}
			}
		});
		
		this.rbRojo=new JRadioButton("Color Rojo");
		this.rbVerde=new JRadioButton("Color Verde");
		this.rbAzul=new JRadioButton("Color Azul");
		this.rbRojo.setSelected(true);
		
		this.btColor=new JButton("Cambia color");
		this.btColor.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(rbRojo.isSelected()) {
					setBackground(Color.RED);
				}
				else if(rbVerde.isSelected()) {
					setBackground(Color.GREEN);
				}
				else {
					setBackground(Color.BLUE);
				}
			}
		}); 
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(this.rbRojo);
		bg.add(this.rbVerde);
		bg.add(this.rbAzul);
		
		this.add(this.tfNombre);
		this.add(this.btSaluda);
		
		this.add(this.rbRojo);
		this.add(this.rbVerde);
		this.add(this.rbAzul);
		this.add(this.btColor);
		
		this.PanelColor=new JPanel();
		this.PanelColor.setPreferredSize(new Dimension(70,70));
		this.PanelColor.setBackground(Color.RED);
		this.PanelColor.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				Color color=JColorChooser.showDialog(pd, "Selecciona un color", Color.RED);
				PanelColor.setBackground(color);
				pd.setColorg(color);
				pd.repaint();
			}
		});
		this.add(new JLabel("Color del Globo"));
		this.add(this.PanelColor);
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
