/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Persistencia.Decoradores;

import DTO.DTOOrdenesTrabajo;
import Expertos.ExpertoEjecutarOrdenesTrabajo;
import Persistencia.ExpertosPersistencia.FachadaInterna;
import java.util.Date;
import java.util.List;

/**
 *
 * @author informatica
 */
public class DecoradorExpertoEjecutarOrdenesTrabajo extends ExpertoEjecutarOrdenesTrabajo {

    @Override
    public List<DTOOrdenesTrabajo> consultarOrdenesPendientes(Date fecha, String tipo){

        iniciarTx();
        List<DTOOrdenesTrabajo> aux = super.consultarOrdenesPendientes(fecha, tipo);
        confirmarTx();
        return aux;
    }

    private void iniciarTx(){

        FachadaInterna.getInstancia().iniciarTransaccion();
    }

    private void confirmarTx(){

    FachadaInterna.getInstancia().confirmarTransaccion();
    }

}
