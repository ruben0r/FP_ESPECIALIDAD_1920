Proceso sin_titulo
	Definir a,b,c,d Como Entero;
	Escribir "Introduzca las notas de los 10 alumnos";
	c<-0;
	d<-0;
	Para a<-1 Hasta 10 Con Paso 1 Hacer
		Leer b;
		Si b<0 O b > 10 Entonces
					Escribir"Nota no válida";
		SiNo
			Si b<7 Entonces
				d<-d+1;
			SiNo
				Si b>=7 Entonces
				c<-c+1;
				FinSi
			FinSi
		FinSi
	FinPara
	Escribir "Hay ", c, " alumnos con nota mayor a 7 y ", d, " alumnos con nota menos a 7";
	
FinProceso

