/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia.Entidades;

import java.util.Date;

/**
 *
 * @author diego
 */
public interface Reserva extends SuperDruperInterfaz {

    public int getcodigoreserva();

    public Date getfecha();

    public void setcodigoreserva(int newVal);

    public void setfecha(Date newVal);

    public ReservaElementoTrabajo getReservaElementoTrabajo();

    public void setReservaElementoTrabajo(ReservaElementoTrabajo reservaElementoTrabajo);
}
