/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Expertos;

import DTO.DTOProblemasDelSemaforo;
import Persistencia.ExpertosPersistencia.Criterio;
import Persistencia.Entidades.Calle;
import Persistencia.Entidades.Denuncia;
import Persistencia.Entidades.DenunciaEstado;
import Persistencia.Entidades.Denunciante;
import Persistencia.Entidades.Interseccion;
import Persistencia.Entidades.ObjetoPersistente;
import Persistencia.Entidades.Problema;
import Persistencia.Entidades.Semaforo;
import Persistencia.Entidades.SuperDruperInterfaz;
import Persistencia.ExpertosPersistencia.FachadaExterna;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author LEIVA
 */
public class ExpertoAntenderReclamoPorDesperfecto implements Experto{

    public Denunciante buscarDenunciante(String dni){
        Criterio criterio = FachadaExterna.getInstancia().crearCriterio("DNI", "=", dni);
        List<Criterio> listaDeCriterios = new ArrayList<Criterio>();
        listaDeCriterios.add(criterio);
        List<SuperDruperInterfaz> listaDeInterfaces = FachadaExterna.getInstancia().buscar("Denunciante", listaDeCriterios);
        List<Denunciante> listaDenunciantes = new ArrayList<Denunciante>() ;
        for(SuperDruperInterfaz aux : listaDeInterfaces ){
            listaDenunciantes.add((Denunciante) aux);
        }

        return listaDenunciantes.get(0);
    }


    public void guardarDenunciante(Denunciante denunciante){

        FachadaExterna.getInstancia().guardar("Denunciante", (SuperDruperInterfaz)denunciante);

    }



    public List<Calle> buscarCalle(String calle){

        Criterio criterio = FachadaExterna.getInstancia().crearCriterio("Calle", "LIKE", calle);
        List<Criterio> listaDeCriterios = new ArrayList<Criterio>();
        listaDeCriterios.add(criterio);
        List<SuperDruperInterfaz> listaSuperDruperInterfaz = FachadaExterna.getInstancia().buscar("Calle", listaDeCriterios);
        List<Calle> listaCalles = new ArrayList<Calle>();
        for(SuperDruperInterfaz aux : listaSuperDruperInterfaz){
            listaCalles.add((Calle) aux);
        }
        return listaCalles;
    }

    public Interseccion buscarInterseccion(Calle calle1, Calle calle2){

    List<Criterio> criterio = new ArrayList<Criterio>();
    criterio.add(FachadaExterna.getInstancia().crearCriterio("Calle1", "=", calle1));
    criterio.add(FachadaExterna.getInstancia().crearCriterio("Calle2", "=", calle2));
    List<SuperDruperInterfaz> listaSuperDruperInterfaz = FachadaExterna.getInstancia().buscar("Interseccion", criterio);
    return (Interseccion)listaSuperDruperInterfaz.get(0);
    }

    public List<Semaforo> buscarSemaforo(Interseccion interseccion) {
        Criterio criterio = FachadaExterna.getInstancia().crearCriterio("Interseccion", "=", interseccion);
        List<Criterio> listaDeCriterio = new ArrayList<Criterio>();
        listaDeCriterio.add(criterio);
        FachadaExterna.getInstancia().buscar("Semaforo", listaDeCriterio);
        return null;
    }

    public List<Problema> buscarProblemas() {
        List<SuperDruperInterfaz> listaDeInterfaces = FachadaExterna.getInstancia().buscar("Problema", null);
        List<Problema> listaDeProblema = new ArrayList<Problema>();
        for(SuperDruperInterfaz aux : listaDeInterfaces){
            listaDeProblema.add((Problema) aux);
        }
        return listaDeProblema;
    }

    public void guardarDenuncia(List<DTOProblemasDelSemaforo> listaDeProblemasDelSemaforo){

        List<Criterio> listaDeCriterios;
        List<Denuncia> listaDeDenuncias;
        List<DTOProblemasDelSemaforo> listaDTOProblemasDelSemaforosParaHacerleDenuncia = new ArrayList<DTOProblemasDelSemaforo>();
        List<SuperDruperInterfaz> listaDeInterfaces;
        boolean seNecesitaCrearDenunciaNueva=false;
        for(DTOProblemasDelSemaforo aux : listaDeProblemasDelSemaforo){
            listaDeCriterios = new ArrayList<Criterio>();
            listaDeDenuncias = new ArrayList<Denuncia>();
            listaDeCriterios.add(FachadaExterna.getInstancia().crearCriterio("Semaforo", "=", aux.getSemaforo()));
            listaDeInterfaces = FachadaExterna.getInstancia().buscar("Denuncia", listaDeCriterios);
            for(SuperDruperInterfaz aux1 : listaDeInterfaces)
                listaDeDenuncias.add((Denuncia) aux1);

            Denuncia denunciaAUtilizar=null;
            int bandera=0;
            for(Denuncia denuncia : listaDeDenuncias){
                for(DenunciaEstado denunciaEstado : denuncia.getDenunciaEstado()){
                    if(denunciaEstado.getEstadoDenuncia().getnombreestado().equalsIgnoreCase("Pendiente de atención") & denunciaEstado.isindicadorestadoactual()){
                        denunciaAUtilizar=denuncia;
                        bandera=1;//avisa que se tiene que hacer un reclamo con la denuncia guradada en denuncia
                        //GENERAR UN RECLAMO
                    }
                    else if(!denunciaEstado.getEstadoDenuncia().getnombreestado().equalsIgnoreCase("Final") & denunciaEstado.isindicadorestadoactual()){
                        bandera=1;//tiene que avisar que no se puede generar un reclamo pero que la denuncia ya exite
                            //AVISAR QUE NO SE PUEDE HACER UNA DENUNCIA
                    }
                     //sino tiene que generar una denuncia
                }
                    
                if(bandera == 1)
                    break;
            }

            if(bandera==1 & denunciaAUtilizar==null ){
            //avisar que tiene que esperar, que ya existe la denuncia

            }else if(bandera==1 & denunciaAUtilizar!=null){
            //GEnerar un reclamo

            }
            else if (bandera == 0){
                //generar denuncia
                listaDTOProblemasDelSemaforosParaHacerleDenuncia.add(aux);
                seNecesitaCrearDenunciaNueva=true;

            }
        }

        if(seNecesitaCrearDenunciaNueva){
            List<Semaforo> listSem = new ArrayList<Semaforo>();
            List<Problema> listProb = new ArrayList<Problema>();
            for(DTOProblemasDelSemaforo aux : listaDTOProblemasDelSemaforosParaHacerleDenuncia){
                listSem.add(aux.getSemaforo());
                for(Problema problem : aux.getListaDeProblemas())
                    listProb.add(problem);
            }
            Denuncia den = (Denuncia)FachadaExterna.getInstancia().crearEntidad("Denuncia");
            den.setSemaforo(listSem);
            den.setProblema(listProb);
        }



    }


}
