package Entidades;

/**
 * @author Bicentenario
 * @version 1.0
 * @created 14-Sep-2010 06:52:15 p.m.
 */
public class ModeloImplementacion {

	private int codigomodelo;
	private String nombremodelo;
	public Marca m_Marca;

	public Modelo(){

	}

	
	public int getcodigomodelo(){
		return codigomodelo;
	}

	public String getnombremodelo(){
		return nombremodelo;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setcodigomodelo(int newVal){
		codigomodelo = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setnombremodelo(String newVal){
		nombremodelo = newVal;
	}

}
