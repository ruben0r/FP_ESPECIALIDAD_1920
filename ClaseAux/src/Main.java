import java.util.Scanner;
public class Main {
static bombilla b1=new bombilla();
static bombilla bomb[]=new bombilla[20];
public static void main(String[] args) {
	for (int k=0;k<bomb.length;k++) {
		bomb[k]=new bombilla(false, false);
	}
Scanner _teclado=new Scanner(System.in);
Menu(_teclado);
System.out.println("Fin del programa");
_teclado.close();
}
public static void Menu(Scanner _teclado) {
System.out.println("1.Activar el interruptor general.");
System.out.println("2.Desactivar el interruptor general.");
System.out.println("3.Encender una bombilla.");
System.out.println("4.Apagar una bombilla.");
System.out.println("5.Estado de las bombillas.");
System.out.println("6.Fin.");
int a=_teclado.nextInt();
switch(a) {
case 1:
	boolean b=b1.EncenderGeneral();
	b1.setEstadoGeneral(true);
	Menu( _teclado);
break;
case 2:
	b1.setEstadoGeneral(false);
	Menu( _teclado);
break;
case 3:
if(b1.getEstadoGeneral()==false) {
System.out.println("Recuerda si no activas el interruptor general no podrás encender las bombillas ;)");
}
else {
	System.out.println("Cuántas bombillas quiere encender?");
	int au=_teclado.nextInt();
	if(au<=20) {
		System.out.println("Introduzca cuales quiere encender");
		for (int i=0;i<au;i++) {
		int c=_teclado.nextInt();
		if(c<=20) {
			b1.EncenderBombilla();
			bomb[c]=new bombilla(b1.getestadoBombilla(),b1.getEstadoGeneral());
			}
		else {System.out.println("Recuerda que solo hay 20 bombillas.");i--;}
		}
		}
}
Menu( _teclado);
break;
case 4:
	System.out.println("Cuántas bombillas quiere apagar?");
	int au=_teclado.nextInt();
	if(au<=20) {
		System.out.println("Introduzca cuales quiere apagar");
		for (int i=0;i<au;i++) {
		int c=_teclado.nextInt();
		if(c<=20) {
			b1.ApagarBombilla();
			bomb[c]=new bombilla(b1.getestadoBombilla(),b1.getEstadoGeneral());
			}
		else {System.out.println("Recuerda que solo hay 20 bombillas.");i--;}
		}
	}
	else {
		{System.out.println("Recuerda que solo hay 20 bombillas.");}
	}
Menu(_teclado);
break;
case 5:
Rellenar();	
Menu( _teclado);
break;
}
}
static public void Rellenar() {
if(b1.getEstadoGeneral()==false) 
	{
	for(int j=0;j<20;j++) {
	if(bomb[j].getestadoBombilla()==false)
		{
			System.out.println("La bombilla número: "+(j+1)+" está apagada.");
		}
		}
			System.out.println("El interruptor general está apagado");
		}
	
else {
	for(int i=0;i<20;i++) {
		if(bomb[i].getestadoBombilla()==false) {
			System.out.println("La bombilla número: "+(i+1)+" está apagada.");
		}
		else if(bomb[i].getestadoBombilla()==true){
			System.out.println("La bombilla número: "+(i+1)+" está encendida.");
		}
	}
	System.out.println("El interruptor general está encendido");
}
}
}
