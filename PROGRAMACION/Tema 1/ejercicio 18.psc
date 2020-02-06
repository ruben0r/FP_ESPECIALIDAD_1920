Proceso sin_titulo
	Definir a, b,n como real;
	Escribir "Inserta el número de números pares que deseas";
	Leer a;

	n<-0;
	Si a MOD 2 = 0 Entonces
		b<-2;
		
	SiNo
		b<-1;
		
	FinSi
	
	Mientras n<a Hacer
			Escribir a + b;
			n<- n+1 ;
			b <- b+2;
		FinMientras
FinProceso
