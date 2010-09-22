/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia.Entidades;

import Persistencia.ExpertosPersistencia.FachadaInterna;

/**
 *
 * @author diego
 */
public class ReservaElementoTrabajoAgente extends ObjetoPersistente implements ReservaElementoTrabajo {

    private ReservaElementoTrabajoImplementacion implementacion;
    private String oidElementoTrabajo;
    private String oidReserva;
    //variable para saber si el objeto relacionado ha sido buscado en la BD
    private boolean elementoTrabajoBuscado;

    public int getcantidadreservada() {
        return implementacion.getcantidadreservada();
    }

    public void setcantidadreservada(int newVal) {
        implementacion.setcantidadreservada(newVal);
    }

    public ElementoTrabajo getElementoTrabajo() {
        if (isElementoTrabajoBuscado() == false) {
            implementacion.setElementoTrabajo((ElementoTrabajo) FachadaInterna.getInstancia().buscar("ElementoTrabajo", oidElementoTrabajo));
        }
        return implementacion.getElementoTrabajo();
    }

    public void setElementoTrabajo(ElementoTrabajo elementoTrabajo) {
        implementacion.setElementoTrabajo(elementoTrabajo);
    }

    /**
     * @return the implementacion
     */
    public ReservaElementoTrabajoImplementacion getImplementacion() {
        return implementacion;
    }

    /**
     * @param implementacion the implementacion to set
     */
    public void setImplementacion(ReservaElementoTrabajoImplementacion implementacion) {
        this.implementacion = implementacion;
    }

    /**
     * @return the elementoTrabajoBuscado
     */
    public boolean isElementoTrabajoBuscado() {
        return elementoTrabajoBuscado;
    }

    /**
     * @param elementoTrabajoBuscado the elementoTrabajoBuscado to set
     */
    public void setElementoTrabajoBuscado(boolean elementoTrabajoBuscado) {
        this.elementoTrabajoBuscado = elementoTrabajoBuscado;
    }

    /**
     * @return the oidElementoTrabajo
     */
    public String getOidElementoTrabajo() {
        return oidElementoTrabajo;
    }

    /**
     * @param oidElementoTrabajo the oidElementoTrabajo to set
     */
    public void setOidElementoTrabajo(String oidElementoTrabajo) {
        this.oidElementoTrabajo = oidElementoTrabajo;
    }

    /**
     * @return the oidReserva
     */
    public String getOidReserva() {
        return oidReserva;
    }

    /**
     * @param oidReserva the oidReserva to set
     */
    public void setOidReserva(String oidReserva) {
        this.oidReserva = oidReserva;
    }
}
