package Entidades;

/**
 * @author Bicentenario
 * @version 1.0
 * @created 14-Sep-2010 06:52:14 p.m.
 */
public class EstadoPersonaPadronImplementacion {

	private int codigoestadopersonapadron;
	private String nombreestado;

	public EstadoPersonaPadron(){

	}

	
	public int getcodigoestadopersonapadron(){
		return codigoestadopersonapadron;
	}

	public String getnombreestado(){
		return nombreestado;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setcodigoestadopersonapadron(int newVal){
		codigoestadopersonapadron = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setnombreestado(String newVal){
		nombreestado = newVal;
	}

}
