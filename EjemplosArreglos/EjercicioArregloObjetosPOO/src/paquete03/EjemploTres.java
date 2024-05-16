/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete03;

import paquete01.Calificacion;

public class EjemploTres {
    public static void main(String[] args) {
        // crear un arreglo de objetos de tipo Calificacion
        Calificacion [] calificaciones = {
            new Calificacion(10, "Computación"), /* esto es un objeto anonimo 
                                                           //El código crea un arreglo de objetos de la clase Calificacion y lo inicializa con dos instancias
                                                           //una con calificación 10 en "Computación" y otra con calificación 9 en "Electrónica". 
                                                             //Estos objetos se crean de manera anónima directamente en la declaración del arreglo.*/
            new Calificacion(9, "Electrónica")};
        
        for (int i = 0; i < calificaciones.length; i++) {
            Calificacion objetoCalificacion = calificaciones[i];
            System.out.printf("%s - %.2f\n", 
                    objetoCalificacion.obtenerNombreMateria(),
                    objetoCalificacion.obtenerNota());
        }
        
    }
}
