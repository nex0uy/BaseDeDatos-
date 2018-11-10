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
    
    public Evento(String nombre,Nota nota,Date fecha,int gasto){
        this.nombre = nombre;
        this.nota = nota;
        this.fecha = fecha;
        this.gasto = gasto;
    }
}
