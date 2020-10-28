package com.ipartek.clases;

/**
 * Clase para representar un patinete
 * 
 * @version 1.0
 * @author Lander Corral
 *
 */
public class Patinete extends Vehiculo {

	public Patinete() {
		super();
	}

	@Override
	public void acelerar(int incrementoVel) throws Exception {
		if (incrementoVel + getVelocidadActual() <= VEL_MAX_PATINETE && isArrancado()) {
			setVelocidadActual(getVelocidadActual() + incrementoVel);
		} else if (incrementoVel < 0) {
			throw new Exception("Has introducido un número negativo");
		} else {
			throw new Exception(
					String.format("Has sobrepasado la velocidad máxima. Máximo: %skm/h, Resultado obtenido: %skm/h",
							VEL_MAX_PATINETE, incrementoVel + getVelocidadActual()));
		}
	}

	@Override
	public String toString() {
		return String.format("Soy un patinete, estoy %s y mi velocidad es de %skm/h",
				isArrancado() ? "encendido" : "apagado", getVelocidadActual());
	}

}
