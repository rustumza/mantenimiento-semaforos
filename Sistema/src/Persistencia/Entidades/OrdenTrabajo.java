/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia.Entidades;

import java.util.Date;

/**
 *
 * @author diego
 */
public interface OrdenTrabajo extends SuperDruperInterfaz {

    public int getduracionprevistatrabajo();

    public Date getfechafintrabajo();

    public int getfechainicioplanificada();

    public Date getfechainiciotrabajo();

    public int gettipoordentrabajo();

    public void setduracionprevistatrabajo(int newVal);

    public void setfechafintrabajo(Date newVal);

    public void setfechainicioplanificada(int newVal);

    public void setfechainiciotrabajo(Date newVal);

    public void settipoordentrabajo(int newVal);

    public Reserva getReserva();

    public void setReserva(Reserva reJserva);

    public EquipoDeTrabajo getEquipoDeTrabajo();

    public void setEquipoDeTrabajo(EquipoDeTrabajo equipoDeTrabajo);

    public Trabajo getTrabajo();

    public void setTrabajo(Trabajo trabajo);

    public OrdenTrabajoEstado getOrdenTrabajoEstado();

    public void setOrdenTrabajoEstado(OrdenTrabajoEstado ordenTrabajoEstado);
}
