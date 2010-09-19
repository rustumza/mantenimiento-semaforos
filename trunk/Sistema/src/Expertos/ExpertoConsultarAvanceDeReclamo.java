/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Expertos;

import DTO.DTOEstadoDenuncia;
import Persistencia.ExpertosPersistencia.Criterio;
import Persistencia.Entidades.Denuncia;
import Persistencia.Entidades.DenunciaEstado;
import Persistencia.Entidades.SuperDruperInterfaz;
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
        List<SuperDruperInterfaz> ListaDeInterfaces = FachadaExterna.getInstancia().buscar("Denuncia", ListaDeCriterio);
        List<Denuncia> ListaDenuncia = new ArrayList<Denuncia>();
        for (SuperDruperInterfaz aux: ListaDeInterfaces){
        ListaDenuncia.add((Denuncia)aux);

        }
        return (List<DTOEstadoDenuncia>) ListaDenuncia.get(0);
    }

    public List<DenunciaEstado> getEstados();


}
