/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia.intermediarios;

import ExpertosPersistencia.Criterio;
import Persistencia.Entidades.ObjetoPersistente;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author Eduardo
 */
public class IntermediarioPersistenciaPersonaPadronEstado extends IntermediarioRelacional{

private String oid;

    public String armarInsert(ObjetoPersistente obj) {
        String insert;

        return insert = "insert into personapadronestado (OIDPersonaPadronEstado, OIDPersonaPadron, OIDEstadoPadronPersona, FechaCambioEstado, IndicadoresEstadoActual) values (OIDPersonaPadronEstado, OIDPersonaPadron, OIDEstadoPadronPersona, FechaCambioEstado, IndicadoresEstadoActual)";
    }

    public String armarSelect(List<Criterio> criterios) {

        List<Criterio> listaCriterios;
        String select;
        listaCriterios = criterios;

        return select = "select * from personapadronestado where " ;//criterios

    }

    public String armarSelectOid(String oid) {

        String selectOid;
        this.oid =oid;

        return selectOid = "select * from personapadronestado where OIDPersonaPadronEstado = " + oid;
    }

    public String armarUpdate(ObjetoPersistente obj) {

        String update;

        return update = "update personapadronestado set OIDPersonaPadronEstado =" + ",OIDPersonaPadron = " + "OIDEstadoPadronPersona = " + "FechaCambioEstado =" + "IndicadoresEstadoActual =";

    }

    public void guardarObjetoCompuesto(ObjetoPersistente obj) {
    }

    public List<ObjetoPersistente> convertirRegistrosAObjetos(ResultSet rs) {


        return null;
    }
}

