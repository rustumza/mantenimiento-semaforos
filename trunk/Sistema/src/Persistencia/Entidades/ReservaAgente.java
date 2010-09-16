/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Persistencia.Entidades;

import Persistencia.ExpertosPersistencia.FachadaInterna;
import java.util.Date;

/**
 *
 * @author diego
 */
public class ReservaAgente implements Reserva {

    private ReservaImplementacion implementacion;
    private String oidReservaElementoTrabajo;
    //variable para saber si el objeto relacionado ha sido buscado en la BD
    private boolean reservaElementoTrabajoBuscado;

    public int getcodigoreserva() {
        return implementacion.getcodigoreserva();
    }

    public Date getfecha() {
        return implementacion.getfecha();
    }

    public void setcodigoreserva(int newVal) {
        implementacion.setcodigoreserva(newVal);
    }

    public void setfecha(Date newVal) {
        implementacion.setfecha(newVal);
    }

    public ReservaElementoTrabajo getReservaElementoTrabajo() {
        if(isReservaElementoTrabajoBuscado()==false)
            implementacion.setReservaElementoTrabajo((ReservaElementoTrabajo)FachadaInterna.getInstancia().buscar("ReservaElementoTrabajo", oidReservaElementoTrabajo));
        return implementacion.getReservaElementoTrabajo();
    }

    public void setReservaElementoTrabajo(ReservaElementoTrabajo reservaElementoTrabajo) {
        implementacion.setReservaElementoTrabajo(reservaElementoTrabajo);
    }

    /**
     * @return the implementacion
     */
    public ReservaImplementacion getImplementacion() {
        return implementacion;
    }

    /**
     * @param implementacion the implementacion to set
     */
    public void setImplementacion(ReservaImplementacion implementacion) {
        this.implementacion = implementacion;
    }

    /**
     * @return the oidReservaElementoTrabajo
     */
    public String getOidReservaElementoTrabajo() {
        return oidReservaElementoTrabajo;
    }

    /**
     * @param oidReservaElementoTrabajo the oidReservaElementoTrabajo to set
     */
    public void setOidReservaElementoTrabajo(String oidReservaElementoTrabajo) {
        this.oidReservaElementoTrabajo = oidReservaElementoTrabajo;
    }

    /**
     * @return the reservaElementoTrabajoBuscado
     */
    public boolean isReservaElementoTrabajoBuscado() {
        return reservaElementoTrabajoBuscado;
    }

    /**
     * @param reservaElementoTrabajoBuscado the reservaElementoTrabajoBuscado to set
     */
    public void setReservaElementoTrabajoBuscado(boolean reservaElementoTrabajoBuscado) {
        this.reservaElementoTrabajoBuscado = reservaElementoTrabajoBuscado;
    }

}
