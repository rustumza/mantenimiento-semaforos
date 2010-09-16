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
public class OrdenTrabajoAgente implements OrdenTrabajo {

    private OrdenTrabajoImplementacion implementacion;
    private String oidReserva;
    private String oidEquipoDeTrabajo;
    private String oidTrabajo;
    private String oidOrdenTrabajoEstado;
    //variable para saber si el objeto relacionado ha sido buscado en la BD
    private boolean reservaBuscado;
    private boolean equipoDeTrabajoBuscado;
    private boolean trabajoBuscado;
    private boolean ordenTrabajoEstadoBuscado;

    public int getduracionprevistatrabajo() {
        return implementacion.getduracionprevistatrabajo();
    }

    public Date getfechafintrabajo() {
        return implementacion.getfechafintrabajo();
    }

    public int getfechainicioplanificada() {
        return implementacion.getfechainicioplanificada();
    }

    public Date getfechainiciotrabajo() {
        return implementacion.getfechainiciotrabajo();
    }

    public int gettipoordentrabajo() {
        return implementacion.gettipoordentrabajo();
    }

    public void setduracionprevistatrabajo(int newVal) {
        implementacion.setduracionprevistatrabajo(newVal);
    }

    public void setfechafintrabajo(Date newVal) {
        implementacion.setfechafintrabajo(newVal);
    }

    public void setfechainicioplanificada(int newVal) {
        implementacion.setfechainicioplanificada(newVal);
    }

    public void setfechainiciotrabajo(Date newVal) {
        implementacion.setfechainiciotrabajo(newVal);
    }

    public void settipoordentrabajo(int newVal) {
        implementacion.settipoordentrabajo(newVal);
    }

    public Reserva getReserva() {
        if (isReservaBuscado() == false) {
            implementacion.setReserva((Reserva) FachadaInterna.getInstancia().buscar("Reserva", oidReserva));
        }
        return implementacion.getReserva();
    }

    public void setReserva(Reserva reserva) {
        implementacion.setReserva(reserva);
    }

    public EquipoDeTrabajo getEquipoDeTrabajo() {
        if (isEquipoDeTrabajoBuscado() == false) {
            implementacion.setEquipoDeTrabajo((EquipoDeTrabajo) FachadaInterna.getInstancia().buscar("EquipoDeTrabajo", oidEquipoDeTrabajo));
        }
        return implementacion.getEquipoDeTrabajo();
    }

    public void setEquipoDeTrabajo(EquipoDeTrabajo equipoDeTrabajo) {
        implementacion.setEquipoDeTrabajo(equipoDeTrabajo);
    }

    public Trabajo getTrabajo() {
        if (isTrabajoBuscado() == false) {
            implementacion.setTrabajo((Trabajo) FachadaInterna.getInstancia().buscar("Trabajo", oidTrabajo));
        }

        return implementacion.getTrabajo();
    }

    public void setTrabajo(Trabajo trabajo) {
        implementacion.setTrabajo(trabajo);
    }

    public OrdenTrabajoEstado getOrdenTrabajoEstado() {
        if (isOrdenTrabajoEstadoBuscado() == false) {
            implementacion.setOrdenTrabajoEstado((OrdenTrabajoEstado) FachadaInterna.getInstancia().buscar("OrdenTrabajoEstado", oidOrdenTrabajoEstado));
        }
        return implementacion.getOrdenTrabajoEstado();
    }

    public void setOrdenTrabajoEstado(OrdenTrabajoEstado ordenTrabajoEstado) {
        implementacion.setOrdenTrabajoEstado(ordenTrabajoEstado);
    }

    /**
     * @return the implementacion
     */
    public OrdenTrabajoImplementacion getImplementacion() {
        return implementacion;
    }

    /**
     * @param implementacion the implementacion to set
     */
    public void setImplementacion(OrdenTrabajoImplementacion implementacion) {
        this.implementacion = implementacion;
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

    /**
     * @return the reservaBuscado
     */
    public boolean isReservaBuscado() {
        return reservaBuscado;
    }

    /**
     * @param reservaBuscado the reservaBuscado to set
     */
    public void setReservaBuscado(boolean reservaBuscado) {
        this.reservaBuscado = reservaBuscado;
    }

    /**
     * @return the oidEquipoDeTrabajo
     */
    public String getOidEquipoDeTrabajo() {
        return oidEquipoDeTrabajo;
    }

    /**
     * @param oidEquipoDeTrabajo the oidEquipoDeTrabajo to set
     */
    public void setOidEquipoDeTrabajo(String oidEquipoDeTrabajo) {
        this.oidEquipoDeTrabajo = oidEquipoDeTrabajo;
    }

    /**
     * @return the equipoDeTrabajoBuscado
     */
    public boolean isEquipoDeTrabajoBuscado() {
        return equipoDeTrabajoBuscado;
    }

    /**
     * @param equipoDeTrabajoBuscado the equipoDeTrabajoBuscado to set
     */
    public void setEquipoDeTrabajoBuscado(boolean equipoDeTrabajoBuscado) {
        this.equipoDeTrabajoBuscado = equipoDeTrabajoBuscado;
    }

    /**
     * @return the oidTrabajo
     */
    public String getOidTrabajo() {
        return oidTrabajo;
    }

    /**
     * @param oidTrabajo the oidTrabajo to set
     */
    public void setOidTrabajo(String oidTrabajo) {
        this.oidTrabajo = oidTrabajo;
    }

    /**
     * @return the trabajoBuscado
     */
    public boolean isTrabajoBuscado() {
        return trabajoBuscado;
    }

    /**
     * @param trabajoBuscado the trabajoBuscado to set
     */
    public void setTrabajoBuscado(boolean trabajoBuscado) {
        this.trabajoBuscado = trabajoBuscado;
    }

    /**
     * @return the oidOrdenTrabajoEstado
     */
    public String getOidOrdenTrabajoEstado() {
        return oidOrdenTrabajoEstado;
    }

    /**
     * @param oidOrdenTrabajoEstado the oidOrdenTrabajoEstado to set
     */
    public void setOidOrdenTrabajoEstado(String oidOrdenTrabajoEstado) {
        this.oidOrdenTrabajoEstado = oidOrdenTrabajoEstado;
    }

    /**
     * @return the ordenTrabajoEstadoBuscado
     */
    public boolean isOrdenTrabajoEstadoBuscado() {
        return ordenTrabajoEstadoBuscado;
    }

    /**
     * @param ordenTrabajoEstadoBuscado the ordenTrabajoEstadoBuscado to set
     */
    public void setOrdenTrabajoEstadoBuscado(boolean ordenTrabajoEstadoBuscado) {
        this.ordenTrabajoEstadoBuscado = ordenTrabajoEstadoBuscado;
    }
}
