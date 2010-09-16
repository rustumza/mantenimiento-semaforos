/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package InterfacesGraficas;

import DTO.DTOOrdenes;
import Expertos.ExpertoConsultarOrdenesPendientes;
import Fabricas.FabricaExpertos;
import java.util.Date;
import java.util.List;

/**
 *
 * @author informatica
 */
public class ControladorConsultarOrdenesPendientes {
ExpertoConsultarOrdenesPendientes ecop;

public List<DTOOrdenes> buscarOrdenes(String fechaString){

    ecop = (ExpertoConsultarOrdenesPendientes)FabricaExpertos.getInstance().getExperto("ExpertoConsultarOrdenesPendientes");
    Date fechaDate = new Date(fechaString);


    
return ecop.buscarOrdenes(fechaDate);
}




}
