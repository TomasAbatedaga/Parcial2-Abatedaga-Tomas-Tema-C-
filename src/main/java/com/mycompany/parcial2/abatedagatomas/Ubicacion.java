/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial2.abatedagatomas;

/**
 *
 * @author abate
 */
public class Ubicacion {
    private String calleA;
    private String calleB;
    private int altura;
    private String barrio;

    public Ubicacion(String calleA, String calleB, int altura, String barrio) {
        this.calleA = calleA;
        this.calleB = calleB;
        this.altura = altura;
        this.barrio = barrio;
    }

    public String getCalleA() {
        return calleA;
    }

    public void setCalleA(String calleA) {
        this.calleA = calleA;
    }

    public String getCalleB() {
        return calleB;
    }

    public void setCalleB(String calleB) {
        this.calleB = calleB;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }
    
    
}
