package Persistencia.Entidades;

import java.util.Date;

/**
 * @author Bicentenario
 * @version 1.0
 * @created 14-Sep-2010 06:52:13 p.m.
 */
public class DetalleInformeMantenimientoImplementacion {

	private char comentario;
	private Date fechafinrealizaciontarea;
	private Date fechainiciorealizaciontarea;
	private Date horafintarea;
	private Date horainiciotarea;
	public Tarea m_Tarea;
	public ElementoTrabajoMantenimiento m_ElementoTrabajoMantenimiento;

	public DetalleInformeMantenimientoImplementacion(){

	}

	
	public char getcomentario(){
		return comentario;
	}

	public Date getfechafinrealizaciontarea(){
		return fechafinrealizaciontarea;
	}

	public Date getfechainiciorealizaciontarea(){
		return fechainiciorealizaciontarea;
	}

	public Date gethorafintarea(){
		return horafintarea;
	}

	public Date gethorainiciotarea(){
		return horainiciotarea;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setcomentario(char newVal){
		comentario = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setfechafinrealizaciontarea(Date newVal){
		fechafinrealizaciontarea = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setfechainiciorealizaciontarea(Date newVal){
		fechainiciorealizaciontarea = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void sethorafintarea(Date newVal){
		horafintarea = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void sethorainiciotarea(Date newVal){
		horainiciotarea = newVal;
	}

}
