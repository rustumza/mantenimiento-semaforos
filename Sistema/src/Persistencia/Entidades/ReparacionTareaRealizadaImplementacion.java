package Persistencia.Entidades;

import java.sql.Time;
import java.util.Date;

/**
 * @author Bicentenario
 * @version 1.0
 * @created 14-Sep-2010 06:52:17 p.m.
 */
public class ReparacionTareaRealizadaImplementacion {

	private String comentario;
	private Date fechafinrealizaciontarea;
	private Date fechainiciorealizaciontarea;
	private Time horafintarea;
	private Time horainiciotarea;
	public ElementoTrabajoReparacion m_ElementoTrabajoReparacion;
	public Tarea m_Tarea;

	public ReparacionTareaRealizada(){

	}

	
	public String getcomentario(){
		return comentario;
	}

	public Date getfechafinrealizaciontarea(){
		return fechafinrealizaciontarea;
	}

	public Date getfechainiciorealizaciontarea(){
		return fechainiciorealizaciontarea;
	}

	public Time gethorafintarea(){
		return horafintarea;
	}

	public Time gethorainiciotarea(){
		return horainiciotarea;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setcomentario(String newVal){
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
	public void sethorafintarea(Time newVal){
		horafintarea = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void sethorainiciotarea(Time newVal){
		horainiciotarea = newVal;
	}

}
