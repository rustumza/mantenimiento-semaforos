package Persistencia.Entidades;

/**
 * @author Bicentenario
 * @version 1.0
 * @created 14-Sep-2010 06:52:17 p.m.
 */
public class ProblemaImplementacion {

	private int codigoProblema;
	private String descripcionProblema;
	public Caso m_Caso;

	public Problema(){

	}

	
	public int getcodigoProblema(){
		return codigoProblema;
	}

	public String getdescripcionProblema(){
		return descripcionProblema;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setcodigoProblema(int newVal){
		codigoProblema = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setdescripcionProblema(String newVal){
		descripcionProblema = newVal;
	}

}
