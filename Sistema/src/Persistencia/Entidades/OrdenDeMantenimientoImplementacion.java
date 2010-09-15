package Entidades;

/**
 * @author Bicentenario
 * @version 1.0
 * @created 14-Sep-2010 06:52:15 p.m.
 */
public class OrdenDeMantenimientoImplementacion extends OrdenTrabajoImplementacion {

	private int codigoordenmantenimiento;
	public Semaforo m_Semaforo;
	public InformeMantenimiento m_InformeMantenimiento;
	public FichaMantenimiento m_FichaMantenimiento;

	public OrdenDeMantenimiento(){

	}

	
	public int getcodigoordenmantenimiento(){
		return codigoordenmantenimiento;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setcodigoordenmantenimiento(int newVal){
		codigoordenmantenimiento = newVal;
	}

}
