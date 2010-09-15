/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Persistencia.Entidades;

import Persistencia.ExpertosPersistencia.FachadaInterna;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author diego
 */
public class CasoAgente implements Caso{

    private CasoImplementacion implementacion;
    private String oidOperador;

    public Date getfechacaso() {
        return implementacion.getfechacaso();
    }

    public int gettipocaso() {
        return implementacion.gettipocaso();
    }

    public void setfechacaso(Date newVal) {
        implementacion.setfechacaso(newVal);
    }

    public void settipocaso(int newVal) {
        implementacion.settipocaso(newVal);
    }

    public Operador getOperador() {

        List<Operador> op = new ArrayList<Operador>();
        op.add(implementacion.getOperador());
        if (op.isEmpty())
            FachadaInterna.getInstancia().buscar("Operador", oidOperador);
    }

    public void setOperador(Operador operador) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Semaforo getSemaforo() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setSemaforo(Semaforo semaforo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Problema getProblema() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setProblema(Problema problema) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Denunciante getDenunciante() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void setDenunciante(Denunciante denunciante) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    /**
     * @return the oidOperador
     */
    public String getOidOperador() {
        return oidOperador;
    }

    /**
     * @param oidOperador the oidOperador to set
     */
    public void setOidOperador(String oidOperador) {
        this.oidOperador = oidOperador;
    }

}
