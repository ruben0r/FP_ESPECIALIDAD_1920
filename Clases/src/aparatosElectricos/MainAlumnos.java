package aparatosElectricos;


import java.util.Scanner;
public class MainAlumnos {
static int num_asig;
static int alu[]=new int[100];
static String[] asig=new String[20];
static Alumno[] Al=new Alumno[20];
static int error=0;
public static Asignaturas[] As=new Asignaturas[20];
static double nts=0;
public static void main(String[] args) {
Scanner _teclado=new Scanner(System.in);
Menu(_teclado);
}
public static void Menu(Scanner _teclado) {
System.out.println("1.Crear un nuevo alumno.");
System.out.println("2.Consultar datos de un alumno.");
System.out.println("3.Crear una o varias asignaturas.");
System.out.println("4.Matricular a un alumno en una o varias asignaturas.");
System.out.println("5.Asignar una nota a un alumno.");
System.out.println("6.Obtener la nota media de un alumno");
System.out.println("7.Mostrar las asignaturas y sus datos.");
System.out.println("8.Fin.");
int a=_teclado.nextInt();
switch(a) {
case 1:
System.out.println("¿Cuántos alumnos quiere añadir?");int help=_teclado.nextInt();
for (int c=0;c<help;c++) {
System.out.println("Creando nuevo alumno.\n \n \n");
for(int i=0;i<Al.length;i++) {
if(Al[i]==null) {
System.out.println("¿Cuál es el número identificativo o NIA?");
int NIA=_teclado.nextInt();
for(int t=0;t<i;t++) {
if(NIA==Al[t].getNia()) {
System.out.println("¡Error! Este Nia ya está siendo utilizado, será redirigido al menú");
Menu(_teclado);
}
}
System.out.println("¿Cuál es su nombre?");
String nombre=_teclado.nextLine();
nombre=_teclado.nextLine();
System.out.println("¿Cuáles son sus apellidos?");
String apellidos=_teclado.nextLine();
System.out.println("¿En cuántas asignaturas está matriculado?");
num_asig=_teclado.nextInt();
double[] notas=new double[num_asig];
Al[i]=new Alumno(NIA,nombre,apellidos,num_asig,notas,asig);
i=Al.length;
}
}
}
Menu(_teclado);
break;
case 2:

System.out.println("Introduzca el NIA del alumno a consultar");//Marcando el objeto(entero) como null, el error noPointerExceblabla outtt!!:)
for (int i=0;i<Al.length;i++) {
if(Al[i]!=null) {
if(Al[i].getNia()==_teclado.nextInt()) {
System.out.println("El alumno con NIA: "+Al[i].getNia()+" se llama:  "+Al[i].getNombre()+" "+Al[i].getapellidos()+" Y está matriculado en las siguientes asignaturas:");ImprimirArrayStr(asig);

}
}
else {
error=error+1;
}

}
if (error==20) {
System.out.println("No hay ningún alumno registrado en el programa. :(");
}
else {
error=0;
}
Menu(_teclado);

break;
case 3:
System.out.println("¿Cuántas asignaturas quieres crear?");
int num=_teclado.nextInt();
for (int i=0; i<num;i++) {
for (int c=0;c<As.length;c++) {
if(As[c]==null) {
System.out.println("Introduzca el nombre de la asignatura a crear.");
String name;
name=_teclado.next();
System.out.println("Introduzca el código de la asignatura");
int cod=_teclado.nextInt();

System.out.println("Introduzca el departamento de la asignatura.");
As[c]=new Asignaturas(name ,_teclado.next(),cod,alu);
c=(As.length-1);
}
}
}
Menu(_teclado);
break;
case 4:
System.out.println("¿Qué alumno quiere matricular?(Introduzca NIA)");
for(int i=0;i<Al.length;i++) {
if(Al[i]!=null) {
if(Al[i].getNia()==_teclado.nextInt());
for (int h=0;h<num_asig;h++) {
System.out.println("Introduzca el código de la asignatura");
int cd=_teclado.nextInt();
for(int y=0;y<As.length;y++) {
if(As[y]!=null) {
if(As[y].getcod()==cd) {
alu=As[y].getalumnos();
for (int p=0;p<alu.length;p++) {
if(alu[p]==0) {
alu[p]=Al[i].getNia();
As[y].setalumnos(alu);
p=alu.length;
asig=Al[i].getasignaturas();
}
for(int u=0;u<asig.length;u++) {
if(asig[u]==null) {
asig[u]=As[y].getNombre();
Al[i].setasignaturas(asig);
u=asig.length;
p=alu.length;
}
}

}
y=As.length;
}
}
}
}
}
}
Menu(_teclado);
break;
case 5:
System.out.println("Introduzca el NIA del alumno al que quiera añadir una nota");
int NIA=_teclado.nextInt();
for (int i=0;i<Al.length;i++) {
if(Al[i]!=null) {
if(Al[i].getNia()==NIA) {
asig=Al[i].getasignaturas();
System.out.print("Introduzca el código de la asignatura a poner nota");
String nom=_teclado.next();
String arr[]=Al[i].getasignaturas();
for(int j=0;j<arr.length;j++) {
	if(arr[j].contentEquals(nom)) {
		double not[]=Al[i].getNotas();
		for(int y=0;y<not.length;y++) {
			if(y==j) {
				if(not[y]==0d) {
					System.out.println("¿Qué nota quiere introducir en la asignatura: "+nom+"?");
					not[y]=_teclado.nextDouble();
					Al[i].setNotas(not);
					y=not.length;
					j=arr.length;
				}
			}
		}
	}
}
}
}
}
Menu(_teclado);
	break;
case 6:
	System.out.println("¿De qué alumno quieres la nota media");
	NIA=_teclado.nextInt();
	for(int q=0;q<Al.length;q++) {
		if(Al[q].getNia()==NIA) {
			double[] nt=Al[q].getNotas();
			for(int p=0;p<nt.length;p++) {	
				nts=nts+nt[p];
				if(p==nt.length-1) {
					int nu=Al[q].getnum();
					System.out.println("La nota media del alumno es: "+(nts/nu));
					q=Al.length;
				}
				
			}
		}
		else {
			
		}
	
	}
	
	Menu(_teclado);
	break;
case 7:
for(int i=0; i<As.length;i++) {
if(As[i]!=null) { //Queda hacer que se puedan imprimir los alumnos con una función que los imprima sino sale null.
System.out.println("La asignatura: "+ As[i].getNombre()+" con código: "+As[i].getcod()+ " tiene como departamento el aula: "+ As[i].getdepartamento()+" y tiene los siguientes alumnos matriculados: ");
int[] array=As[i].getalumnos();
ImprimirArrayInt(array);

}
}
break;
}
}
public static void ImprimirArrayStr(String[] array) {
for(int i=0;i<array.length;i++) {
if(array[i]!=null) {
System.out.print("nombre: "+array[i]+"\n");
}
else {
System.out.println("No más hay asignaturas matriculadas en este alumno");
i=100;
}
}
}
public static void ImprimirArrayInt(int[] array) {
for(int i=0;i<100;i++) {
if(array[i]!=0) {
System.out.print("NIA: "+array[i]+"\n");
}
else {
System.out.print("No más hay alumnos matriculados en esta asignatura");
i=100;
}
}
}
}		