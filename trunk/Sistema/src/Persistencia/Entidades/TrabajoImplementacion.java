package Entidades;

/**
 * @author Bicentenario
 * @version 1.0
 * @created 14-Sep-2010 06:52:18 p.m.
 */
public class TrabajoImplementacion {

	private int codigoTrabajo;
	private int tiempoEstimadoTrabajo;
	private int tipotrabajo;
	public TrabajoElementoNecesario m_TrabajoElementoNecesario;
	public OrdenTrabajo m_OrdenTrabajo;

	public Trabajo(){

	}

	
	public int getcodigoTrabajo(){
		return codigoTrabajo;
	}

	public int gettiempoEstimadoTrabajo(){
		return tiempoEstimadoTrabajo;
	}

	public int gettipotrabajo(){
		return tipotrabajo;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setcodigoTrabajo(int newVal){
		codigoTrabajo = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void settiempoEstimadoTrabajo(int newVal){
		tiempoEstimadoTrabajo = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void settipotrabajo(int newVal){
		tipotrabajo = newVal;
	}

}
