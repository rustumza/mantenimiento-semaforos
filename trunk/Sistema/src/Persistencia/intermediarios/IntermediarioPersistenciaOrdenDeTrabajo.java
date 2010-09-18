/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


package Persistencia.intermediarios;

import ExpertosPersistencia.Criterio;
import Persistencia.Entidades.ObjetoPersistente;
import Persistencia.Entidades.OrdenTrabajo;
import Persistencia.Entidades.OrdenTrabajoAgente;
import Persistencia.Fabricas.FabricaEntidades;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eduardo
 */
public class IntermediarioPersistenciaOrdenDeTrabajo extends IntermediarioRelacional{

private String oid;

    public String armarInsert(ObjetoPersistente obj) {
        String insert;

        return insert = "insert into ordendetrabajo (OIDOrdenDeTrabajo, FechaInicioTrabajo, FechaFinTrabajo, FechaInicioPlanificada, DuracionPrevistaTrabajo, Tipo, OIDEquipoDeTrabajo) values (OIDOrdenDeTrabajo, FechaInicioTrabajo, FechaFinTrabajo, FechaInicioPlanificada, DuracionPrevistaTrabajo, Tipo, OIDEquipoDeTrabajo)";
    }

    public String armarSelect(List<Criterio> criterios) {

        String select;

        select = "SELECT * FROM ordendetrabajo" ;//criterios
        
        if (!criterios.isEmpty()) {
            select = select + " WHERE ";
            for (int i = 0; i < criterios.size(); i++) {
                if (i > 0) {
                    select = select + criterios.get(i).getTipo();
                }

                select = select + "ordendetrabajo." + criterios.get(i).getAtributo() + " " + criterios.get(i).getOperador() + " '" + criterios.get(i).getValor()+"'";
            }
        }

        return select;
    }

    public String armarSelectOid(String oid) {

        String selectOid;
        this.oid =oid;

        return selectOid = "SELECT * FROM ordendetrabajo WHERE OIDOrdenDeTrabajo = " + oid;
    }

    public String armarUpdate(ObjetoPersistente obj) {

        String update;

        return update = "update ordendetrabajo set OIDOrdenDeTrabajo =" + ",FechaInicioTrabajo = " + "FechaFinTrabajo = " + "FechaInicioPlanificada =" + "DuracionPrevistaTrabajo =" + "Tipo = " + "OIDEquipoDeTrabajo =";

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
                nuevaOrdenTrabajo.setOidReserva(rs.getString(""));


            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return null;
    }
}

