/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia.intermediarios;

import Persistencia.Entidades.DenunciaAgente;
import Persistencia.Entidades.FallaTecnica;
import Persistencia.ExpertosPersistencia.Criterio;
import Persistencia.Entidades.ObjetoPersistente;
import Persistencia.Entidades.SuperDruperInterfaz;
import Persistencia.ExpertosPersistencia.FachadaInterna;
import Persistencia.Fabricas.FabricaCriterios;
import Persistencia.Fabricas.FabricaEntidades;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eduardo
 */
public class IntermediarioPersistenciaDenuncia extends IntermediarioRelacional {
    
    public String armarInsert(ObjetoPersistente obj) {
        String insert;
        DenunciaAgente denuncia = (DenunciaAgente)obj;
        
        insert = "INSERT INTO denuncia (OIDCaso, CodigoDenuncia, Prioridad)"
               + "values '" + denuncia.getOid() + "' ,'" + denuncia.getcodigoDenuncia() + "' ,'" + denuncia.getprioridad() + "' ";

    return insert;
    }

    public String armarSelect(List<Criterio> criterios) {

        String select;
        
        select = "SELECT * FROM denuncia" ;
        String condicion = "";

        while (!criterios.isEmpty()) {

            condicion = condicion + " WHERE ";

            for(int i= 0; i < criterios.size(); i++){
                if(i>0){
                    condicion = condicion + " AND ";
                }

                condicion = condicion + " denuncia." + criterios.get(i).getAtributo() + " " + criterios.get(i).getOperador() + " " + criterios.get(i).getValor();
            }
            select = select + condicion;
        }

         return select;
    }

    public String armarSelectOid(String oid) {

        String selectOid;
                
        return selectOid = "SELECT * FROM denuncia where OIDDenuncia = '" + oid + "'";
    }

    public String armarUpdate(ObjetoPersistente obj) {
       
        String update;
        DenunciaAgente denuncia = (DenunciaAgente)obj;

         update = "UPDATE denuncia SET"
                 + "OIDDenuncia ='" + denuncia.getOid() + "'"
                 + "CodigoDenuncia ='" + denuncia.getcodigoDenuncia() + "'"
                 + "Prioridad = '" + denuncia.getprioridad() + "'";

         return update;
    }

    public void guardarObjetoCompuesto(ObjetoPersistente obj) {
    }

    public List<ObjetoPersistente> convertirRegistrosAObjetos(ResultSet rs) {
    
        List<ObjetoPersistente> nuevosObjetos = new ArrayList<ObjetoPersistente>();
        try {
            while (rs.next()) {
                DenunciaAgente nuevaDenuncia = (DenunciaAgente) FabricaEntidades.getInstancia().crearEntidad("Denuncia");

                nuevaDenuncia.setIsNuevo(false);
                nuevaDenuncia.setOid(rs.getString("OIDDenuncia"));
                nuevaDenuncia.setcodigoDenuncia(Integer.valueOf(rs.getString("CodigoDenuncia")));
                nuevaDenuncia.setprioridad(Float.valueOf(rs.getString("Prioridad")));


                nuevosObjetos.add(nuevaDenuncia);


            }
        } catch (SQLException ex) {
            Logger.getLogger(IntermediarioPersistenciaDenuncia.class.getName()).log(Level.SEVERE, null, ex);
        }

        return nuevosObjetos;
    }

    @Override
    public void guardarObjetosRelacionados(ObjetoPersistente obj) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void buscarObjRelacionados(ObjetoPersistente obj) {
       List<Criterio> listaCriterios = new ArrayList<Criterio>();
        listaCriterios.add(FabricaCriterios.getInstancia().crearCriterio("Denuncia", "=", obj.getOid()));

        for (SuperDruperInterfaz fallaTecnica : FachadaInterna.getInstancia().buscar("FallaTecnica", listaCriterios)) {
            ((DenunciaAgente)obj).addOidFallaTecnica(((ObjetoPersistente)fallaTecnica).getOid());
        }

    }
}
