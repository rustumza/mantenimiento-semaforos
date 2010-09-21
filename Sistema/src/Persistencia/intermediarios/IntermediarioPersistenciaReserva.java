/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia.intermediarios;

import Persistencia.ExpertosPersistencia.Criterio;
import Persistencia.Entidades.ObjetoPersistente;
import Persistencia.Entidades.ReservaAgente;
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
public class IntermediarioPersistenciaReserva extends IntermediarioRelacional {

    public String armarInsert(ObjetoPersistente obj) {
        String insert;

        return insert = "insert into reserva (OIDReserva, OIDOrdenDeTrabajo, FechaReserva, CodigoReserva) values (OIDReserva, OIDOrdenDeTrabajo, FechaReserva, CodigoReserva)";
    }

    public String armarSelect(List<Criterio> criterios) {
        String select;

        select = "select * from reserva";

        if (!criterios.isEmpty()) {
            select = select + " WHERE ";
            for (int i = 0; i < criterios.size(); i++) {
                if (i > 0) {
                    select = select + " AND ";
                }

                select = select + "reserva." + criterios.get(i).getAtributo() + " " + criterios.get(i).getOperador() + " '" + criterios.get(i).getValor() + "'";
            }
        }
        
        
        return select;

    }

    public String armarSelectOid(String oid) {

        String selectOid;

        return selectOid = "select * from reserva where OIDReserva = " + oid;
    }

    public String armarUpdate(ObjetoPersistente obj) {

        String update;

        return update = "update reserva set OIDReserva =" + ",OIDOrdenDeTrabajo = " + "FechaReserva = " + "CodigoReserva =";

    }

    public void guardarObjetoCompuesto(ObjetoPersistente obj) {
    }

    public List<ObjetoPersistente> convertirRegistrosAObjetos(ResultSet rs) {

        List<ObjetoPersistente> nuevosObjetos = new ArrayList<ObjetoPersistente>();
        try {
            while (rs.next()) {

                ReservaAgente nuevaReserva = (ReservaAgente) FabricaEntidades.getInstancia().crearEntidad("Reserva");
                nuevaReserva.setIsNuevo(false);
                nuevaReserva.setOid(rs.getString("OIDReserva"));
                nuevaReserva.setcodigoreserva(Integer.valueOf(rs.getString("CodigoReserva")));
                try {
                    nuevaReserva.setfecha(FormateadorFechas.getInstancia().getFormat_dd_MM_yyyy().parse(rs.getString("FechaReserva")));
                } catch (ParseException ex) {
                    Logger.getLogger(IntermediarioPersistenciaReserva.class.getName()).log(Level.SEVERE, null, ex);
                }
                nuevaReserva.setReservaElementoTrabajoBuscado(false);

                nuevosObjetos.add(nuevaReserva);

            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }

        return nuevosObjetos;
    }
}
