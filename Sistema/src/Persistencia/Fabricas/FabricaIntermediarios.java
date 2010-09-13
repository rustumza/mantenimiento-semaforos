package Persistencia.Fabricas;

import Persistencia.intermediarios.IntermediarioPersistencia;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */





/**
 *
 * @author diego
 */
public class FabricaIntermediarios {

    static FabricaIntermediarios instancia = null;

    private FabricaIntermediarios(){
    
    }


    public static FabricaIntermediarios getInstancia(){
        if(instancia == null)
            instancia = new FabricaIntermediarios();
        return instancia;

    }


    public IntermediarioPersistencia crearIntermediario(String nombre){
        IntermediarioPersistencia intermediario = null;

        if(nombre.equals("Persona")){
            intermediario = (new IntermediarioPersona());
        }

        if(nombre.equals("DetallePersona")){
            intermediario = (new IntermediarioDetallePersona());
        }


        return intermediario;
    }

}
