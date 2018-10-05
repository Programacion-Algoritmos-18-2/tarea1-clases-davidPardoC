/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author David Pardo
 */
public class Estudiante {
    int edad;
    int cedula;
    String nombre="Estudiante";
    String[] sexoA = {"H","M"};
    String sexo=sexoA[(int)(Math.random()* 1 + 0)];
}
