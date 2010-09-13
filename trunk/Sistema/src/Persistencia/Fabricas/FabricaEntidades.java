package Persistencia.Fabricas;

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

    public Object crearEntidad(String entidad){


        return null;
    }



}
