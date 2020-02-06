Proceso ejercicio_3
	Definir ejemplo como Entero;
	Definir ejemplo2 como Entero ;
	Definir ejemplo3 como Entero;
	Definir n Como Caracter ;
	n <- "																								" ;
	Escribir "Introduzca el número que quieras saber si es mayor de 10" ;
	Leer ejemplo ;
	Si ejemplo > 10 Entonces 
		Escribir "el número es mayor que 10" ;
	SiNo
		Escribir "  el número es menor o igual a 10 ";
		
	FinSi
	Escribir n ;
	Escribir " Introduzca dos números a comparar" ;
	Leer ejemplo ;
	Leer ejemplo2 ;
	Si ejemplo > ejemplo2 Entonces 
		Escribir " el número ", ejemplo , " Es mayor que " , ejemplo2 ;
	SiNo
		Escribir " el número ", ejemplo2 , "Es mayor que " , ejemplo ;
	FinSi
	
	Escribir "Introduzca la base y la altura de la figura ";
	Leer ejemplo ;
	Leer ejemplo2 ;
	Si ejemplo = ejemplo2 Entonces
		Escribir " la figura es un cuadrado";
	SiNo
		Escribir " la figura es un rectángulo" ;
	FinSi
	
	Escribir " Introduzca los dos números a comparar" ;
	Leer ejemplo ;
	Leer ejemplo2 ;
	Si ejemplo = ejemplo2 Entonces
		Escribir "el primer número es igual al segundo" ;
	FinSi
	Si ejemplo > ejemplo2 Entonces
		Escribir " El primer número es mayor al segundo " ;
	SiNo
		Escribir " El segundo número es mayor al primero" ;

	FinSi
	Escribir " Introduzca el número " ;
	Leer ejemplo;ejemplo2 <- ejemplo ;
	Si ejemplo > 0 Entonces
		Escribir " El número es positivo" ;
	Sino 
		Si ejemplo < 0 Entonces
			Escribir "El número es negativo" ;
		SiNo
			Escribir "El número es neutro" ;
		FinSi
		
	FinSi
	
	Escribir "Introduzca las medidas de los 3 lados" ;
	Leer ejemplo ;
	Leer ejemplo2;
	Leer ejemplo3;
	//forma corta (muchos procesos)
	Si (ejemplo = ejemplo2) Y (ejemplo2 = ejemplo3) Entonces
		Escribir "El triángulo es equilátero" ;
	SiNo
		Si (ejemplo2 = ejemplo3) O (ejemplo = ejemplo2) O (ejemplo = ejemplo3) Entonces
			
			Escribir "Es un triángulo isósceles" ;
		SiNo
			Escribir "Es un triángulo escaleno" ;
			
		FinSi
		
	FinSi
FinProceso
