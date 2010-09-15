/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Persistencia.Decoradores;

import Expertos.ExpertoAntenderReclamoPorDesperfecto;
import Persistencia.Entidades.Denunciante;
import Persistencia.ExpertosPersistencia.FachadaInterna;

/**
 *
 * @author LEIVA
 */
public class DecoradorExpertoAntenderReclamoPorDesperfecto extends ExpertoAntenderReclamoPorDesperfecto{

    @Override
    public Denunciante buscarDenunciante(String dni){
        inicarTX();
        confirmarTx();
        return super.buscarDenunciante(dni);
    }

    private void inicarTX(){

        FachadaInterna.getInstancia().iniciarTransaccion();

    }
    private void confirmarTx(){
    FachadaInterna.getInstancia().confirmarTransaccion();
    }
}
