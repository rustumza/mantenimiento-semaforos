package Entidades;

/**
 * @author Bicentenario
 * @version 1.0
 * @created 14-Sep-2010 06:52:15 p.m.
 */
public class OrdenDeReparacionImplementacion extends OrdenTrabajoImplementacion {

	private int codigoordenreparacion;
	public Denuncia m_Denuncia;
	public InformeReparacion m_InformeReparacion;

	public OrdenDeReparacion(){

	}

	
	public int getcodigoordenreparacion(){
		return codigoordenreparacion;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setcodigoordenreparacion(int newVal){
		codigoordenreparacion = newVal;
	}

}
