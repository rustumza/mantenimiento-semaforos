/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia.intermediarios;

import Persistencia.Entidades.CalleAgente;
import Persistencia.ExpertosPersistencia.Criterio;
import Persistencia.Entidades.ObjetoPersistente;
import java.sql.ResultSet;
import java.util.List;

/**
 *
 * @author Eduardo
 */
public class IntermediarioPersistenciaCalle extends IntermediarioRelacional{

private String oid;

    public String armarInsert(ObjetoPersistente obj) {
        CalleAgente callea = (CalleAgente)obj;
        String insert;

        return "insert into calle(OIDCalle, CodigoCalle, NombreCalle) values ('"+callea.getOid()+"',"+String.valueOf(callea.getcodigoCalle())+",'"+ callea.getnombrecalle()+"')";
    }

    public String armarSelect(List<Criterio> criterios) {

        
        String select;
        
        select = "select * from calle " ;//criterios
        
        if (!criterios.isEmpty()) {
            select = select + " WHERE ";
            for (int i = 0; i < criterios.size(); i++) {
                if (i > 0) {
                    select = select + " AND ";
                }

                select = select + "calle." + criterios.get(i).getAtributo() + " " + criterios.get(i).getOperador() + " '" + criterios.get(i).getValor() + "'";
            }
        }
        
        return select;

    }

    public String armarSelectOid(String oid) {

        String selectOid;
        

         selectOid = "select * from calle where OIDCalle = '" + oid + "'";

         return selectOid;
    }

    public String armarUpdate(ObjetoPersistente obj) {

        CalleAgente callea = (CalleAgente) obj;
        String update;

        update = "update calle set OIDCalle = '"+ callea.getOid()+
                        "', CodigoCalle = "+String.valueOf(callea.getcodigoCalle())+
                        ", NombreCalle = '"+callea.getnombrecalle()+"'";

        return update;
    }

    public void guardarObjetoCompuesto(ObjetoPersistente obj) {
    }

    public List<ObjetoPersistente> convertirRegistrosAObjetos(ResultSet rs) {


        return null;
    }

    @Override
    public void guardarObjetosRelacionados(ObjetoPersistente obj) {

    }

    @Override
    public void buscarObjRelacionados(ObjetoPersistente obj) {

    }

    @Override
    public void setearDatosPadre(ObjetoPersistente objPer) {
        
    }
}
