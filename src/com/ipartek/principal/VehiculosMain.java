package com.ipartek.principal;

import com.ipartek.clases.Bici;
import com.ipartek.clases.Coche;
import com.ipartek.clases.Patinete;

public class VehiculosMain {

	public static void main(String[] args) {

		System.out.println("=======================================================================");
		pruebaPatinete();
		System.out.println("=======================================================================");
		pruebaCoche();
		System.out.println("=======================================================================");
		pruebaBici();
		System.out.println("=======================================================================");
	}

	/**
	 * Probamos una Bici
	 */
	private static void pruebaBici() {
		Bici b = new Bici();
		System.out.println(b);
		b.arrancar(); // Arrancamos
		System.out.println(b);

		try {
			b.acelerar(5);
			b.acelerar(15);
			b.acelerar(30);
			System.out.println(b);
			b.acelerar(1);
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}

		try {
			b.frenar(20);
			b.frenar(20);
			System.out.println(b);
			b.frenar(1);
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}

		b.apagar(); // Apagamos
		System.out.println(b);
	}

	/**
	 * Probamos un coche
	 */
	private static void pruebaCoche() {
		Coche c = new Coche();
		System.out.println(c);
		c.arrancar(); // Arrancamos
		System.out.println(c);

		try {
			c.acelerar(15);
			c.acelerar(65);
			c.acelerar(70);
			System.out.println(c);
			c.acelerar(1);
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}

		try {
			c.frenar(75);
			c.frenar(75);
			System.out.println(c);
			c.frenar(1);
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}

		c.apagar(); // Apagamos
		System.out.println(c);
	}

	/**
	 * Probamos un patinete
	 */
	private static void pruebaPatinete() {
		Patinete p = new Patinete();
		System.out.println(p);
		p.arrancar(); // Arrancamos
		System.out.println(p);

		try {
			p.acelerar(5);
			p.acelerar(35);
			p.acelerar(40);
			System.out.println(p);
			p.acelerar(1);
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}

		try {
			p.frenar(40);
			p.frenar(40);
			System.out.println(p);
			p.frenar(1);
		} catch (Exception e) {
			System.err.println("Error: " + e.getMessage());
		}

		p.apagar(); // Apagamos
		System.out.println(p);
	}
}
