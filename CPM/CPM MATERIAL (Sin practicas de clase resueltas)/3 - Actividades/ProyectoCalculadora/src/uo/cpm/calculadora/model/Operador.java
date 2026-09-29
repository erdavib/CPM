package uo.cpm.calculadora.model;

import uo.cpm.calculadora.model.enumeration.Operation;

public class Operador {
	
	private int firstOperator;
	private int secondOperator;
	private Operation operation;
	private boolean existsFirstOperator = false;
	private boolean existsSecondOperator = false;
	
	private boolean operated = false;

	public void setOperator(int operator) {
		if(this.operation==null) {
			existsFirstOperator=true;
			this.firstOperator=operator;
		}else{
			existsSecondOperator=true;
			this.secondOperator=operator;
		}
	}
	
	public void setOperation(Operation operation) {
		if(canSetOperation()) {
			this.operation=operation;
		}
	}
	
	private boolean canSetOperation() {
		return existsFirstOperator&&!existsSecondOperator;
	}
	
	public String getResult() {
		if(operation==null) {
			return existsFirstOperator?"Operation?":"First Num?";
		}else if(!existsSecondOperator) {
			return "Second num?";
		} else if(operated) {
			return "Blocked";
		}
		switch(operation) {
		case Operation.SUMA:
			operated = true;
			return Integer.toString(firstOperator+secondOperator);
		case Operation.RESTA:
			operated = true;
			return Integer.toString(firstOperator-secondOperator);
		case Operation.MULTIPLICACION:
			operated = true;
			return Integer.toString(firstOperator*secondOperator);
		default:
			return "";
		}
	}

}
