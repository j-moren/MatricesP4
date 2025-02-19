

public class MatricesP4 {

    public static void main(String[] args) {
        Metodos metodos = new Metodos();

        int[][] matriz = metodos.solicitarDimensión(); // Solicitar la dimensión de la Matriz

        metodos.llenarMatriz(matriz); // Llenar la Matriz con datos

        int[] sumasColumnas = metodos.sumarColumnas(matriz); //Sumar las Columnas

        int columnaMaxima = metodos.columnaconMaximasuma(sumasColumnas); // Encontrar la Columna con la Máxima Suma

        metodos.imprimirColumnaConMaximaSuma(matriz, columnaMaxima);

        metodos.imprimirSumaColumna(sumasColumnas, columnaMaxima);
    }
}