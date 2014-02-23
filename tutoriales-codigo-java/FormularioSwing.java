package com.applikdos;

import javax.swing.*;

public class FormularioSwing extends JFrame {
	JButton btnAceptar;
	JTextField caja1;
	JLabel etiqueta;

	public FormularioSwing() {
		setVisible(true);
		setSize(550, 250);
		setLayout(null);

		etiqueta = new JLabel();
		etiqueta.setText("Nombre");
		etiqueta.setBounds(100, 10, 100, 30);
		getContentPane().add(etiqueta);

		caja1 = new JTextField();
		caja1.setBounds(200, 10, 150, 30);
		getContentPane().add(caja1);

		btnAceptar = new JButton();
		btnAceptar.setText("Aceptar");
		btnAceptar.setBounds(220, 100, 100, 30);
		getContentPane().add(btnAceptar);

	}

	public static void main(String[] args) {
		new FormularioSwing();
	}
}
