package com.example.apis_proyectou1.controller;

import com.example.apis_proyectou1.entities.Plantas;
import com.example.apis_proyectou1.service.PlantaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/planta")
public class PlantasController {
    @Autowired
    private PlantaService plantaService;


    @PostMapping("/guardar")
    public void guardar(@RequestParam(value = "id", defaultValue = "" ) int id,@RequestParam(value = "nombre", defaultValue = "" ) String nombre, @RequestParam (value = "etapa", defaultValue = "" ) String etapa, @RequestParam (value = "tipo", defaultValue = "" ) String tipo){

        Plantas planta = new Plantas(id, nombre, etapa, tipo);

        plantaService.insert(planta);
        System.out.println("Guardado");
    }

    @GetMapping("/actualizar")
    public void actualizar(@RequestParam(value = "id", defaultValue = "" ) int id, @RequestParam(value = "nombre", defaultValue = "" ) String nombre, @RequestParam (value = "etapa", defaultValue = "" ) String etapa, @RequestParam (value = "tipo", defaultValue = "" ) String tipo){
        plantaService.update(id, nombre, etapa, tipo);
        System.out.println("Editado");
    }

    @GetMapping("/mostrar-plantas")
    public ResponseEntity<ArrayList<Plantas>> mostrar() {
        return ResponseEntity.ok(plantaService.mostrar());
    }

    @GetMapping("/eliminar")
    public void actualizar(@RequestParam(value = "id", defaultValue = "" ) int id){
        plantaService.eliminar(id);
        System.out.println("Eliminado");
    }
}
