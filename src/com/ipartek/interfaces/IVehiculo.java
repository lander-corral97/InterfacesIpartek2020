package com.ipartek.interfaces;

/**
 * Interfaz para cualquier veh�culo
 * 
 * @author Lander Corral
 *
 */
public interface IVehiculo {

	public final int VEL_MAX_COCHE = 150;
	public final int VEL_MAX_BICI = 50;
	public final int VEL_MAX_PATINETE = 80;

	/**
	 * Arrancar�, poniendo el booleano isArrancado a true;
	 */
	void arrancar();

	/**
	 * Incrementar� la velocidad
	 * 
	 * @param incrementoVel
	 * @throws Exception Si supera la velocidad permitida o se mete un n�mero
	 *                   negativo
	 */
	void acelerar(int incrementoVel) throws Exception;

	/**
	 * Frenar� el veh�culo
	 * 
	 * @param decrementoVel
	 * @throws Exception Si la velocidad baja de 0 o se mete un n�mero negativo
	 */
	void frenar(int decrementoVel) throws Exception;

	/**
	 * Parar� el veh�culo, poniendo el booleano isArrancado a false;
	 */
	void apagar();

}
