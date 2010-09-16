package Persistencia.Entidades;

/**
 * @author Bicentenario
 * @version 1.0
 * @created 14-Sep-2010 06:52:18 p.m.
 */
public class TrabajoImplementacion implements Trabajo {

	private int codigoTrabajo;
	private int tiempoEstimadoTrabajo;
	private int tipotrabajo;
	private TrabajoElementoNecesario trabajoElementoNecesario;
	private OrdenTrabajo ordenTrabajo;

	public TrabajoImplementacion(){

	}

	
	public int getcodigoTrabajo(){
		return codigoTrabajo;
	}

	public int gettiempoEstimadoTrabajo(){
		return tiempoEstimadoTrabajo;
	}

	public int gettipotrabajo(){
		return tipotrabajo;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setcodigoTrabajo(int newVal){
		codigoTrabajo = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void settiempoEstimadoTrabajo(int newVal){
		tiempoEstimadoTrabajo = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void settipotrabajo(int newVal){
		tipotrabajo = newVal;
	}

    /**
     * @return the trabajoElementoNecesario
     */
    public TrabajoElementoNecesario getTrabajoElementoNecesario() {
        return trabajoElementoNecesario;
    }

    /**
     * @param trabajoElementoNecesario the trabajoElementoNecesario to set
     */
    public void setTrabajoElementoNecesario(TrabajoElementoNecesario trabajoElementoNecesario) {
        this.trabajoElementoNecesario = trabajoElementoNecesario;
    }

    /**
     * @return the ordenTrabajo
     */
    public OrdenTrabajo getOrdenTrabajo() {
        return ordenTrabajo;
    }

    /**
     * @param ordenTrabajo the ordenTrabajo to set
     */
    public void setOrdenTrabajo(OrdenTrabajo ordenTrabajo) {
        this.ordenTrabajo = ordenTrabajo;
    }

}
