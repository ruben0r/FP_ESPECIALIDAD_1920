Proceso sin_titulo
	Definir a Como Real;
	Definir b como Real;	
	Definir c Como Real;
	Escribir "Leer el primer n�mero a comparar" ;
	Leer a;
	Escribir "Leer el segundo n�mero a comparar" ;
	Leer b;
	Escribir "Leer el tercer n�mero a comparar" ;
	Leer c;
	Si a > b Y a > c Entonces
		Escribir"El n�mero m�s grande es el primero (", a, ")" ;
	SiNo
		
		Si b > a Y b > c Entonces
			Escribir "El n�mero m�s grande es el segundo (", b, ")" ;
		SiNo
			
			Si c>a Y c>b Entonces
				Escribir "El n�mero m�s grande es el tercero (",c,")" ;
			FinSi
		FinSi
	FinSi
FinProceso
