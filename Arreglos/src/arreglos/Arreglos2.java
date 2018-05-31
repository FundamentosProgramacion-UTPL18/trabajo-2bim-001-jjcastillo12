/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos;

/**
 *
 * @author Usuario
 */
public class Arreglos2 {

    public static void main(String[] args) {
        int multiplicacion = 0;
        int[] arreglo = {1, 2, 3, 4, 5, 6, 7};
        for (int contador = 0; contador < arreglo.length; contador++) {
            // si el arreglo es par imprima la tabla de valores
            if (arreglo[contador] % 2 == 0) {
                // ciclo repetitivo para imprimir la tabla de multiplicacr
                for (int contador2=1; contador2 <= 12; contador2++) {
                    multiplicacion = arreglo[contador] * contador2;
                    System.out.printf("%d x %d = %d\n",arreglo[contador],contador2,multiplicacion);
                }
            }
            
        }

    }

}
