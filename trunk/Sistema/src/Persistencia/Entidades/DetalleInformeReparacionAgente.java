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
public class DetalleInformeReparacionAgente implements DetalleInformeReparacion {

    private DetalleInformeReparacionImplementacion implementacion;
    public String oidReparacionTareaRealizada;
    private String oidFallaTecnica;
    private String oidEstadoFallaTecnica;

    public String getcomentario() {
        return implementacion.getcomentario();
    }

    public void setcomentario(String newVal) {
        implementacion.setcomentario(newVal);
    }

    public ReparacionTareaRealizada getReparacionTareaRealizada() {
        if (implementacion.getReparacionTareaRealizada() == null) {
            implementacion.setReparacionTareaRealizada((ReparacionTareaRealizada) FachadaInterna.getInstancia().buscar("ReparacionTareaRealizada", oidReparacionTareaRealizada));
        }
        return implementacion.getReparacionTareaRealizada();
    }

    public void setReparacionTareaRealizada(ReparacionTareaRealizada reparacionTareaRealizada) {
        implementacion.setReparacionTareaRealizada(reparacionTareaRealizada);
    }

    public FallaTecnica getFallaTecnica() {
        if(implementacion.getFallaTecnica()==null){
            implementacion.setFallaTecnica((FallaTecnica)FachadaInterna.getInstancia().buscar("FallaTecnica", oidFallaTecnica));
        }
        return implementacion.getFallaTecnica();
    }

    public void setFallaTecnica(FallaTecnica fallaTecnica) {
        implementacion.setFallaTecnica(fallaTecnica);
    }

    public EstadoFallaTecnica getEstadoFallaTecnica() {
        if(implementacion.getEstadoFallaTecnica()==null){
            implementacion.setEstadoFallaTecnica((EstadoFallaTecnica)FachadaInterna.getInstancia().buscar("EstadoFallaTecnica", oidEstadoFallaTecnica));
        }
        return implementacion.getEstadoFallaTecnica();
    }

    public void setEstadoFallaTecnica(EstadoFallaTecnica estadoFallaTecnica) {
        implementacion.setEstadoFallaTecnica(estadoFallaTecnica);
    }

    /**
     * @return the implementacion
     */
    public DetalleInformeReparacionImplementacion getImplementacion() {
        return implementacion;
    }

    /**
     * @param implementacion the implementacion to set
     */
    public void setImplementacion(DetalleInformeReparacionImplementacion implementacion) {
        this.implementacion = implementacion;
    }

    /**
     * @return the oidFallaTecnica
     */
    public String getOidFallaTecnica() {
        return oidFallaTecnica;
    }

    /**
     * @param oidFallaTecnica the oidFallaTecnica to set
     */
    public void setOidFallaTecnica(String oidFallaTecnica) {
        this.oidFallaTecnica = oidFallaTecnica;
    }

    /**
     * @return the oidEstadoFallaTecnica
     */
    public String getOidEstadoFallaTecnica() {
        return oidEstadoFallaTecnica;
    }

    /**
     * @param oidEstadoFallaTecnica the oidEstadoFallaTecnica to set
     */
    public void setOidEstadoFallaTecnica(String oidEstadoFallaTecnica) {
        this.oidEstadoFallaTecnica = oidEstadoFallaTecnica;
    }
}
