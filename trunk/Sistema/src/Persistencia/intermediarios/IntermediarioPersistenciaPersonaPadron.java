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
public class IntermediarioPersistenciaPersonaPadron extends IntermediarioRelacional{

private String oid;

    public String armarInsert(ObjetoPersistente obj) {
        String insert;

        return insert = "insert into personapadron (OIDPersonaPadron, Apellido, Nombre, Domicilio, NroDocumento, TipoDocumento) values (OIDPersonaPadron, Apellido, Nombre, Domicilio, NroDocumento, TipoDocumento)";
    }

    public String armarSelect(List<Criterio> criterios) {

        List<Criterio> listaCriterios;
        String select;
        listaCriterios = criterios;

        return select = "select * from personapadron where " ;//criterios

    }

    public String armarSelectOid(String oid) {

        String selectOid;
        this.oid =oid;

        return selectOid = "select * from personapadron where OIDPersonaPadron = " + oid;
    }

    public String armarUpdate(ObjetoPersistente obj) {

        String update;

        return update = "update personapadron set OIDPersonaPadron =" + ",Apellido = " + "Nombre = " + "Nombre = " + "Domicilio =" + "NroDocumento =" + "TipoDocumento =";

    }

    public void guardarObjetoCompuesto(ObjetoPersistente obj) {
    }

    public List<ObjetoPersistente> convertirRegistrosAObjetos(ResultSet rs) {


        return null;
    }
}

