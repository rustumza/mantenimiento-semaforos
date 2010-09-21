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

       return experto.consultarOrdenesTrabajoPendientes(fecha, tipo);
    }

//    public void confirmarOrden(OrdenDeReparacion ordenes) {
//
//        experto.guardarOrdenTrabajo((OrdenTrabajo)ordenes);
//
//    }
}
