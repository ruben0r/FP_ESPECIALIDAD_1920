import java.util.Scanner;
public class Punto{
	Scanner _teclado=new Scanner(System.in);
		//Esto es la definición de la clase
		private int abscisa; //Eje x
		private int ordenada; //Eje y
		public Punto() {
			abscisa=0;
			ordenada=0;
		}
		private double x1,x2,y1,y2;
		public void Rectangulo() {
			 x1=0;
			 y1=0;
			 x2=0;
			 y2=0;
			}
		public int getAbscisa() {return abscisa;}
		
		public void setAbscisa(int x) {abscisa = x;}
		public int getOrdenada() {return ordenada;}
		public void setOrdenada(int y) {ordenada = y;}
		public String toString () {
			String info="Eje x:"+ getAbscisa()+" Eje y"+getOrdenada();
			return info;
		}
		private static int numRectangulos;
		public void setx1(double x) {x1=x;}
		public void setx2(double x) {x2=x;}
		public void sety1(double x) {y1=x;}
		public void sety2(double x) {y2=x;}
		public double getx1() {return x1;}
		public double getx2() {return x2;}
		public double gety1() {return y1;}
		public double gety2() {return y2;}
		public String RepresentarFigura() {
			numRectangulos++;
			String salida="el vértice de la esquina inferior izquierda tiene las siguientes coordenadas: "+getx1()+" "+gety1();
			salida=salida+"el vértice de la esquina superior derecha tiene las siguientes coordenadas:" + gety1()+" "+gety2();
			System.out.println("El número de rectángulos creados es: "+numRectangulos);
			System.out.println("Introduzca el nombre del rectángulo:");
			String res=_teclado.nextLine();
			System.out.println("El nombre del rectángulo número: " +numRectangulos);
			return salida;
		}
		
	}


