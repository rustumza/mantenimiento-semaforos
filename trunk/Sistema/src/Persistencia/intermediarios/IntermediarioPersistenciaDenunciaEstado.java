/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia.intermediarios;

import Persistencia.Entidades.DenunciaEstadoAgente;
import Persistencia.ExpertosPersistencia.Criterio;
import Persistencia.Entidades.ObjetoPersistente;
import Persistencia.Fabricas.FabricaEntidades;
import Utilidades.FormateadorFechas;
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
public class IntermediarioPersistenciaDenunciaEstado extends IntermediarioRelacional{



    public String armarInsert(ObjetoPersistente obj) {
        String insert;
        DenunciaEstadoAgente denunciaEstado = (DenunciaEstadoAgente)obj;

         insert = "INSERT INTO denunciaestado (OIDDenunciaEstado, OIDDenuncia, OIDEstadoDenuncia, FechaCambioEstado, IndicadoresEstadoActual)"
                 + "VALUES '" + denunciaEstado.getOid() + "', '" + denunciaEstado.getOidDenuncia() + "', '" + denunciaEstado.getOidEstadoDenuncia() + "', '" + denunciaEstado.getfechacambioestado() + "', '" + denunciaEstado.getIndicadoresEstadoActual() + "'";

    return insert;
    }

    public String armarSelect(List<Criterio> criterios) {

        
        String select;
        String condicion = "";
        select = "SELECT * FROM denunciaestado" ;

        while (!criterios.isEmpty()) {            
            
            condicion = condicion + " WHERE ";
            
            for(int i = 0; i < criterios.size(); i++){
                if(i>0){
                    condicion = condicion + " AND ";
                }
                condicion = condicion + "denunciaestado." + criterios.get(i).getAtributo() + " " + criterios.get(i).getOperador() + " '" + criterios.get(i).getValor() + "'";
            }
            select = select + condicion;
        }

         return select;
    }

    public String armarSelectOid(String oid) {

        String selectOid;
        

        return selectOid = "SELECT * FROM denunciaestado WHERE OIDDenunciaEstado = '" + oid + "'";
    }

    public String armarUpdate(ObjetoPersistente obj) {

        String update;
        DenunciaEstadoAgente denunciaestado = (DenunciaEstadoAgente)obj;
         update = "UPDATE denunciaestado SET"
                 + "OIDDenunciaEstado= '" + denunciaestado.getOid() + "',"
                 + "OIDDenuncia=' " + denunciaestado.getOidDenuncia()+ "', "
                 + "OIDEstadoDenuncia = '" +denunciaestado.getOidEstadoDenuncia()+ "', "
                 + "FechaCambioEstado='" + denunciaestado.getfechacambioestado() + "', "
                 + "IndicadoresEstadoActual='" + denunciaestado.getIndicadoresEstadoActual() + "'";


         return update;
    }

    public void guardarObjetoCompuesto(ObjetoPersistente obj) {
    }

    public List<ObjetoPersistente> convertirRegistrosAObjetos(ResultSet rs) {

    List<ObjetoPersistente> nuevosObjetos = new ArrayList<ObjetoPersistente>();
        try {
            while (rs.next()) {
                DenunciaEstadoAgente nuevaDenunciaEstado = (DenunciaEstadoAgente) FabricaEntidades.getInstancia().crearEntidad("DenunciaEstado");
                nuevaDenunciaEstado.setIsNuevo(false);
                nuevaDenunciaEstado.setOid(rs.getString("OIDDenunciaEstado"));
                nuevaDenunciaEstado.setOidDenuncia(rs.getString("OIDDenuncia"));
                nuevaDenunciaEstado.setDenunciaBuscado(false);
                nuevaDenunciaEstado.setOidEstadoDenuncia(rs.getString("OIDEstadoDenuncia"));
                nuevaDenunciaEstado.setfechacambioestado(Integer.valueOf("FechaCambioEstado"));
                nuevaDenunciaEstado.setindicadorestadoactual(false);
            nuevosObjetos.add(nuevaDenunciaEstado);
            }
        } catch (SQLException ex) {
            Logger.getLogger(IntermediarioPersistenciaDenunciaEstado.class.getName()).log(Level.SEVERE, null, ex);
        }

        return nuevosObjetos;
    }

    @Override
    public void guardarObjetosRelacionados(ObjetoPersistente obj) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void buscarObjRelacionados(ObjetoPersistente obj) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void setearDatosPadre(ObjetoPersistente objPer) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}

