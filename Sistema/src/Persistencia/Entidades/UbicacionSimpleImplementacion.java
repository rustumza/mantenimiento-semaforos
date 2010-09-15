package Entidades;

/**
 * @author Bicentenario
 * @version 1.0
 * @created 14-Sep-2010 06:52:19 p.m.
 */
public class UbicacionSimpleImplementacion extends UbicacionImplementacion {

	private int altura;
	private int codigoUbicacionSimple;
	public Calle m_Calle;

	public UbicacionSimpleImplementacion(){

	}

	
	public int getaltura(){
		return altura;
	}

	public int getcodigoUbicacionSimple(){
		return codigoUbicacionSimple;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setaltura(int newVal){
		altura = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setcodigoUbicacionSimple(int newVal){
		codigoUbicacionSimple = newVal;
	}

}
