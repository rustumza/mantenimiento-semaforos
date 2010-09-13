package Persistencia.ExpertosPersistencia;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import Persistencia.Entidades.SuperDruperInterfaz;
import Persistencia.Entidades.ObjetoPersistente;
import ExpertosPersistencia.Criterio;
import java.util.List;

/**
 *
 * @author diego
 */
public class FachadaExterna {

    private static FachadaExterna instancia = null;

    public static FachadaExterna getInstancia(){
        if (instancia == null)
            instancia = new FachadaExterna();
        return instancia;
    }

    private FachadaExterna(){

    }

    public void guardar(String nombreClase, ObjetoPersistente obj){
       FachadaInterna.getInstancia().guardar(nombreClase, obj);
    }

    public SuperDruperInterfaz crearEntidad(String nombre){
        return FachadaInterna.getInstancia().crearEntidad(nombre);
    }

    public Criterio crearCriterio(String atributo, String operador, String valor){

        return FachadaInterna.getInstancia().crearCriterio(atributo, operador, valor);

    }

    public List<SuperDruperInterfaz> buscar(String nombreEntidad, List<Criterio> listaCriterios) {
        return FachadaInterna.getInstancia().buscar(nombreEntidad, listaCriterios);
    }

}
