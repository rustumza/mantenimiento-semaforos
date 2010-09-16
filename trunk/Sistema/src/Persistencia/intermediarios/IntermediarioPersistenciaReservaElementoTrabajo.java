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
public class IntermediarioPersistenciaReservaElementoTrabajo extends IntermediarioRelacional{

private String oid;

    public String armarInsert(ObjetoPersistente obj) {
        String insert;

        return insert = "insert into reservaelementotrabajo (OIDReservaElementoTrabajo, OIDElementoTrabajo, OIDReserva, CantidadReservada) values (OIDReservaElementoTrabajo, OIDElementoTrabajo, OIDReserva, CantidadReservada)";
    }

    public String armarSelect(List<Criterio> criterios) {

        List<Criterio> listaCriterios;
        String select;
        listaCriterios = criterios;

        return select = "select * from reservaelementotrabajo where " ;//criterios

    }

    public String armarSelectOid(String oid) {

        String selectOid;
        this.oid =oid;

        return selectOid = "select * from reservaelementotrabajo where OIDReservaElementoTrabajo = " + oid;
    }

    public String armarUpdate(ObjetoPersistente obj) {

        String update;

        return update = "update reservaelementotrabajo set OIDReservaElementoTrabajo =" + ",OIDElementoTrabajo = " + "OIDReserva = " + "CantidadReservada =";

    }

    public void guardarObjetoCompuesto(ObjetoPersistente obj) {
    }

    public List<ObjetoPersistente> convertirRegistrosAObjetos(ResultSet rs) {


        return null;
    }
}

