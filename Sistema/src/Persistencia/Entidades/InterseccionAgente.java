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
public class InterseccionAgente implements Interseccion {

    private InterseccionImplementacion implementacion;
    private String oidCalle;
    //variable para saber si el objeto relacionado ya ha sido buscado en la BD
    private boolean calleBuscado;

    public Calle getCalle() {
        if (isCalleBuscado() == false) {
            implementacion.setCalle((Calle) FachadaInterna.getInstancia().buscar("Calle", oidCalle));
        }
        return implementacion.getCalle();
    }

    public void setCalle(Calle calle) {
        implementacion.setCalle(calle);
    }

    /**
     * @return the implementacion
     */
    public InterseccionImplementacion getImplementacion() {
        return implementacion;
    }

    /**
     * @param implementacion the implementacion to set
     */
    public void setImplementacion(InterseccionImplementacion implementacion) {
        this.implementacion = implementacion;
    }

    /**
     * @return the oidCalle
     */
    public String getOidCalle() {
        return oidCalle;
    }

    /**
     * @param oidCalle the oidCalle to set
     */
    public void setOidCalle(String oidCalle) {
        this.oidCalle = oidCalle;
    }

    /**
     * @return the calle
     */
    public boolean isCalleBuscado() {
        return calleBuscado;
    }

    /**
     * @param calle the calle to set
     */
    public void setCalle(boolean calle) {
        this.calleBuscado = calle;
    }
}
