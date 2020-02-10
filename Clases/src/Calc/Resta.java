package Calc;

public class Resta extends Calculadora{
	private double resta;
	public Resta(double op1,double op2) {
		super(op1,op2,'-');
		this.resta=op2-op1;
		this.setResultado(resta);
	}
}
