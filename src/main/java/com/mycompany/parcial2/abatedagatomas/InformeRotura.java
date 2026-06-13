/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial2.abatedagatomas;

import java.util.Date;

/**
 *
 * @author abate
 */
public class InformeRotura {
    private int codInf;
    private Date fechaInforme;
    private String problema;
    private int codUrgencia;
    private Ciudadano ciudadano;
    private Bache bache;
    private PedidoObra pedidoReparacion;

    public InformeRotura(int codInf, Date fechaInforme, String problema, int codUrgencia, Ciudadano ciudadano, Bache bache) {
        this.codInf = codInf;
        this.fechaInforme = fechaInforme;
        this.problema = problema;
        this.codUrgencia = codUrgencia;
        this.ciudadano = ciudadano;
        this.bache = bache;
        this.pedidoReparacion = null;
        this.ciudadano.agregarInforme(this);
        this.bache.agregarInforme(this);
    }

    public int getCodInf() {
        return codInf;
    }

    public void setCodInf(int codInf) {
        this.codInf = codInf;
    }

    public Date getFechaInforme() {
        return fechaInforme;
    }

    public void setFechaInforme(Date fechaInforme) {
        this.fechaInforme = fechaInforme;
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public int getCodUrgencia() {
        return codUrgencia;
    }

    public void setCodUrgencia(int codUrgencia) {
        this.codUrgencia = codUrgencia;
    }

    public Ciudadano getCiudadano() {
        return ciudadano;
    }

    public void setCiudadano(Ciudadano ciudadano) {
        this.ciudadano = ciudadano;
    }

    public Bache getBache() {
        return bache;
    }

    public void setBache(Bache bache) {
        this.bache = bache;
    }
    
    public void setPedidoReparacion(PedidoObra pedido) {
        this.pedidoReparacion = pedido;
    }
}
