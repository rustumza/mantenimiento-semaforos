/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Expertos;

import DTO.DTOOrdenesTrabajo;
import Fabricas.FabricaExpertos;
import Persistencia.Entidades.EstadoOrdenTrabajo;
import Persistencia.Entidades.OrdenDeMantenimiento;
import Persistencia.Entidades.OrdenDeReparacion;
import Persistencia.Entidades.OrdenTrabajo;
import Persistencia.Entidades.OrdenTrabajoEstado;
import Persistencia.ExpertosPersistencia.Criterio;
import Persistencia.ExpertosPersistencia.FachadaExterna;
import Persistencia.Fabricas.FabricaCriterios;
import Persistencia.Fabricas.FabricaEntidades;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author informatica
 */
public class ExpertoEjecutarOrdenesTrabajo implements Experto{
    private String ConsultarOrdenesPendientes;

    public List<OrdenDeMantenimiento> consultarOrdenesMantenimientoPendientes(Date fecha, String tipo) {

        List<OrdenDeMantenimiento>ordenesEncontradas = new ArrayList<OrdenDeMantenimiento>();
        
        ordenesEncontradas = ((ExpertoConsultarOrdenesPendientes)FabricaExpertos.getInstance().getExperto(ConsultarOrdenesPendientes)).buscarOrdenesMantPendiente(fecha);

        return ordenesEncontradas;
    }

    public List<OrdenDeReparacion> consultarOrdenesReparacionPendientes(Date fecha, String tipo) {
        List<OrdenDeReparacion>ordenesEncontradas = new ArrayList<OrdenDeReparacion>();

        ordenesEncontradas =((ExpertoConsultarOrdenesPendientes)(FabricaExpertos.getInstance().getExperto(ConsultarOrdenesPendientes))).buscarOrdenesReparacionPendiente(fecha);

        return ordenesEncontradas;


    }
 public List<OrdenTrabajo> consultarOrdenesTrabajoPendientes(Date fecha, String tipo) {
        List<OrdenTrabajo>ordenesEncontradas = new ArrayList<OrdenTrabajo>();

        ordenesEncontradas =((ExpertoConsultarOrdenesPendientes)(FabricaExpertos.getInstance().getExperto(ConsultarOrdenesPendientes))).buscarOrdenes(fecha);

        return ordenesEncontradas;


    }
    public void guardarOrdenTrabajo(List<OrdenTrabajo> ordenesEncontradas) {
        List<Criterio> listaCriterios = new ArrayList<Criterio>();
        listaCriterios.add(FabricaCriterios.getInstancia().crearCriterio("NombreEstado","=","en Reparacion"));

        EstadoOrdenTrabajo estado = (EstadoOrdenTrabajo) FachadaExterna.getInstancia().buscar("EstadoOrdenTrabajo", listaCriterios).get(0);

        for (OrdenTrabajo orden : ordenesEncontradas) {
            OrdenTrabajoEstado ordentrabajoestado = (OrdenTrabajoEstado)FabricaEntidades.getInstancia().crearEntidad("OrdenTrabajoEstado");
            ordentrabajoestado.setEstadoOrdenTrabajo(estado);
            ordentrabajoestado.setfechacambioestado(new Date());
            ordentrabajoestado.setindicadorestadoactual(true);

            orden.addEstado(ordentrabajoestado);

            FachadaExterna.getInstancia().guardar("OrdenTrabajo", orden);
            
        }


    }




}
