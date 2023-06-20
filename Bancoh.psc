Algoritmo Bancoh
	Definir a,b,c,d,totalsucursales Como Real
	totalsucursales <- 0
	Definir cantidad,i Como Entero
	Definir identiasesor,nombreasesor Como Caracter
	Escribir 'Ingrese identifación Asesor'
	Leer identiasesor
	Escribir 'Ingrese su nombre'
	Leer nombreasesor
	Escribir 'Digite cantidad sucursales a hacer promedio'
	Leer cantidad
	Para i<-1 Hasta cantidad Hacer
		Escribir 'ingrese el valor total de mes de PRESTAMOS DE VIVIENDA'
		Leer a
		Dimension prestamouno[a]
		Escribir 'ingrese el valor total de mes de PRESTAMOS DE ESTUDIO'
		Leer b
		Dimension prestamodos[b]
		Escribir 'ingrese el valor total de mes de PRESTAMOS DE COMPRA DE CARTERA'
		Leer c
		Dimension prestamotres[c]
	FinPara
	Para i<-1 Hasta cantidad Hacer
		d <- (prestamouno[a]+prestamodos[b]+prestamotres[c])/3
		Escribir 'Total promedio sucursal',i,'es de: ',d,'$'
		totalsucursales <- totalsucursales+d
	FinPara
	Escribir '------PROMEDIO TOTAL DE SUCURSALES------'
	totalsucursales <- totalsucursales/cantidad
	Escribir 'El promedio de prestamos de todas las sucursales es de ',totalsucursales
FinAlgoritmo
