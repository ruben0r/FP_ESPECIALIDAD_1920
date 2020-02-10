package aparatosElectricos;
import java.util.Scanner;
public class bombilla {
	Scanner _teclado=new Scanner(System.in);
	private int a;
	private boolean[] estado=new boolean[21];
	private int Menu(){

		System.out.println("1.Activar el interruptor general.");
		System.out.println("2.Desactivar el interruptor general.");
		System.out.println("3.Encender una bombilla.");
		System.out.println("4.Apagar una bombilla.");
		System.out.println("5.Estado de las bombillas.");
		System.out.println("6.Fin.");
		a=_teclado.nextInt();
		return a;
	}
	public String getestado1() {
		String salir="Fin";
		return salir;
	}
	public void setestado(){
		Menu();
		switch(a) {
		case 1:
			EncenderGeneral();
			setestado();
			break;
		case 2:
			ApagarGeneral();
			setestado();
			break;
		case 3:
			if(estado[20]==false) {
				System.out.println("Recuerda si no activas el interruptor general no podrás encender las bombillas ;)");
			}
			else {
			EncenderBombilla();
			}
			setestado();
			break;
		case 4:
			ApagarBombilla();		
			setestado();
			break;
		case 5:
			Imprimir();			
			setestado();
			break;
		}	
	}
	private boolean[] EncenderGeneral() {
		estado[20]=true;
		return estado;
		
	}
	private boolean[] ApagarGeneral() {
		estado[20]=false;
		return estado;
	}
	private boolean[] ApagarBombilla() {
		System.out.println("Cuantas bombillas quiere apagar");
		int b=_teclado.nextInt();
		if(b<=20) {
		System.out.println("Introduzca cuales quiere apagar");
		for (int i=0;i<b;i++) {
			int c=_teclado.nextInt();
			if(c<=20) {estado[c-1]=false;}
			else {System.out.println("Recuerda que solo hay 20 bombillas.");i--;}
			}
		}
		else {
			
			System.out.println("De momento solo tenemos 20 bombillas :)");
			ApagarBombilla();
		}
		return estado;
	}
	private boolean[] EncenderBombilla() {
		System.out.println("Cuantas bombillas quiere encender");
		int b=_teclado.nextInt();
		if(b<=20) {
		System.out.println("Introduzca cuales quiere encender");
		for (int i=0;i<b;i++) {
			int c=_teclado.nextInt();
			if(c<=20) {estado[c-1]=true;}
			else {System.out.println("Recuerda que solo hay 20 bombillas.");i--;}
			}
		}
		else {
			System.out.println("De momento solo tenemos 20 bombillas :)");
			EncenderBombilla();
		}
		return estado;
	}
	private void Imprimir() {
		if(estado[20]==false) {
			for(int j=0;j<20;j++) {System.out.println("La bombilla número: "+(j+1)+" está apagada.");}
			System.out.println("El interruptor general está apagado");
		}
		else {
			for(int i=0;i<20;i++) {
			if(estado[i]==false) {
				System.out.println("La bombilla número: "+(i+1)+" está apagada.");
			}
			else {
				System.out.println("La bombilla número: "+(i+1)+" está encendida.");
			}
			}
				System.out.println("El interruptor general está encendido");
			}
		
	}
}
