package Persistencia.Entidades;

import java.util.Date;

/**
 * @author Bicentenario
 * @version 1.0
 * @created 14-Sep-2010 06:52:18 p.m.
 */
public class TrabajadorRolImplementacion {

	private Date fechafinrol;
	private Date fechainiciorol;
	public Rol m_Rol;
	public Trabajador m_Trabajador;

	public TrabajadorRol(){

	}

	
	public Date getfechafinrol(){
		return fechafinrol;
	}

	public Date getfechainiciorol(){
		return fechainiciorol;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setfechafinrol(Date newVal){
		fechafinrol = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setfechainiciorol(Date newVal){
		fechainiciorol = newVal;
	}

}
