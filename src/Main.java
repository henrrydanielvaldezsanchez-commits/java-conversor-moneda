import java.util.Scanner;

class Conversor {
    double tasaDolar = 58.5;
    double tasaEuro = 63.2;

    double convertirADolar(double pesos) {
        return pesos / tasaDolar;
    }

    double convertirAEuro(double pesos) {
        return pesos / tasaEuro;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Conversor conv = new Conversor();

        System.out.println("Ingrese la cantidad en pesos:");
        double pesos = sc.nextDouble();

        System.out.println("1 - Convertir a Dólar");
        System.out.println("2 - Convertir a Euro");
        int opcion = sc.nextInt();

        if (opcion == 1) {
            double resultado = conv.convertirADolar(pesos);
            System.out.println("Dólares: " + resultado);
        } else if (opcion == 2) {
            double resultado = conv.convertirAEuro(pesos);
            System.out.println("Euros: " + resultado);
        } else {
            System.out.println("Opción inválida");
        }

        sc.close();
    }
}