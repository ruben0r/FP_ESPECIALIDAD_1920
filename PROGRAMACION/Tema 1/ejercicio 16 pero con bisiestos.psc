Proceso sin_titulo
	Definir dia,mes,ano Como Entero;
	Definir tipo Como Caracter;
	Escribir "Introduzca el d�a de hoy (en n�mero)";
	Leer dia;
	Escribir "Introduzca el mes (en n�mero)";
	Leer mes;
	Escribir "Introduzca el a�o (en n�mero)";
	Leer ano;
	
	Segun mes Hacer
		1:
			tipo<- "Enero";
		2:
			tipo <-"Febrero";
		3:
			tipo <-"Marzo";
		4:
			tipo <-"Abril";
		5:
			tipo <-"Mayo";
		6:
			tipo <-"Junio";
		7:
			tipo <-"Julio";
		8:
			tipo <-"Agosto";
		9:
			tipo <-"Septiembre";
		10:
			tipo <-"Octubre";
		11:
			tipo <-"Noviembre";
		12:
			tipo <-"Diciembre";
		De Otro Modo:
			
	FinSegun
	
	Si ano >0 Y ano <2020 Entonces
		Si (ano MOD 4 = 0) O (ano MOD 400 = 0) Entonces
			Si mes > 0 Y mes < 13 Entonces
				Si mes Mod 2 = 0 Entonces
					Si mes = 8 Entonces
						Si dia > 0 Y dia < 32 Entonces
							Escribir "Estamos a ", dia, " De ", tipo, " del ", ano ;
						Sino 
							Escribir "Error al introducir la fecha";
						FinSi
					SiNo
						Si mes = 2 Entonces
							Si dia > 0 Y dia <= 29 Entonces
								Escribir "Estamos a ", dia, " De ", tipo, " del ", ano, " (a�o bisiesto) ";
							Sino 
								Escribir "Error al introducir la fecha (a�o bisiesto)";
							FinSi
						SiNo
							Si dia > 0 Y dia < 31 Entonces
								Escribir "Estamos a ", dia, " De ", tipo, " del ", ano ;
							Sino 
								Escribir "Error al introducir la fecha";
							FinSi
						FinSi
						
						
						
					FinSi
				SiNo
					Si dia > 0 Y dia < 31 Entonces
							Escribir "Estamos a ", dia, " De ", tipo, " del ", ano ;
					SiNo
							Escribir "Error al introducir la fecha";
					FinSi
						
						
						
					FinSi
			SiNo
				Escribir "Error al introducir la fecha";
			FinSi
		SiNo
			Si mes > 0 Y mes < 13 Entonces
				Si mes Mod 2 = 0 Entonces
					Si mes = 8 Entonces
						Si dia > 0 Y dia < 32 Entonces
							Escribir "Estamos a ", dia, " De ", tipo, " del ", ano ;
						Sino 
							Escribir "Error al introducir la fecha";
						FinSi
					SiNo
						Si mes = 2 Entonces
							Si dia > 0 Y dia <= 28 Entonces
								Escribir "Estamos a ", dia, " De ", tipo, " del ", ano, "(a�o no bisiesto)" ;
							Sino 
								Escribir "Error al introducir la fecha (a�o no bisiesto)";
							FinSi
						SiNo
							Si dia > 0 Y dia < 31 Entonces
								Escribir "Estamos a ", dia, " De ", tipo, " del ", ano ;
							Sino 
								Escribir "Error al introducir la fecha";
							FinSi
						FinSi
						
						
						
					FinSi
				SiNo
					Si dia > 0 Y dia < 31 Entonces
							Escribir "Estamos a ", dia, " De ", tipo, " del ", ano ;
					SiNo
							Escribir "Error al introducir la fecha";
					FinSi
						
						
						
					FinSi
			SiNo
				Escribir "Error al introducir la fecha";
			FinSi
		FinSi
	SiNo
		Escribir "Error al introducir la fecha";
	FinSi
FinProceso
