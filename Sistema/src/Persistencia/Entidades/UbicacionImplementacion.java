package Persistencia.Entidades;

/**
 * @author Bicentenario
 * @version 1.0
 * @created 14-Sep-2010 06:52:19 p.m.
 */
public class UbicacionImplementacion {

	private int prioridad;
	private int tipoubicacion;

	public UbicacionImplementacion(){

	}

	

	public int getPrioridad(){
		return prioridad;
	}

	public int gettipoubicacion(){
		return tipoubicacion;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setPrioridad(int newVal){
		prioridad = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void settipoubicacion(int newVal){
		tipoubicacion = newVal;
	}

}
