package Persistencia.Entidades;

/**
 * @author Bicentenario
 * @version 1.0
 * @created 14-Sep-2010 06:52:13 p.m.
 */
public class ElementoTrabajoImplementacion {

	private int codigosistemaexterno;
	private int tipoelemento;

	public ElementoTrabajoImplementacion(){

	}

	
	public int getcodigosistemaexterno(){
		return codigosistemaexterno;
	}

	public int gettipoelemento(){
		return tipoelemento;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setcodigosistemaexterno(int newVal){
		codigosistemaexterno = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void settipoelemento(int newVal){
		tipoelemento = newVal;
	}

}
