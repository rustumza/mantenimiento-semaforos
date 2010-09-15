package Entidades;

/**
 * @author Bicentenario
 * @version 1.0
 * @created 14-Sep-2010 06:52:15 p.m.
 */
public class MarcaImplementacion {

	private int codigomarca;
	private String nombremarca;

	public Marca(){

	}

	public void finalize() throws Throwable {

	}

	public int getcodigomarca(){
		return codigomarca;
	}

	public String getnombremarca(){
		return nombremarca;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setcodigomarca(int newVal){
		codigomarca = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setnombremarca(String newVal){
		nombremarca = newVal;
	}

}
