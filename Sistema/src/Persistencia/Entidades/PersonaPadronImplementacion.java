package Persistencia.Entidades;

/**
 * @author Bicentenario
 * @version 1.0
 * @created 14-Sep-2010 06:52:16 p.m.
 */
public class PersonaPadronImplementacion {

	private String apellido;
	private String domicilio;
	private String nombre;
	private String nroDocumento;
	private String tipoDocumento;
	public PersonaPadronEstado m_PersonaPadronEstado;

	public PersonaPadron(){

	}

	
	public String getapellido(){
		return apellido;
	}

	public String getdomicilio(){
		return domicilio;
	}

	public String getnombre(){
		return nombre;
	}

	public String gettipoDocumento(){
		return tipoDocumento;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setapellido(String newVal){
		apellido = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setdomicilio(String newVal){
		domicilio = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setnombre(String newVal){
		nombre = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void settipoDocumento(String newVal){
		tipoDocumento = newVal;
	}

}
