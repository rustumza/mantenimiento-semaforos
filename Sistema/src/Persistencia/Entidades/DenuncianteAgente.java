/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia.Entidades;

import Persistencia.ExpertosPersistencia.FachadaInterna;

/**
 *
 * @author diego
 */
public class DenuncianteAgente implements Denunciante {

    private DenuncianteImplementacion implementacion;
    private String oidPersonaPadron;

    public String getcelular() {
        return getImplementacion().getcelular();
    }

    public String getdomicilio() {
        return getImplementacion().getdomicilio();
    }

    public String getemail() {
        return getImplementacion().getemail();
    }

    public String gettelefonofijo() {
        return getImplementacion().gettelefonofijo();
    }

    public void setcelular(String newVal) {
        getImplementacion().setcelular(newVal);
    }

    public void setdomicilio(String newVal) {
        getImplementacion().setdomicilio(newVal);
    }

    public void setemail(String newVal) {
        getImplementacion().setemail(newVal);
    }

    public void settelefonofijo(String newVal) {
        getImplementacion().settelefonofijo(newVal);
    }

    public PersonaPadron getPersonaPadron() {
        if (getImplementacion().getPersonaPadron() == null) {
            implementacion.setPersonaPadron((PersonaPadron) FachadaInterna.getInstancia().buscar("PersonaPadron", oidPersonaPadron));
        }
        return getImplementacion().getPersonaPadron();
    }

    public void setPersonaPadron(PersonaPadron personaPadron) {
        getImplementacion().setPersonaPadron(personaPadron);
    }

    /**
     * @return the oidPersonaPadron
     */
    public String getOidPersonaPadron() {
        return oidPersonaPadron;
    }

    /**
     * @param oidPersonaPadron the oidPersonaPadron to set
     */
    public void setOidPersonaPadron(String oidPersonaPadron) {
        this.oidPersonaPadron = oidPersonaPadron;
    }

    /**
     * @return the implementacion
     */
    public DenuncianteImplementacion getImplementacion() {
        return implementacion;
    }

    /**
     * @param implementacion the implementacion to set
     */
    public void setImplementacion(DenuncianteImplementacion implementacion) {
        this.implementacion = implementacion;
    }
}
