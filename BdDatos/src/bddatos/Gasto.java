/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bddatos;

import java.util.Date;

/**
 *
 * @author germanpujadas
 */
public class Gasto {

    public void setId_evento(int id_evento) {
        this.id_evento = id_evento;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public void setNombreUsr(String nombre) {
        this.nombreUsr = nombre;
    }
    
    public void setTotal(int total) {
        this.total = total;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getId_evento() {
        return id_evento;
    }

    public int getId_usuario() {
        return id_usuario;
    }
    
    public String getNombreUsr() {
        return this.nombreUsr;
    }

    public int getTotal() {
        return total;
    }

    public Date getFecha() {
        return fecha;
    }
    
    private int id_evento;
    private int id_usuario;
    private String nombreUsr;
    private int total;
    private Date fecha;
    
    
    public Gasto(int id_evento, int id_usuario, String nombreUsr,int total, Date fecha){
        this.id_evento = id_evento;
        this.id_usuario = id_usuario;
        this.nombreUsr = nombreUsr;
        this.total = total;
        this.fecha = fecha;
    }
}
