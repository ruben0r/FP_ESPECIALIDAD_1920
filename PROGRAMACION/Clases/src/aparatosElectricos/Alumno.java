package aparatosElectricos;
public class Alumno {
private int NIA;
String nombre;
private String apellidos;
private int num_asig;
private String[] asignaturas=new String[20];
private double notas[]=new double[num_asig];
public Alumno(int NIA, String nombre, String apellidos, int num_asig, double[] notas,String asignaturas[]){
this.NIA=NIA;
this.nombre=nombre;
this.apellidos=apellidos;
this.num_asig=num_asig;
this.notas=notas;
this.asignaturas=asignaturas;
}
public int getNia(){return NIA;}
public void setasignaturas(String [] asignaturas) {this.asignaturas=asignaturas;}
public String[] getasignaturas() {return asignaturas;}
public String getNombre(){return nombre;}
public String getapellidos(){return apellidos;}
public int getnum(){return num_asig;}
public void setNotas(double[] notas) {this.notas=notas;}
public double[] getNotas(){return notas;}
}