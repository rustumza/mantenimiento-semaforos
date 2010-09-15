package Persistencia.Entidades;

/**
 * @author Bicentenario
 * @version 1.0
 * @created 14-Sep-2010 06:52:13 p.m.
 */
public class DetalleInformeReparacionImplementacion {

	private String comentario;
	public ReparacionTareaRealizada m_ReparacionTareaRealizada;
	public FallaTecnica m_FallaTecnica;
	public EstadoFallaTecnica m_EstadoFallaTecnica;

	public DetalleInformeReparacionImplementacion(){

	}

	
	public String getcomentario(){
		return comentario;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setcomentario(String newVal){
		comentario = newVal;
	}

}
