/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bddatos;

import java.util.Date;

/**
 *
 * @author sombra
 */
public class Evento {
    
    private int id;
    private String nombre;
    private Nota nota;
    private Date fecha;
    private int gasto;
    private String lugar;
    
    public Evento(String nombre,Nota nota,Date fecha,int gasto, String lugar){
        this.nombre = nombre;
        this.nota = nota;
        this.fecha = fecha;
        this.gasto = gasto;
        this.lugar = lugar;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public Date getFecha(){
        return this.fecha;
    }
    
    public String getLugar(){
        return this.lugar;
    }
    
    public int getCosto(){
        return this.gasto;
    }
    
    public int getID(){
        return this.id;
    }
    
    public void setID(int id){
        this.id = id;
    }
}
