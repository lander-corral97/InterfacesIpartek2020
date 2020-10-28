package com.ipartek.clases;

public class Bici extends Vehiculo {

	public Bici() {
		super();
	}

	@Override
	public void acelerar(int incrementoVel) throws Exception {
		if (incrementoVel + getVelocidadActual() <= VEL_MAX_BICI && isArrancado()) {
			setVelocidadActual(getVelocidadActual() + incrementoVel);
		} else if (incrementoVel < 0) {
			throw new Exception("Has introducido un número negativo");
		} else {
			throw new Exception(
					String.format("Has sobrepasado la velocidad máxima. Máximo: %skm/h, Resultado obtenido: %skm/h",
							VEL_MAX_BICI, incrementoVel + getVelocidadActual()));
		}
	}

	@Override
	public String toString() {
		return String.format("Soy una bici, estoy %s y mi velocidad es de %skm/h",
				isArrancado() ? "encendida" : "apagada", getVelocidadActual());
	}

}
