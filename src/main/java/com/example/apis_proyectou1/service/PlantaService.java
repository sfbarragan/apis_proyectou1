package com.example.apis_proyectou1.service;

import com.example.apis_proyectou1.entities.Plantas;
import com.example.apis_proyectou1.repo.PlantasRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Service
public class PlantaService {
    @Autowired
    PlantasRepo plantasRepo;

    public void insert(Plantas planta){
        plantasRepo.insert(planta);
    }
    public void eliminar(int id){
        plantasRepo.eliminar(id);
    }
    public void update(int id, String nombre, String etapa, String tipo){
        plantasRepo.update(id, nombre, etapa, tipo);
    }

    public ArrayList<Plantas> mostrar(){
        return plantasRepo.mostrar();
    }
}
