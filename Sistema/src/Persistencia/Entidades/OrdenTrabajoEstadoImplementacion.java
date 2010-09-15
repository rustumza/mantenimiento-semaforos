package Entidades;

/**
 * @author Bicentenario
 * @version 1.0
 * @created 14-Sep-2010 06:52:16 p.m.
 */
public class OrdenTrabajoEstadoImplementacion {

	private Date fechacambioestado;
	private boolean indicadorestadoactual;
	public EstadoOrdenTrabajo m_EstadoOrdenTrabajo;

	public OrdenTrabajoEstado(){

	}

	
	public Date getfechacambioestado(){
		return fechacambioestado;
	}

	public boolean isindicadorestadoactual(){
		return indicadorestadoactual;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setfechacambioestado(Date newVal){
		fechacambioestado = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setindicadorestadoactual(boolean newVal){
		indicadorestadoactual = newVal;
	}

}
