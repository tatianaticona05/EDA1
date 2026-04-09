package fundamentos;
import java.util.Scanner;

public class ArticulosCategoria {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        //variables
        char codigo;
        int cantidad;
        double precio;

        int totalA = 0, totalB = 0;
        double importeA = 0, importeB = 0;

        //leer datos
        codigo = sc.next().charAt(0);
        while (codigo != 'X') {

            precio = sc.nextDouble();
            cantidad = sc.nextInt();

            if (codigo == 'A') {
                totalA = totalA + cantidad;
                importeA = importeA + (precio * cantidad);
            } else if (codigo == 'B') {
                totalB = totalB + cantidad;
                importeB = importeB + (precio * cantidad);
            }

            codigo = sc.next().charAt(0);
        }

        //resultads
        System.out.println("Total A: " + totalA);
        System.out.println("Importe A: " + importeA);
        System.out.println("Total B: " + totalB);
        System.out.println("Importe B: " + importeB);
    }
}
