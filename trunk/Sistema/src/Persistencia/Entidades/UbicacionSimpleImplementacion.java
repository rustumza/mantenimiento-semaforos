package Persistencia.Entidades;

/**
 * @author Bicentenario
 * @version 1.0
 * @created 14-Sep-2010 06:52:19 p.m.
 */
public class UbicacionSimpleImplementacion extends UbicacionImplementacion implements UbicacionSimple{

	private int altura;
	private int codigoUbicacionSimple;
	private Calle calle;

	public UbicacionSimpleImplementacion(){

	}

	
	   public int getaltura() {
        return altura;
    }

    public int getcodigoUbicacionSimple() {
        return codigoUbicacionSimple;
    }

    /**
     *
     * @param newVal
     */
    public void setaltura(int newVal) {
        altura = newVal;
    }

    /**
     *
     * @param newVal
     */
    public void setcodigoUbicacionSimple(int newVal) {
        codigoUbicacionSimple = newVal;
    }

    /**
     * @return the calle
     */
    public Calle getCalle() {
        return calle;
    }

    /**
     * @param calle the calle to set
     */
    public void setCalle(Calle calle) {
        this.calle = calle;
    }

}
