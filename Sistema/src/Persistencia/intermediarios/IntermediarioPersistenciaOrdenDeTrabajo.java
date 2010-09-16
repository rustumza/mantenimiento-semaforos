/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import//borrar el import


package Persistencia.intermediarios;

import ExpertosPersistencia.Criterio;
import Persistencia.Entidades.ObjetoPersistente;
import java.sql.ResultSet;
import java.util.List;

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

        List<Criterio> listaCriterios;
        String select;
        listaCriterios = criterios;

        return select = "select * from ordendetrabajo where " ;//criterios

    }

    public String armarSelectOid(String oid) {

        String selectOid;
        this.oid =oid;

        return selectOid = "select * from ordendetrabajo where OIDOrdenDeTrabajo = " + oid;
    }

    public String armarUpdate(ObjetoPersistente obj) {

        String update;

        return update = "update ordendetrabajo set OIDOrdenDeTrabajo =" + ",FechaInicioTrabajo = " + "FechaFinTrabajo = " + "FechaInicioPlanificada =" + "DuracionPrevistaTrabajo =" + "Tipo = " + "OIDEquipoDeTrabajo =";

    }

    public void guardarObjetoCompuesto(ObjetoPersistente obj) {
    }

    public List<ObjetoPersistente> convertirRegistrosAObjetos(ResultSet rs) {


        return null;
    }
}

