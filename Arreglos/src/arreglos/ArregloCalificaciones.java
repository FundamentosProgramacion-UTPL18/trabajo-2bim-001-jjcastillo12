/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ArregloCalificaciones {

    public static void main(String[] args) {
        String estudiante;
        String nombre;
        double[] calificaciones_progra = {18, 19, 15, 16, 17, 10};
        double[] calificaciones_bd = {10, 12, 13, 20, 17, 20};
        double[] promedios = new double[6];
        for (int contador = 0; contador < calificaciones_bd.length; contador++) {
            double suma = calificaciones_progra[contador] + calificaciones_bd[contador];
            double promedio = suma / 2;
            promedios[contador] = promedio;
        }
        for (int contador2 = 0; contador2 < promedios.length; contador2++) {
            System.out.printf("Estudiante %d:\t%.2f\t%.2f\t%.2f\n", contador2+1, calificaciones_progra[contador2], calificaciones_bd[contador2], promedios[contador2]);
        }

    }
}
