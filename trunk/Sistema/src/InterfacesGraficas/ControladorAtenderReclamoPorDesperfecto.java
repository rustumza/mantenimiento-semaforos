/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package InterfacesGraficas;

import Persistencia.Entidades.Denunciante;
import Expertos.ExpertoAntenderReclamoPorDesperfecto;
import Fabricas.FabricaExpertos;
import Persistencia.Entidades.Calle;
import Persistencia.Entidades.Interseccion;
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

    public Interseccion buscarInterseccion(String OidCalle1, String OidCalle2){

    return earpd.buscarInterseccion(OidCalle1, OidCalle2);
    }
}
