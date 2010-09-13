package Persistencia.Fabricas;

import ExpertosPersistencia.Criterio;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author diego
 */
public class FabricaCriterios {

    public static FabricaCriterios _instancia = null;


    public static FabricaCriterios getInstancia(){
        if (_instancia == null)
            _instancia = new FabricaCriterios();
        return _instancia;
    }

    public Criterio crearCriterio(String atributo, String operador, String valor){

        Criterio nuevoCriterio = new Criterio();
        nuevoCriterio.setAtributo(atributo);
        nuevoCriterio.setOperador(operador);
        nuevoCriterio.setValor(valor);

        return nuevoCriterio;
    }

}
