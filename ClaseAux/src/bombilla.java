import java.util.Scanner;
public class bombilla {
	
	public bombilla(boolean a, boolean b) {
		estadoBomb=a;
		estadoGeneral=b;
	}
	public bombilla() {
	}{
		
	}

Scanner _teclado=new Scanner(System.in);
private int a;
private boolean estadoBomb=false;
private static boolean estadoGeneral;
public boolean getestado1() {return estadoBomb;}
public void setestado(boolean estado, boolean estado2){
this.estadoBomb=estado;
this.estadoGeneral=estado2;
}
public boolean getEstadoGeneral() {return estadoGeneral;}
public boolean getestadoBombilla() {return estadoBomb;}
public void setEstadoGeneral(boolean estadoGeneral) {this.estadoGeneral=estadoGeneral;}
public void setestadoBombilla(boolean estadoBomb) {this.estadoBomb=estadoBomb;}
public boolean EncenderGeneral() {
estadoGeneral=true;
return estadoGeneral;

}
public boolean ApagarGeneral() {
estadoBomb=false;
return estadoBomb;
}
public boolean ApagarBombilla() {
estadoBomb=false;

return estadoBomb;
}
public boolean EncenderBombilla() {
	estadoBomb=true;
	return estadoBomb;
}

}