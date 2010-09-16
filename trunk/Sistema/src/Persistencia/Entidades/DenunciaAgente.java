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
public class DenunciaAgente extends CasoAgente implements Denuncia {

    private DenunciaImplementacion implementacion;
    private String oidReclamo;
    private String oidDenunciaEstado;
    private String oidFallaTecnica;

    //variables para saber si se han buscado los atributos en la BD
    private boolean reclamoBuscado;
    private boolean denunciaEstadoBuscado;
    private boolean fallaTecnicaBuscado;

    public int getcodigoDenuncia() {
        return implementacion.getcodigoDenuncia();
    }

    public float getprioridad() {
        return implementacion.getprioridad();
    }

    public void setcodigoDenuncia(int newVal) {
        implementacion.setcodigoDenuncia(newVal);
    }

    public void setprioridad(float newVal) {
        implementacion.setprioridad(newVal);
    }

    public Reclamo getReclamo() {
        if (isReclamoBuscado() == false) {
            implementacion.setReclamo((Reclamo) FachadaInterna.getInstancia().buscar("Reclamo", oidReclamo));
        }
        return implementacion.getReclamo();
    }

    public void setReclamo(Reclamo reclamo) {
        implementacion.setReclamo(reclamo);
    }

    public DenunciaEstado getDenunciaEstado() {
        if (isDenunciaEstadoBuscado() == false) {
            implementacion.setDenunciaEstado((DenunciaEstado) FachadaInterna.getInstancia().buscar("DenunciaEstado", oidDenunciaEstado));
        }
        return implementacion.getDenunciaEstado();
    }

    public void setDenunciaEstado(DenunciaEstado denunciaEstado) {
        implementacion.setDenunciaEstado(denunciaEstado);
    }

    public FallaTecnica getFallaTecnica() {
        if (isFallaTecnicaBuscado() == false) {
            implementacion.setFallaTecnica((FallaTecnica) FachadaInterna.getInstancia().buscar("FallaTecnica", oidFallaTecnica));
        }
        return implementacion.getFallaTecnica();
    }

    public void setFallaTecnica(FallaTecnica fallaTecnica) {
        implementacion.setFallaTecnica(fallaTecnica);
    }

    /**
     * @return the implementacion
     */
    public DenunciaImplementacion getImplementacion() {
        return implementacion;
    }

    /**
     * @param implementacion the implementacion to set
     */
    public void setImplementacion(DenunciaImplementacion implementacion) {
        this.implementacion = implementacion;
    }

    /**
     * @return the oidReclamo
     */
    public String getOidReclamo() {
        return oidReclamo;
    }

    /**
     * @param oidReclamo the oidReclamo to set
     */
    public void setOidReclamo(String oidReclamo) {
        this.oidReclamo = oidReclamo;
    }

    /**
     * @return the oidDenunciaEstado
     */
    public String getOidDenunciaEstado() {
        return oidDenunciaEstado;
    }

    /**
     * @param oidDenunciaEstado the oidDenunciaEstado to set
     */
    public void setOidDenunciaEstado(String oidDenunciaEstado) {
        this.oidDenunciaEstado = oidDenunciaEstado;
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
     * @return the reclamoBuscado
     */
    public boolean isReclamoBuscado() {
        return reclamoBuscado;
    }

    /**
     * @param reclamoBuscado the reclamoBuscado to set
     */
    public void setReclamoBuscado(boolean reclamoBuscado) {
        this.reclamoBuscado = reclamoBuscado;
    }

    /**
     * @return the denunciaEstadoBuscado
     */
    public boolean isDenunciaEstadoBuscado() {
        return denunciaEstadoBuscado;
    }

    /**
     * @param denunciaEstadoBuscado the denunciaEstadoBuscado to set
     */
    public void setDenunciaEstadoBuscado(boolean denunciaEstadoBuscado) {
        this.denunciaEstadoBuscado = denunciaEstadoBuscado;
    }

    /**
     * @return the fallaTecnicaBuscado
     */
    public boolean isFallaTecnicaBuscado() {
        return fallaTecnicaBuscado;
    }

    /**
     * @param fallaTecnicaBuscado the fallaTecnicaBuscado to set
     */
    public void setFallaTecnicaBuscado(boolean fallaTecnicaBuscado) {
        this.fallaTecnicaBuscado = fallaTecnicaBuscado;
    }
}
