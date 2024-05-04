package com.mycompany.tallerclase;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author raffa
 */
public class Residencia {
    
    public String direccion;
    public String ciudad;
    public char codigo_postal;
    
    //INICIO CONSTRUCTORES
    //Constructor por defecto
    public Residencia() {
        this.direccion="";
        this.ciudad="";  
        this.codigo_postal=0;
    }
    //Constructor por parametros
    public Residencia (String direccion, String ciudad, int codigo_postal){
        this.direccion=direccion;
        this.ciudad=ciudad;
        this.codigo_postal = (char) codigo_postal;
    }
    //FIN CONSTRUCTORES
    
    public String getDireccion() {
        return direccion;
        }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
        }
    
    
     public String getCiudad() {
        return ciudad;
        }
    
    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
        }
    
    
    public char getCodigo_postal() {
        return codigo_postal;
        }
    
    public void setCodigo_postal(char codigo_postal) {
        this.codigo_postal = codigo_postal;
        }
    
    public String toString(){
        return "Soy una residencia";
    }
}
