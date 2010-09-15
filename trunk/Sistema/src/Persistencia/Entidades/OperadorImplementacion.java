package Entidades;

/**
 * @author Bicentenario
 * @version 1.0
 * @created 14-Sep-2010 06:52:15 p.m.
 */
public class OperadorImplementacion {

	private String legajo;
	private String nombreOperador;

	public Operador(){

	}

	
	public int getlegajo(){
		return legajo;
	}

	public String getnombreOperador(){
		return nombreOperador;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setlegajo(int newVal){
		legajo = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setnombreOperador(String newVal){
		nombreOperador = newVal;
	}

}
