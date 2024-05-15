/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete02;
import paquete01.LibretaCalificacion;
public class Ejecutor2 {
    public static void main(String[] args) {
    double [] notas = {10, 9, 8, 10};
    String nombreEstudiante = "Rene Elizalde";
            LibretaCalificacion libreta1 = new LibretaCalificacion(
                    nombreEstudiante,
                    notas);
        libreta1.establecerPromedio();
        //si no lo llama no recibe ningun valor y se entiende como 0
        libreta1.establecerPromedioCualitativo();
        // si no lo llama no recibe ningun valor y se entiende como null
        System.out.printf("%s\n", libreta1);
    
                    
} 
    
}
