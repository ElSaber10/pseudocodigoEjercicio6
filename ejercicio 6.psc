Algoritmo sin_titulo
	Definir n, contador, datos, Menores, Mayores, MenosDe25, MayoresDe25 Como Entero
	Dimension datos(100)
	Mientras  contador < 100 Hacer
		contador <- contador + 1;
		Escribir "ingrese la edad"
		leer datos(contador)
		si datos(contador) >= 25 Entonces
			Mayores <- Mayores + 1;
			MayoresDe25 <-  MayoresDe25 + datos(contador);
		SiNo
			Menores <- Menores + 1;
			MenosDe25 <-  MenosDe25 + datos(contador);
		FinSi
	FinMientras
	Escribir  "Mayores de 25 el promedio es " MayoresDe25/Mayores
	Escribir "Menores de 25 el promedio es " MenosDe25/Menores 
FinAlgoritmo
