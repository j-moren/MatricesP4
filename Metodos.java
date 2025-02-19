import java.util.Random;
import java.util.Scanner;

public class Metodos {
    
    public int[][] solicitarDimensión() {
        Scanner sc = new Scanner (System.in);// Crear objeto Scanner para leer la entrada
        
        System.out.println("Ingrese el Número de Filas de la Matriz: "); // Solicitar el Número de Filas
        int i = sc.nextInt(); // Lee el Número de filas

        System.out.println("Ingrese el Número de las Columnas: "); // Solicitar el Número de las colummnas
        int j = sc.nextInt(); // Lee el número de columnas

        int [][] matriz = new int[i][j]; // Crear Matriz con dimensiones Ingresadas

        sc.close();

        return matriz;

    }
    public void llenarMatriz (int[][] matriz){
        Random rand = new Random(); // Llenar Matriz con Valores Aleatorios entre 0 a 100

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz [i][j] = rand.nextInt(101); // Genera Números entre 0 a 100
                
            }
        }
    }
    public int[] sumarColumnas (int[][] matriz) {
        int[] sumasColumnas = new int[matriz[0].length]; // Array para almacenar las sumas de las columnas

        for (int j = 0; j < matriz[0].length; j++) {
            int sumaColumna = 0;
            for (int i = 0; i < matriz.length; i++) {
                sumaColumna += matriz[i][j]; // Suma los Elementos de Cada Columna
            }
            sumasColumnas[j] = sumaColumna; // Guarda la suma de la Columna en un Array
        }
        return sumasColumnas;
    }    
    public int columnaconMaximasuma(int[] sumasColumnas) {
        int maxSuma = sumasColumnas[0]; // Inicializamos con la Primera suma
        int columnaMaxima = 0; // Inicializamos con la Primera Colunma

        for (int i = 1; i < sumasColumnas.length; i++) {
            if (sumasColumnas[i] > maxSuma) {
            maxSuma = sumasColumnas[i]; // Actualizamos la Maxima Suma
            columnaMaxima = i; // Actualizamos la Columna con la Maxima Suma
            }
        }
        return columnaMaxima;
    }
}
