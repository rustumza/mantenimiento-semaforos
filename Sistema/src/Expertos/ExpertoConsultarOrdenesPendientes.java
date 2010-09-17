/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Expertos;

import DTO.DTOOrdenes;
import ExpertosPersistencia.Criterio;
import Persistencia.Entidades.OrdenDeMantenimiento;
import Persistencia.Entidades.OrdenTrabajo;
import Persistencia.Entidades.SuperDruperInterfaz;
import Persistencia.ExpertosPersistencia.FachadaExterna;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author informatica
 */
public class ExpertoConsultarOrdenesPendientes implements Experto{


public boolean validarFecha(Date fecha){

    return (new Date().compareTo(fecha)>= 0);
    }

public List<OrdenTrabajo> buscarOrdenes(Date fecha){
    if(!validarFecha(fecha)){
    //Tirar excepcion por fecha incorrecta
        return null;
    }




    List<Criterio> listaDeCriterios = new ArrayList<Criterio>();
    listaDeCriterios.add(FachadaExterna.getInstancia().crearCriterio("estado", "=", "pendiente"));
    listaDeCriterios.add(FachadaExterna.getInstancia().crearCriterio("fechaInicioTrabajo", "=", "fecha"));
    List<SuperDruperInterfaz> listaDeInterfaces = FachadaExterna.getInstancia().buscar("OrdenTrabajo", listaDeCriterios);
    List<OrdenTrabajo> listaOrdenTrabajo = new ArrayList<OrdenTrabajo>() ;
        for(SuperDruperInterfaz aux : listaDeInterfaces ){
            listaOrdenTrabajo.add((OrdenTrabajo) aux);
            }

    return listaOrdenTrabajo;

}

public List<OrdenDeMantenimiento> buscarOrdenesMantPendiente(Date fecha){

    return null;
}


}
