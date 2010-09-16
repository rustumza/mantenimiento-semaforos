package Persistencia.Entidades;

/**
 * @author Bicentenario
 * @version 1.0
 * @created 14-Sep-2010 06:52:16 p.m.
 */
public class OrdenTrabajoRepuestoNecesarioImplementacion {

	private int cantidadNecesaria;
	public Repuesto m_Repuesto;

	public OrdenTrabajoRepuestoNecesario(){

	}

	
	public int getcantidadNecesaria(){
		return cantidadNecesaria;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setcantidadNecesaria(int newVal){
		cantidadNecesaria = newVal;
	}

}
