/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Expertos;

import ExpertosPersistencia.Criterio;
import Persistencia.Entidades.Calle;
import Persistencia.Entidades.Denunciante;
import Persistencia.Entidades.SuperDruperInterfaz;
import Persistencia.ExpertosPersistencia.FachadaExterna;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author LEIVA
 */
public class ExpertoAntenderReclamoPorDesperfecto implements Experto{

    public Denunciante buscarDenunciante(String dni){
        Criterio criterio = FachadaExterna.getInstancia().crearCriterio("DNI", "=", dni);
        List<Criterio> listaDeCriterios = new ArrayList<Criterio>();
        listaDeCriterios.add(criterio);
        List<SuperDruperInterfaz> listaDeInterfaces = FachadaExterna.getInstancia().buscar("Denunciante", listaDeCriterios);
        List<Denunciante> listaDenunciantes = new ArrayList<Denunciante>() ;
        for(SuperDruperInterfaz aux : listaDeInterfaces ){
            listaDenunciantes.add((Denunciante) aux);
        }

        return listaDenunciantes.get(0);
    }


    public void guardarDenunciante(Denunciante denunciante){

        FachadaExterna.getInstancia().guardar("Denunciante", (SuperDruperInterfaz)denunciante);

    }



    public DtoCalle buscarCalle(String calle1, String calle2){
        Criterio criterio = FachadaExterna.getInstancia().crearCriterio("Calle", "LIKE", calle1);
        List<Criterio> listaDeCriterios = new ArrayList<Criterio>();
        listaDeCriterios.add(criterio);
        List<SuperDruperInterfaz> listaSuperDruperInterfaz = FachadaExterna.getInstancia().buscar("Calle", listaDeCriterios);
        List<Calle> listaCalles = new ArrayList<Calle>();
        for(SuperDruperInterfaz aux : listaSuperDruperInterfaz){
            listaCalles.add((Calle) aux);
        }

    }

}