package aparatosElectricos;
import javax.swing.*;
import java.util.Scanner;
public class MainCuenta {
	static Scanner _teclado=new Scanner(System.in);
	static CuentaBanco[] cu=new CuentaBanco[100];
	public static void main(String[] args) {
		Menu();
		JOptionPane.showMessageDialog(null, "Fin del programa");
	}
	public static void Menu() {
		System.out.println("1.Crear cuenta bancaria");
		System.out.println("2.Ingresar dinero");
		System.out.println("3.Sacar dinero");
		System.out.println("4.Consultar dinero restante");
		System.out.println("5.Fin");
		String nombre;
		String DNI;
		double dinero;
		String dineros;
		int error=0;
		switch(_teclado.nextInt()) {
		case 1:
			DNI=JOptionPane.showInputDialog("¿Cuál es su DNI");
			nombre=JOptionPane.showInputDialog("¿Cuál es su nombre");
			dineros=JOptionPane.showInputDialog("¿Con cuánto dinero quiere inicializar la cuenta?");
			dinero=Double.parseDouble(dineros);
			for(int i=0;i<cu.length;i++) {
				if(cu[i]==null) {
					cu[i]=new CuentaBanco(dinero,nombre,DNI);
				}
				else if(cu[i]!=null){
					error++;
				}
				else if(error==cu.length-1) {
					JOptionPane.showMessageDialog(null, "Está creado el número máximo de cuentas");
				}
			}
			Menu();
			break;
		case 2:
			DNI=JOptionPane.showInputDialog(null, "Introduzca su DNI");
			for(int i=0;i<cu.length;i++) {
				if(cu[i]!=null) {
					if(cu[i].getDNI().contains(DNI)) {
						dineros=JOptionPane.showInputDialog("¿Cuánto dinero quiere ingresar?");
						dinero=Double.parseDouble(dineros);
						cu[i].Ingresar(dinero);
						i=cu.length;
					}
				}
			}
			Menu();
			break;
		case 3:
			DNI=JOptionPane.showInputDialog(null, "Introduzca su DNI");
			for(int i=0;i<cu.length;i++) {
				if(cu[i]!=null) {
					if(cu[i].getDNI().contains(DNI)) {
						dineros=JOptionPane.showInputDialog("¿Cuánto dinero quiere retirar?");
						dinero=Double.parseDouble(dineros);
						cu[i].Retirar(dinero);
						i=cu.length;
					}
				}
			}
			Menu();
			break;
		case 4:
			DNI=JOptionPane.showInputDialog(null, "Introduzca su DNI");
			for(int i=0;i<cu.length;i++) {
				if(cu[i]!=null) {
					if(cu[i].getDNI().contains(DNI)) {
						JOptionPane.showMessageDialog(null, cu[i].getResultado());
						i=cu.length;
					}
				}
			}
			Menu();
			break;
			
		}
	}
}
