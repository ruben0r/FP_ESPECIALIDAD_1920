Proceso sin_titulo
	Definir a,b,c,d,e,f,g,h Como Real;
	Escribir "Introduzca la nota de la 1ª asignatura";
	Leer a ;
	Escribir "Introduzca la nota de la 2ª asignatura";
	Leer b ;
	Escribir "Introduzca la nota de la 3ª asignatura";
	Leer c ;
	Escribir "Introduzca la nota de la 4ª asignatura";
	Leer d ;
	Escribir "Introduzca la nota de la 5ª asignatura";
	Leer e ;
	Escribir "Introduzca la nota de la 6ª asignatura";
	Leer f ;
	Escribir "Introduzca el coste de la matrícula";
	Leer g ;
	h<- a+b+c+d+e+f ;
	Si h >24 Entonces
		
		Escribir "Este alumno debe pagar: ", g*0.7, " euros por la matrícula "; 
	SiNo
		Escribir "Este alumno debe de pagar: ", g*1.10, " euros por la matrícula" ;
	FinSi
	
FinProceso
