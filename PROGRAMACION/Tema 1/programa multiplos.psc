Proceso sin_titulo
	Definir a,b,d,n Como Entero;
	Definir c,h Como Caracter;
	c<-"Los n�meros con m�ltiplo 3 son ";
	h<-"Los n�meros con m�ltiplo 5 son ";
	d<-0;
	Escribir "Introduzca los 10 n�meros";
	Para n<-1 Hasta 10 Con Paso 1 Hacer
		Leer b;
		Si b MOD 3 = 0 Entonces
			c<- c+ ConvertirATexto(b) + ", ";
		SiNo 
			Si b MOD 5 = 0 Entonces
				h<- h+ ConvertirATexto(b) + ", ";
			SiNo
			FinSi
			
		FinSi
	FinPara	
	Escribir c;
	Escribir h;
FinProceso
