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
public class OrdenDeReparacionAgente extends OrdenTrabajoAgente implements OrdenDeReparacion {

    private String oidDenuncia;
    private String oidInformeReparacion;
    //variable para saber si el atributo relacionado ya fue buscado en la BD
    private boolean denunciaBuscado;
    private boolean informeReparacionBuscado;

    public int getcodigoordenreparacion() {
        return ((OrdenDeReparacionImplementacion) super.getImplementacion()).getcodigoordenreparacion();
    }

    public void setcodigoordenreparacion(int newVal) {
        ((OrdenDeReparacionImplementacion) super.getImplementacion()).setcodigoordenreparacion(newVal);
    }

    public Denuncia getDenuncia() {
        if (isDenunciaBuscado() == false) {
            ((OrdenDeReparacionImplementacion) super.getImplementacion()).setDenuncia((Denuncia) FachadaInterna.getInstancia().buscar("Denuncia", oidDenuncia));
        }
        return ((OrdenDeReparacionImplementacion) super.getImplementacion()).getDenuncia();

    }

    public void setDenuncia(Denuncia denuncia) {
        ((OrdenDeReparacionImplementacion) super.getImplementacion()).setDenuncia(denuncia);
    }

    public InformeReparacion getInformeReparacion() {
        if (isInformeReparacionBuscado() == false) {
            ((OrdenDeReparacionImplementacion) super.getImplementacion()).setInformeReparacion((InformeReparacion) FachadaInterna.getInstancia().buscar("InformeReparacion", oidInformeReparacion));
        }
        return ((OrdenDeReparacionImplementacion) super.getImplementacion()).getInformeReparacion();
    }

    public void setInformeReparacion(InformeReparacion informeReparacion) {
        ((OrdenDeReparacionImplementacion)super.getImplementacion()).setInformeReparacion(informeReparacion);
    }

    /**
     * @return the oidDenuncia
     */
    public String getOidDenuncia() {
        return oidDenuncia;
    }

    /**
     * @param oidDenuncia the oidDenuncia to set
     */
    public void setOidDenuncia(String oidDenuncia) {
        this.oidDenuncia = oidDenuncia;
    }

    /**
     * @return the denunciaBuscado
     */
    public boolean isDenunciaBuscado() {
        return denunciaBuscado;
    }

    /**
     * @param denunciaBuscado the denunciaBuscado to set
     */
    public void setDenunciaBuscado(boolean denunciaBuscado) {
        this.denunciaBuscado = denunciaBuscado;
    }

    /**
     * @return the oidInformeReparacion
     */
    public String getOidInformeReparacion() {
        return oidInformeReparacion;
    }

    /**
     * @param oidInformeReparacion the oidInformeReparacion to set
     */
    public void setOidInformeReparacion(String oidInformeReparacion) {
        this.oidInformeReparacion = oidInformeReparacion;
    }

    /**
     * @return the informeReparacionBuscado
     */
    public boolean isInformeReparacionBuscado() {
        return informeReparacionBuscado;
    }

    /**
     * @param informeReparacionBuscado the informeReparacionBuscado to set
     */
    public void setInformeReparacionBuscado(boolean informeReparacionBuscado) {
        this.informeReparacionBuscado = informeReparacionBuscado;
    }
}
