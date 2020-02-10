package Calc;

public class Suma extends Calculadora{
	private double suma;
	public Suma(double op1,double op2) {
		super(op1,op2,'+');
		this.suma=op1+op2;
		this.setResultado(suma);
	}
	public Suma() {
		// TODO Auto-generated constructor stub
	}
}
