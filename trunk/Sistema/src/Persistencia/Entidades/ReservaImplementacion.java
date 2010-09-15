package Entidades;

/**
 * @author Bicentenario
 * @version 1.0
 * @created 14-Sep-2010 06:52:17 p.m.
 */
public class ReservaImplementacion {

	private int codigoreserva;
	private Date fecha;
	public ReservaElementoTrabajo m_ReservaElementoTrabajo;

	public Reserva(){

	}

	
	public int getcodigoreserva(){
		return codigoreserva;
	}

	public Date getfecha(){
		return fecha;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setcodigoreserva(int newVal){
		codigoreserva = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setfecha(Date newVal){
		fecha = newVal;
	}

}
