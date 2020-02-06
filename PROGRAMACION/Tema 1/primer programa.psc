Algoritmo Primeralgoritmo
	Definir ejemplo2 como Entero;
	Definir ejemplo1 como Entero;//Hemos creado una variable de tipo entero
	 // le hemos puesto un valor literal
	// En PSeinT El = es <-
	Leer ejemplo1 ;
	Leer ejemplo2 ; //pedir dato al usuario
	Escribir "Buenas tardes" ;	
	Escribir "Vamos a mostrar la variable resultado es " , ejemplo2 + ejemplo1 ;
	Escribir " introduzca los dos números a restar " ;
	Leer ejemplo1 ;
	Leer ejemplo2 ;
	Escribir "Vamos a mostrar la variable resultado es " , ejemplo1 - ejemplo2 ;
	Escribir " introduzca los dos números a multiplicar" ;
	Leer ejemplo1 ;
	Leer ejemplo2 ;
	Escribir "Vamos a mostrar la variable resultado es " , ejemplo1 * ejemplo2 ;
	Escribir " introduzca el número y el módulo a calcular ";
	Leer ejemplo1 ;
	ejemplo1 <- ejemplo1 % 2 ;
	Si ejemplo1 = 0 Entonces
	Escribir "el número es par" ;
	SiNo
	Escribir "el número es impar" ;
	FinSi

	Escribir " introduzca la base y la altura del rectángulo ";
	Leer ejemplo1 ;
	Leer ejemplo2 ;
	Escribir "Vamos a mostrar el área del rectángulo " , ejemplo1 * ejemplo2 ;
	Escribir " introduzca la diagonal menor del rombo (d) ";
	Leer ejemplo1 ;
	Escribir " introduzca la diagonal mayor del rombo (D) ";
	Leer ejemplo2 ;
	Escribir "Vamos a mostrar el área del rombo " , ejemplo1 * ejemplo2 /2 ;
	Escribir " introduzca la base y la altura del triángulo ";
	Leer ejemplo1 ;
	Leer ejemplo2 ;
	Escribir "Vamos a mostrar el área del triángulo " , ejemplo1 * ejemplo2 /2;
	Escribir " introduzca la base y la altura del paralelogramo";
	Leer ejemplo1 ;
	Leer ejemplo2 ;
	Escribir "Vamos a mostrar el área del paralelogramo " , ejemplo1 * ejemplo2 ;
	
FinAlgoritmo
