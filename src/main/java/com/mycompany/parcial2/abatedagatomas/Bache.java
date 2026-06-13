/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial2.abatedagatomas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author abate
 */
public class Bache {
    private int idBache;
    private String tamano;
    private int prioridad; 
    private String estado;
    private Ubicacion posicionExacta;
    private List<InformeRotura> informesAsociados;

    public Bache(int idBache, String tamano, int prioridad, Ubicacion ubicacion) {
        this.idBache = idBache;
        this.tamano = tamano;
        this.prioridad = prioridad;
        this.estado = "sin reparar";
        this.posicionExacta = ubicacion;
        this.informesAsociados = new ArrayList<>();
    }

    public int getIdBache() {
        return idBache;
    }

    public void setIdBache(int idBache) {
        this.idBache = idBache;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    public Ubicacion getPosicionExacta() {
        return posicionExacta;
    }

    public void setPosicionExacta(Ubicacion posicionExacta) {
        this.posicionExacta = posicionExacta;
    }

    public List<InformeRotura> getInformesAsociados() {
        return informesAsociados;
    }

    public void setInformesAsociados(List<InformeRotura> informesAsociados) {
        this.informesAsociados = informesAsociados;
    }

    public void agregarInforme(InformeRotura informe) {
        this.informesAsociados.add(informe);
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
}
