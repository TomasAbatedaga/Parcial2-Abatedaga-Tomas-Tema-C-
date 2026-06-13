/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial2.abatedagatomas;

import java.util.List;

/**
 *
 * @author abate
 */
public class BrigadaReparacion {
    private int numero;
    private String nombre; 
    private int cantTrabajadores;
    private String equipamiento;
    private String materiales;
    private Trabajador jefe; 
    private List<Trabajador> operarios; 

    public BrigadaReparacion(int numero, String nombre, String equipamiento, String materiales, Trabajador jefe, List<Trabajador> operarios) {
        this.numero = numero;
        this.nombre = nombre;
        this.equipamiento = equipamiento;
        this.materiales = materiales;
        this.jefe = jefe;
        this.operarios = operarios;
        this.cantTrabajadores = operarios.size() + 1;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantTrabajadores() {
        return cantTrabajadores;
    }

    public void setCantTrabajadores(int cantTrabajadores) {
        this.cantTrabajadores = cantTrabajadores;
    }

    public String getEquipamiento() {
        return equipamiento;
    }

    public void setEquipamiento(String equipamiento) {
        this.equipamiento = equipamiento;
    }

    public String getMateriales() {
        return materiales;
    }

    public void setMateriales(String materiales) {
        this.materiales = materiales;
    }

    public Trabajador getJefe() {
        return jefe;
    }

    public void setJefe(Trabajador jefe) {
        this.jefe = jefe;
    }

    public List<Trabajador> getOperarios() {
        return operarios;
    }

    public void setOperarios(List<Trabajador> operarios) {
        this.operarios = operarios;
    }
    
    
}
