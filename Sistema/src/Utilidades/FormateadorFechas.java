/*
 * Clase para formatear fechas
 */
package Utilidades;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Bicentenario
 */
public class FormateadorFechas {

    private static FormateadorFechas instancia;
    private SimpleDateFormat format_dd_MM_yyyy = new SimpleDateFormat("dd/MM/yyyy");
    private SimpleDateFormat format_yyyy_MM_dd = new SimpleDateFormat("yyyy/MM/dd");
    private SimpleDateFormat StringAFecha = new SimpleDateFormat();


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

    public Date StringAFecha(String fecha) throws ParseException{
        return StringAFecha.parse(fecha);
    }


}
