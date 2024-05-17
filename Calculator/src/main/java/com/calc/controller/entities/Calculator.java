package com.calc.controller.entities;

public class Calculator {
	private double num1;
	private double num2;
	private String operator;
	public Calculator() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Calculator(double num1, double num2, String operator) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.operator = operator;
	}
	public double getNum1() {
		return num1;
	}
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public double getNum2() {
		return num2;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	public String getOperator() {
		return operator;
	}
	public void setOperator(String operator) {
		this.operator = operator;
	}
	public double Result() {
		double result=0;
		switch(this.operator) {
		case "+":
            result = this.num1 + this.num2;
            break;
        case "-":
            result = this.num1 - this.num2;
            break;
        case "*":
            result = this.num1 * this.num2;
            break;
        case "/":
            result = this.num1 / this.num2;
            break;
        default:
            result = 0;
		}
		return result;
		
	}
	
	

}
