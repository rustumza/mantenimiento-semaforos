/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia.Entidades;

/**
 *
 * @author diego
 */
public interface Denuncia extends Caso {

    public int getcodigoDenuncia();

    public float getprioridad();

    public void setcodigoDenuncia(int newVal);

    public void setprioridad(float newVal);

    public Reclamo getReclamo();

    public void setReclamo(Reclamo reclamo);

    public DenunciaEstado getDenunciaEstado();

    public void setDenunciaEstado(DenunciaEstado denunciaEstado);

    public FallaTecnica getFallaTecnica();

    public void setFallaTecnica(FallaTecnica fallaTecnica);
}
