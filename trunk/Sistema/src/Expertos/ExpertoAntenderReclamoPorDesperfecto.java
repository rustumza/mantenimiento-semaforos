/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Expertos;

import ExpertosPersistencia.Criterio;
import Persistencia.Entidades.Calle;
import Persistencia.Entidades.Denunciante;
import Persistencia.Entidades.Interseccion;
import Persistencia.Entidades.ObjetoPersistente;
import Persistencia.Entidades.Problema;
import Persistencia.Entidades.Semaforo;
import Persistencia.Entidades.SuperDruperInterfaz;
import Persistencia.ExpertosPersistencia.FachadaExterna;
import java.util.ArrayList;
import java.util.Date;
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



    public List<Calle> buscarCalle(String calle){

        Criterio criterio = FachadaExterna.getInstancia().crearCriterio("Calle", "LIKE", calle);
        List<Criterio> listaDeCriterios = new ArrayList<Criterio>();
        listaDeCriterios.add(criterio);
        List<SuperDruperInterfaz> listaSuperDruperInterfaz = FachadaExterna.getInstancia().buscar("Calle", listaDeCriterios);
        List<Calle> listaCalles = new ArrayList<Calle>();
        for(SuperDruperInterfaz aux : listaSuperDruperInterfaz){
            listaCalles.add((Calle) aux);
        }
        return listaCalles;
    }

    public Interseccion buscarInterseccion(Calle calle1, Calle calle2){

    List<Criterio> criterio = new ArrayList<Criterio>();
    criterio.add(FachadaExterna.getInstancia().crearCriterio("Calle1", "=", calle1));
    criterio.add(FachadaExterna.getInstancia().crearCriterio("Calle2", "=", calle2));
    List<SuperDruperInterfaz> listaSuperDruperInterfaz = FachadaExterna.getInstancia().buscar("Interseccion", criterio);
    return (Interseccion)listaSuperDruperInterfaz.get(0);
    }

    public List<Semaforo> buscarSemaforo(Interseccion interseccion) {
        Criterio criterio = FachadaExterna.getInstancia().crearCriterio("Interseccion", "=", Interseccion);
        List<Criterio> listaDeCriterio = new ArrayList<Criterio>();
        listaDeCriterio.add(criterio);
        FachadaExterna.getInstancia().buscar("Semaforo", listaDeCriterio);
        return null;
    }

    public List<Problema> buscarProblemas() {
        List<SuperDruperInterfaz> listaDeInterfaces = FachadaExterna.getInstancia().buscar("Problema", null);
        List<Problema> listaDeProblema = new ArrayList<Problema>();
        for(SuperDruperInterfaz aux : listaDeInterfaces){
            listaDeProblema.add((Problema) aux);
        }
        return listaDeProblema;
    }

    public void guardarDenuncia(List<Semaforo> listaSemaforo, List<Problema> listaProblema){

        for(Semaforo aux:listaSemaforo)
            aux.
        FachadaExterna.getInstancia().
           



    }


}
