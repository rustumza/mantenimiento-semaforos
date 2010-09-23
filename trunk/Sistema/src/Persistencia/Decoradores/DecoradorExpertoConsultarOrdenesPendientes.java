/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Persistencia.Decoradores;


import Expertos.ExpertoConsultarOrdenesPendientes;
import Persistencia.Entidades.OrdenTrabajo;
import Persistencia.ExpertosPersistencia.FachadaInterna;
import java.util.Date;
import java.util.List;

/**
 *
 * @author informatica
 */
public class DecoradorExpertoConsultarOrdenesPendientes extends ExpertoConsultarOrdenesPendientes {

    @Override
     public List<OrdenTrabajo> buscarOrdenes(Date fecha) {
    iniciarTx();
    List<OrdenTrabajo> aux = super.buscarOrdenes(fecha);
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
