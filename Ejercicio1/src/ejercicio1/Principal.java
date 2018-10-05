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
public class Principal {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
        for (int i = 0; i < 2; i++) {
            estudiante.edad=(int)(Math.random()*80+ 1);
            estudiante.cedula=(int)(Math.random()*99999999+1111111111);
            System.out.println(estudiante.nombre+" "+(i+1));
            System.out.println("Edad: "+estudiante.edad);
            System.out.println("Sexo: "+estudiante.sexo);
            System.out.println("Cedula: "+estudiante.cedula);
            System.out.println("--------------------------");
        }
    }
}
