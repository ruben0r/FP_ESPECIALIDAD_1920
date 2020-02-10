package aparatosElectricos;
import java.util.Scanner;
public class MainAp {
	static Scanner _teclado=new Scanner(System.in);
static AparatosElectricos[] Ap=new AparatosElectricos[20];

public static void main(String[] args) {

	for(int c=0;c<Ap.length;c++) {
		Ap[c]=new AparatosElectricos("",0.00d,false);
	}
	Menu(_teclado);
}
public static void Menu(Scanner _teclado) {
	System.out.println("1.Crear un nuevo aparato eléctrico.");
	System.out.println("2.Activar un aparato eléctrico.");
	System.out.println("3.Desactivar un aparato eléctrico.");
	System.out.println("4.Mostrar estado de los aparatos");
	System.out.println("5.Mostrar consumo total");
	System.out.println("6.Introduzca la potenciatotal del sistema");
	System.out.println("7.Fin.");
	int a=_teclado.nextInt();
	double potencia=0.00d;
	String nombre;
	int num=0;
	String estado="";
	switch(a) {
	case 1:
		for(int i=0;i<Ap.length;i++) {
			potencia=Ap[i].getPotencia();
			if(potencia==0.00d) {
				System.out.println("Introduzca el nombre del aparato");
				nombre=_teclado.next();
				System.out.println("Introduzca la potencia");
				potencia=_teclado.nextDouble();
				Ap[i]=new AparatosElectricos(nombre,potencia,false);
				i=Ap.length;
				}
			else{}
		}
	
		Menu(_teclado);
	break;
	case 2:
		System.out.println("¿Cuál aparato quiere encender? (Introduzca su número)");
		num=_teclado.nextInt();
		Ap[(num-1)].Encender();
		Menu(_teclado);
	break;
	case 3:
		System.out.println("¿Cuál aparato quiere apagar?");
		num=_teclado.nextInt();
		Ap[(num-1)].Apagar();
		Menu(_teclado);
	break;
	case 4:
		for (int j=0;j<Ap.length;j++) {
			if(Ap[j].getPotencia()!=0.00d) {
				if(Ap[j].getEstado()==false) {
					estado="Apagado";
				}
				else {estado="Encendido";}
				System.out.println("El aparato número "+(j+1)+" Nombre:"+Ap[j].getNombre()+" Tiene una potencia de: "+Ap[j].getPotencia()+" Y está: "+estado);
			}
			
		}
		Menu(_teclado);
	
	break;
	case 5:
		
		System.out.println("El consumo total de los aparatos encendidos es de: "+ Ap[1].getPotenciaTotal()+ "W");
		Menu(_teclado);
		break;
	case 6:
		System.out.println("Introduzca la potencia máxima del sistema en watios");
		double potenciamax=_teclado.nextInt();
		Ap[1].setPotenciaMax(potenciamax);
		Menu(_teclado);
		break;
		
	}
	}
	}