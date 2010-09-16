package Persistencia.Entidades;

/**
 * @author Bicentenario
 * @version 1.0
 * @created 14-Sep-2010 06:52:13 p.m.
 */
public class EquipoDeTrabajoImplementacion implements EquipoDeTrabajo{

	private int cargaHorariaMaxPorDia;
	private int codigoEquipo;
	private String nombreEquipo;
	private TrabajadorRol trabajadorRol;

	public EquipoDeTrabajoImplementacion(){

	}

	
	public int getcargaHorariaMaxPorDia(){
		return cargaHorariaMaxPorDia;
	}

	public int getcodigoEquipo(){
		return codigoEquipo;
	}

	public String getnombreEquipo(){
		return nombreEquipo;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setcargaHorariaMaxPorDia(int newVal){
		cargaHorariaMaxPorDia = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setcodigoEquipo(int newVal){
		codigoEquipo = newVal;
	}

	/**
	 * 
	 * @param newVal
	 */
	public void setnombreEquipo(String newVal){
		nombreEquipo = newVal;
	}

    /**
     * @return the trabajadorRol
     */
    public TrabajadorRol getTrabajadorRol() {
        return trabajadorRol;
    }

    /**
     * @param trabajadorRol the trabajadorRol to set
     */
    public void setTrabajadorRol(TrabajadorRol trabajadorRol) {
        this.trabajadorRol = trabajadorRol;
    }

}
