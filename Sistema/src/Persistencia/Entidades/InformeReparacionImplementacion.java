package Persistencia.Entidades;

import java.sql.Time;
import java.util.Date;

/**
 * @author Bicentenario
 * @version 1.0
 * @created 14-Sep-2010 06:52:14 p.m.
 */
public class InformeReparacionImplementacion {

	private int duracionReparacion;
	private Date fechainforme;
	private Time horainforme;
	public DetalleInformeReparacion m_DetalleInformeReparacion;

	public InformeReparacion(){

	}

	
	public int getduracionReparacion(){
		return duracionReparacion;
	}

	public Date getfechainforme(){
		return fechainforme;
	}

	public Time gethorainforme(){
		return horainforme;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setduracionReparacion(int newVal){
		duracionReparacion = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setfechainforme(Date newVal){
		fechainforme = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void sethorainforme(Time newVal){
		horainforme = newVal;
	}

}
