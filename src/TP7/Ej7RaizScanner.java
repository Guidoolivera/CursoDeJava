package TP7;

import java.util.Scanner;

public class Ej7RaizScanner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numeroParaCalcular;
        System.out.println("Ingrese un número para calcular su raíz: ");
        numeroParaCalcular = scanner.nextInt();
        RaizScanner raizScanner = new RaizScanner();
        raizScanner.calcularRaiz(numeroParaCalcular);
    }

    public static class RaizScanner {

        public void calcularRaiz(int numeroParaCalcular){

            if (numeroParaCalcular > 0) {
                System.out.println("La raíz de " + numeroParaCalcular + " es: " + Math.sqrt(numeroParaCalcular));
            } else
                System.out.println("Error: el número no puede ser negativo.");
        }
    }
}
