package Persistencia.Entidades;

/**
 * @author Bicentenario
 * @version 1.0
 * @created 14-Sep-2010 06:52:12 p.m.
 */
public class DenunciaEstadoImplementacion {

	private int fechacambioestado;
	private boolean indicadorestadoactual;
	public EstadoDenuncia m_EstadoDenuncia;

	public DenunciaEstadoImplementacion(){

	}

	public int getfechacambioestado(){
		return fechacambioestado;
	}

	public boolean isindicadorestadoactual(){
		return indicadorestadoactual;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setfechacambioestado(int newVal){
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
