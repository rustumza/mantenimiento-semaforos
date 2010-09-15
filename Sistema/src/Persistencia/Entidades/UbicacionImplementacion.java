package Entidades;

/**
 * @author Bicentenario
 * @version 1.0
 * @created 14-Sep-2010 06:52:19 p.m.
 */
public class UbicacionImplementacion {

	private int codigoUbicacion;
	private int Prioridad;
	private int tipoubicacion;
	public Prioridad m_Prioridad;

	public UbicacionImplementacion(){

	}

	
	public int getcodigoUbicacion(){
		return codigoUbicacion;
	}

	public int getPrioridad(){
		return Prioridad;
	}

	public int gettipoubicacion(){
		return tipoubicacion;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setcodigoUbicacion(int newVal){
		codigoUbicacion = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setPrioridad(int newVal){
		Prioridad = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void settipoubicacion(int newVal){
		tipoubicacion = newVal;
	}

}
