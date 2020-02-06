Proceso sin_titulo
	Definir a Como Real;
	Definir b como Real;	
	Definir c Como Real;
	Escribir "Leer el primer número a comparar" ;
	Leer a;
	Escribir "Leer el segundo número a comparar" ;
	Leer b;
	Escribir "Leer el tercer número a comparar" ;
	Leer c;
	Si a > b Y a > c Entonces
		Escribir"El número más grande es el primero (", a, ")" ;
	SiNo
		
		Si b > a Y b > c Entonces
			Escribir "El número más grande es el segundo (", b, ")" ;
		SiNo
			
			Si c>a Y c>b Entonces
				Escribir "El número más grande es el tercero (",c,")" ;
			FinSi
		FinSi
	FinSi
FinProceso
