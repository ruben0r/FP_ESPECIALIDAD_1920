package aparatosElectricos;
	public class AparatosElectricos {
		private static double potenciatotal=0;
		private static double potenciamax=0;
		private boolean estado=false;
		double potencia=0.00d;
		private String nombre="";
		public AparatosElectricos(String nombre, double potencia, boolean estado){
			this.nombre=nombre;
			this.potencia=potencia;
			this.estado=estado;
			AparatosElectricos.potenciatotal+=0;
			AparatosElectricos.potenciamax+=0;
		}
		public void setPotenciaTotal(double potenciatotal) {
			this.potenciatotal=potenciatotal;
		}
		public double getPotenciaTotal() {
			return potenciatotal;
		}
		public String getNombre() {
			return nombre;
		}
		public boolean Apagar(){
			estado=false;
			AparatosElectricos.potenciatotal+=potencia;
			return estado;
		}
		public boolean Encender(){
			if(potenciamax==0) {
				System.out.println("Introduzca un dato para la potencia máxima");
				estado=true;
				AparatosElectricos.potenciatotal+=potencia;
			}
			else if(potenciatotal==0) {
				AparatosElectricos.potenciatotal+=potencia;
				if(potenciatotal>(potenciamax*0.75) && potenciatotal<potenciamax) {
					estado=true;
					AparatosElectricos.potenciatotal+=potencia;
				}
				else if(potenciatotal>=potenciamax) {
					System.out.println("Ha superado el 100% de la potencia máxima, no podemos encender este aparato");
				}
				else {
					estado=true;
					AparatosElectricos.potenciatotal+=potencia;
				}
				
			}
			else if(potenciatotal>(potenciamax*0.75) && potenciatotal<potenciamax) {
				estado=true;
				AparatosElectricos.potenciatotal+=potencia;
			}
			else if(potenciatotal>=potenciamax) {
				System.out.println("Ha superado el 100% de la potencia máxima, no podemos encender este aparato");
			}
			else {
				estado=true;
				AparatosElectricos.potenciatotal+=potencia;
			}
			return estado;
		}
		public double getPotencia() {
			return potencia;
		}
		public boolean getEstado() {
			return estado;
		}
		public void setPotenciaMax(double potenciamax) {
			this.potenciamax=potenciamax;
		}
		public double getPotenciaMax() {
			return potenciamax;
		}
}
