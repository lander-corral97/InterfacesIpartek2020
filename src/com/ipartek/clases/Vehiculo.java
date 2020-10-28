package com.ipartek.clases;

import com.ipartek.interfaces.IVehiculo;

/**
 * Clase para representar un vehículo en general
 * 
 * @version 1.0
 * @author Lander Corral
 *
 */
public abstract class Vehiculo implements IVehiculo {

	private int velocidadActual;
	private boolean isArrancado;

	public Vehiculo() {
		super();
		this.velocidadActual = 0;
		this.isArrancado = false;
	}

	public int getVelocidadActual() {
		return velocidadActual;
	}

	public void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}

	public boolean isArrancado() {
		return isArrancado;
	}

	public void setArrancado(boolean isArrancado) {
		this.isArrancado = isArrancado;
	}

	@Override
	public void arrancar() {
		this.isArrancado = true;
	}

	@Override
	abstract public void acelerar(int incrementoVel) throws Exception;

	@Override
	public void frenar(int decrementoVel) throws Exception {
		if (velocidadActual - decrementoVel >= 0 && isArrancado) {
			velocidadActual -= decrementoVel;
		} else if (decrementoVel < 0) {
			throw new Exception("Has introducido un número negativo");
		} else {
			throw new Exception("No puede haber velocidad negativa. Mínimo: 0km/h, Resultado: "
					+ (velocidadActual - decrementoVel) + "km/h");
		}
	}

	@Override
	public void apagar() {
		this.isArrancado = false;
	}

}
