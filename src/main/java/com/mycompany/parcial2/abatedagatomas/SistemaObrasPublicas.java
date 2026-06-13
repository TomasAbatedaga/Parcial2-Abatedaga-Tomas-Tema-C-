/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parcial2.abatedagatomas;

/**
 *
 * @author abate
 */
import java.util.ArrayList;
import java.util.List;

public class SistemaObrasPublicas {

    private List<Ciudadano> ciudadanos = new ArrayList<>();
    private List<Bache> baches = new ArrayList<>();
    private List<InformeRotura> informes = new ArrayList<>();
    private List<PedidoObra> pedidos = new ArrayList<>();
    private List<BrigadaReparacion> brigadas = new ArrayList<>();

    public List<InformeRotura> informesporCiudadano(Ciudadano ciu) {
        return new ArrayList<>(); 
    }
    
    public List<InformeRotura> informesSinPedidos() {
        return new ArrayList<>();
    }
    
    public List<BrigadaReparacion> informeBrigadasOciosas() {
        return new ArrayList<>();
    }
    
    public List<PedidoObra> pedidosPorBrigada(BrigadaReparacion b) {
        return new ArrayList<>();
    }
    
    public List<Bache> bachesSinReparar() {
        return new ArrayList<>();
    }
    
    public List<Trabajador> trabajadoresPorBrigada(BrigadaReparacion b) {
        return new ArrayList<>();
    }
    
    public void registrarDenuncia(Ciudadano ciudadano, Bache bache) {
    }

    public void elaborarPedidoDeObra(InformeRotura informe) {
    }

    public void informarReparacionCumplida(PedidoObra pedido, String observaciones) {
    }
}
