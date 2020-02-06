package aparatosElectricos;

import javax.swing.JOptionPane;

public class CuentaBanco {
	private double dinero;
	private String DNI;
	private String resultado;
	public double getDinero() {
		return dinero;
	}
	public void setDinero(double dinero) {
		this.dinero = dinero;
	}
	public String getDNI() {
		return DNI;
	}
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	private String nombre;
	public CuentaBanco(double dinero,String nombre,String DNI) {
		this.dinero=dinero;
		this.nombre=nombre;
		this.DNI=DNI;
	}
	public void Retirar(double cantidad) {
		if(cantidad>dinero) {
			JOptionPane.showMessageDialog(null, "No puedes sacar más dinero del que tienes ;(");
		}
		else {
			dinero-=cantidad;
		}
	}
	public void Ingresar(double cantidad) {
		dinero+=cantidad;
		}
	public String getResultado() {
		resultado="El dinero restante de la cuenta perteneciente a: "+nombre+" con DNI: "+DNI+"Es de: "+dinero+" Euros.";
		return resultado;
	}

}
