package com.renegade;

public class Ejemplo3Java7Interface implements Operacion {

	// Utilizando clases anónimas con Java 7.
	public double sumar(double d1, double d2) {
		return d1+d2;
	}
	
	public static void main(String[] args) {
		Ejemplo3Java7Interface ejemplo3 = new Ejemplo3Java7Interface();
		
		// Utilizando clases anónimas con Java 7.
		System.out.println(ejemplo3.sumar(10, 20));
		
	}

}
