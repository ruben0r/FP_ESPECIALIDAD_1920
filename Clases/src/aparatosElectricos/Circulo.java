package aparatosElectricos;

public class Circulo {
private double x;
private double y;
private double radio;
private String resultados;
public double getX() {
return x;
}
public void setX(double x) {
this.x = x;
}
public double getY() {
return y;
}
public void setY(double y) {
this.y = y;
}
public double getRadio() {
return radio;
}
public void setRadio(double radio) {
this.radio = radio;
}
public Circulo (double x,double y,double radio) {
this.x=x;
this.y=y;
this.radio=radio;
}
public Circulo(double radio) {
x=0d;
y=0d;
this.radio=radio;
}
public Circulo() {
x=0d;
y=0d;
radio=1d;
}
public double Area() {
return Math.PI*(radio*radio);
}
public double Longitud(){
return 2*Math.PI*radio;
}
public String getResultados(){
resultados="el círculo con coordenadas: "+x+", "+y+ " con radio: "+radio+"cm. Tiene un área de: "+Area()+"cm. Y una longitud de: "+Longitud()+"cm.";
return resultados;
}
}