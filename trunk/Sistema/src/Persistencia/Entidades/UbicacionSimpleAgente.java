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
public class UbicacionSimpleAgente implements UbicacionSimple{

    private UbicacionSimpleImplementacion implementacion;
    private String oidCalle;
    //variable para saber si ya se ha buscado el objeto relacionado en la BD
    private boolean CalleBuscado;

    public int getaltura() {
        return implementacion.getaltura();
    }

    public void setaltura(int newVal) {
        implementacion.setaltura(newVal);
    }

    public Calle getCalle() {
        if(isCalleBuscado()==false)
            implementacion.setCalle((Calle)FachadaInterna.getInstancia().buscar("Calle", oidCalle));
        return implementacion.getCalle();
    }

    public void setCalle(Calle calle) {
        implementacion.setCalle(calle);
    }

    /**
     * @return the implementacion
     */
    public UbicacionSimpleImplementacion getImplementacion() {
        return implementacion;
    }

    /**
     * @param implementacion the implementacion to set
     */
    public void setImplementacion(UbicacionSimpleImplementacion implementacion) {
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
     * @return the CalleBuscado
     */
    public boolean isCalleBuscado() {
        return CalleBuscado;
    }

    /**
     * @param CalleBuscado the CalleBuscado to set
     */
    public void setCalleBuscado(boolean CalleBuscado) {
        this.CalleBuscado = CalleBuscado;
    }

}
