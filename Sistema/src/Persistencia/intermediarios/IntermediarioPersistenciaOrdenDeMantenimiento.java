/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia.intermediarios;

import Persistencia.Entidades.OrdenTrabajoAgente;
import Persistencia.ExpertosPersistencia.Criterio;
import Persistencia.Entidades.ObjetoPersistente;
import Persistencia.Entidades.OrdenDeMantenimientoAgente;
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
public class IntermediarioPersistenciaOrdenDeMantenimiento extends IntermediarioPersistenciaOrdenDeTrabajo {

    @Override
    public String armarInsert(ObjetoPersistente obj) {
        String insert;

        OrdenDeMantenimientoAgente ordenMant = (OrdenDeMantenimientoAgente) obj;

        String insertPadre = super.armarInsert(obj);

        insert = "INSERT INTO ordendemantenimiento (OIDOrdenDeTrabajo, OIDSemaforo, CodigoOrdenMantenimiento, OIDFichaMantenimiento) "
                + "VALUES ('"+ordenMant.getOid()+"', '"+ordenMant.getOidSemaforo()+"', "+ordenMant.getcodigoordenmantenimiento()+", '"+ordenMant.getOidFichaMantenimiento()+"')";
        insert = insertPadre + insert;

        return insert;
    }

    @Override
    public String armarSelect(List<Criterio> criterios) {
        String select;
        select = "SELECT * "
                + "FROM ordendemantenimiento";

        if (!criterios.isEmpty()) {
            select = select + " WHERE ";
            for (int i = 0; i < criterios.size(); i++) {
                if (i > 0) {
                    select = select + " AND ";
                }

                select = select + "ordendemantenimiento." + criterios.get(i).getAtributo() + " " + criterios.get(i).getOperador() + " '" + criterios.get(i).getValor() + "'";
            }
        }

        return select;

    }

    @Override
    public String armarSelectOid(String oid) {

        String selectOid;

        selectOid = "SELECT * "
                + "FROM ordendemantenimiento "
                + "WHERE OIDOrdenDeTrabajo = '"+oid+"'";

        return selectOid;
    }

    @Override
    public String armarUpdate(ObjetoPersistente obj) {

        String update;
        OrdenDeMantenimientoAgente ordenMant = (OrdenDeMantenimientoAgente) obj;

        update = "UPDATE ordendemantenimiento "
                + "SET OIDOrdenDeTrabajo = '"+ordenMant.getOid()+"', "
                + "OIDSemaforo = '"+ordenMant.getOidSemaforo()+"', "
                + "CodigoOrdenMantenimiento = "+ordenMant.getcodigoordenmantenimiento()+ ", "
                + "OIDFichaMantenimiento = '"+ordenMant.getOidFichaMantenimiento()+"'";

        String updatePadre = super.armarUpdate(obj);

        update = updatePadre + update;

        return update;

    }

    @Override
    public void guardarObjetoCompuesto(ObjetoPersistente obj) {
    }

    @Override
    public List<ObjetoPersistente> convertirRegistrosAObjetos(ResultSet rs) {

        List<ObjetoPersistente> nuevosObjetos = new ArrayList<ObjetoPersistente>();

        try {
            while (rs.next()) {
                OrdenDeMantenimientoAgente nuevaOrdenDeMantenimiento = (OrdenDeMantenimientoAgente) FabricaEntidades.getInstancia().crearEntidad("OrdenDeMantenimiento");

                nuevaOrdenDeMantenimiento.setIsNuevo(false);
                nuevaOrdenDeMantenimiento.setOid(rs.getString("OIDOrdenDeTrabajo"));
                nuevaOrdenDeMantenimiento.setOidSemaforo(rs.getString("OIDSemaforo"));
                nuevaOrdenDeMantenimiento.setSemaforoBuscado(false);
                nuevaOrdenDeMantenimiento.setInformeMantenimientoBuscado(false);
                nuevaOrdenDeMantenimiento.setOidFichaMantenimiento(rs.getString("OIDFichaMantenimiento"));
                nuevaOrdenDeMantenimiento.setFichaMantenimientoBuscado(false);
                
                nuevosObjetos.add(nuevaOrdenDeMantenimiento);

            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return nuevosObjetos;
    }

    @Override
    public void buscarObjRelacionados(ObjetoPersistente obj){
        super.buscarObjRelacionados(obj);
    }
}
