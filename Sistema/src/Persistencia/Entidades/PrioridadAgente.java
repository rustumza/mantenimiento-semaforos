/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Persistencia.Entidades;

/**
 *
 * @author diego
 */
public class PrioridadAgente implements Prioridad{

    private PrioridadImplementacion implementacion;

    public int getcodigoPrioridad() {
        return implementacion.getcodigoPrioridad();
    }

    public String getnivelPrioridad() {
        return implementacion.getnivelPrioridad();
    }

    public void setcodigoPrioridad(int newVal) {
        implementacion.setcodigoPrioridad(newVal);
    }

    public void setnivelPrioridad(String newVal) {
        implementacion.setnivelPrioridad(newVal);
    }

    /**
     * @return the implementacion
     */
    public PrioridadImplementacion getImplementacion() {
        return implementacion;
    }

    /**
     * @param implementacion the implementacion to set
     */
    public void setImplementacion(PrioridadImplementacion implementacion) {
        this.implementacion = implementacion;
    }

}
