Proceso sin_titulo
	Definir horas,salario,c Como Real;
	Definir turno,dia,nombre Como Caracter;
	Escribir "Introduzca su nombre" ;
	Leer nombre;
	Escribir "Introduzca el número de horas trabajadas" ;
	Leer horas;
	Escribir "Introduzca el turno trabajado (nocturno o diurno)" ;
	Leer turno;
	Escribir "Introduzca el tipo de día trabajado (laborable o festivo)" ;
	Leer dia;
	Si turno = "nocturno" O turno = "Nocturno" Entonces
		Si dia = "festivo" O dia = "Festivo" Entonces
			
			Escribir "El salario de: " ,nombre , " es de: ", 13.5*horas*1.15 ;
		SiNo
			Escribir "El salario de: " ,nombre , " es de: ", 13.5*horas ;
		FinSi
		
	SiNo
		Si dia = "festivo" O dia= "Festivo" Entonces
			Escribir "El salario de: " ,nombre , " es de: ", 10* horas * 1.10 ;
		SiNo
			Escribir "El salario de: " ,nombre , " es de: ", 10*horas ;
		FinSi
		
	FinSi
FinProceso
