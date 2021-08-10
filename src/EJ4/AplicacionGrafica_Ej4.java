package EJ4;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class AplicacionGrafica_Ej4 extends JFrame{
	
	private JPanel contentPane;
	
	public AplicacionGrafica_Ej4() {
		//CUANDO LE DEMOS A LA X SE CERRARA LA VENTANA
		setDefaultCloseOperation(EXIT_ON_CLOSE);
				
		//HACEMOS QUE LA VENTANA SEA VISIBLE
		setVisible(true);
		
		//CREAMOS EL PANEL
		contentPane = new JPanel();
		
		//INDICAMOS SU DISEÑO
		contentPane.setLayout(null);
		
		//ASIGNAMOS EL PANEL A LA VENTANA
		setContentPane(contentPane);
		
		//AÑADIMOS TITULO A LA VENTANA
		setTitle("Calculadora");
		
		//TAMAÑO DE LA VENTANA
		setBounds(400,400,450,400);
		
		//CREAMOS LOS CONTENIDOS
		
		JTextField num1 = new JTextField();
		JTextField num2 = new JTextField();
		JButton sumar = new JButton("+");
		JButton restar = new JButton("-");
		JButton multi = new JButton("*");
		JButton divi = new JButton("/");
		
		//POSICION CONTENIDOS
		
		num1.setBounds(40,40,50,20);
		num2.setBounds(100,40,50,20);
		sumar.setBounds(150,135,50,20);
		restar.setBounds(150,110,50,20);
		multi.setBounds(212,110,50,20);
		divi.setBounds(212,135,50,20);
		
		//AÑADIR EL CONTENIDO
		
		contentPane.add(num1);
		contentPane.add(num2);
		contentPane.add(sumar);
		contentPane.add(restar);
		contentPane.add(multi);
		contentPane.add(divi);
		
		//EVENTO BOTON
		sumar.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
				int resultado =0;
				String op1=num1.getText();
				int Opcion1 = Integer.parseInt(op1);
				
				String op2=num2.getText();
				int Opcion2 = Integer.parseInt(op2);
				
				resultado = Opcion1 + Opcion2;
				JTextField result = new JTextField ("Result = "+resultado);
				result.setBounds(170,40,70,20);
				contentPane.add(result);
				
			}
		});	
		restar.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
				int resultado =0;
				String op1=num1.getText();
				int Opcion1 = Integer.parseInt(op1);
				
				String op2=num2.getText();
				int Opcion2 = Integer.parseInt(op2);
				
				resultado = Opcion1 - Opcion2;
				JTextField result = new JTextField ("Result = "+resultado);
				result.setBounds(170,40,70,20);
				contentPane.add(result);
				
			}
		});
		multi.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
				int resultado =0;
				String op1=num1.getText();
				int Opcion1 = Integer.parseInt(op1);
				
				String op2=num2.getText();
				int Opcion2 = Integer.parseInt(op2);
				
				resultado = Opcion1 * Opcion2;
				JTextField result = new JTextField ("Result = "+resultado);
				result.setBounds(170,40,70,20);
				contentPane.add(result);
				
			}
		});	
		divi.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent e) {
				
				int resultado =0;
				String op1=num1.getText();
				int Opcion1 = Integer.parseInt(op1);
				
				String op2=num2.getText();
				int Opcion2 = Integer.parseInt(op2);
				
				resultado = Opcion1 / Opcion2;
				JTextField result = new JTextField ("Result = "+resultado);
				result.setBounds(170,40,70,20);
				contentPane.add(result);
				
			}
		});	
	}
	
	
}
