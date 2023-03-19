import java.util.Scanner;

/**
 * @author DIANA PAZ
 */

public class dni{

    static Scanner sc = new Scanner(System.in);
    /**
     * El método main recibe la entrada del usuario y llama al método obtenerLetra para calcular la letra del DNI.
     * Finalmente, imprime el número del DNI y su letra correspondiente.
     *
     * @param args argumentos de línea de comando
     */

    public static void main(String[] args){
        System.out.println("Este algoritmo calcula la letra del DNI");
        System.out.println("Introduce tu dni");
       int dni = sc.nextInt();
        char letras = obtenerLetraAleatoria(dni);
        System.out.println("Tu dni es "+ dni +letras);
        System.out.println("ESTE ES TU NUMERO DE DNI ALEATORIO");
        System.out.println("esta es una nueva modificacion");



    }

    /**
     * El método obtenerLetra calcula la letra del DNI a partir del número del DNI recibido como parámetro.
     *
     * @param dni número del DNI
     * @return letra correspondiente al número del DNI
     */

    public static char obtenerLetraAleatoria(int dni){
        char[] letraAleatoria = {'T', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        int resto = dni % 23;
        return letraAleatoria[resto];
    }
}
