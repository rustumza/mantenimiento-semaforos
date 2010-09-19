/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import//borrar el import

package Persistencia.intermediarios;

import Persistencia.ExpertosPersistencia.Criterio;
import Persistencia.Entidades.ObjetoPersistente;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author Eduardo
 */
public class IntermediarioPersistenciaUbicacion extends IntermediarioRelacional{

 private String oid;

    public String armarInsert(ObjetoPersistente obj) {
        String insert;

        return insert = "insert into ubicacion (OIDUbicacion, CodigoUbicacion, Prioridad, TipoUbicacion) values (OIDUbicacion, CodigoUbicacion, Prioridad, TipoUbicacion)";
    }

    public String armarSelect(List<Criterio> criterios) {

        List<Criterio> listaCriterios;
        String select;
        listaCriterios = criterios;

        return select = "select * from ubicacion where " ;//criterios

    }

    public String armarSelectOid(String oid) {

        String selectOid;
        this.oid =oid;

        return selectOid = "select * from ubicacion where OIDUbicacion = " + oid;
    }

    public String armarUpdate(ObjetoPersistente obj) {

        String update;

        return update = "update ubicacion set OIDUbicacion =" + ",CodigoUbicacion = " + "Prioridad = " + "TipoUbicacion =";

    }

    public void guardarObjetoCompuesto(ObjetoPersistente obj) {
    }

    public List<ObjetoPersistente> convertirRegistrosAObjetos(ResultSet rs) {


        return null;
    }
}

