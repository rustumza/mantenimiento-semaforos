/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesGraficas;

import Expertos.ExpertoEjecutarOrdenesTrabajo;
import Fabricas.FabricaExpertos;
import Persistencia.Entidades.OrdenDeReparacion;
import Persistencia.Entidades.OrdenTrabajo;
import java.util.Date;
import java.util.List;

/**
 *
 * @author informatica
 */
public class ControladorEjecutarOrdenesTrabajo {

    ExpertoEjecutarOrdenesTrabajo experto;
    PantallaEjecutarOrdenTrabajo pantalla;

    public ControladorEjecutarOrdenesTrabajo() {
        experto = (ExpertoEjecutarOrdenesTrabajo) FabricaExpertos.getInstance().getExperto("ExpertoEjecutarOrdenesTrabajo");
        pantalla = new PantallaEjecutarOrdenTrabajo(this);
    }

    public void iniciar() {
        pantalla.setVisible(true);
    }

    public List<OrdenTrabajo> consultarOrdenesPendientes(Date fecha, String tipo) {
        if(tipo.equals("Trabajo"))
            return experto.consultarOrdenesTrabajoPendientes(fecha);
        else if(tipo.equals("Reparacion"))
            return experto.consultarOrdenesReparacionPendientes(fecha);
        else if(tipo.equals("Mantenimiento"))
            return experto.consultarOrdenesMantenimientoPendientes(fecha);
        else 
            return null;
    }

//    public void confirmarOrden(OrdenDeReparacion ordenes) {
//
//        experto.guardarOrdenTrabajo((OrdenTrabajo)ordenes);
//
//    }
}
