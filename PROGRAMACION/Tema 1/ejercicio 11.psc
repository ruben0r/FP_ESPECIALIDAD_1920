Proceso sin_titulo
	Definir a,b Como Entero;
	Escribir "Introduzca el número";
	Leer a ;
	b <- a Mod 2;
	Si a = 0 Entonces
		Escribir "El número es neutro (0) ";
	SiNo
		Si b = 0 Entonces
			Escribir "El número es par";
		SiNo
			Escribir "El número es impar";
		FinSi
	FinSi
	
FinProceso
