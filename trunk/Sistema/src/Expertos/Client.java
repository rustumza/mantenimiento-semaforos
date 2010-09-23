/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Expertos;

import java.net.*;
import java.util.*;

// Clases que guardan relación con el mensaje
import org.apache.soap.*;
// Clases que guardan relación con las llamadas
import org.apache.soap.rpc.*;

public class Client
{
public void confirmarReserva() throws MalformedURLException
{
// Dirección del servicio de Apache SOAP
URL url = new URL(
"http://www.frm.utn.edu.ar:8080/cronossistemastock/servlet/awsconfirmarreserva?wsdl" );
// Identificador del servicio. Proporcionado
// al desplegar este
String urn = "urn:demo:cambio";
// Prepara invocacion del servicio
Call call = new Call();
call.setTargetObjectURI( urn );
call.setMethodName( "getRate" );
call.setEncodingStyleURI( Constants.NS_URI_SOAP_ENC );
// Parametros
Vector params = new Vector();
params.addElement(
new Parameter( "country1",
String.class, "USA", null ) );
params.addElement(
new Parameter( "country2",
String.class, "EUR", null ) );
call.setParams( params );
try
{
System.out.println(
"invocamos service\n"
+ " URL= " + url
+ "\n URN ="
+ urn );
// invocamos
Response response = call.invoke( url, "" );
// Hay fallo?
if( !response.generatedFault() )
{
// NO HAY FALLO
Parameter result = response.getReturnValue();
System.out.println( "Result= " + result.getValue() );
}
else
{
// HAY FALLO
Fault f = response.getFault();
System.err.println( "Fault= "
+ f.getFaultCode() + ", "
+ f.getFaultString() );
}
}
// La llamada ha tenido problemas
catch( SOAPException e )
{
System.err.println(
"SOAPException= " + e.getFaultCode()
+ ", " + e.getMessage() );
}
}
}