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
public class Ciudadano {
    private String nombre;
    private int contraseña; 
    private List<InformeRotura> informesRealizados; // Asociación 1 a *
    
    // Constructor sin parámetros (Requerido por el parcial para pruebas JUnit)
    public Ciudadano() {
        this.informesRealizados = new ArrayList<>();
    }

    // Constructor con parámetros
    public Ciudadano(String nombre, int contraseña) {
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.informesRealizados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getContraseña() {
        return contraseña;
    }

    public void setContraseña(int contraseña) {
        this.contraseña = contraseña;
    }

    public List<InformeRotura> getInformesRealizados() {
        return informesRealizados;
    }

    public void setInformesRealizados(List<InformeRotura> informesRealizados) {
        this.informesRealizados = informesRealizados;
    }
    
    public boolean validarIngreso(int psw) {
        return this.contraseña == psw;
    }

    public void cambioPassword(String newPass) {
        this.contraseña = Integer.parseInt(newPass);
    }

    public void delay(int mili) throws InterruptedException {
        try {
            Thread.sleep(mili);
        } catch (InterruptedException e) {
            System.out.println("Delay de " + mili + " milisegundos");
            throw e;
        }
    }

    public boolean ciudadanosDiferentes(Ciudadano c2) {
        if (c2 == null) return true;
        return !this.nombre.equals(c2.nombre) || this.contraseña != c2.contraseña;
    }

    public void agregarInforme(InformeRotura informe) {
        this.informesRealizados.add(informe);
    }
}
