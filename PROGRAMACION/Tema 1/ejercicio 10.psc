Proceso sin_titulo
	Definir a,b,c,d,e,f,g,h Como Real;
	Escribir "Introduzca la nota de la 1� asignatura";
	Leer a ;
	Escribir "Introduzca la nota de la 2� asignatura";
	Leer b ;
	Escribir "Introduzca la nota de la 3� asignatura";
	Leer c ;
	Escribir "Introduzca la nota de la 4� asignatura";
	Leer d ;
	Escribir "Introduzca la nota de la 5� asignatura";
	Leer e ;
	Escribir "Introduzca la nota de la 6� asignatura";
	Leer f ;
	Escribir "Introduzca el coste de la matr�cula";
	Leer g ;
	h<- a+b+c+d+e+f ;
	Si h >24 Entonces
		
		Escribir "Este alumno debe pagar: ", g*0.7, " euros por la matr�cula "; 
	SiNo
		Escribir "Este alumno debe de pagar: ", g*1.10, " euros por la matr�cula" ;
	FinSi
	
FinProceso
