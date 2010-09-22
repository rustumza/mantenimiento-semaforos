/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


package Persistencia.intermediarios;

import Persistencia.ExpertosPersistencia.Criterio;
import Persistencia.Entidades.ObjetoPersistente;
import Persistencia.Entidades.OrdenTrabajo;
import Persistencia.Entidades.OrdenTrabajoAgente;
import Persistencia.Entidades.Reserva;
import Persistencia.Entidades.SuperDruperInterfaz;
import Persistencia.Entidades.TrabajoAgente;
import Persistencia.ExpertosPersistencia.FachadaInterna;
import Persistencia.Fabricas.FabricaCriterios;
import Persistencia.Fabricas.FabricaEntidades;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eduardo
 */
public class IntermediarioPersistenciaOrdenDeTrabajo extends IntermediarioRelacional{

    public String armarInsert(ObjetoPersistente obj) {
        String insert;

        OrdenTrabajoAgente ordenTrabajo = (OrdenTrabajoAgente) obj;

        return insert = "INSERT INTO ordendetrabajo (OIDOrdenDeTrabajo, FechaInicioTrabajo, FechaFinTrabajo, FechaInicioPlanificada, DuracionPrevistaTrabajo, Tipo, OIDEquipoDeTrabajo)"
                + " VALUES ('"+ordenTrabajo.getOid()+"', '"+ordenTrabajo.getfechainiciotrabajo()+"', '"+ordenTrabajo.getfechafintrabajo()+"', '"+ordenTrabajo.getfechainicioplanificada()+"', "+ordenTrabajo.getduracionprevistatrabajo()+", '"+ordenTrabajo.gettipoordentrabajo()+"', '"+ordenTrabajo.getOidEquipoDeTrabajo()+"'d);";
    }

    public String armarSelect(List<Criterio> criterios) {

        String select;

        select = "SELECT * FROM ordendetrabajo" ;
        
        if (!criterios.isEmpty()) {
            select = select + " WHERE ";
            for (int i = 0; i < criterios.size(); i++) {
                if (i > 0) {
                    select = select + " AND ";
                }

                select = select + "ordendetrabajo." + criterios.get(i).getAtributo() + " " + criterios.get(i).getOperador() + " '" + criterios.get(i).getValor()+"'";
            }
        }

        return select;
    }

    public String armarSelectOid(String oid) {

        String selectOid;

        return selectOid = "SELECT * FROM ordendetrabajo WHERE OIDOrdenDeTrabajo = '" + oid+"'";
    }

    public String armarUpdate(ObjetoPersistente obj) {

        OrdenTrabajoAgente ordenTrabajo = (OrdenTrabajoAgente) obj;
        String update;

        update = "UPDATE ordendetrabajo SET "
                + "OIDOrdenDeTrabajo = '"+ ordenTrabajo.getOid()+ ","
                + "FechaInicioTrabajo = '"+ordenTrabajo.getfechainiciotrabajo() + "', "
                + "FechaFinTrabajo = '"+ ordenTrabajo.getfechafintrabajo()+"', "
                + "FechaInicioPlanificada = '"+ordenTrabajo.getfechainicioplanificada() +"', "
                + "DuracionPrevistaTrabajo = "+ordenTrabajo.getduracionprevistatrabajo()+ ", "
                + "Tipo = '"+ordenTrabajo.gettipoordentrabajo()+ "', "
                + "OIDEquipoDeTrabajo = '"+ordenTrabajo.getOidEquipoDeTrabajo()+"';";

        return update;

    }

    public void guardarObjetoCompuesto(ObjetoPersistente obj) {
    }

    public List<ObjetoPersistente> convertirRegistrosAObjetos(ResultSet rs) {

        List<ObjetoPersistente> nuevosObjetos = new ArrayList<ObjetoPersistente>();
        try {
            while (rs.next()) {
                OrdenTrabajoAgente nuevaOrdenTrabajo = (OrdenTrabajoAgente) FabricaEntidades.getInstancia().crearEntidad("OrdenTrabajo");
                nuevaOrdenTrabajo.setIsNuevo(false);
                nuevaOrdenTrabajo.setOid(rs.getString("OIDOrdenDeTrabajo"));
                nuevaOrdenTrabajo.setOidEquipoDeTrabajo(rs.getString("OIDEquipoDeTrabajo"));
                nuevaOrdenTrabajo.setEquipoDeTrabajoBuscado(false);
                nuevaOrdenTrabajo.setOrdenTrabajoEstadosBuscado(false);
                nuevaOrdenTrabajo.setReservaBuscado(false);
                nuevaOrdenTrabajo.setTrabajoBuscado(false);
                
                nuevosObjetos.add(nuevaOrdenTrabajo);

            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return nuevosObjetos;
    }

    @Override
    public void guardarObjetosRelacionados(ObjetoPersistente obj) {
        for (Reserva reserva : ((OrdenTrabajo)obj).getRervas()) {
            FachadaInterna.getInstancia().guardar("Reserva", (ObjetoPersistente) reserva);
        }
    }

    @Override
    public void buscarObjRelacionados(ObjetoPersistente obj) {
        
        List<Criterio> listaCriterios = new ArrayList<Criterio>();
        listaCriterios.add(FabricaCriterios.getInstancia().crearCriterio("OrdenTrabajo", "=", obj.getOid()));
        
        List<SuperDruperInterfaz> listaTrabajos = FachadaInterna.getInstancia().buscar("Trabajo", listaCriterios);

        for (SuperDruperInterfaz trabajo : listaTrabajos) {

            ((OrdenTrabajoAgente)obj).addOidTrabajo(((TrabajoAgente)trabajo).getOid());

        }
    }
}

