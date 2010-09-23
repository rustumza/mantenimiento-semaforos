/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package InterfacesGraficas;

/**
 *
 * @author rustu
 */
public class ChuckNorrisControlador {
    
    PantallaPrincipal pantPrinc;
    ControladorAtenderReclamoPorDesperfecto contAtendRecl;
    ControladorConsultarAvanceDeReclamo contConsAvancRec;
    ControladorConsultarOrdenesPendientes contConsOrdPend;
    ControladorEjecutarOrdenesTrabajo contEjecOrdTrab;


    public ChuckNorrisControlador(PantallaPrincipal pantPrinci){
        this.pantPrinc=pantPrinci;
        
    }


    public void iniciarCUAtenderReclamoPorDesperfecto(){
        pantPrinc.setVisible(false);
        contAtendRecl=new ControladorAtenderReclamoPorDesperfecto();
        contAtendRecl.iniciar();


    }


    public void iniciarCUConsultarAvanceDeReclamo(){
        pantPrinc.setVisible(false);
        contConsAvancRec = new ControladorConsultarAvanceDeReclamo();
        contConsAvancRec.iniciar();

    }


    public void iniciarCUConsultarOrdenesPendientes(){
        pantPrinc.setVisible(false);
        contConsOrdPend = new ControladorConsultarOrdenesPendientes();
        contConsOrdPend.iniciar();


    }


    public void iniciarCUEjecutarOrdenesPendientes(){

        pantPrinc.setVisible(false);
        contEjecOrdTrab = new ControladorEjecutarOrdenesTrabajo();
        contEjecOrdTrab.iniciar();

    }
}
