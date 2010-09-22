/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia.Entidades;

import Persistencia.ExpertosPersistencia.Criterio;
import Persistencia.ExpertosPersistencia.FachadaInterna;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author diego
 */
public class CasoAgente extends ObjetoPersistente implements Caso  {

    private CasoImplementacion implementacion;
    private String oidOperador;
    private List<String> listaOidSemaforos;
    private String oidProblema;
    private String oidDenunciante;

    /*variables para saber si los atributos han sido buscado en la BD*/
    private boolean operadorBuscado;
    private boolean semaforoBuscado;
    private boolean problemaBuscado;
    private boolean denuncianteBuscado;

    public Date getfechacaso() {
        return getImplementacion().getfechacaso();
    }

    public int gettipocaso() {
        return getImplementacion().gettipocaso();
    }

    public void setfechacaso(Date newVal) {
        getImplementacion().setfechacaso(newVal);
    }

    public void settipocaso(int newVal) {
        getImplementacion().settipocaso(newVal);
    }

    public Operador getOperador() {
        if (isOperadorBuscado() == false) {
            getImplementacion().setOperador((Operador) FachadaInterna.getInstancia().buscar("Operador", oidOperador));
        }
        return getImplementacion().getOperador();
    }

    public void setOperador(Operador operador) {
        getImplementacion().setOperador(operador);
    }

    public List<Semaforo> getSemaforo() {
         
        if (isSemaforoBuscado() == false) {
            List<Criterio> listaDeCriterio = new ArrayList<Criterio>();
            listaDeCriterio.add(FachadaInterna.getInstancia().crearCriterio("Denuncia", "=", super.getOid()));
            List<SuperDruperInterfaz> listaDeInterfaces = FachadaInterna.getInstancia().buscar("Semaforo", listaDeCriterio);
            List<Semaforo> listaDeSemaforo=new ArrayList<Semaforo>();
            for(SuperDruperInterfaz aux : listaDeInterfaces)
                listaDeSemaforo.add((Semaforo) aux);
            getImplementacion().setSemaforo(listaDeSemaforo);
        }
        return getImplementacion().getSemaforo();
    }

    public void setSemaforo(List<Semaforo> semaforo) {
        getImplementacion().setSemaforo(semaforo);

    }

    public List<Problema> getProblema() {
        if (isProblemaBuscado() == false) {
            List<Criterio> listaDeCriterio = new ArrayList<Criterio>();
            listaDeCriterio.add(FachadaInterna.getInstancia().crearCriterio("Denuncia", "=", super.getOid()));
            List<SuperDruperInterfaz> listaDeInterfaces = FachadaInterna.getInstancia().buscar("Semaforo", listaDeCriterio);
            List<Problema> listaDeProblema = new ArrayList<Problema>();
            for(SuperDruperInterfaz aux : listaDeInterfaces)
                listaDeProblema.add((Problema) aux);
            getImplementacion().setProblema(listaDeProblema);
        }
        return getImplementacion().getProblema();
    }

    public void setProblema(List<Problema> problema) {
        getImplementacion().setProblema(problema);
    }

    public Denunciante getDenunciante() {
        if (isDenuncianteBuscado() == false) {
            getImplementacion().setDenunciante((Denunciante) FachadaInterna.getInstancia().buscar("Denunciante", getOidDenunciante()));
        }
        return getImplementacion().getDenunciante();
    }

    public void setDenunciante(Denunciante denunciante) {
        getImplementacion().setDenunciante(denunciante);
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
    public List<String> getOidSemaforo() {
        return listaOidSemaforos;
    }

    /**
     * @param oidSemaforo the oidSemaforo to set
     */
    public void setOidSemaforo(List<String> oidSemaforo) {
        this.listaOidSemaforos = oidSemaforo;
    }

    public void addOidSemaforo(String oidSemaforo){
        if(listaOidSemaforos == null){
            listaOidSemaforos = new ArrayList<String>();
        }

        listaOidSemaforos.add(oidSemaforo);
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

    /**
     * @return the operadorBuscado
     */
    public boolean isOperadorBuscado() {
        return operadorBuscado;
    }

    /**
     * @param operadorBuscado the operadorBuscado to set
     */
    public void setOperadorBuscado(boolean operadorBuscado) {
        this.operadorBuscado = operadorBuscado;
    }

    /**
     * @return the semaforoBuscado
     */
    public boolean isSemaforoBuscado() {
        return semaforoBuscado;
    }

    /**
     * @param semaforoBuscado the semaforoBuscado to set
     */
    public void setSemaforoBuscado(boolean semaforoBuscado) {
        this.semaforoBuscado = semaforoBuscado;
    }

    /**
     * @return the problemaBuscado
     */
    public boolean isProblemaBuscado() {
        return problemaBuscado;
    }

    /**
     * @param problemaBuscado the problemaBuscado to set
     */
    public void setProblemaBuscado(boolean problemaBuscado) {
        this.problemaBuscado = problemaBuscado;
    }

    /**
     * @return the denuncianteBuscado
     */
    public boolean isDenuncianteBuscado() {
        return denuncianteBuscado;
    }

    /**
     * @param denuncianteBuscado the denuncianteBuscado to set
     */
    public void setDenuncianteBuscado(boolean denuncianteBuscado) {
        this.denuncianteBuscado = denuncianteBuscado;
    }

    /**
     * @return the implementacion
     */
    public CasoImplementacion getImplementacion() {
        return implementacion;
    }

    /**
     * @param implementacion the implementacion to set
     */
    public void setImplementacion(CasoImplementacion implementacion) {
        this.implementacion = implementacion;
    }
}
