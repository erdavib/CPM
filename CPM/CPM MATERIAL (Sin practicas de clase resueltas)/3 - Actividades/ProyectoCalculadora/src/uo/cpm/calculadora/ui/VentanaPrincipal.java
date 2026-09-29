package uo.cpm.calculadora.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import uo.cpm.calculadora.model.enumeration.Operation;
import uo.cpm.calculadora.service.Calculadora;

public class VentanaPrincipal extends JFrame{

	private static final long serialVersionUID = 1L;
	
	private ProcesaOperatorActionListener POAL = new ProcesaOperatorActionListener();
	private ProcesaOperationActionListener  POPAL = new ProcesaOperationActionListener();
	private Calculadora calculadora;
	private JPanel pnPrincipal;
	private JTextField tfDisplay;
	private JButton btSuma;
	private JButton bt9;
	private JButton bt8;
	private JButton bt7;
	private JButton bt4;
	private JButton bt1;
	private JButton bt0;
	private JButton bt5;
	private JButton bt6;
	private JButton btResta;
	private JButton btMultiplicacion;
	private JButton bt3;
	private JButton bt2;
	private JButton btIgual;
	
	public VentanaPrincipal(Calculadora calculadora) {
		setBounds(new Rectangle(10, 10, 453, 592));
		this.calculadora = calculadora;
		setIconImage(Toolkit.getDefaultToolkit().getImage(VentanaPrincipal.class.getResource("/uo/cpm/calculadora/img/ChatGPT Image 15 oct 2025, 12_30_33.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Calculadora");
		getContentPane().add(getPnPrincipal(), BorderLayout.CENTER);
		this.setLocationRelativeTo(null);
		
	}
	
	public class ProcesaOperationActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton boton = (JButton) e.getSource();
			String text = boton.getText();
			
			Operation operation;
			
			switch(text) {
			case "+":
				operation=Operation.SUMA;
				break;
			case "-":
				operation=Operation.RESTA;
				break;
			default:
				operation=Operation.MULTIPLICACION;
			}
			
			setOperation(operation);
			displayOperation(text);
		}
		
	}
	private void setOperation(Operation operation) {
		calculadora.setOperation(operation);
	}
	private void displayOperation(String text) {
		getTfDisplay().setText(text);
	}
	
	public class ProcesaOperatorActionListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			JButton boton = (JButton) e.getSource();
			
			int numero = Integer.parseInt(boton.getText());
			
			setOperator(numero);
			displayOperator(numero);
		}
	}
	private void setOperator(int operator) {
		calculadora.setOperator(operator);
	}
	private void displayOperator(int operator) {
		getTfDisplay().setText(String.valueOf(operator));
	}
	
	private JPanel getPnPrincipal() {
		if (pnPrincipal == null) {
			pnPrincipal = new JPanel();
			pnPrincipal.setBorder(null);
			pnPrincipal.setBackground(new Color(72, 72, 72));
			pnPrincipal.setLayout(null);
			pnPrincipal.add(getTfDisplay());
			pnPrincipal.add(getBtSuma());
			pnPrincipal.add(getBt9());
			pnPrincipal.add(getBt8());
			pnPrincipal.add(getBt7());
			pnPrincipal.add(getBt4());
			pnPrincipal.add(getBt1());
			pnPrincipal.add(getBt0());
			pnPrincipal.add(getBt5());
			pnPrincipal.add(getBt6());
			pnPrincipal.add(getBtResta());
			pnPrincipal.add(getBtMultiplicacion());
			pnPrincipal.add(getBt3());
			pnPrincipal.add(getBt2());
			pnPrincipal.add(getBtIgual());
		}
		return pnPrincipal;
	}
	private JTextField getTfDisplay() {
		if (tfDisplay == null) {
			tfDisplay = new JTextField();
			tfDisplay.setForeground(new Color(42, 42, 42));
			tfDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
			tfDisplay.setFont(new Font("Tahoma", Font.BOLD, 64));
			tfDisplay.setText("0");
			tfDisplay.setFocusable(false);
			tfDisplay.setEditable(false);
			tfDisplay.setBorder(null);
			tfDisplay.setBackground(new Color(170, 206, 168));
			tfDisplay.setBounds(10, 21, 414, 95);
			tfDisplay.setColumns(10);
		}
		return tfDisplay;
	}
	private JButton getBtSuma() {
		if (btSuma == null) {
			btSuma = new JButton("+");
			btSuma.setFocusable(false);
			btSuma.setFont(new Font("Tahoma", Font.BOLD, 60));
			btSuma.setBackground(new Color(134, 193, 206));
			btSuma.setForeground(new Color(243, 243, 243));
			btSuma.setBorder(null);
			btSuma.setBounds(329, 127, 95, 95);
			btSuma.addActionListener(POPAL);
		}
		return btSuma;
	}
	private JButton getBt9() {
		if (bt9 == null) {
			bt9 = new JButton("9");
			bt9.setFocusable(false);
			bt9.setFont(new Font("Tahoma", Font.BOLD, 60));
			bt9.setBackground(new Color(144, 144, 144));
			bt9.setForeground(new Color(243, 243, 243));
			bt9.setBorder(null);
			bt9.setBounds(224, 127, 95, 95);
			bt9.addActionListener(POAL);
		}
		return bt9;
	}
	private JButton getBt8() {
		if (bt8 == null) {
			bt8 = new JButton("8");
			bt8.setFocusable(false);
			bt8.setFont(new Font("Tahoma", Font.BOLD, 60));
			bt8.setBackground(new Color(144, 144, 144));
			bt8.setForeground(new Color(243, 243, 243));
			bt8.setBorder(null);
			bt8.setBounds(119, 127, 95, 95);
			bt8.addActionListener(POAL);
		}
		return bt8;
	}
	private JButton getBt7() {
		if (bt7 == null) {
			bt7 = new JButton("7");
			bt7.setFocusable(false);
			bt7.setFont(new Font("Tahoma", Font.BOLD, 60));
			bt7.setBackground(new Color(144, 144, 144));
			bt7.setForeground(new Color(243, 243, 243));
			bt7.setBorder(null);
			bt7.setBounds(10, 127, 95, 95);
			bt7.addActionListener(POAL);
		}
		return bt7;
	}
	
	private JButton getBt4() {
		if (bt4 == null) {
			bt4 = new JButton("4");
			bt4.setFocusable(false);
			bt4.setFont(new Font("Tahoma", Font.BOLD, 60));
			bt4.setBackground(new Color(144, 144, 144));
			bt4.setForeground(new Color(243, 243, 243));
			bt4.setBorder(null);
			bt4.setBounds(10, 233, 95, 95);
			bt4.addActionListener(POAL);
		}
		return bt4;
	}
	private JButton getBt1() {
		if (bt1 == null) {
			bt1 = new JButton("1");
			bt1.setFocusable(false);
			bt1.setFont(new Font("Tahoma", Font.BOLD, 60));
			bt1.setBackground(new Color(144, 144, 144));
			bt1.setForeground(new Color(243, 243, 243));
			bt1.setBorder(null);
			bt1.setBounds(10, 339, 95, 95);
			bt1.addActionListener(POAL);
		}
		return bt1;
	}
	private JButton getBt0() {
		if (bt0 == null) {
			bt0 = new JButton("0");
			bt0.setFocusable(false);
			bt0.setFont(new Font("Tahoma", Font.BOLD, 60));
			bt0.setBackground(new Color(144, 144, 144));
			bt0.setForeground(new Color(243, 243, 243));
			bt0.setBorder(null);
			bt0.setBounds(10, 445, 95, 95);
			bt0.addActionListener(POAL);
		}
		return bt0;
	}
	private JButton getBt5() {
		if (bt5 == null) {
			bt5 = new JButton("5");
			bt5.setFocusable(false);
			bt5.setFont(new Font("Tahoma", Font.BOLD, 60));
			bt5.setBackground(new Color(144, 144, 144));
			bt5.setForeground(new Color(243, 243, 243));
			bt5.setBorder(null);
			bt5.setBounds(119, 233, 95, 95);
			bt5.addActionListener(POAL);
		}
		return bt5;
	}
	private JButton getBt6() {
		if (bt6 == null) {
			bt6 = new JButton("6");
			bt6.setFocusable(false);
			bt6.setFont(new Font("Tahoma", Font.BOLD, 60));
			bt6.setBackground(new Color(144, 144, 144));
			bt6.setForeground(new Color(243, 243, 243));
			bt6.setBorder(null);
			bt6.setBounds(224, 233, 95, 95);
			bt6.addActionListener(POAL);
		}
		return bt6;
	}
	private JButton getBtResta() {
		if (btResta == null) {
			btResta = new JButton("-");
			btResta.setFocusable(false);
			btResta.setFont(new Font("Tahoma", Font.BOLD, 60));
			btResta.setBackground(new Color(134, 193, 206));
			btResta.setForeground(new Color(243, 243, 243));
			btResta.setBorder(null);
			btResta.setBounds(329, 233, 95, 95);
			btResta.addActionListener(POPAL);
		}
		return btResta;
	}
	private JButton getBtMultiplicacion() {
		if (btMultiplicacion == null) {
			btMultiplicacion = new JButton("x");
			btMultiplicacion.setFocusable(false);
			btMultiplicacion.setFont(new Font("Tahoma", Font.BOLD, 60));
			btMultiplicacion.setBackground(new Color(134, 193, 206));
			btMultiplicacion.setForeground(new Color(243, 243, 243));
			btMultiplicacion.setBorder(null);
			btMultiplicacion.setBounds(329, 339, 95, 95);
			btMultiplicacion.addActionListener(POPAL);
		}
		return btMultiplicacion;
	}
	private JButton getBt3() {
		if (bt3 == null) {
			bt3 = new JButton("3");
			bt3.setFocusable(false);
			bt3.setFont(new Font("Tahoma", Font.BOLD, 60));
			bt3.setBackground(new Color(144, 144, 144));
			bt3.setForeground(new Color(243, 243, 243));
			bt3.setBorder(null);
			bt3.setBounds(224, 339, 95, 95);
			bt3.addActionListener(POAL);
		}
		return bt3;
	}
	private JButton getBt2() {
		if (bt2 == null) {
			bt2 = new JButton("2");
			bt2.setFocusable(false);
			bt2.setFont(new Font("Tahoma", Font.BOLD, 60));
			bt2.setBackground(new Color(144, 144, 144));
			bt2.setForeground(new Color(243, 243, 243));
			bt2.setBorder(null);
			bt2.setBounds(119, 339, 95, 95);
			bt2.addActionListener(POAL);
		}
		return bt2;
	}
	private JButton getBtIgual() {
		if (btIgual == null) {
			btIgual = new JButton("=");
			btIgual.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					displayResult();
				}
			});
			btIgual.setFocusable(false);
			btIgual.setFont(new Font("Tahoma", Font.BOLD, 60));
			btIgual.setBackground(new Color(219, 89, 89));
			btIgual.setForeground(new Color(243, 243, 243));
			btIgual.setBorder(null);
			btIgual.setBounds(119, 445, 305, 95);
		}
		return btIgual;
	}
	private void displayResult() {
		getTfDisplay().setText(calculadora.getResult());
	}
}
