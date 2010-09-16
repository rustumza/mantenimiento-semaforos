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
public class EquipoDeTrabajoAgente implements EquipoDeTrabajo{

    private EquipoDeTrabajoImplementacion implementacion;
    private String oidTrabajadorRol;

    private boolean trabajadorBuscado;

    public int getcargaHorariaMaxPorDia() {
        return implementacion.getcargaHorariaMaxPorDia();
    }

    public int getcodigoEquipo() {
        return implementacion.getcodigoEquipo();
    }

    public String getnombreEquipo() {
        return implementacion.getnombreEquipo();
    }

    public void setcargaHorariaMaxPorDia(int newVal) {
        implementacion.setcargaHorariaMaxPorDia(newVal);
    }

    public void setcodigoEquipo(int newVal) {
        implementacion.setcodigoEquipo(newVal);
    }

    public void setnombreEquipo(String newVal) {
        implementacion.setnombreEquipo(newVal);
    }

    public TrabajadorRol getTrabajadorRol() {
        if(isTrabajadorBuscado()==false)
            implementacion.setTrabajadorRol((TrabajadorRol)FachadaInterna.getInstancia().buscar("TrabajadorRol", oidTrabajadorRol));
        return implementacion.getTrabajadorRol();
    }

    public void setTrabajadorRol(TrabajadorRol trabajadorRol) {
        implementacion.setTrabajadorRol(trabajadorRol);
    }

    /**
     * @return the implementacion
     */
    public EquipoDeTrabajoImplementacion getImplementacion() {
        return implementacion;
    }

    /**
     * @param implementacion the implementacion to set
     */
    public void setImplementacion(EquipoDeTrabajoImplementacion implementacion) {
        this.implementacion = implementacion;
    }

    /**
     * @return the oidTrabajadorRol
     */
    public String getOidTrabajadorRol() {
        return oidTrabajadorRol;
    }

    /**
     * @param oidTrabajadorRol the oidTrabajadorRol to set
     */
    public void setOidTrabajadorRol(String oidTrabajadorRol) {
        this.oidTrabajadorRol = oidTrabajadorRol;
    }

    /**
     * @return the trabajadorBuscado
     */
    public boolean isTrabajadorBuscado() {
        return trabajadorBuscado;
    }

    /**
     * @param trabajadorBuscado the trabajadorBuscado to set
     */
    public void setTrabajadorBuscado(boolean trabajadorBuscado) {
        this.trabajadorBuscado = trabajadorBuscado;
    }

}
