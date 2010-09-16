package Persistencia.Entidades;

/**
 * @author Bicentenario
 * @version 1.0
 * @created 14-Sep-2010 06:52:17 p.m.
 */
public class ReservaElementoTrabajoImplementacion {

	private int cantidadreservada;
	public ElementoTrabajo m_ElementoTrabajo;

	public ReservaElementoTrabajo(){

	}

	
	public int getcantidadreservada(){
		return cantidadreservada;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setcantidadreservada(int newVal){
		cantidadreservada = newVal;
	}

}
