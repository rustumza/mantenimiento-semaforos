/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Expertos;

import DTO.DTOEstadoDenuncia;
import ExpertosPersistencia.Criterio;
import Persistencia.ExpertosPersistencia.FachadaExterna;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RUSTU
 */
public class ExpertoConsultarAvanceDeReclamo implements Experto {

    public List<DTOEstadoDenuncia> ConsultarEstadoCaso(String numcaso){

        Criterio criterio=FachadaExterna.getInstancia().crearCriterio("CodigoDenuncia", "=", numcaso);
        List<Criterio> ListaDeCriterio = new ArrayList<Criterio>();
        ListaDeCriterio.add(criterio);
        return null;
    }
}
