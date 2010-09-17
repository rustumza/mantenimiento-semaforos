/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Expertos;

import Persistencia.Entidades.OrdenDeMantenimiento;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author informatica
 */
public class ExpertoEjecutarOrdenesTrabajo implements Experto{

    public List<OrdenDeMantenimiento> consultarOrdenesMantenimientoPendientes(Date fecha, String tipo) {

        List<OrdenDeMantenimiento>ordenesEncontradas = new ArrayList<OrdenDeMantenimiento>();
        
        ordenesEncontradas = (new ExpertoConsultarOrdenesPendientes()).buscarOrdenesMantPendiente(fecha);

        return ordenesEncontradas;
    }

        


}
