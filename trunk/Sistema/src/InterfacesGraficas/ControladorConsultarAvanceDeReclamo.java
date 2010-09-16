/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesGraficas;

import DTO.DTOEstadoDenuncia;
import Expertos.ExpertoConsultarAvanceDeReclamo;
import Fabricas.FabricaExpertos;
import java.util.List;

/**
 *
 * @author LEIVA
 */
public class ControladorConsultarAvanceDeReclamo {

   ExpertoConsultarAvanceDeReclamo ecadr;

    public List<DTOEstadoDenuncia> ConsultarEstadoCaso(String numcaso) {

     ecadr = (ExpertoConsultarAvanceDeReclamo) FabricaExpertos.getInstance().getExperto("ConsultarAvanceDeReclamo");
        
        
        return ecadr.ConsultarEstadoCaso(numcaso);
    }
}
