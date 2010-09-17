/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package InterfacesGraficas;

import DTO.DTOProblemasDelSemaforo;
import Persistencia.Entidades.Denunciante;
import Expertos.ExpertoAntenderReclamoPorDesperfecto;
import Fabricas.FabricaExpertos;
import Persistencia.Decoradores.DecoradorExpertoAntenderReclamoPorDesperfecto;
import Persistencia.Entidades.Calle;
import Persistencia.Entidades.Interseccion;
import Persistencia.Entidades.Problema;
import Persistencia.Entidades.Semaforo;
import Persistencia.ExpertosPersistencia.Cache;
import java.util.List;
/**
 *
 * @author LEIVA
 */
public class ControladorAtenderReclamoPorDesperfecto {

    ExpertoAntenderReclamoPorDesperfecto earpd;


    public Denunciante buscarDenunciante(String dni){



         earpd = (ExpertoAntenderReclamoPorDesperfecto)FabricaExpertos.getInstance().getExperto("AtenderReclamoPorDesperfecto");

        
        return earpd.buscarDenunciante(dni);
    }

    public void guardarDenunciante(Denunciante denunciante){

        earpd.guardarDenunciante(denunciante);

    }


    public Calle[] buscarCalle(String calle){

        List<Calle> listaDeCalle = earpd.buscarCalle(calle);
        return listaDeCalle.toArray(new Calle[listaDeCalle.size()]);

    }

    public Interseccion buscarInterseccion(Calle calle1, Calle calle2){

        return earpd.buscarInterseccion(calle1, calle2);
    }

    public Semaforo[] buscarSemaforo(Interseccion interseccion){
        List<Semaforo> miListaDeSemaforos = earpd.buscarSemaforo(interseccion);
        return miListaDeSemaforos.toArray(new Semaforo[miListaDeSemaforos.size()]);
    }

    public Problema[] buscarProblema(){
        List<Problema> listaDeProblemas = earpd.buscarProblemas();
        return listaDeProblemas.toArray(new Problema[listaDeProblemas.size()]);
    }

    public void guardarDenuncia(List<DTOProblemasDelSemaforo> listaDeProblemasDelSemaforo){
        earpd.guardarDenuncia(listaDeProblemasDelSemaforo);


    }

}
