package ejercicio1.window;

import java.awt.event.*;

import javax.swing.*;

public class Ventana extends JFrame {
	private JPanel contentPane;

	public Ventana() {
		// Creamos el titulo de la ventana
		setTitle("SALUDADOR");

		// Definimos el size de la ventana
		setBounds(500, 500, 600, 400);

		// Operacion que cuando se cierre la ventana terminara la aplicacion
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Hacer la ventana visible
		setVisible(true);

		// Creamos el panel
		contentPane = new JPanel();

		// Creamos un label
		JLabel label = new JLabel("Introduce un nombre para saludar");

		// Indicamos su diseño
		contentPane.setLayout(null);

		// Añadimos el label al panel
		contentPane.add(label);

		// Colocamos el elemento en algun lugar del panel
		label.setBounds(200, 20, 300, 60);

		// Creamos una barra de texto
		JTextField textField = new JTextField();

		// Le ponemos un size a la barra de texto
		textField.setBounds(200, 100, 200, 20);

		// introducimos la barra de texto en el panel
		contentPane.add(textField);

		// introducimos un boton y lo ponemos en el panel
		JButton boton = new JButton("Saludar!");

		//Creamos el evento para que cuando le demos al boton, salude al texto que introduzcamos
		boton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Saludos " + textField.getText()+"!!!");
			}
		});
		
		boton.setBounds(200, 150, 200, 20);
		contentPane.add(boton);

		// Asignamos el panel a la ventana
		setContentPane(contentPane);
	}
}
