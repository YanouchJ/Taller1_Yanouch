package com.mycompany.tallerclase;

import java.util.Calendar;
import java.util.Date;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author raffa
 */
public class Empleado {

     /*Objeto*/
    public String cedula;
    public String nombre;
    private char genero;
    private Date fecha_nacimiento;

    public Residencia residencia;
    private double salario;
    
    /*public Date getFecha_ingreso(){
        return fecha_ingreso;
    }
    public void setFecha_ingreso(Date fecha_ingreso){
        this.fecha_ingreso =fecha_ingreso;
    }
    
    /*Clase*/
    private Date fecha_ingreso;
    private int edad;
    public double prestaciones;
    private int antiguedad;

    //CONSTRUCTORES
    //Constructor por defecto
    public Empleado() {
        this.cedula = "";
        this.nombre = "";
        this.genero = 'F';
        this.fecha_nacimiento = new Date();
        this.salario = 466;
        this.fecha_ingreso = new Date();
        this.residencia = new Residencia("Direccion1", "Quito", 170902);
    }

    //Constructor por parametros
    public Empleado(String cedula, String nombre, char genero, Date fecha_nacimiento) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.genero = genero;
        this.salario = 466;
        this.fecha_nacimiento = fecha_nacimiento;
        this.residencia = new Residencia("Direccion1", "Quito", 170902);
    }
    //Fin constructores
    
    public void ModificarSalario(double salario) {
        this.salario = salario;
    }

    //METODOS
    //Getters y setters
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public char getGenero() {
        return genero;
    }

    public Date getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public double getSalario() {
        return salario;
    }

    public Date getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void setFecha_nacimiento(Date fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public void setFecha_ingreso(Date fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }
    
    public int CalcularEdad(){
        int anio_nacimiento = this.fecha_nacimiento.getYear()+1900;
        Calendar calendar = Calendar.getInstance();
        int anio_actual = calendar.get(Calendar.YEAR);
       
        return anio_actual-anio_nacimiento;
    }
    
    public int CalcularAntiguedad(){
        int anio_ingreso = this.fecha_ingreso.getYear()+1900;
       Calendar calendar = Calendar.getInstance();
        int anio_actual = calendar.get(Calendar.YEAR);
        
        return anio_actual-anio_ingreso;
    }
    
    public double CalcularPrestaciones(){
        int antiguedad = CalcularAntiguedad();
        double prestaciones = antiguedad * this.salario/12;
        
        return prestaciones;
    }
    
    @Override
    public String toString(){
        return "Nombre: " +this.nombre+", Cedula: "+this.cedula+", Genero: "+this.genero;
    }
}
