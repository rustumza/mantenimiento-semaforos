/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Persistencia.Entidades;

/**
 *
 * @author RUSTU
 */
public interface Interseccion extends SuperDruperInterfaz {

    public int getcodigoInterseccion();

    public void setcodigoInterseccion(int newVal);

    public Calle getCalle();

    public void setCalle(Calle calle);
}
