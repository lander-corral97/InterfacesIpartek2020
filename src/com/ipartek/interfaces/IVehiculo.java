package com.ipartek.interfaces;

/**
 * Interfaz para cualquier vehículo
 * 
 * @author Lander Corral
 *
 */
public interface IVehiculo {

	public final int VEL_MAX_COCHE = 150;
	public final int VEL_MAX_BICI = 50;
	public final int VEL_MAX_PATINETE = 80;

	/**
	 * Arrancará, poniendo el booleano isArrancado a true;
	 */
	void arrancar();

	/**
	 * Incrementará la velocidad
	 * 
	 * @param incrementoVel
	 * @throws Exception Si supera la velocidad permitida o se mete un número
	 *                   negativo
	 */
	void acelerar(int incrementoVel) throws Exception;

	/**
	 * Frenará el vehículo
	 * 
	 * @param decrementoVel
	 * @throws Exception Si la velocidad baja de 0 o se mete un número negativo
	 */
	void frenar(int decrementoVel) throws Exception;

	/**
	 * Parará el vehículo, poniendo el booleano isArrancado a false;
	 */
	void apagar();

}
