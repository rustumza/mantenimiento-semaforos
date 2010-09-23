/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Persistencia.intermediarios;

import Persistencia.ExpertosPersistencia.Criterio;
import Persistencia.Entidades.ObjetoPersistente;
import Persistencia.Entidades.SemaforoAgente;
import Persistencia.Fabricas.FabricaEntidades;
import Utilidades.FormateadorFechas;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eduardo
 */
public class IntermediarioPersistenciaSemaforo extends IntermediarioRelacional{

    
   public String armarInsert(ObjetoPersistente obj) {
        String insert;
        SemaforoAgente semaforo = (SemaforoAgente) obj;

        insert = "INSERT INTO semaforo (OIDSemaforo, FechaInstalacion, NumeroSerie, OIDUbicacion, OIDTipoSemaforo, OIDEsquina, OIDOrientacion)"
                 + "VALUES '" + semaforo.getOid() + "', '" + semaforo.getfechaInstalacion() + "', '" + semaforo.getnumeroSerie() + "', '" + semaforo.getnumeroSerie() + "', '" + semaforo.getOidUbicacion() + "', '" + semaforo.getOidTipoSemaforo() + "', '" + semaforo.getOidEsquina() + "', '" + semaforo.getOidOrientacion() + "'";

         return insert;
   }

    public String armarSelect(List<Criterio> criterios) {

        String select;
        boolean addjoin = false;//se activa cuando es necesario hacer join para la busqueda N a N
        
        select = "SELECT * FROM semaforo";

        
        String condicion = "";
        
        while(!criterios.isEmpty()){
            condicion = condicion + " WHERE ";
            for(int i = 0; i < criterios.size(); i++){
                if(i>0){
                    condicion = condicion + " AND ";
                }
                condicion = condicion + " semaforo."    + criterios.get(i).getAtributo() + " " + criterios.get(i).getOperador() + " '" + criterios.get(i).getValor() + "'";
            }
            
            select = select + condicion;
        }
              
        return  select;

    }

    public String armarSelectOid(String oid) {

        String selectOid;
        

        return selectOid = "SELECT * FROM semaforo where OIDSemaforo = '" + oid + "'";
    }

    public String armarUpdate(ObjetoPersistente obj) {

        String update;

        SemaforoAgente semaforo = (SemaforoAgente) obj;
        
        update = "UPDATE semaforo SET"
                + "OIDSemaforo = '" + semaforo.getOid() + "' "
                + "FechaInstalacion ='" + semaforo.getfechaInstalacion() + "'"
                + "NumeroSerie ='" + semaforo.getnumeroSerie() + "'"
                + "OIDUbicacion ='" + semaforo.getOidUbicacion() + "' "
                + "OIDTipoSemaforo ='" + semaforo.getTipoSemaforo() + "'"
                + "OIDEsquina ='" + semaforo.getOidEsquina() +"'"
                + "OIDOrientacion ='" + semaforo.getOidOrientacion() + "'"
                + "OIDModelo ='" + semaforo.getOidModelo() + "'";


        return update;
    }

    public void guardarObjetoCompuesto(ObjetoPersistente obj) {
    }

    public List<ObjetoPersistente> convertirRegistrosAObjetos(ResultSet rs) {

    List<ObjetoPersistente> nuevosObjetos = new ArrayList<ObjetoPersistente>();
        try {
            while (rs.next()) {
                SemaforoAgente nuevoSemaforo = (SemaforoAgente) FabricaEntidades.getInstancia().crearEntidad("Semaforo");

                nuevoSemaforo.setIsNuevo(false);
                nuevoSemaforo.setOid(rs.getString("OIDSemaforo"));
                nuevoSemaforo.setOidEsquina(rs.getString("OIDEsquina"));
                nuevoSemaforo.setEsquinaBuscado(false);
                nuevoSemaforo.setOidModelo(rs.getString("OIDModelo"));
                nuevoSemaforo.setModeloBuscado(false);
                nuevoSemaforo.setOidOrientacion(rs.getString("OIDOrientacion"));
                nuevoSemaforo.setOrientacionBuscado(false);
                nuevoSemaforo.setOidTipoSemaforo(rs.getString("OIDTipoSemaforo"));
                nuevoSemaforo.setTipoSemaforoBuscado(false);
                nuevoSemaforo.setOidUbicacion(rs.getString("OIDUbicacion"));
                nuevoSemaforo.setUbicacionBuscado(false);
                try {
                    nuevoSemaforo.setfechaInstalacion(FormateadorFechas.getInstancia().StringAFecha(rs.getString("FechaInstalacion")));
                } catch (ParseException ex) {
                    Logger.getLogger(IntermediarioPersistenciaSemaforo.class.getName()).log(Level.SEVERE, null, ex);
                }
                nuevoSemaforo.setnumeroSerie(rs.getString("NumeroSerie"));

                nuevosObjetos.add(nuevoSemaforo);
                                   }
        } catch (SQLException ex) {
            Logger.getLogger(IntermediarioPersistenciaSemaforo.class.getName()).log(Level.SEVERE, null, ex);
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

