package com.example.apis_proyectou1.repo;

import com.example.apis_proyectou1.entities.Plantas;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public class PlantasRepo {
    public ArrayList<Plantas> plantas = new ArrayList<Plantas>();

    public void insert(Plantas planta){
        plantas.add(planta);
    }

    public void update(int id,String nombre, String etapa, String tipo){
        for(int i= 0; i< plantas.size(); i++){
            if(plantas.get(i).getId() == id){
                plantas.get(i).setNombre(nombre);
                plantas.get(i).setEtapa(etapa);
                plantas.get(i).setTipo(tipo);
                System.out.println(plantas.get(i).toString());
            }
        }
    }

    public void eliminar(int id){
        for(int i= 0; i< plantas.size(); i++){
            if(plantas.get(i).getId() == id){
                plantas.remove(i);
                System.out.println("eliminado");
            }
        }
    }

    public ArrayList<Plantas> mostrar(){
        return plantas;
    }

}
