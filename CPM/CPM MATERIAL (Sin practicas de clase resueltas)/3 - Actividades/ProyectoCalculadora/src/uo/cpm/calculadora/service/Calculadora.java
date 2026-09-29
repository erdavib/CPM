package uo.cpm.calculadora.service;

import uo.cpm.calculadora.model.Operador;
import uo.cpm.calculadora.model.enumeration.Operation;

public class Calculadora {
	
	private Operador operador = new Operador();

	public void setOperator(int operator) {
		operador.setOperator(operator);
	}
	
	public void setOperation(Operation operation) {
		operador.setOperation(operation);
	}

	public String getResult(){
		return operador.getResult();
	}
}
