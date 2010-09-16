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
public class PersonaPadronAgente implements PersonaPadron{

    private PersonaPadronImplementacion implementacion;
    private String oidPersonaPadronEstado;
    //variable para saber si el objeto realacionado ya ha sido buscado en la BD
    private boolean personaPadronEstadoBuscado;

    public String getapellido() {
        return implementacion.getapellido();
    }

    public String getdomicilio() {
        return implementacion.getdomicilio();
    }

    public String getnombre() {
        return implementacion.getnombre();
    }

    public String gettipoDocumento() {
        return implementacion.gettipoDocumento();
    }

    public void setapellido(String newVal) {
        implementacion.setapellido(newVal);
    }

    public void setdomicilio(String newVal) {
        implementacion.setdomicilio(newVal);
    }

    public void setnombre(String newVal) {
        implementacion.setnombre(newVal);
    }

    public void settipoDocumento(String newVal) {
        implementacion.settipoDocumento(newVal);
    }

    public String getNroDocumento() {
        return implementacion.getNroDocumento();
    }

    public void setNroDocumento(String nroDocumento) {
        implementacion.setNroDocumento(nroDocumento);
    }

    public PersonaPadronEstado getPersonaPadronEstado() {
        if(isPersonaPadronEstadoBuscado()==false)
            implementacion.setPersonaPadronEstado((PersonaPadronEstado)FachadaInterna.getInstancia().buscar("PersonaPadronEstado", oidPersonaPadronEstado));
        return implementacion.getPersonaPadronEstado();
    }

    public void setPersonaPadronEstado(PersonaPadronEstado personaPadronEstado) {
        implementacion.setPersonaPadronEstado(personaPadronEstado);
    }

    /**
     * @return the implementacion
     */
    public PersonaPadronImplementacion getImplementacion() {
        return implementacion;
    }

    /**
     * @param implementacion the implementacion to set
     */
    public void setImplementacion(PersonaPadronImplementacion implementacion) {
        this.implementacion = implementacion;
    }

    /**
     * @return the oidPersonaPadronEstado
     */
    public String getOidPersonaPadronEstado() {
        return oidPersonaPadronEstado;
    }

    /**
     * @param oidPersonaPadronEstado the oidPersonaPadronEstado to set
     */
    public void setOidPersonaPadronEstado(String oidPersonaPadronEstado) {
        this.oidPersonaPadronEstado = oidPersonaPadronEstado;
    }

    /**
     * @return the personaPadronEstadoBuscado
     */
    public boolean isPersonaPadronEstadoBuscado() {
        return personaPadronEstadoBuscado;
    }

    /**
     * @param personaPadronEstadoBuscado the personaPadronEstadoBuscado to set
     */
    public void setPersonaPadronEstadoBuscado(boolean personaPadronEstadoBuscado) {
        this.personaPadronEstadoBuscado = personaPadronEstadoBuscado;
    }

}
