package Persistencia.Entidades;

import java.util.Date;
import java.util.List;

/**
 * @author Bicentenario
 * @version 1.0
 * @created 14-Sep-2010 06:52:15 p.m.
 */
public class OrdenTrabajoImplementacion implements OrdenTrabajo {

    private int duracionprevistatrabajo;
    private Date fechafintrabajo;
    private Date fechainicioplanificada;
    private Date fechainiciotrabajo;
    private String tipoordentrabajo;
    private Reserva reserva;
    private EquipoDeTrabajo equipoDeTrabajo;
    private Trabajo trabajo;
    private List<OrdenTrabajoEstado> listaEstadosOrdenTrabajo;

    public OrdenTrabajoImplementacion() {
    }

    public int getduracionprevistatrabajo() {
        return duracionprevistatrabajo;
    }

    public Date getfechafintrabajo() {
        return fechafintrabajo;
    }

    public Date getfechainicioplanificada() {
        return fechainicioplanificada;
    }

    public Date getfechainiciotrabajo() {
        return fechainiciotrabajo;
    }

    public String gettipoordentrabajo() {
        return tipoordentrabajo;
    }

    /**
     *
     * @param newVal
     */
    public void setduracionprevistatrabajo(int newVal) {
        duracionprevistatrabajo = newVal;
    }

    /**
     *
     * @param newVal
     */
    public void setfechafintrabajo(Date newVal) {
        fechafintrabajo = newVal;
    }

    /**
     *
     * @param newVal
     */
    public void setfechainicioplanificada(Date newVal) {
        fechainicioplanificada = newVal;
    }

    /**
     *
     * @param newVal
     */
    public void setfechainiciotrabajo(Date newVal) {
        fechainiciotrabajo = newVal;
    }

    /**
     *
     * @param newVal
     */
    public void settipoordentrabajo(String newVal) {
        tipoordentrabajo = newVal;
    }

    /**
     * @return the reJserva
     */
    public Reserva getReserva() {
        return reserva;
    }

    /**
     * @param reJserva the reJserva to set
     */
    public void setReserva(Reserva reJserva) {
        this.reserva = reJserva;
    }

    /**
     * @return the equipoDeTrabajo
     */
    public EquipoDeTrabajo getEquipoDeTrabajo() {
        return equipoDeTrabajo;
    }

    /**
     * @param equipoDeTrabajo the equipoDeTrabajo to set
     */
    public void setEquipoDeTrabajo(EquipoDeTrabajo equipoDeTrabajo) {
        this.equipoDeTrabajo = equipoDeTrabajo;
    }

    /**
     * @return the trabajo
     */
    public Trabajo getTrabajo() {
        return trabajo;
    }

    /**
     * @param trabajo the trabajo to set
     */
    public void setTrabajo(Trabajo trabajo) {
        this.trabajo = trabajo;
    }

    /**
     * @return the listaEstadosOrdenTrabajo
     */
    public List<OrdenTrabajoEstado> getListaEstadosOrdenTrabajo() {
        return listaEstadosOrdenTrabajo;
    }

    /**
     * @param listaEstadosOrdenTrabajo the listaEstadosOrdenTrabajo to set
     */
    public void setListaEstadosOrdenTrabajo(List<OrdenTrabajoEstado> listaEstadosOrdenTrabajo) {
        this.listaEstadosOrdenTrabajo = listaEstadosOrdenTrabajo;
    }

}
