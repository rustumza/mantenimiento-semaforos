package Persistencia.Entidades;

import Entidades.UbicacionImplementacion;

/**
 * @author Bicentenario
 * @version 1.0
 * @created 14-Sep-2010 06:52:15 p.m.
 */
public class InterseccionImplementacion extends UbicacionImplementacion {

	private int codigoInterseccion;
	public Calle m_Calle;

	public Interseccion(){

	}

	
	public int getcodigoInterseccion(){
		return codigoInterseccion;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setcodigoInterseccion(int newVal){
		codigoInterseccion = newVal;
	}

}
