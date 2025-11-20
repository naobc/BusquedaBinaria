import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.Arrays;

public class busquedaBinaria {

    public static int busquedaBinaria(int[] arr, int objetivo) {
        int inicio = 0, fin = arr.length - 1;

        while (inicio <= fin) {
            int medio = (inicio + fin) / 2;

            if (arr[medio] == objetivo) return medio;
            if (arr[medio] < objetivo) inicio = medio + 1;
            else fin = medio - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("numeros.txt"));

            String linea = br.readLine();
            int[] arr = Arrays.stream(linea.split(" "))
                            .mapToInt(Integer::parseInt)
                            .toArray();

            int buscar = Integer.parseInt(br.readLine());

            br.close();

            int resultado = busquedaBinaria(arr, buscar);

            PrintWriter pw = new PrintWriter("resultado.txt");
            pw.println("Buscando: " + buscar);
            pw.println("Índice encontrado: " + resultado);
            pw.close();

            System.out.println("BusquedaBinaria generada en resultado.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
