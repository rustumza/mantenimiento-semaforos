/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia.intermediarios;

import Persistencia.ExpertosPersistencia.Criterio;
import Persistencia.Entidades.ObjetoPersistente;
import Persistencia.Entidades.ReservaElementoTrabajoAgente;
import Persistencia.Fabricas.FabricaEntidades;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Eduardo
 */
public class IntermediarioPersistenciaReservaElementoTrabajo extends IntermediarioRelacional{

    public String armarInsert(ObjetoPersistente obj) {
        String insert;

        return insert = "insert into reservaelementotrabajo (OIDReservaElementoTrabajo, OIDElementoTrabajo, OIDReserva, CantidadReservada) values (OIDReservaElementoTrabajo, OIDElementoTrabajo, OIDReserva, CantidadReservada)";
    }

    public String armarSelect(List<Criterio> criterios) {
        String select;

        select = "select * from reservaelementotrabajo";
        
        if (!criterios.isEmpty()) {
            select = select + " WHERE ";
            for (int i = 0; i < criterios.size(); i++) {
                if (i > 0) {
                    select = select + " AND ";
                }

                select = select + "reservaelementotrabajo." + criterios.get(i).getAtributo() + " " + criterios.get(i).getOperador() + " '" + criterios.get(i).getValor() + "'";
            }
        }

        return select;

    }

    public String armarSelectOid(String oid) {

        String selectOid;

        return selectOid = "select * from reservaelementotrabajo where OIDReservaElementoTrabajo = " + oid;
    }

    public String armarUpdate(ObjetoPersistente obj) {

        String update;

        return update = "update reservaelementotrabajo set OIDReservaElementoTrabajo =" + ",OIDElementoTrabajo = " + "OIDReserva = " + "CantidadReservada =";

    }

    public void guardarObjetoCompuesto(ObjetoPersistente obj) {
    }

    public List<ObjetoPersistente> convertirRegistrosAObjetos(ResultSet rs) {

        List<ObjetoPersistente> nuevosObjetos = new ArrayList<ObjetoPersistente>();

        try {
            while (rs.next()) {

                ReservaElementoTrabajoAgente nuevaReservaElementoTrabajo = (ReservaElementoTrabajoAgente) FabricaEntidades.getInstancia().crearEntidad("ReservaElementoTrabajo");

                nuevaReservaElementoTrabajo.setOid(rs.getString("OIDReservaElementoTrabajo"));
                nuevaReservaElementoTrabajo.setIsNuevo(false);
                nuevaReservaElementoTrabajo.setOidElementoTrabajo(rs.getString("OIDReservaElementoTrabajo"));
                nuevaReservaElementoTrabajo.setElementoTrabajoBuscado(false);
                nuevaReservaElementoTrabajo.setcantidadreservada(Integer.valueOf(rs.getString("CantidadReservada")));

                nuevosObjetos.add(nuevaReservaElementoTrabajo);

            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return nuevosObjetos;
    }
}

