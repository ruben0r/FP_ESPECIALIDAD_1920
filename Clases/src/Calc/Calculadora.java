package Calc;

public class Calculadora {
	static private double op1;
	static private double op2;
	static private char operador;
	static private double resultado;
	public double getOp1() {
		return op1;
	}
	public void setOp1(double op1) {
		this.op1 = op1;
	}
	public double getOp2() {
		return op2;
	}
	public void setOp2(double op2) {
		this.op2 = op2;
	}
	public char getOperador() {
		return operador;
	}
	public void setOperador(char operador) {
		this.operador = operador;
	}
	public double getResultado() {
		return resultado;
	}
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}
	public Calculadora(double op1, double op2, char operador) {
		this.op1=op1;
		this.op2=op2;
		this.operador=operador;
	}
	public Calculadora() {
		// TODO Auto-generated constructor stub
	}
	public double calcular() {
		switch (operador) {
		case '+':
			Suma su=new Suma(op1,op2);
			break;
		case '-':
			
			break;
		case '*':
			
			break;
		case '/':
			
			break;
		}
		return resultado;
	}
public String Resultado() {
		return "El resultado de la operación es: "+resultado ;
	}
}
