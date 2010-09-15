package Persistencia.Entidades;

/**
 * @author Bicentenario
 * @version 1.0
 * @created 14-Sep-2010 06:52:12 p.m.
 */
public class DenunciaImplementacion extends CasoImplementaciono {

	private int codigoDenuncia;
	private float prioridad;
	public Reclamo m_Reclamo;
	public DenunciaEstado m_DenunciaEstado;
	public FallaTecnica m_FallaTecnica;

	public DenunciaImplementacion(){

	}

	
	public int getcodigoDenuncia(){
		return codigoDenuncia;
	}

	public float getprioridad(){
		return prioridad;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setcodigoDenuncia(int newVal){
		codigoDenuncia = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setprioridad(float newVal){
		prioridad = newVal;
	}

}
