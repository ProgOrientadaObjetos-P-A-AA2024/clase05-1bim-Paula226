/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete01.Calificacion;
import paquete01.Profesor;

public class Ejemplo {
    public static void main(String[] args) {
        Profesor profesor1 = new Profesor("Franco", "nombramiento"); 
        Profesor profesor2 = new Profesor("Richard", "contrato"); 
        // crear un arreglo de objetos de tipo Calificacion
        // arreglo estatico
        Calificacion [] calificaciones = new Calificacion[2];
        //
        Calificacion c = new Calificacion(10, "Computación");
        Calificacion c2 = new Calificacion(9, "Electrónica");
        // calificaciones en un arreglo de tipo de calificacion
        calificaciones[0] = c;
        calificaciones[1] = c2;
        // ciclo repetitivo
        for (int i = 0; i < calificaciones.length; i++) {
            Calificacion objetoCalificacion = calificaciones[i];
            System.out.printf("%s - %.2f\n", 
                    objetoCalificacion.obtenerNombreMateria(),
                    objetoCalificacion.obtenerNota());
        }
        
    }
}
