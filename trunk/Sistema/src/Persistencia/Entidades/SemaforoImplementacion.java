package Entidades;

/**
 * @author Bicentenario
 * @version 1.0
 * @created 14-Sep-2010 06:52:18 p.m.
 */
public class SemaforoImplementacion {

	private Date fechaInstalacion;
	private int numeroSerie;
	public Orientación m_Orientación;
	public Modelo m_Modelo;
	public Esquina m_Esquina;
	public TipoSemaforo m_TipoSemaforo;
	public Ubicacion m_Ubicacion;

	public Semaforo(){

	}

	
	public Date getfechaInstalacion(){
		return fechaInstalacion;
	}

	public int getnumeroSerie(){
		return numeroSerie;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setfechaInstalacion(Date newVal){
		fechaInstalacion = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setnumeroSerie(int newVal){
		numeroSerie = newVal;
	}

}
