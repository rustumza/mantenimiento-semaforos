/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia.Entidades;

import Persistencia.ExpertosPersistencia.FachadaInterna;
import java.util.Date;

/**
 *
 * @author diego
 */
public class CasoAgente implements Caso {

    private CasoImplementacion implementacion;
    private String oidOperador;
    private String oidSemaforo;
    private String oidProblema;
    private String oidDenunciante;

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
        if (implementacion.getOperador() == null) {
            implementacion.setOperador((Operador) FachadaInterna.getInstancia().buscar("Operador", oidOperador));
        }
        return implementacion.getOperador();
    }

    public void setOperador(Operador operador) {
        implementacion.setOperador(operador);
    }

    public Semaforo getSemaforo() {
        if (implementacion.getSemaforo() == null) {
            implementacion.setSemaforo((Semaforo) FachadaInterna.getInstancia().buscar("Semaforo", getOidSemaforo()));
        }
        return implementacion.getSemaforo();
    }

    public void setSemaforo(Semaforo semaforo) {
        implementacion.setSemaforo(semaforo);

    }

    public Problema getProblema() {
        if (implementacion.getProblema() == null) {
            implementacion.setProblema((Problema) FachadaInterna.getInstancia().buscar("Problema", oidProblema));
        }
        return implementacion.getProblema();
    }

    public void setProblema(Problema problema) {
        implementacion.setProblema(problema);
    }

    public Denunciante getDenunciante() {
        if (implementacion.getDenunciante() == null) {
            implementacion.setDenunciante((Denunciante) FachadaInterna.getInstancia().buscar("Denunciante", getOidDenunciante()));
        }
        return implementacion.getDenunciante();
    }

    public void setDenunciante(Denunciante denunciante) {
        implementacion.setDenunciante(denunciante);
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

    /**
     * @return the oidSemaforo
     */
    public String getOidSemaforo() {
        return oidSemaforo;
    }

    /**
     * @param oidSemaforo the oidSemaforo to set
     */
    public void setOidSemaforo(String oidSemaforo) {
        this.oidSemaforo = oidSemaforo;
    }

    /**
     * @return the oidProblema
     */
    public String getOidProblema() {
        return oidProblema;
    }

    /**
     * @param oidProblema the oidProblema to set
     */
    public void setOidProblema(String oidProblema) {
        this.oidProblema = oidProblema;
    }

    /**
     * @return the oidDenunciante
     */
    public String getOidDenunciante() {
        return oidDenunciante;
    }

    /**
     * @param oidDenunciante the oidDenunciante to set
     */
    public void setOidDenunciante(String oidDenunciante) {
        this.oidDenunciante = oidDenunciante;
    }
}
