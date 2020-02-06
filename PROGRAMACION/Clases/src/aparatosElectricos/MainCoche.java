package aparatosElectricos;
import java.util.regex.*;
import java.util.Scanner;
public class MainCoche {
static Scanner _teclado=new Scanner(System.in);
static Coche[] co=new Coche[10];
public static void main(String[] args) {
Menu();
}
public static void Menu(){
System.out.println("1.Crear nuevo coche");
System.out.println("2.Ver coche y sus características");
System.out.println("3.Cambiar color a un coche");
System.out.println("4.Fin");
String marca;
String color;
String matricula;
int puertas;
switch(_teclado.nextInt())
{
case 1:
System.out.println("¿Cuántos coches quieres crear?");
int auc=_teclado.nextInt();
for(int c=0;c<auc;c++){
System.out.println("¿Quiere crearlo por defecto(pulse 1) o introducir los datos(pulse 2)?");
if(_teclado.nextInt()==1) {
for (int i=0;i<co.length;i++) {
if(co[i]==null) {
co[i]=new Coche();
i=co.length;
}
}
}
else {
for (int i=0;i<co.length;i++) {
if (co[i]==null) {
System.out.println("Introduzca la marca del coche número:"+(i+1));
marca=_teclado.next();
System.out.println("Introduzca la matricula del coche número:"+(i+1));
matricula=_teclado.next();
System.out.println("Introduzca el color del coche número:"+(i+1));
color=_teclado.next();
System.out.println("Introduzca el número de puertas del coche número:"+(i+1));
puertas=_teclado.nextInt();
co[i]=new Coche(color,marca,matricula,puertas);
i=co.length;
}
}
}
}
Menu();
break;
case 2:
System.out.println("¿De que coche quiere los datos?");
int a=_teclado.nextInt()-1;
int b=0;
for(int i=0;i<co.length;i++) {
if(i==a) {
if(co[i]!=null) {
System.out.println("El coche número: "+(i+1)+" con matrícula: "+co[i].getMatricula()+" , marca: "+co[i].getMarca()+" es de color: "+co[i].getColor()+" y tiene: "+co[i].getPuertas()+" puertas.");
i=co.length;
}
else {
b++;
if(b==(co.length-1)) {
System.err.println("No hay ningún coche creado ;(");
b=0;
}
}
}
else {
b++;
if(b==(co.length-1)) {
System.err.println("No hay ningún coche creado ;(");
b=0;
}
}
}
Menu();
break;
case 3:
Pattern p = Pattern.compile("(Azul)?(azul)?(rojo)?(Rojo)?(amarillo)?(Amarillo)?(Negro)?(negro)?(Blanco)?(blanco)?(Verde)?(verde)?(Rosa)?(rosa)?(Morado)?(morado)?(Lila)?(lila)?");
String colour;
System.out.println("¿A qué coche quiere cambiar el color(Introduzca el número)?");
a=_teclado.nextInt()-1;
for(int i=0;i<co.length;i++) {
if(i==a) {
if(co[i]!=null) {
System.out.println("Este coche es de color: "+co[i].getColor()+", ¿A qué color desea cambiarlo?");
colour=_teclado.next();
Matcher m = p.matcher(colour);
if(m.matches()) {
co[i].setColor(colour);
}
else {
System.err.println("Introduzca un color válido");
i--;
}
i=co.length;
}
}
Menu();
break;
}
}
}
}