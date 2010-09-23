    /*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia.intermediarios;

import Persistencia.Entidades.CasoAgente;
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
        DenunciaAgente denuncia = (DenunciaAgente) obj;

        insert = "INSERT INTO denuncia (OIDCaso, CodigoDenuncia, Prioridad)"
                + "values '" + denuncia.getOid() + "' ,'" + denuncia.getcodigoDenuncia() + "' ,'" + denuncia.getprioridad() + "' ";

        return insert;
    }

    public String armarSelect(List<Criterio> criterios) {

        String select;

        select = "SELECT * FROM denuncia";

        if (criterios.get(0).getAtributo().equals("Reclamo")) {
            String join = "JOIN reclamo ON reclamo.OIDDenuncia = denuncia.OIDDenuncia WHERE reclamo.OIDCaso = '" + criterios.get(0).getValor() + "'";
            select = select + join;
        } else if (!criterios.isEmpty()) {
            select = select + " WHERE ";

            for (int i = 0; i < criterios.size(); i++) {
                if (i > 0) {
                    select = select + " AND ";
                }

                select = select + "denuncia." + criterios.get(i).getAtributo() + " " + criterios.get(i).getOperador() + " '" + criterios.get(i).getValor() + "'";
            }
        }

        return select;
    }

    public String armarSelectOid(String oid) {

        String selectOid;

        return selectOid = "SELECT * FROM denuncia where OIDDenuncia = '" + oid + "'";
    }

    public String armarUpdate(ObjetoPersistente obj) {

        String update;
        DenunciaAgente denuncia = (DenunciaAgente) obj;

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
                nuevaDenuncia.setOid(rs.getString("OIDCaso"));
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
    }

    @Override
    public void buscarObjRelacionados(ObjetoPersistente obj) {
        List<Criterio> listaCriterios = new ArrayList<Criterio>();
        listaCriterios.add(FabricaCriterios.getInstancia().crearCriterio("Denuncia", "=", obj.getOid()));

        for (SuperDruperInterfaz fallaTecnica : FachadaInterna.getInstancia().buscar("FallaTecnica", listaCriterios)) {
            ((DenunciaAgente) obj).addOidFallaTecnica(((ObjetoPersistente) fallaTecnica).getOid());
        }

    }

    @Override
    public void setearDatosPadre(ObjetoPersistente objPer) {
        CasoAgente padre = (CasoAgente) FachadaInterna.getInstancia().buscar("Caso", objPer.getOid());

        ((CasoAgente) objPer).setOidDenunciante(padre.getOidDenunciante());
        ((CasoAgente) objPer).setDenuncianteBuscado(false);
        ((CasoAgente) objPer).setOidOperador(padre.getOidOperador());
        ((CasoAgente) objPer).setOperadorBuscado(false);
        ((CasoAgente) objPer).setfechacaso(padre.getfechacaso());
        ((CasoAgente) objPer).settipocaso(padre.gettipocaso());
        ((CasoAgente) objPer).setOidSemaforo(padre.getOidSemaforo());

    }
}
