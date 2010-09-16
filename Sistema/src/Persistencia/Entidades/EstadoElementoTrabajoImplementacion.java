package Persistencia.Entidades;

/**
 * @author Bicentenario
 * @version 1.0
 * @created 14-Sep-2010 06:52:14 p.m.
 */
public class EstadoElementoTrabajoImplementacion {

	private int codigoestadoelementotrabajo;
	private String nombreEstado;

	public EstadoElementoTrabajo(){

	}

	
	public int getcodigoestadoelementotrabajo(){
		return codigoestadoelementotrabajo;
	}

	public String getnombreEstado(){
		return nombreEstado;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setcodigoestadoelementotrabajo(int newVal){
		codigoestadoelementotrabajo = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setnombreEstado(String newVal){
		nombreEstado = newVal;
	}

}
