package Persistencia.Entidades;

/**
 * @author Bicentenario
 * @version 1.0
 * @created 14-Sep-2010 06:52:16 p.m.
 */
public class PersonaPadronImplementacion implements PersonaPadron{

    private String apellido;
    private String domicilio;
    private String nombre;
    private String nroDocumento;
    private String tipoDocumento;
    private PersonaPadronEstado personaPadronEstado;

    public PersonaPadronImplementacion() {
    }

    public String getapellido() {
        return apellido;
    }

    public String getdomicilio() {
        return domicilio;
    }

    public String getnombre() {
        return nombre;
    }

    public String gettipoDocumento() {
        return tipoDocumento;
    }

    /**
     *
     * @param newVal
     */
    public void setapellido(String newVal) {
        apellido = newVal;
    }

    /**
     *
     * @param newVal
     */
    public void setdomicilio(String newVal) {
        domicilio = newVal;
    }

    /**
     *
     * @param newVal
     */
    public void setnombre(String newVal) {
        nombre = newVal;
    }

    /**
     *
     * @param newVal
     */
    public void settipoDocumento(String newVal) {
        tipoDocumento = newVal;
    }

    /**
     * @return the nroDocumento
     */
    public String getNroDocumento() {
        return nroDocumento;
    }

    /**
     * @param nroDocumento the nroDocumento to set
     */
    public void setNroDocumento(String nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    /**
     * @return the personaPadronEstado
     */
    public PersonaPadronEstado getPersonaPadronEstado() {
        return personaPadronEstado;
    }

    /**
     * @param personaPadronEstado the personaPadronEstado to set
     */
    public void setPersonaPadronEstado(PersonaPadronEstado personaPadronEstado) {
        this.personaPadronEstado = personaPadronEstado;
    }
}
