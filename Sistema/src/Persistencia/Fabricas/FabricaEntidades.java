package Persistencia.Fabricas;

import Persistencia.Entidades.ObjetoPersistente;
import Persistencia.Entidades.OrdenTrabajo;
import Persistencia.Entidades.OrdenTrabajoAgente;
import Persistencia.Entidades.OrdenTrabajoImplementacion;
import Persistencia.Entidades.SuperDruperInterfaz;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author diego
 */
public class FabricaEntidades {

    public static FabricaEntidades _instancia = null;

    public static FabricaEntidades getInstancia(){
        if(_instancia == null)
            _instancia = new FabricaEntidades();
        return _instancia;
    }

    public SuperDruperInterfaz crearEntidad(String entidad){

        if(entidad.equals("OrdenTrabajo")){
           OrdenTrabajoImplementacion ordenTrabImpl = new OrdenTrabajoImplementacion();
           OrdenTrabajoAgente ordenTrabAgente = new OrdenTrabajoAgente();
           ordenTrabAgente.setImplementacion(ordenTrabImpl);

           return ordenTrabAgente;
        } else{
            return null;
        }

    }



}
