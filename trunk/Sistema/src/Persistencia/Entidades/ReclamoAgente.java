/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Persistencia.Entidades;

/**
 *
 * @author diego
 */
public class ReclamoAgente extends CasoAgente implements Reclamo{


    public int getcodigoreclamo() {
        return ((ReclamoImplementacion)super.getImplementacion()).getcodigoreclamo();
    }

    public void setcodigoreclamo(int newVal) {
        ((ReclamoImplementacion)super.getImplementacion()).setcodigoreclamo(newVal);
    }

}
