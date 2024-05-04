/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.tallerclase;

import java.util.Date;

/**
 * Nombre: Rafaela Yanouch
 * Deber: Taller 1
 * Descripcion: 
 */
public class TallerClase {

    public static void main(String[] args) {
        Date fecha_nacimiento = new Date ("17/07/1994");
        
        Empleado empleado_2 = new Empleado("1717171717", "Rafaela", 'F', fecha_nacimiento);
        //empleado_2.residencia.setCiudad("Guayaquil");
        empleado_2.setFecha_ingreso(new Date ("10/10/2020"));
        
        //1. Modificar salario de empleado
        System.out.println("El sueldo actual es: " +empleado_2.getSalario());
        empleado_2.setSalario(500);
        
        System.out.println("El nuevo sueldo es: " +empleado_2.getSalario());
        //System.out.println("El nombre del empleado 2 es: "+ empleado_2.getNombre());        
        
        
        //2. Calcula la edad
        System.out.println("La edad del empleado es: " +empleado_2.CalcularEdad());
        
        //3. Calcular prestaciones
        System.out.println("Las prestaciones son: " +empleado_2.CalcularPrestaciones());
        
        System.out.println("Empleado: " +empleado_2.toString());
        
        Residencia residencia = new Residencia();
        System.out.println(residencia.toString());
    
    }
}

