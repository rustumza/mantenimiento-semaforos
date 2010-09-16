package Persistencia.Entidades;

import java.util.Date;

/**
 * @author Bicentenario
 * @version 1.0
 * @created 14-Sep-2010 06:52:15 p.m.
 */
public class OrdenTrabajoImplementacion {

	private int duracionprevistatrabajo;
	private Date fechafintrabajo;
	private int fechainicioplanificada;
	private Date fechainiciotrabajo;
	private int tipoordentrabajo;
	public Reserva m_Reserva;
	public EquipoDeTrabajo m_EquipoDeTrabajo;
	public Trabajo m_Trabajo;
	public OrdenTrabajoEstado m_OrdenTrabajoEstado;

	public OrdenTrabajo(){

	}

	
	public int getduracionprevistatrabajo(){
		return duracionprevistatrabajo;
	}

	public Date getfechafintrabajo(){
		return fechafintrabajo;
	}

	public int getfechainicioplanificada(){
		return fechainicioplanificada;
	}

	public Date getfechainiciotrabajo(){
		return fechainiciotrabajo;
	}

	public int gettipoordentrabajo(){
		return tipoordentrabajo;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setduracionprevistatrabajo(int newVal){
		duracionprevistatrabajo = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setfechafintrabajo(Date newVal){
		fechafintrabajo = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setfechainicioplanificada(int newVal){
		fechainicioplanificada = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setfechainiciotrabajo(Date newVal){
		fechainiciotrabajo = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void settipoordentrabajo(int newVal){
		tipoordentrabajo = newVal;
	}

}
