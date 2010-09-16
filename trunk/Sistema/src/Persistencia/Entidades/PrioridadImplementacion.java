package Persistencia.Entidades;

/**
 * @author Bicentenario
 * @version 1.0
 * @created 14-Sep-2010 06:52:16 p.m.
 */
public class PrioridadImplementacion {

	private int codigoPrioridad;
	private String nivelPrioridad;

	public Prioridad(){

	}

	
	public int getcodigoPrioridad(){
		return codigoPrioridad;
	}

	public String getnivelPrioridad(){
		return nivelPrioridad;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setcodigoPrioridad(int newVal){
		codigoPrioridad = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setnivelPrioridad(String newVal){
		nivelPrioridad = newVal;
	}

}
