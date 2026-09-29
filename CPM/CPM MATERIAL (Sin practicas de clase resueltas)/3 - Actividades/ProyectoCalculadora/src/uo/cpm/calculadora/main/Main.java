package uo.cpm.calculadora.main;

import java.awt.EventQueue;

import uo.cpm.calculadora.service.Calculadora;
import uo.cpm.calculadora.ui.VentanaPrincipal;

public class Main {

	public static void main(String[] args) {
		Calculadora calculadora = new Calculadora();
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaPrincipal frame = new VentanaPrincipal(calculadora);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}

}
