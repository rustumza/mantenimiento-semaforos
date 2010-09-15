package Persistencia.Entidades;

/**
 * @author Bicentenario
 * @version 1.0
 * @created 14-Sep-2010 06:52:12 p.m.
 */
public class DenunciaImplementacion extends CasoImplementacion implements Denuncia{

    private int codigoDenuncia;
    private float prioridad;
    private Reclamo reclamo;
    private DenunciaEstado denunciaEstado;
    private FallaTecnica fallaTecnica;

    public DenunciaImplementacion() {
    }

    public int getcodigoDenuncia() {
        return codigoDenuncia;
    }

    public float getprioridad() {
        return prioridad;
    }

    /**
     *
     * @param newVal
     */
    public void setcodigoDenuncia(int newVal) {
        codigoDenuncia = newVal;
    }

    /**
     *
     * @param newVal
     */
    public void setprioridad(float newVal) {
        prioridad = newVal;
    }

    /**
     * @return the reclamo
     */
    public Reclamo getReclamo() {
        return reclamo;
    }

    /**
     * @param reclamo the reclamo to set
     */
    public void setReclamo(Reclamo reclamo) {
        this.reclamo = reclamo;
    }

    /**
     * @return the denunciaEstado
     */
    public DenunciaEstado getDenunciaEstado() {
        return denunciaEstado;
    }

    /**
     * @param denunciaEstado the denunciaEstado to set
     */
    public void setDenunciaEstado(DenunciaEstado denunciaEstado) {
        this.denunciaEstado = denunciaEstado;
    }

    /**
     * @return the fallaTecnica
     */
    public FallaTecnica getFallaTecnica() {
        return fallaTecnica;
    }

    /**
     * @param fallaTecnica the fallaTecnica to set
     */
    public void setFallaTecnica(FallaTecnica fallaTecnica) {
        this.fallaTecnica = fallaTecnica;
    }
}
