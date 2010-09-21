/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia.intermediarios;

import Persistencia.Entidades.OrdenTrabajoAgente;
import Persistencia.ExpertosPersistencia.Criterio;
import Persistencia.Entidades.ObjetoPersistente;
import Persistencia.Entidades.OrdenDeReparacionAgente;
import Persistencia.Fabricas.FabricaEntidades;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eduardo
 */
public class IntermediarioPersistenciaOrdenReparacion extends IntermediarioPersistenciaOrdenDeTrabajo{

    @Override
    public String armarInsert(ObjetoPersistente obj) {

        String insert;

        OrdenDeReparacionAgente ordenRep = (OrdenDeReparacionAgente) obj;

        insert = "INSERT INTO ordenreparacion (OIDOrdenTrabajo, OIDDenuncia) "
                + "VALUES ('"+obj.getOid()+"', '"+ordenRep.getOidDenuncia()+"')";
        
        String insertPadre = super.armarInsert(obj);
        
        insert = insertPadre + insert;

        return insert;
    }

    @Override
    public String armarSelect(List<Criterio> criterios) {

        String select;
        select = "SELECT * "
                + "FROM ordenreparacion";

        if (!criterios.isEmpty()) {
            select = select + " WHERE ";
            for (int i = 0; i < criterios.size(); i++) {
                if (i > 0) {
                    select = select + " AND ";
                }

                select = select + "ordenreparacion." + criterios.get(i).getAtributo() + " " + criterios.get(i).getOperador() + " '" + criterios.get(i).getValor() + "'";
            }
        }

        return select;
    }

    @Override
    public String armarSelectOid(String oid) {
        String selectOid;

        selectOid = "SELECT * "
                + "FROM ordenreparacion "
                + "WHERE OIDOrdenTrabajo = '"+oid+"'";

        return selectOid;
    }

    @Override
    public String armarUpdate(ObjetoPersistente obj) {

        String update;
        OrdenDeReparacionAgente ordenRep = (OrdenDeReparacionAgente) obj;

        update = "UPDATE ordenreparacion "
                + "SET OIDOrdenTrabajo = '"+ordenRep.getOid()+"', "
                + "OIDDenuncia = '"+ordenRep.getOidDenuncia()+"'";

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
        List<ObjetoPersistente> listaPadres = super.convertirRegistrosAObjetos(rs);

        int i = 0;
        try {
            while (rs.next()) {

                OrdenDeReparacionAgente nuevaOrdenRep = (OrdenDeReparacionAgente) FabricaEntidades.getInstancia().crearEntidad("OrdenDeReparacion");

                nuevaOrdenRep.setPadre((OrdenTrabajoAgente) listaPadres.get(i));

                nuevaOrdenRep.setIsNuevo(false);
                nuevaOrdenRep.setOid(rs.getString("OIDOrdenDeTrabajo"));
                nuevaOrdenRep.setOidDenuncia(rs.getString("OIDDenuncia"));
                nuevaOrdenRep.setDenunciaBuscado(false);
                nuevaOrdenRep.setInformeReparacionBuscado(false);

                nuevosObjetos.add(nuevaOrdenRep);
                i++;

            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return nuevosObjetos;


    }

    @Override
    public void guardarObjetosRelacionados(ObjetoPersistente obj) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void buscarObjRelacionados(ObjetoPersistente obj) {
        super.buscarObjRelacionados(obj);
    }
}

