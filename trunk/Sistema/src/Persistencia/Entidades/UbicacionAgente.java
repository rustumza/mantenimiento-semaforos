/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia.Entidades;

import Persistencia.ExpertosPersistencia.FachadaInterna;

/**
 *
 * @author informatica
 */
public class UbicacionAgente extends ObjetoPersistente implements Ubicacion {

    private UbicacionImplementacion implementacion;
    private String oidOperador;

    /*variables para saber si los atributos han sido buscado en la BD*/
    private boolean operadorBuscado;

    public int getcodigoubicacion() {
        return getImplementacion().getcodigoubicacion();
    }

    public int getprioridad() {
        return getImplementacion().getPrioridad();
    }

    public int gettipoubicacion() {

        return getImplementacion().gettipoubicacion();
    }

    public void setcodigoubicacion(int newVal) {
        getImplementacion().setcodigoubicacion(newVal);
    }

    public void setprioridad(int newVal) {
        getImplementacion().setPrioridad(newVal);
    }

    public void settipoubicacion(int newVal) {
        getImplementacion().settipoubicacion(newVal);
    }

    public Operador getOperador() {
        if (isOperadorBuscado() == false) {
            getImplementacion().setOperador((Operador) FachadaInterna.getInstancia().buscar("Operador", oidOperador));
        }
        return getImplementacion().getOperador();
    }

    public void setOperador(Operador operador) {
        getImplementacion().setOperador(operador);
    }

    public String getOidOperador() {
        return oidOperador;
    }

    /**
     * @param oidOperador the oidOperador to set
     */
    public void setOidOperador(String oidOperador) {
        this.oidOperador = oidOperador;
    }

    public boolean isOperadorBuscado() {
        return operadorBuscado;
    }

    /**
     * @param operadorBuscado the operadorBuscado to set
     */
    public void setOperadorBuscado(boolean operadorBuscado) {
        this.operadorBuscado = operadorBuscado;
    }

    public UbicacionImplementacion getImplementacion() {
        return implementacion;
    }

    /**
     * @param implementacion the implementacion to set
     */
    public void setImplementacion(UbicacionImplementacion implementacion) {
        this.implementacion = implementacion;
    }
}
