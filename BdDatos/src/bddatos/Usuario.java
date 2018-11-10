/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bddatos;

/**
 *
 * @author sombra
 */
public class Usuario {
    
    
    private int id;
    private String usuario;
    private String nombre;
    private String apellido;
    private String email;
    private String pw;
    private int sueldo ;
    private int saldo_disp;
    
    public Usuario(int id,String nombre,String usuario,String apellido,String email,String pw){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.pw = pw;
        this.sueldo = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public int getSaldo_disp() {
        return saldo_disp;
    }

    public void setSaldo_disp(int saldo_disp) {
        this.saldo_disp = saldo_disp;
    }
    
    
    
}
