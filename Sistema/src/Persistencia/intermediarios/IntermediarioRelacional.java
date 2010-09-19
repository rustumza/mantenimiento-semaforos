package Persistencia.intermediarios;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



import Persistencia.Entidades.ObjetoPersistente;
import Persistencia.ExpertosPersistencia.Conexion;
import Persistencia.ExpertosPersistencia.Criterio;
import ExpertosPersistencia.generadorOid;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diego
 */
public abstract class IntermediarioRelacional extends IntermediarioPersistencia{

    @Override
    public void desmaterializar(ObjetoPersistente obj) {
        String consulta = null;
        if(obj.isIsNuevo()){
            obj.setOid((generadorOid.getInstance().generarOid()));
            consulta = armarInsert(obj);

        }else{
            consulta = armarUpdate(obj);
        }
        
        Conexion.getInstance().insert(consulta);

        guardarObjetoCompuesto(obj);

        

    }

    @Override
    public List<ObjetoPersistente> materializar(List<Criterio> criterios){
        List<ObjetoPersistente> objetosEncontrados = new ArrayList<ObjetoPersistente>();

        String consulta = armarSelect(criterios);

        ResultSet rs = Conexion.getInstance().select(consulta);

        objetosEncontrados = convertirRegistrosAObjetos(rs);

        return objetosEncontrados;
    }

    @Override
    public ObjetoPersistente materializar(String oid){
        ObjetoPersistente objetoEncontrado = null;
        List<ObjetoPersistente> objetoRetornado = new ArrayList<ObjetoPersistente>();
        String consulta = armarSelectOid(oid);
        ResultSet rs = Conexion.getInstance().select(consulta);
        objetoRetornado = (ArrayList<ObjetoPersistente>) convertirRegistrosAObjetos(rs);
        for(ObjetoPersistente op : objetoRetornado){
            objetoEncontrado=op;
        }
        
        return objetoEncontrado;
    }

    public abstract String armarInsert(ObjetoPersistente obj);
    public abstract String armarSelect(List<Criterio> criterios);
    public abstract String armarSelectOid(String oid);
    public abstract String armarUpdate(ObjetoPersistente obj);
    public abstract void guardarObjetoCompuesto(ObjetoPersistente obj);
    public abstract List<ObjetoPersistente> convertirRegistrosAObjetos(ResultSet rs);


   

}
