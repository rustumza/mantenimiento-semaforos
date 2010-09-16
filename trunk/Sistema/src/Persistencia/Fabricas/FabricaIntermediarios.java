package Persistencia.Fabricas;

import Persistencia.intermediarios.IntermediarioPersistencia;
import Persistencia.intermediarios.IntermediarioPersistenciaCalle;
import Persistencia.intermediarios.IntermediarioPersistenciaCasoSemaforo;
import Persistencia.intermediarios.IntermediarioPersistenciaCronogramaMantenimiento;
import Persistencia.intermediarios.IntermediarioPersistenciaDenuncia;
import Persistencia.intermediarios.IntermediarioPersistenciaDenunciaEstado;
import Persistencia.intermediarios.IntermediarioPersistenciaDenunciante;
import Persistencia.intermediarios.IntermediarioPersistenciaDetalleInformeMantenimiento;
import Persistencia.intermediarios.IntermediarioPersistenciaDetalleInformeReparacion;
import Persistencia.intermediarios.IntermediarioPersistenciaElementoTrabajoMantenimiento;
import Persistencia.intermediarios.IntermediarioPersistenciaElementoTrabajoReparacion;
import Persistencia.intermediarios.IntermediarioPersistenciaEquipamiento;
import Persistencia.intermediarios.IntermediarioPersistenciaEquipoDeTrabajo;
import Persistencia.intermediarios.IntermediarioPersistenciaEsquina;
import Persistencia.intermediarios.IntermediarioPersistenciaEstadoDenuncia;
import Persistencia.intermediarios.IntermediarioPersistenciaEstadoElementoTrabajo;
import Persistencia.intermediarios.IntermediarioPersistenciaEstadoFallaTecnica;
import Persistencia.intermediarios.IntermediarioPersistenciaEstadoOrdenTrabajo;
import Persistencia.intermediarios.IntermediarioPersistenciaEstadoPadronPersona;
import Persistencia.intermediarios.IntermediarioPersistenciaFallaTecnica;
import Persistencia.intermediarios.IntermediarioPersistenciaFallaTecnicaDenuncia;
import Persistencia.intermediarios.IntermediarioPersistenciaFichaMantenimiento;
import Persistencia.intermediarios.IntermediarioPersistenciaInformeMantenimiento;
import Persistencia.intermediarios.IntermediarioPersistenciaInformeReparacion;
import Persistencia.intermediarios.IntermediarioPersistenciaInterseccion;
import Persistencia.intermediarios.IntermediarioPersistenciaInterseccionCalle;
import Persistencia.intermediarios.IntermediarioPersistenciaMarca;
import Persistencia.intermediarios.IntermediarioPersistenciaModelo;
import Persistencia.intermediarios.IntermediarioPersistenciaNumerador;
import Persistencia.intermediarios.IntermediarioPersistenciaOperador;
import Persistencia.intermediarios.IntermediarioPersistenciaOrdenDeMantenimiento;
import Persistencia.intermediarios.IntermediarioPersistenciaOrdenReparacion;
import Persistencia.intermediarios.IntermediarioPersistenciaOrdenTrabajoEstado;
import Persistencia.intermediarios.IntermediarioPersistenciaOrientacion;
import Persistencia.intermediarios.IntermediarioPersistenciaPeriodicidad;
import Persistencia.intermediarios.IntermediarioPersistenciaPersonaPadron;
import Persistencia.intermediarios.IntermediarioPersistenciaPersonaPadronEstado;
import Persistencia.intermediarios.IntermediarioPersistenciaPesoDeReclamo;
import Persistencia.intermediarios.IntermediarioPersistenciaProblema;
import Persistencia.intermediarios.IntermediarioPersistenciaProblemaCaso;
import Persistencia.intermediarios.IntermediarioPersistenciaRangoAnios;
import Persistencia.intermediarios.IntermediarioPersistenciaReclamo;
import Persistencia.intermediarios.IntermediarioPersistenciaReparacionTareaRealizada;
import Persistencia.intermediarios.IntermediarioPersistenciaRepuesto;
import Persistencia.intermediarios.IntermediarioPersistenciaReserva;
import Persistencia.intermediarios.IntermediarioPersistenciaReservaElementoTrabajo;
import Persistencia.intermediarios.IntermediarioPersistenciaRol;
import Persistencia.intermediarios.IntermediarioPersistenciaSemaforo;
import Persistencia.intermediarios.IntermediarioPersistenciaTarea;
import Persistencia.intermediarios.IntermediarioPersistenciaTareaFichaMantenimiento;
import Persistencia.intermediarios.IntermediarioPersistenciaTipoSemaforo;
import Persistencia.intermediarios.IntermediarioPersistenciaTrabajador;
import Persistencia.intermediarios.IntermediarioPersistenciaTrabajadorRol;
import Persistencia.intermediarios.IntermediarioPersistenciaTrabajadorTrabajo;
import Persistencia.intermediarios.IntermediarioPersistenciaTrabajoElementoNecesario;
import Persistencia.intermediarios.IntermediarioPersistenciaTrabajoOrdenDeTrabajo;
import Persistencia.intermediarios.IntermediarioPersistenciaUbicacionSimple;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author diego
 */
public class FabricaIntermediarios {

    static FabricaIntermediarios instancia = null;

    private FabricaIntermediarios() {
    }

    public static FabricaIntermediarios getInstancia() {
        if (instancia == null) {
            instancia = new FabricaIntermediarios();
        }
        return instancia;

    }

    public IntermediarioPersistencia crearIntermediario(String nombre) {
        IntermediarioPersistencia intermediario = null;

        if (nombre.equals("Calle")) {
            intermediario = (new IntermediarioPersistenciaCalle());
        }

        if (nombre.equals("Caso")) {
            intermediario = (new IntermediarioPersistenciaCaso());
        }

        if (nombre.equals("CasoSemaforo")) {
            intermediario = (new IntermediarioPersistenciaCasoSemaforo());
        }
        if (nombre.equals("CronogramaMantenimiento")) {
            intermediario = (new IntermediarioPersistenciaCronogramaMantenimiento());
        }

        if (nombre.equals("Denuncia")) {
            intermediario = (new IntermediarioPersistenciaDenuncia());
        }

        if (nombre.equals("DenunciaEstado")) {
            intermediario = (new IntermediarioPersistenciaDenunciaEstado());
        }
        if (nombre.equals("Denunciante")) {
            intermediario = (new IntermediarioPersistenciaDenunciante());
        }

        if (nombre.equals("DetalleInformeMantenimiento")) {
            intermediario = (new IntermediarioPersistenciaDetalleInformeMantenimiento());
        }

        if (nombre.equals("DetalleInformeReparacion")) {
            intermediario = (new IntermediarioPersistenciaDetalleInformeReparacion());
        }
        if (nombre.equals("ElementoTrabajo")) {
            intermediario = (new IntermediarioPersistenciaElementoTrabajo());
        }

        if (nombre.equals("ElementoTrabajoMantenimiento")) {
            intermediario = (new IntermediarioPersistenciaElementoTrabajoMantenimiento());
        }

        if (nombre.equals("ElementoTrabajoReparacion")) {
            intermediario = (new IntermediarioPersistenciaElementoTrabajoReparacion());
        }
        if (nombre.equals("Equipamiento")) {
            intermediario = (new IntermediarioPersistenciaEquipamiento());
        }

        if (nombre.equals("EquipoDeTrabajo")) {
            intermediario = (new IntermediarioPersistenciaEquipoDeTrabajo());
        }

        if (nombre.equals("Esquina")) {
            intermediario = (new IntermediarioPersistenciaEsquina());
        }
        if (nombre.equals("EstadoDenuncia")) {
            intermediario = (new IntermediarioPersistenciaEstadoDenuncia());
        }

        if (nombre.equals("EstadoElementoTrabajo")) {
            intermediario = (new IntermediarioPersistenciaEstadoElementoTrabajo());
        }

        if (nombre.equals("EstadoFallaTecnica")) {
            intermediario = (new IntermediarioPersistenciaEstadoFallaTecnica());
        }
        if (nombre.equals("EstadoOrdenTrabajo")) {
            intermediario = (new IntermediarioPersistenciaEstadoOrdenTrabajo());
        }

        if (nombre.equals("EstadoPadronPersona")) {
            intermediario = (new IntermediarioPersistenciaEstadoPadronPersona());
        }

        if (nombre.equals("FallaTecnica")) {
            intermediario = (new IntermediarioPersistenciaFallaTecnica());
        }
        if (nombre.equals("FallaTecnicaDenuncia")) {
            intermediario = (new IntermediarioPersistenciaFallaTecnicaDenuncia());
        }

        if (nombre.equals("FichaMantenimiento")) {
            intermediario = (new IntermediarioPersistenciaFichaMantenimiento());
        }

        if (nombre.equals("InformeMantenimiento")) {
            intermediario = (new IntermediarioPersistenciaInformeMantenimiento());
        }

        if (nombre.equals("InformeReparacion")) {
            intermediario = (new IntermediarioPersistenciaInformeReparacion());
        }
        
        if (nombre.equals("Interseccion")) {
            intermediario = (new IntermediarioPersistenciaInterseccion());
        }

        if (nombre.equals("InterseccionCalle")) {
            intermediario = (new IntermediarioPersistenciaInterseccionCalle());
        }
        if (nombre.equals("Marca")) {
            intermediario = (new IntermediarioPersistenciaMarca());
        }

        if (nombre.equals("Modelo")) {
            intermediario = (new IntermediarioPersistenciaModelo());
        }

        if (nombre.equals("Numerador")) {
            intermediario = (new IntermediarioPersistenciaNumerador());
        }

        if (nombre.equals("Operador")) {
            intermediario = (new IntermediarioPersistenciaOperador());
        }

        if (nombre.equals("OrdenDeMantenimiento")) {
            intermediario = (new IntermediarioPersistenciaOrdenDeMantenimiento());
        }

        if (nombre.equals("OrdenDeTrabajo")) {
            intermediario = (new IntermediarioPersistenciaOrdenDeTrabajo());
        }

        if (nombre.equals("OrdenReparacion")) {
            intermediario = (new IntermediarioPersistenciaOrdenReparacion());
        }

        if (nombre.equals("OrdenTrabajoEstado")) {
            intermediario = (new IntermediarioPersistenciaOrdenTrabajoEstado());
        }

        if (nombre.equals("Orientacion")) {
            intermediario = (new IntermediarioPersistenciaOrientacion());
        }
        if (nombre.equals("Periodicidad")) {
            intermediario = (new IntermediarioPersistenciaPeriodicidad());
        }

        if (nombre.equals("PersonaPadron")) {
            intermediario = (new IntermediarioPersistenciaPersonaPadron());
        }

        if (nombre.equals("PersonaPadronEstado")) {
            intermediario = (new IntermediarioPersistenciaPersonaPadronEstado());
        }

        if (nombre.equals("PesoDeReclamo")) {
            intermediario = (new IntermediarioPersistenciaPesoDeReclamo());
        }

        if (nombre.equals("Problema")) {
            intermediario = (new IntermediarioPersistenciaProblema());
        }

        if (nombre.equals("ProblemaCaso")) {
            intermediario = (new IntermediarioPersistenciaProblemaCaso());
        }

        if (nombre.equals("RangoAnios")) {
            intermediario = (new IntermediarioPersistenciaRangoAnios());
        }

        if (nombre.equals("Reclamo")) {
            intermediario = (new IntermediarioPersistenciaReclamo());
        }

        if (nombre.equals("ReparacionTareaRealizada")) {
            intermediario = (new IntermediarioPersistenciaReparacionTareaRealizada());
        }

        if (nombre.equals("Repuesto")) {
            intermediario = (new IntermediarioPersistenciaRepuesto());
        }

        if (nombre.equals("Reserva")) {
            intermediario = (new IntermediarioPersistenciaReserva());
        }
        if (nombre.equals("ReservaElementoTrabajo")) {
            intermediario = (new IntermediarioPersistenciaReservaElementoTrabajo());
        }

        if (nombre.equals("Rol")) {
            intermediario = (new IntermediarioPersistenciaRol());
        }

        if (nombre.equals("Semaforo")) {
            intermediario = (new IntermediarioPersistenciaSemaforo());
        }

        if (nombre.equals("Tarea")) {
            intermediario = (new IntermediarioPersistenciaTarea());
        }

        if (nombre.equals("TareaFichaMantenimiento")) {
            intermediario = (new IntermediarioPersistenciaTareaFichaMantenimiento());
        }

        if (nombre.equals("TipoSemaforo")) {
            intermediario = (new IntermediarioPersistenciaTipoSemaforo());
        }

        if (nombre.equals("Trabajador")) {
            intermediario = (new IntermediarioPersistenciaTrabajador());
        }

        if (nombre.equals("TrabajadorRol")) {
            intermediario = (new IntermediarioPersistenciaTrabajadorRol());
        }

        if (nombre.equals("TrabajadorTrabajo")) {
            intermediario = (new IntermediarioPersistenciaTrabajadorTrabajo());
        }

        if (nombre.equals("Trabajo")) {
            intermediario = (new IntermediarioPersistenciaTrabajo());
        }

        if (nombre.equals("TrabajoElementoNecesario")) {
            intermediario = (new IntermediarioPersistenciaTrabajoElementoNecesario());
        }

        if (nombre.equals("TrabajoOrdenDeTrabajo")) {
            intermediario = (new IntermediarioPersistenciaTrabajoOrdenDeTrabajo());
        }
        if (nombre.equals("Ubicacion")) {
            intermediario = (new IntermediarioPersistenciaUbicacion());
        }

        if (nombre.equals("UbicacionSimple")) {
            intermediario = (new IntermediarioPersistenciaUbicacionSimple());
        }

        return intermediario;
    }
}
