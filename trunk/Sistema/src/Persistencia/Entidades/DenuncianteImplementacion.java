package Persistencia.Entidades;

/**
 * @author Bicentenario
 * @version 1.0
 * @created 14-Sep-2010 06:52:12 p.m.
 */
public class DenuncianteImplementacion {

	private int celular;
	private char domicilio;
	private char email;
	private int telefonofijo;
	public PersonaPadron m_PersonaPadron;

	public DenuncianteImplementacion(){

	}

	
	public int getcelular(){
		return celular;
	}

	public char getdomicilio(){
		return domicilio;
	}

	public char getemail(){
		return email;
	}

	public int gettelefonofijo(){
		return telefonofijo;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setcelular(int newVal){
		celular = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setdomicilio(char newVal){
		domicilio = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setemail(char newVal){
		email = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void settelefonofijo(int newVal){
		telefonofijo = newVal;
	}

}
