/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.equipoamarillo.pp2.p.pkg2;
import java.util.Scanner;
/**
 *
 * @author Julián
 */
public class SPPEquipoAmarilloPP2P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int arreglo1[][];
        int numFilas1;
        int numColumnas1;
        int datoCasilla1;
        int cont=0;
        System.out.println("Matriz A");
        numFilas1 = darTamaño(" filas:");
        numColumnas1 = darTamaño(" columnas:");

        arreglo1 = new int[numFilas1][numColumnas1];
        for (int i = 0; i < arreglo1.length; i++) {
            for (int j = 0; j < arreglo1.length; j++) {
                cont++;
                System.out.println("Ingrese dato para ser guardado en la casilla: "+cont);
                datoCasilla1 = solicitaDatos();
                arreglo1[i][j] = datoCasilla1;
            }
        }
        int arreglo2[][];
        int numFilas2;
        int numColumnas2;
        int datoCasilla2;
        System.out.println("Matriz B");
        numFilas2 = darTamaño(" Filas:");
        numColumnas2 = darTamaño(" Columnas:");

        arreglo2 = new int[numFilas2][numColumnas2];
        for (int i = 0; i < arreglo2.length; i++) {
            for (int j = 0; j < arreglo2[i].length; j++) {
                System.out.println("Ingrese dato para ser guardado en la casilla:");
                datoCasilla2 = solicitaDatos();
                arreglo2[i][j] = datoCasilla2;
            }
        }
        if ((numFilas1 != numFilas2) || (numColumnas1 != numColumnas2)) {
            System.out.println("No son iguales las dimensiones de ambas matrices");
            System.exit(0);
        } else {
            System.out.println("Ambas matrices son de dimensiones iguales");
        }
        for (int i = 0; i < arreglo2.length; i++) {
            for (int j = 0; j < arreglo2[i].length; j++) {
                if (arreglo1[i][j] != arreglo2[i][j]) {
                    System.out.println("No todos los valores de todas las casillas de ambas matrices son iguales");
                    System.exit(0);
                } else {
                }
            }
        }
        System.out.println("Los valores de todas las casilla son iguales en ambas matrices");
    }

    public static int darTamaño(String dimension) {
        int x;
        boolean flag;
        System.out.println("Valor de " + dimension);

        do {
            x = solicitaDatos();
            flag = true;
            if (x < 1) {
                System.out.println("Porfavor itroduzca un entero positivo (no hay longitudes negativas  o nulas de matrices)");
                flag = false;
            }

        } while (flag == false);

        return x;
    }

    public static int[][] darValores(int m, int n) {
        int[][] matrix = new int[m][n];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Introduzca valores para la posición " + i + ", " + j);
                matrix[i][j] = solicitaDatos();
            }
        }

        return matrix;
    }

    public static int solicitaDatos() {
        Scanner teclado = new Scanner(System.in);
        boolean flag;
        int x = 0;
        do {
            try { 
                x = teclado.nextInt();
                flag = true;
            } catch (Exception ex) { 
                flag = false;
                System.out.println("\nEl valor insertado es inválido. Introduzca un entero válido.\n" + ex + "\n");
                teclado.nextLine();  
            }

        } while (flag == false);

        return x; 
    }

    public static void muestraArreglo(int[][] matrix) { 
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print("[" + matrix[i][j] + "]");
                if (j + 2 > matrix[i].length) {
                    System.out.println("\t");
                }
            }
        }

    }

}