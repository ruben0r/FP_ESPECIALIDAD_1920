package aparatosElectricos;

public class Coche {
private String color;
private String marca;
private String matricula;
public String getColor() {
return color;
}
public void setColor(String color) {
this.color = color;
}
public String getMarca() {
return marca;
}
public void setMarca(String marca) {
this.marca = marca;
}
public String getMatricula() {
return matricula;
}
public void setMatricula(String matricula) {
this.matricula = matricula;
}
public int getPuertas() {
return puertas;
}
public void setPuertas(int puertas) {
this.puertas = puertas;
}
private int puertas;
private int aleat;
public Coche() {
color="Blanco.";
marca="Mercedes";
aleat=(int)Math.round(Math.random()*9998+1);
matricula=aleat+"-jkn";
}
public Coche(String color, String marca, String matricula, int puertas) {
this.color=color;
this.marca=marca;
this.matricula=matricula;
this.puertas=puertas;
}
}
