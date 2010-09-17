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
public class DenunciaEstadoAgente implements DenunciaEstado {

    private DenunciaEstadoImplementacion implementacion;
    private String oidEstadoDenuncia;
    
    private boolean estadoDenunciaBuscadoscado;

    public int getfechacambioestado() {
        return implementacion.getfechacambioestado();
    }

    public boolean isindicadorestadoactual() {
        return implementacion.isindicadorestadoactual();
    }

    public void setfechacambioestado(int newVal) {
        implementacion.setfechacambioestado(newVal);
    }

    public void setindicadorestadoactual(boolean newVal) {
        implementacion.setindicadorestadoactual(newVal);
    }

    public EstadoDenuncia getEstadoDenuncia() {
        if (isEstadoDenunciaBuscadoscado() == false) {
            implementacion.setEstadoDenuncia((EstadoDenuncia) FachadaInterna.getInstancia().buscar("EstadoDenuncia", oidEstadoDenuncia));
        }
        return implementacion.getEstadoDenuncia();
    }

    public void setEstadoDenuncia(EstadoDenuncia estadoDenuncia) {
        implementacion.setEstadoDenuncia(estadoDenuncia);
    }

    /**
     * @return the implementacion
     */
    public DenunciaEstadoImplementacion getImplementacion() {
        return implementacion;
    }

    /**
     * @param implementacion the implementacion to set
     */
    public void setImplementacion(DenunciaEstadoImplementacion implementacion) {
        this.implementacion = implementacion;
    }

    /**
     * @return the estadoDenunciaBuscadoscado
     */
    public boolean isEstadoDenunciaBuscadoscado() {
        return estadoDenunciaBuscadoscado;
    }

    /**
     * @param estadoDenunciaBuscadoscado the estadoDenunciaBuscadoscado to set
     */
    public void setEstadoDenunciaBuscadoscado(boolean estadoDenunciaBuscadoscado) {
        this.estadoDenunciaBuscadoscado = estadoDenunciaBuscadoscado;
    }
}
