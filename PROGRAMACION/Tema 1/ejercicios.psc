Proceso ejercicio_3
	Definir ejemplo como Entero;
	Definir ejemplo2 como Entero ;
	Definir ejemplo3 como Entero;
	Definir n Como Caracter ;
	n <- "																								" ;
	Escribir "Introduzca el n�mero que quieras saber si es mayor de 10" ;
	Leer ejemplo ;
	Si ejemplo > 10 Entonces 
		Escribir "el n�mero es mayor que 10" ;
	SiNo
		Escribir "  el n�mero es menor o igual a 10 ";
		
	FinSi
	Escribir n ;
	Escribir " Introduzca dos n�meros a comparar" ;
	Leer ejemplo ;
	Leer ejemplo2 ;
	Si ejemplo > ejemplo2 Entonces 
		Escribir " el n�mero ", ejemplo , " Es mayor que " , ejemplo2 ;
	SiNo
		Escribir " el n�mero ", ejemplo2 , "Es mayor que " , ejemplo ;
	FinSi
	
	Escribir "Introduzca la base y la altura de la figura ";
	Leer ejemplo ;
	Leer ejemplo2 ;
	Si ejemplo = ejemplo2 Entonces
		Escribir " la figura es un cuadrado";
	SiNo
		Escribir " la figura es un rect�ngulo" ;
	FinSi
	
	Escribir " Introduzca los dos n�meros a comparar" ;
	Leer ejemplo ;
	Leer ejemplo2 ;
	Si ejemplo = ejemplo2 Entonces
		Escribir "el primer n�mero es igual al segundo" ;
	FinSi
	Si ejemplo > ejemplo2 Entonces
		Escribir " El primer n�mero es mayor al segundo " ;
	SiNo
		Escribir " El segundo n�mero es mayor al primero" ;

	FinSi
	Escribir " Introduzca el n�mero " ;
	Leer ejemplo;ejemplo2 <- ejemplo ;
	Si ejemplo > 0 Entonces
		Escribir " El n�mero es positivo" ;
	Sino 
		Si ejemplo < 0 Entonces
			Escribir "El n�mero es negativo" ;
		SiNo
			Escribir "El n�mero es neutro" ;
		FinSi
		
	FinSi
	
	Escribir "Introduzca las medidas de los 3 lados" ;
	Leer ejemplo ;
	Leer ejemplo2;
	Leer ejemplo3;
	//forma corta (muchos procesos)
	Si (ejemplo = ejemplo2) Y (ejemplo2 = ejemplo3) Entonces
		Escribir "El tri�ngulo es equil�tero" ;
	SiNo
		Si (ejemplo2 = ejemplo3) O (ejemplo = ejemplo2) O (ejemplo = ejemplo3) Entonces
			
			Escribir "Es un tri�ngulo is�sceles" ;
		SiNo
			Escribir "Es un tri�ngulo escaleno" ;
			
		FinSi
		
	FinSi
FinProceso
