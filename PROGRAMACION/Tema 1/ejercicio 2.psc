Proceso ejercicio_2
	Definir ejemplo como Real ;
	Escribir "Introduzca el número al que quieras hacer cuadrado" ;
	Leer ejemplo ;
	Escribir "El cuadrado del número es ", ejemplo^2 ;
	
	Escribir "Introduzca las horas que quieres pasar a minutos y segundos" ;
	Leer ejemplo ;
	
	Escribir ejemplo, " horas son ", ejemplo * 60, "minutos y ", ejemplo * 360, " segundos" ;
	
	Escribir "Introduzca los minutos que ha girado el spinner " ;
	Leer ejemplo ; //se indica que v = cte.
	Escribir "el spinner ha girado ", ejemplo * 60 , " veces" ;
	
	Escribir " Introduzca el número del que quieres averiguar su anterior y su posterior " ;
	Leer ejemplo ;
	Escribir "El número anterior a su número es ", ejemplo - 1, "y el posterior es: ", ejemplo +1 ;
	Definir IVA como Real ;
	Escribir "Introduzca el precio del producto" ;
	Leer ejemplo ;
	Escribir "introduzca el IVA del producto (4%, 16%, 21%)" ;
	Leer IVA ;
	IVA <- IVA / 100 ;
	Escribir "El precio bruto del producto es: ", ejemplo - (ejemplo * IVA) ;
	
	
	
	
	
	
	
	
	
	
	
	
FinProceso
