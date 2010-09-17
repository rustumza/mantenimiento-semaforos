package Persistencia.Entidades;

/**
 * @author Bicentenario
 * @version 1.0
 * @created 14-Sep-2010 06:52:15 p.m.
 */
public class InterseccionImplementacion extends UbicacionImplementacion implements Interseccion{

	private Calle calle;

	public InterseccionImplementacion(){

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
