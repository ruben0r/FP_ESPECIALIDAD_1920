package Calc;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class MainCalc {
	static char operador;
	static double op1;
	static double op2;
	static Calculadora ca=new Calculadora();
	static Scanner _teclado=new Scanner(System.in);
	static Suma su=new Suma();
	public static void main(String[] args) {
		Menu();
		System.out.println(ca.Resultado());
	}
	public static void Menu(){
		String operaciones[]={"Sumar","Restar","Multiplicar","Dividir"};
		int operadorint=JOptionPane.showOptionDialog(null, "Seleccione la operación","operandos" , JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, operaciones, _teclado);
		op1=Double.parseDouble(JOptionPane.showInputDialog("Introduzca el primer operando"));
		op2=Double.parseDouble(JOptionPane.showInputDialog("Introduzca el segundo operando"));
		ca.setOp1(op1);
		ca.setOp2(op2);
		if(operadorint==1) {
			ca.setOperador('+');
		}
		else if(operadorint==2) {
			ca.setOperador('-');
		}
		else if(operadorint==3) {
			ca.setOperador('*');
		}
		else if(operadorint==4) {
			ca.setOperador('/');
		}
		
		
	}
}
