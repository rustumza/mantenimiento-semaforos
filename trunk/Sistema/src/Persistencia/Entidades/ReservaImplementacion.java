package Persistencia.Entidades;

import java.util.Date;

/**
 * @author Bicentenario
 * @version 1.0
 * @created 14-Sep-2010 06:52:17 p.m.
 */
public class ReservaImplementacion implements Reserva{

	private int codigoreserva;
	private Date fecha;
	private ReservaElementoTrabajo reservaElementoTrabajo;

	public ReservaImplementacion(){

	}

	
	   public int getcodigoreserva() {
        return codigoreserva;
    }

    public Date getfecha() {
        return fecha;
    }

    /**
     *
     * @param newVal
     */
    public void setcodigoreserva(int newVal) {
        codigoreserva = newVal;
    }

    /**
     *
     * @param newVal
     */
    public void setfecha(Date newVal) {
        fecha = newVal;
    }

    /**
     * @return the reservaElementoTrabajo
     */
    public ReservaElementoTrabajo getReservaElementoTrabajo() {
        return reservaElementoTrabajo;
    }

    /**
     * @param reservaElementoTrabajo the reservaElementoTrabajo to set
     */
    public void setReservaElementoTrabajo(ReservaElementoTrabajo reservaElementoTrabajo) {
        this.reservaElementoTrabajo = reservaElementoTrabajo;
    }

}
