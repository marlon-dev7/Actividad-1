import  java.util.Scanner; // Importa scanner para leer datos de entradad del usuario

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array1 = new int[7]; // Se crea el primer arreglo
        int[] array2 = new int[7]; // Se crea el segundo arreglo
        int[] arrayDiferencia = new int[7];

        int sumaTotal = 0;
        int totalElementos = array1.length * 2;

        System.out.println("Ingrese 7 valores para el primer arreglo");
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            array1[i] = sc.nextInt();
            sumaTotal += array1[i];
        }

        System.out.println("Ingrese 7 valores para el segundo arreglo");
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            array2[i] = sc.nextInt();
            sumaTotal += array1[i];
        }

        // Diferencia
        for (int i = 0; i < array1.length; i++) {
            arrayDiferencia[i] = array1[i] - array2[i];
        }

        // Promedio
        double promedio = (double) sumaTotal / totalElementos;

        System.out.printf("El promedio es: %.2f", promedio);

        System.out.println("\nArreglo de diferencias");
        for (int i = 0; i < arrayDiferencia.length; i++) {
            System.out.println("Posición" + i + ":" + arrayDiferencia[i]);
        }
        sc.close();
    }
}
