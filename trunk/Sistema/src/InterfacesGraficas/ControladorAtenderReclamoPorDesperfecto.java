/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package InterfacesGraficas;

import DTO.DTOProblemasDelSemaforo;
import DTO.DTOinfoParaCrearDenuncia;
import Persistencia.Entidades.Denunciante;
import Expertos.ExpertoAntenderReclamoPorDesperfecto;
import Fabricas.FabricaExpertos;
import InterfacesGraficas.ModelosTablas.ModeloTablaSemaforos;
import Persistencia.Decoradores.DecoradorExpertoAntenderReclamoPorDesperfecto;
import Persistencia.Entidades.Calle;
import Persistencia.Entidades.Interseccion;
import Persistencia.Entidades.Problema;
import Persistencia.Entidades.Semaforo;
import Persistencia.ExpertosPersistencia.Cache;
import java.util.List;
import javax.swing.SpinnerListModel;
/**
 *
 * @author LEIVA
 */
public class ControladorAtenderReclamoPorDesperfecto {

    ExpertoAntenderReclamoPorDesperfecto earpd;
    PantallaAtenderReclamoPorDesperfecto pantallaARPD;

    public ControladorAtenderReclamoPorDesperfecto(){
         earpd = (ExpertoAntenderReclamoPorDesperfecto)FabricaExpertos.getInstance().getExperto("AtenderReclamoPorDesperfecto");
         pantallaARPD = new PantallaAtenderReclamoPorDesperfecto(this);
    }

    public void iniciar(){
        pantallaARPD.setVisible(true);
    }

    public Denunciante buscarDenunciante(String dni){
        
        return earpd.buscarDenunciante(dni);
    }

    public void guardarDenunciante(Denunciante denunciante){

        earpd.guardarDenunciante(denunciante);

    }


    public Calle[] buscarCalle(String calle){

        List<Calle> listaDeCalle = earpd.buscarCalle(calle);
        return listaDeCalle.toArray(new Calle[listaDeCalle.size()]);

    }


    public void buscarSemaforo(Calle calle1, Calle calle2){

        ModeloTablaSemaforos modTabSem = new ModeloTablaSemaforos();
        modTabSem.addAllRow(earpd.buscarSemaforo(calle1, calle2));
        pantallaARPD.getTablaDeSemafor().setModel(modTabSem);
        pantallaARPD.getTodosLosProblemas().setModel(new SpinnerListModel(buscarProblema()));
    }

    public Problema[] buscarProblema(){
        List<Problema> listaDeProblemas = earpd.buscarProblemas();
        return listaDeProblemas.toArray(new Problema[listaDeProblemas.size()]);
    }

    public void guardarDenuncia(DTOinfoParaCrearDenuncia infoParaCrearDenuncia){
        earpd.guardarDenuncia(infoParaCrearDenuncia);


    }

    /*
    public static void main(String[] Args){

        ControladorAtenderReclamoPorDesperfecto cont = new ControladorAtenderReclamoPorDesperfecto();
        cont.pantallaARPD = new PantallaAtenderReclamoPorDesperfecto(cont);
        cont.iniciar();




    }
*/
}
