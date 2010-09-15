package Entidades;

/**
 * @author Bicentenario
 * @version 1.0
 * @created 14-Sep-2010 06:52:18 p.m.
 */
public class TareaImplementacion extends TrabajoImplementacion {

	private int codigoTarea;
	private String descripciontarea;

	public Tarea(){

	}

	
	public int getcodigoTarea(){
		return codigoTarea;
	}

	public String getdescripciontarea(){
		return descripciontarea;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setcodigoTarea(int newVal){
		codigoTarea = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setdescripciontarea(String newVal){
		descripciontarea = newVal;
	}

}
