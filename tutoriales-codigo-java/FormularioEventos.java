package com.applikdos;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class FormularioEventos extends JFrame implements ActionListener {

	JButton boton1, boton2;

	public static void main(String[] args) {
		new FormularioEventos();
	}

	public FormularioEventos() {
		setTitle("Formulario");
		setSize(550, 250);
		setLayout(null);
		setVisible(true);

		boton1 = new JButton();
		boton1.setText("Aceptar");
		boton1.setBounds(150, 100, 100, 30);
		getContentPane().add(boton1);
		boton1.addActionListener(this);

		boton2 = new JButton();
		boton2.setText("Cerrar");
		boton2.setBounds(260, 100, 100, 30);
		getContentPane().add(boton2);
		boton2.addActionListener(this);
	}
    
	public void actionPerformed(ActionEvent evento){
	
		if(evento.getSource()==boton1){
			JOptionPane.showMessageDialog(null, "Este es el boton 1");
		}
		
		if(evento.getSource()==boton2){
			JOptionPane.showMessageDialog(null, "Este es el boton 2");
		}
		
	}
}
