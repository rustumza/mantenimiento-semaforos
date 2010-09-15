package Entidades;

/**
 * @author Bicentenario
 * @version 1.0
 * @created 14-Sep-2010 06:52:14 p.m.
 */
public class FichaMantenimientoImplementacion {

	private int codigoFichaMantenimiento;
	public Modelo m_Modelo;
	public Periodicidad m_Periodicidad;
	public RangoAnios m_RangoAnios;
	public Tarea m_Tarea;

	public FichaMantenimiento(){

	}

	
	public int getcodigoFichaMantenimiento(){
		return codigoFichaMantenimiento;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setcodigoFichaMantenimiento(int newVal){
		codigoFichaMantenimiento = newVal;
	}

}
