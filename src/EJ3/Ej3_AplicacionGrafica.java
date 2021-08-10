package EJ3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.* ;
import javax.swing.JOptionPane;

public class Ej3_AplicacionGrafica extends JFrame{
	private JPanel contentPane;
	
	Ej3_AplicacionGrafica(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setVisible(true);
		
		contentPane=new JPanel();
		
		contentPane.setLayout(null);
		
		setContentPane(contentPane);
		
		setTitle("Preguntas");
		
		setBounds(400,400,450,400);
		
		//CREAMOS LOS CONTENIDOS
		JLabel texto1 = new JLabel("Elija un sistema operativo");
		JLabel texto2 = new JLabel("Elije tu especialidad");
		JLabel texto3 = new JLabel("Horas en el ordenador");
		JRadioButton rdbtnOpcion = new JRadioButton ("Windows", true);
		JRadioButton rdbtnOpcion_2 = new JRadioButton ("Linux", false);
		JRadioButton rdbtnOpcion_3 = new JRadioButton ("Mac", false);
		JCheckBox chBoxOp = new JCheckBox("Programación", true);
		JCheckBox chBoxOp_2 = new JCheckBox("Diseño gráfico",false);
		JCheckBox chBoxOp_3 = new JCheckBox("Administración",false);
		//LE AÑADIMOS UN MINIMO Y UN MAXIMO
		SpinnerModel value = new SpinnerNumberModel(1, 0,10,1);
		JSpinner horas = new JSpinner(value);
		JButton Enviar = new JButton("Enviar");
		
		//POSICION CONTENIDO
		texto1.setBounds(43,0,180,80);
		texto2.setBounds(250,0,180,80);
		texto3.setBounds(43,130,180,10);
		rdbtnOpcion.setBounds(43,50,109,23);
		rdbtnOpcion_2.setBounds(43,70,109,23);
		rdbtnOpcion_3.setBounds(43,90,109,23);
		chBoxOp.setBounds(250,50,109,23);
		chBoxOp_2.setBounds(250,70,109,23);
		chBoxOp_3.setBounds(250,90,120,23);
		horas.setBounds(43,150,120,23);
		Enviar.setBounds(200,150,120,23);
		
		//AÑADIMOS EL CONTENIDO
		contentPane.add(texto1);
		contentPane.add(texto2);
		contentPane.add(texto3);
		contentPane.add(rdbtnOpcion);
		contentPane.add(rdbtnOpcion_2);
		contentPane.add(rdbtnOpcion_3);
		contentPane.add(chBoxOp);
		contentPane.add(chBoxOp_2);
		contentPane.add(chBoxOp_3);
		contentPane.add(horas);
		contentPane.add(Enviar);
		
		//AÑADIMOS LOS BOTONES EN UN GRUPO
		ButtonGroup bgroup = new ButtonGroup();
		bgroup.add(rdbtnOpcion);
		bgroup.add(rdbtnOpcion_2);
		bgroup.add(rdbtnOpcion_3);
		
		//EVENTO BOTON
		Enviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//RADIUS BOTON
				String botonR ="";
				if (rdbtnOpcion.isSelected()==true) {
					botonR = rdbtnOpcion.getText();
				}else if (rdbtnOpcion_2.isSelected()==true) {
					 botonR = rdbtnOpcion_2.getText();
				}else {
					 botonR = rdbtnOpcion_3.getText();
				}
				
				String op1 = "";
				String op2 = "";
				String op3 = "";
				if (chBoxOp.isSelected()==true) {
					op1 = chBoxOp.getText();
				}
				if (chBoxOp_2.isSelected()==true) {
					op2 = chBoxOp_2.getText();
				}
				if (chBoxOp_3.isSelected()==true) {
					op3 = chBoxOp_3.getText();
				}
				
				String hora = horas.getValue().toString();
				JOptionPane.showMessageDialog(null, "El sistema operativo es: " + botonR + "\nTu especialidad es: " + op1 + " " + op2 + " " + op3 + "\ny le dedicas al ordenador " + hora +" horas");
				
				
				
			}
		});
		
		
	}

}
