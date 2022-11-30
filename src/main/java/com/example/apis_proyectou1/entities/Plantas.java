package com.example.apis_proyectou1.entities;

public class Plantas {
    int id;
    String nombre;
    String etapa;
    String tipo;

    public Plantas() {
        this.id = 0;
        this.nombre = "";
        this.etapa = "";
        this.tipo = "";
    }

    public Plantas(int id, String nombre, String etapa, String tipo) {
        this.id = id;
        this.nombre = nombre;
        this.etapa = etapa;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEtapa() {
        return etapa;
    }

    public void setEtapa(String etapa) {
        this.etapa = etapa;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Plantas{" +
                "nombre='" + nombre + '\'' +
                ", etapa='" + etapa + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
