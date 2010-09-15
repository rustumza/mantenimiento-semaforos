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
        if (implementacion.getEstadoDenuncia() == null) {
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
}
