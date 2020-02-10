package compartir;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner _teclado=new Scanner(System.in);
		int arrayaleat[]=arrayaleatorio(_teclado);
		boolean[] par=EsPar(arrayaleat);
		String arrayst[]=(ComprobarPar(par, arrayaleat));
		Imprimirarray(arrayst);
	}
	public static int[] arrayaleatorio(Scanner _teclado) {
		System.out.println("De cuántos elementos quieres que sea el array?");
		int aux=_teclado.nextInt();
		int array[]=new int[aux];
		for(int i=0;i<array.length;i++) {
			array[i]=(int)Math.floor(Math.random()*(aux-1)+1);
		}
		return array;
	}
	public static boolean[] EsPar(int array[]){
		boolean bo[]=new boolean[array.length];
		for (int i=0; i<array.length;i++) {
			if(array[i]%2==0) {
				bo[i]=true;
//			System.out.println(array[i]+" Es par");
			}
			else {
				bo[i]=false;
			}
		}
		return bo;
	}

	public static String[] ComprobarPar(boolean[] boo, int[]array) {
		String res[]=new String[array.length];
			for (int i=0;i<array.length;i++) {
				if(boo[i]==true) {
					res[i]=("El número: "+array[i]+" es par");
				}
				else{
					res[i]=("El número: "+array[i]+" es impar");
				}
			}
		return res;
	}
	public static void Imprimirarray(String array[]) {
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}
}
