package Persistencia.Entidades;

/**
 * @author Bicentenario
 * @version 1.0
 * @created 14-Sep-2010 06:52:13 p.m.
 */
public class ElementoTrabajoReparacionImplementacion {

	private int cantidad;
	public ElementoTrabajo m_ElementoTrabajo;
	public EstadoElementoTrabajo m_EstadoElementoTrabajo;

	public ElementoTrabajoReparacionImplementacion(){

	}

	
	public int getcantidad(){
		return cantidad;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setcantidad(int newVal){
		cantidad = newVal;
	}

}
