/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesGraficas;

import DTO.DTOOrdenes;
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

        ControladorConsultarOrdenesPendientes ccop;
        ExpertoEjecutarOrdenesTrabajo eeot;

        public List<DTOOrdenesTrabajo> consultarOrdenesPendientes(Date fecha, String tipo) {

            eeot = (ExpertoEjecutarOrdenesTrabajo) FabricaExpertos.getInstance().getExperto("ExpertoEjecutarOrdenesTrabajo");

           return eeot.consultarOrdenesPendientes (fecha, tipo);
}

    public void confirmarOrden(OrdenDeReparacion ordenes){

       eeot.guardarOrdenes(ordenes);

    }
}
