package com.ipartek.principal;

import com.ipartek.clases.Bici;
import com.ipartek.clases.Coche;
import com.ipartek.clases.Patinete;

/**
 * 
 * Crear un proyecto nuevo llamado P009_VehiculosDeCiudad. Dentro de dicho
 * proyecto crearemos la siguiente jerarquía de paquetes:
 * <ul>
 * <li>Com.ipartek.interfaces</li>
 * <li>Com.ipartek.clases</li>
 * <li>Com.ipartek.principal</li>
 * </ul>
 * Una vez creada esta jerarquía, se procederá a crear una interfaz llamada
 * Vehiculo. Dicha interfaz tendrá las siguientes constantes:
 * <ul>
 * <li>VEL_MAX_COCHE=150</li>
 * <li>VEL_MAX_BICI=50</li>
 * <li>VEL_MAX_PATINETE=80.</li>
 * </ul>
 * Asimismo también contendrá la definición de los siguientes métodos
 * <ul>
 * <li>Arrancar()</li>
 * <li>Acelerar(int incrementoVel)</li>
 * <li>Frenar(int decrementoVel)</li>
 * <li>Apagar()</li>
 * </ul>
 * Una vez creada se creara una clase patinete, con los atributos
 * velocidadActual (int) y estaArrancado (boolean) y el método toString(), que
 * implementara la interfaz vehiculo. Dicha clase redefinirá los métodos
 * anteriores para que realicen las siguientes tareas
 * <ul>
 * <li>Arrancar: pondrá el atributo estaArrancado a true. Debe estar apagado
 * para poder arrancarse</li>
 * <li>Acelerar: incrementara la velocidad actual con el valor que se le pasa
 * por parámetro sin sobrepasar el limite máximo de velocidad. Solo acelerara si
 * el patinete esta encendido</li>
 * <li>Frenar: decrementara la velocidad actual con el valor que se le pasa por
 * parámetro sin llegar a bajar de 0. Solo frenara si el patinete esta
 * encendido</li>
 * <li>Apagar: pondrá el atributo estaArrancado a false, solo si la
 * velocidadActual es 0</li>
 * <li>toString: mostrara una cadena de texto con el siguiente formato: "Soy un
 * patinete, estoy (encendido/apagado) y mi velocidad es de (velocidadActual)
 * Km/h"</li>
 * </ul>
 * De la misma manera que se ha creado una clase patinete, se crearan dos clases
 * llamadas Bici y Coche, con los mismos atributos. También definirán los mismos
 * métodos de la interfaz<br>
 * En un programa principal, se probaran los métodos con los tres objetos de
 * cada tipo de vehiculo, arrancándolos, acelerando varias veces hasta que
 * lleguen a velocidad máxima, frenando hasta detenerse en varias veces y
 * apagándose. El proceso deberá seguir la lógica del mundo real. No se podrá
 * apagar si ya está encendido, no podrá acelerar ni frenar si esta apagado…<br>
 * realizar las modificaciones pertinentes en el programa para que los atributos
 * arrancado y velocidadActual se hereden de una clase vehiculo, y que no se
 * pueda heredar de las clases patinete bici y coche
 * 
 * 
 * @version 1.0
 * @author Lander Corral
 *
 */
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
