package Entidades;

/**
 * @author Bicentenario
 * @version 1.0
 * @created 14-Sep-2010 06:52:14 p.m.
 */
public class EstadoOrdenTrabajoImplementacion {

	private int codigoestadoordentrabajo;
	private String nombreestado;
	public OrdenTrabajoEstado m_OrdenTrabajoEstado;

	public EstadoOrdenTrabajo(){

	}

	
	public int getcodigoestadoordentrabajo(){
		return codigoestadoordentrabajo;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setcodigoestadoordentrabajo(int newVal){
		codigoestadoordentrabajo = newVal;
	}

}
