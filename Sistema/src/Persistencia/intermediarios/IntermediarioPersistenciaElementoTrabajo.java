/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import//borrar el import


package Persistencia.intermediarios;

import ExpertosPersistencia.Criterio;
import Persistencia.Entidades.ElementoTrabajoMantenimiento;
import Persistencia.Entidades.ElementoTrabajoMantenimientoAgente;
import Persistencia.Entidades.ObjetoPersistente;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author Eduardo
 */
public class IntermediarioPersistenciaElementoTrabajo extends IntermediarioRelacional{
private String oid;

    public String armarInsert(ObjetoPersistente obj) {
        String insert;

        return insert = "insert into elementotrabajo (OIDElementoTrabajo, CodigoSistemaExterno, TipoElemento) values (OIDElementoTrabajo, CodigoSistemaExterno, TipoElemento)";
    }

    public String armarSelect(List<Criterio> criterios) {

        List<Criterio> listaCriterios;
        String select;
        listaCriterios = criterios;

        return select = "select * from elementotrabajo where " ;//criterios

    }

    public String armarSelectOid(String oid) {

        String selectOid;
        this.oid =oid;

        return selectOid = "select * from elementotrabajo where OIDElementoTrabajo = " + oid;
    }

    public String armarUpdate(ObjetoPersistente obj) {

        String update;

        return update = "update elementotrabajo set OIDElementoTrabajo =" + ",CodigoSistemaExterno = " + "TipoElemento = " ;

    }

    public void guardarObjetoCompuesto(ObjetoPersistente obj) {
    }

    public List<ObjetoPersistente> convertirRegistrosAObjetos(ResultSet rs) {


        return null;
    }
}
