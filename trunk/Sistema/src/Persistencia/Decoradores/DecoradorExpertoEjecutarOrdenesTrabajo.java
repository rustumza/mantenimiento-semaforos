/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Persistencia.Decoradores;

import DTO.DTOOrdenesTrabajo;
import Expertos.ExpertoEjecutarOrdenesTrabajo;
import Persistencia.Entidades.OrdenDeMantenimiento;
import Persistencia.Entidades.OrdenTrabajo;
import Persistencia.ExpertosPersistencia.FachadaInterna;
import java.util.Date;
import java.util.List;

/**
 *
 * @author informatica
 */
public class DecoradorExpertoEjecutarOrdenesTrabajo extends ExpertoEjecutarOrdenesTrabajo {

    
    public List<OrdenTrabajo> consultarOrdenesPendientes(Date fecha, String tipo){

        iniciarTx();
        List<OrdenTrabajo> aux = super.consultarOrdenesTrabajoPendientes(fecha, tipo);
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
