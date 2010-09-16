/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia.Entidades;

/**
 *
 * @author diego
 */
public interface UbicacionSimple extends SuperDruperInterfaz {

    public int getaltura();

    public int getcodigoUbicacionSimple();

    public void setaltura(int newVal);

    public void setcodigoUbicacionSimple(int newVal);

    public Calle getCalle();

    public void setCalle(Calle calle);
}
