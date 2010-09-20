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

    public List<DTOEstadoDenuncia> ConsultarEstadoCaso(String numcaso) {

        Criterio criterio = FachadaExterna.getInstancia().crearCriterio("CodigoDenuncia", "=", numcaso);
        List<Criterio> listaDeCriterio = new ArrayList<Criterio>();
        listaDeCriterio.add(criterio);
        List<SuperDruperInterfaz> listaDeInterfaces = FachadaExterna.getInstancia().buscar("Denuncia", listaDeCriterio);
        List<Denuncia> listaDenuncia = new ArrayList<Denuncia>();
        for (SuperDruperInterfaz aux : listaDeInterfaces) {
            listaDenuncia.add((Denuncia) aux);
        }

        for(Denuncia denuncia : listaDenuncia){
            for(DenunciaEstado denEstado: denuncia.getDenunciaEstado()){
                DTOEstadoDenuncia estDenuncia = new DTOEstadoDenuncia();
                estDenuncia.setFecha(denEstado.getfechacambioestado());
                denEstado.setEstadoDenuncia(denEstado.getEstadoDenuncia());
            }
        }
                 
        return (List<DTOEstadoDenuncia>) listaDenuncia.get(0);
    }

    
}
