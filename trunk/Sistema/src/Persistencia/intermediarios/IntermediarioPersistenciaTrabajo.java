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
public abstract class IntermediarioPersistenciaTrabajo extends IntermediarioRelacional{
    
    public abstract String armarInsert(ObjetoPersistente obj);
    public abstract String armarSelect(List<Criterio> criterios);
    public abstract String armarSelectOid(String oid);
    public abstract String armarUpdate(ObjetoPersistente obj);
    public abstract void guardarObjetoCompuesto(ObjetoPersistente obj);
    public abstract List<ObjetoPersistente> convertirRegistrosAObjetos(ResultSet rs);
}
