Proceso sin_titulo
	Definir a,b Como Entero;
	Escribir "Introduzca el n�mero";
	Leer a ;
	b <- a Mod 2;
	Si a = 0 Entonces
		Escribir "El n�mero es neutro (0) ";
	SiNo
		Si b = 0 Entonces
			Escribir "El n�mero es par";
		SiNo
			Escribir "El n�mero es impar";
		FinSi
	FinSi
	
FinProceso
