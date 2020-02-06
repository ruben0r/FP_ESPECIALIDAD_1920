import java.util.Scanner;
public class Rectangulo {
	Scanner _teclado=new Scanner(System.in);
	private double x1,x2,y1,y2;
	private static final String NombreFigura="Rectángulo";
	public void Rectangulo(){
		numRectangulos++;
		 String nombre=getNombre();
		 System.out.println("El nombre del rectángulo número: " +numRectangulos+" se llama: "+ nombre);
		 double sup=Superficie();
		 System.out.println("El área del rectángulo es: " + sup + " metros cuadrados");
		 double per=Perimetro();
		 System.out.println("El perímetro del rectángulo es: " + per + " metros cuadrados");
		 Desplazar();
		 System.out.println("El número de rectángulos creados es: "+numRectangulos);
	}
	public String getNombre() {
		 System.out.println("Introduzca el nombre del rectángulo:");
		 String NombreRectangulo=_teclado.nextLine();
		 return NombreRectangulo;
	}
		
	private final double PI=3.1416d;
	private static int numRectangulos;
	public void setx1(double x1) {this.x1=x1;}
	public void setx2(double x2) {this.x2=x2;}
	public void sety1(double y1) {this.y1=y1;}
	public void sety2(double y2) {this.y2=y2;}
	public double getx1() {return x1;}
	public double getx2() {return x2;}
	public double gety1() {return y1;}
	public double gety2() {return y2;}
	public String RepresentarFigura() {
		String salida="el vértice de la esquina inferior izquierda tiene las siguientes coordenadas: "+x1+" "+x2;
		salida=salida+"\n el vértice de la esquina superior derecha tiene las siguientes coordenadas:" + y1+" "+y2;
		return salida;
	}			
	public double Superficie() {
		double area=0;
		area=(CalcularLados(x1,x2)*CalcularLados(y1,y2));
		return area;
	}
	public double Perimetro() {
		double perimetro=0;
			perimetro=2*(CalcularLados(x1,x2))+2*(CalcularLados(y1,y2));
		return perimetro;
	}
	public double CalcularLados(double x1, double x2) {
		double lado=0;
			lado=Math.abs(x2-x1);
		return lado;
	}
	public void Desplazar() {
		double despl=0;
			System.out.println("Cuánto quiere desplazar el rectángulo?");
			despl=_teclado.nextDouble();
			x1=x1+despl;
			x2=x2+despl;
			y1=y1+despl;
			y2=y2+despl;
			System.out.println(RepresentarFigura());
	}
}

