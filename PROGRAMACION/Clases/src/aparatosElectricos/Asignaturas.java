package aparatosElectricos;
public class Asignaturas {
private String nombre;
private String departamento;
private int cod;
private int alumnos[]=new int[100];
public String getNombre() {
return nombre;
}
public void setnombre(String nombre) {
this.nombre = nombre;
}
public String getdepartamento() {
return departamento;
}
public void setdepartamento(String departamento) {
this.departamento = departamento;
}
public int getcod() {
return cod;
}
public void setcod(int cod) {
this.cod = cod;
}
public int[] getalumnos() {
return alumnos;
}
public void setalumnos(int[] alumnos) {
this.alumnos = alumnos;
}
public Asignaturas(String nombre, String departamento, int cod, int[] alumnos ) {
this.nombre=nombre;
this.departamento=departamento;
this.cod=cod;
this.alumnos=alumnos;
}
}