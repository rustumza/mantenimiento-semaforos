package Persistencia.ExpertosPersistencia;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author diego
 */
public class Criterio {

    public static final int AND = 1;
    public static final int OR = 2;
    public static final int LIKE = 3;
    private String atributo;
    private String operador;
    private String valor;
    private String tipo;

    /**
     * @return the atributo
     */
    public String getAtributo() {
        return atributo;
    }

    /**
     * @param atributo the atributo to set
     */
    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }

    /**
     * @return the operador
     */
    public String getOperador() {
        return operador;
    }

    /**
     * @param operador the operador to set
     */
    public void setOperador(String operador) {
        this.operador = operador;
    }

    /**
     * @return the valor
     */
    public String getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(String valor) {
        this.valor = valor;

    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param selecTipo opcion para setear los distintos tipos
     */
    public void setTipo(int selecTipo) {
        switch (selecTipo) {
            case AND:
                tipo = " AND ";
                break;
            case OR:
                tipo = " OR ";
                break;
            case LIKE:
                tipo = " LIKE ";
                break;
            default:
                break;
        }
    }
}
