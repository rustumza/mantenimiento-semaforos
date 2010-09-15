package Entidades;

/**
 * @author Bicentenario
 * @version 1.0
 * @created 14-Sep-2010 06:52:17 p.m.
 */
public class ReclamoImplementacion extends CasoImplementacion {

	private int codigoreclamo;

	public Reclamo(){

	}


	public int getcodigoreclamo(){
		return codigoreclamo;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setcodigoreclamo(int newVal){
		codigoreclamo = newVal;
	}

}
