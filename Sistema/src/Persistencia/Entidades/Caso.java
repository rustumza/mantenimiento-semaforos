/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia.Entidades;

import java.util.Date;

/**
 *
 * @author diego
 */
public interface Caso extends SuperDruperInterfaz {

    public Date getfechacaso();

    public int gettipocaso();

    public void setfechacaso(Date newVal);

    public void settipocaso(int newVal);

    public Operador getOperador();

    public void setOperador(Operador operador);

    public Semaforo getSemaforo();

    public void setSemaforo(Semaforo semaforo);

    public Problema getProblema();

    public void setProblema(Problema problema);

    public Denunciante getDenunciante();

    public void setDenunciante(Denunciante denunciante);
}
