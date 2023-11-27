package org.java;

public class Calculator {
	private float num1;
	private float num2;
	
	public Calculator(float num1, float num2) throws Exception {
		setNum1(num1);
		setNum2(num2);
	}

	public float getNum1() {
		return num1;
	}

	public void setNum1(float num1) {
		this.num1 = num1;
	}

	public float getNum2() {
		return num2;
	}

	public void setNum2(float num2) {
		this.num2 = num2;
	}
	
	public void SummNumbers() {
		
	}
	
	public float addizione(float num1, float num2) {
		return getNum1() + getNum2();
	}
	
	public float sottrazione(float num1, float num2) {
		return getNum1() - getNum2();
	}
	
	public float divisione(float num1, float num2) throws Exception {
        if (getNum2() != 0) {
            return getNum1() / getNum2();
        } 
        else {
            throw new Exception("Division by zero is not allowed.");
        }	
    }
	
	public float moltiplicazione(float num1, float num2) {
		return getNum1() * getNum2();
	}
	

	@Override
	public String toString() {
	    return "Calculator: \n" +
	           "Primo numero inserito = " + getNum1() +
	           "Secondo numero inserito = " + getNum2();
	}
	
}
