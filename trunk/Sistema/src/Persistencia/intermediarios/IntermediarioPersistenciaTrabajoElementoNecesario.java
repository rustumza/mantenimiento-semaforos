/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Persistencia.intermediarios;

import Persistencia.ExpertosPersistencia.Criterio;
import Persistencia.Entidades.ObjetoPersistente;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author Eduardo
 */
public class IntermediarioPersistenciaTrabajoElementoNecesario extends IntermediarioRelacional{

 private String oid;

    public String armarInsert(ObjetoPersistente obj) {
        String insert;

        return insert = "insert into trabajoelementonecesario (OIDTrabajoElementoNecesario, OIDTrabajo, OIDElementoTrabajo, CantidadNecesaria) values (OIDTrabajoElementoNecesario, OIDTrabajo, OIDElementoTrabajo, CantidadNecesaria)";
    }

    public String armarSelect(List<Criterio> criterios) {

        List<Criterio> listaCriterios;
        String select;
        listaCriterios = criterios;

        return select = "select * from trabajoelementonecesario where " ;//criterios

    }

    public String armarSelectOid(String oid) {

        String selectOid;
        this.oid =oid;

        return selectOid = "select * from trabajoelementonecesario where OIDTrabajoElementoNecesario = " + oid;
    }

    public String armarUpdate(ObjetoPersistente obj) {

        String update;

        return update = "update trabajoelementonecesario set OIDTrabajoElementoNecesario =" + ",OIDTrabajo = " + "OIDElementoTrabajo = " + "CantidadNecesaria =" ;

    }

    public void guardarObjetoCompuesto(ObjetoPersistente obj) {
    }

    public List<ObjetoPersistente> convertirRegistrosAObjetos(ResultSet rs) {


        return null;
    }
}
