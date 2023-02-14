package ejercicio.notas;

import java.util.Scanner;


public class Auxiliar {

    //Declaro la matriz
    double notas[][] = new double[3][2];
    Scanner in = new Scanner(System.in);

    //Método para llenar la matriz
    public void llenarMatriz() {
        double notaEntrada;
        //notas.length = calcula el total de filas de la matriz
        //notas[i].length = calcula el tamaño de una fila específica

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.println("Digite la nota: ");
                notaEntrada = in.nextDouble();

                //Guardo la nota en la matriz
                notas[i][j] = notaEntrada;

            } //Cierre del for interno

        }
        System.out.println("¡Matriz ocupada!");
    }

    //Método para leer la matriz
    public void leerMatriz() {
        System.out.println("IMPRIMIENDO LA MATRIZ");
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[i].length; j++) {
                System.out.print(notas[i][j] + "  ");

            }
            //Paso a otra fila salto de linea
            System.out.println("");

        }
    }

}
