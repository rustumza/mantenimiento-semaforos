package Persistencia.Entidades;

/**
 * @author Bicentenario
 * @version 1.0
 * @created 14-Sep-2010 06:52:18 p.m.
 */
public class TrabajoElementoNecesarioImplementacion {

	private int cantidadNecesaria;
	public ElementoTrabajo m_ElementoTrabajo;

	public TrabajoElementoNecesarioImplementacion(){

	}

	
	public int getcantidadNecesaria(){
		return cantidadNecesaria;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setcantidadNecesaria(int newVal){
		cantidadNecesaria = newVal;
	}

}
