/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Persistencia.Decoradores;

import DTO.DTOOrdenes;
import Expertos.ExpertoConsultarOrdenesPendientes;
import Persistencia.ExpertosPersistencia.FachadaInterna;
import java.util.Date;
import java.util.List;

/**
 *
 * @author informatica
 */
public class DecoradorExpertoConsultarOrdenesPendientes extends ExpertoConsultarOrdenesPendientes {

    public List<DTOOrdenes> buscarOrdenes(Date fecha){at

    iniciarTx();
    
    List<DTOOrdenes> hh = super.buscarOrdenes(fecha);
    return 

    }

    private void iniciarTx(){

    FachadaInterna.getInstancia().iniciarTransaccion();
    }

    private void confirmarTx(){

    FachadaInterna.getInstancia().confirmarTransaccion();
    }
}
