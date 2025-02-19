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
}
