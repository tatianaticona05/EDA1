package fundamentos;
import java.util.Scanner;

public class RegistroTemperaturas {

    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        //variables
        int max, min;

        int dias = 0;
        int errores = 0;

        double sumaMax = 0, sumaMin = 0;
        double promMax = 0, promMin = 0;
        double porcentajeError = 0;

        //leer datos.
        max = sc.nextInt();
        min = sc.nextInt();

        while (!(max == 0 && min == 0)) {

            if (max == 9 || min == 9) {
                errores = errores + 1;
            } else {
                dias = dias + 1;
                sumaMax = sumaMax + max;
                sumaMin = sumaMin + min;
            }

            max = sc.nextInt();
            min = sc.nextInt();
        }

        if (dias > 0) {
            promMax = sumaMax / dias;
            promMin = sumaMin / dias;
        }

        if ((dias + errores) > 0) {
            porcentajeError = (errores * 100.0) / (dias + errores);
        }

        //reesultados
        System.out.println("Dias: " + dias);
        System.out.println("Promedio Max: " + promMax);
        System.out.println("Promedio Min: " + promMin);
        System.out.println("Errores: " + errores);
        System.out.println("Porcentaje Error: " + porcentajeError + "%");
    }
}
