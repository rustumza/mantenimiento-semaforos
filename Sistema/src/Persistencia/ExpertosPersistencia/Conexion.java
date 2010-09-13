package Persistencia.ExpertosPersistencia;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author diego
 */
public class Conexion {

    Connection conn = null;
    static Conexion instancia = null;

    public static Conexion getInstance() {
        if (instancia == null) {
            instancia = new Conexion();
        }
        return instancia;
    }

    Conexion() {
        conn = estableceConexion();
        try {
            conn.setAutoCommit(false);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }

    public final Connection estableceConexion() {

        if (conn != null) {
            return conn;
        }
        try {
            //Class.forName("org.postgresql.Driver");
            String urlConexion = "jdbc:postgresql://localhost:5432/prueba_persistencia";
            String usr = "postgres";
            String pass = "postgres";
            conn = DriverManager.getConnection(urlConexion, usr, pass);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }

    public int insert(String query) {
        int resultado = 0;

        try {
            resultado = conn.createStatement().executeUpdate(query);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally{
            return resultado;
        }
    }

    public ResultSet select(String query){

        ResultSet rs = null;

        try {
             rs =  conn.createStatement().executeQuery(query);

        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);

        }
        finally{

            return rs;
        }

        
    }

    public void commit() {
        try {
            conn.commit();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }


    public void rollback() {
        try {
            conn.rollback();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void iniciarTransaccion(){
    }

    public void confirmarTransaccion(){
        try{

            conn.commit();
        }catch(SQLException sqle){
            System.out.println(sqle.getMessage());
            System.out.println(sqle.getErrorCode());

        }
    }

    public void deshacerTransaccion(){
        try{
            conn.rollback();
        }catch(SQLException sqle){
            System.out.println(sqle.getMessage());
            System.out.println(sqle.getErrorCode());

        }

    }



}
