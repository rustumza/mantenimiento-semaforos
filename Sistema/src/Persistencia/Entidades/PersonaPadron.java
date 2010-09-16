/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia.Entidades;

/**
 *
 * @author diego
 */
public interface PersonaPadron extends SuperDruperInterfaz {

    public String getapellido();

    public String getdomicilio();

    public String getnombre();

    public String gettipoDocumento();

    public void setapellido(String newVal);

    public void setdomicilio(String newVal);

    public void setnombre(String newVal);

    public void settipoDocumento(String newVal);

    public String getNroDocumento();

    public void setNroDocumento(String nroDocumento);

    public PersonaPadronEstado getPersonaPadronEstado();

    public void setPersonaPadronEstado(PersonaPadronEstado personaPadronEstado);
}
