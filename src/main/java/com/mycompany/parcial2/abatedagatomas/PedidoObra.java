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
public class PedidoObra {
    private int idPedidoObra;
    private Ubicacion ubicacion;
    private String tamano;
    private Date fechaCreacion;
    private Date fechaReparacion;
    private String observaciones;
    private BrigadaReparacion brigadaAsignada;

    public PedidoObra(int idPedidoObra, Ubicacion ubicacion, String tamano, Date fechaCreacion) {
        this.idPedidoObra = idPedidoObra;
        this.ubicacion = ubicacion;
        this.tamano = tamano;
        this.fechaCreacion = fechaCreacion;
        this.fechaReparacion = null;
        this.observaciones = "";
    }

    public int getIdPedidoObra() {
        return idPedidoObra;
    }

    public void setIdPedidoObra(int idPedidoObra) {
        this.idPedidoObra = idPedidoObra;
    }

    public Ubicacion getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(Ubicacion ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaReparacion() {
        return fechaReparacion;
    }

    public void setFechaReparacion(Date fechaReparacion) {
        this.fechaReparacion = fechaReparacion;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public BrigadaReparacion getBrigadaAsignada() {
        return brigadaAsignada;
    }

    public void setBrigadaAsignada(BrigadaReparacion brigadaAsignada) {
        this.brigadaAsignada = brigadaAsignada;
    }
    
    public void asignarBrigada(BrigadaReparacion brigada) {
        this.brigadaAsignada = brigada;
    }
}
