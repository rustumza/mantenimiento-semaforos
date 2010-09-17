/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesGraficas;

import DTO.DTOOrdenesTrabajo;
import Expertos.ExpertoEjecutarOrdenesTrabajo;
import Fabricas.FabricaExpertos;
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

    public void inicar() {
        pantalla.setVisible(true);
    }

//    public List<DTOOrdenesTrabajo> consultarOrdenesPendientes(Date fecha, String tipo) {
//
//        /return experto.consultarOrdenesPendientes(fecha, tipo);
//    }
//
//    public void confirmarOrden(OrdenDeReparacion ordenes) {
//
//        experto.guardarOrdenes(ordenes);
//
//    }
}
