/*
 * Clase para formatear fechas
 */
package Utilidades;

import java.text.SimpleDateFormat;

/**
 *
 * @author Bicentenario
 */
public class FormateadorFechas {

    public static FormateadorFechas instancia;
    private SimpleDateFormat format_dd_MM_yyyy = new SimpleDateFormat("dd/MM/yyyy");
    private SimpleDateFormat format_yyyy_MM_dd = new SimpleDateFormat("yyyy/MM/dd");

    public static FormateadorFechas getInstancia(){
        if(instancia==null)
            instancia = new FormateadorFechas();
        return instancia;
    }

    /**
     * @return the format_dd_MM_yyyy
     */
    public SimpleDateFormat getFormat_dd_MM_yyyy() {
        return format_dd_MM_yyyy;
    }

   
    public SimpleDateFormat getFormat_yyyy_MM_dd() {
        return format_yyyy_MM_dd;
    }


}
