/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia.Entidades;

/**
 *
 * @author diego
 */
public interface Trabajo extends SuperDruperInterfaz {

    public int getcodigoTrabajo();

    public int gettiempoEstimadoTrabajo();

    public int gettipotrabajo();

    public void setcodigoTrabajo(int newVal);

    public void settiempoEstimadoTrabajo(int newVal);

    public void settipotrabajo(int newVal);

    public TrabajoElementoNecesario getTrabajoElementoNecesario();

    public void setTrabajoElementoNecesario(TrabajoElementoNecesario trabajoElementoNecesario);

    public OrdenTrabajo getOrdenTrabajo();

    public void setOrdenTrabajo(OrdenTrabajo ordenTrabajo);
}
