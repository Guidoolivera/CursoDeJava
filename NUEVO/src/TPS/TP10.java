package TPS;

import java.util.Scanner;

public class TP10 {
    public static void main(String[] args) {
        double numeroRandom = 1 + (Math.random()*100);
        int numeroAleatorio = (int) numeroRandom;
        int intentos = 1;
        int numeroElegido;
        Scanner scanner = new Scanner(System.in);

        /* Descomentar para observar los números generados.
        System.out.println(numeroRandom);
        System.out.println(numeroAleatorio);
        */

        System.out.println("Adivina el número entre 1 y 100!");
        System.out.println("Ingresa tu número elegido: ");

        numeroElegido = scanner.nextInt();

        while (numeroElegido != numeroAleatorio){ //Bucle que se repite hasta que los números coincidan.
            if (numeroElegido > numeroAleatorio){
                System.out.println("No! Mas bajo ;) \nIntenta de nuevo: ");
            }else{
                System.out.println("No! Más alto ;) \nIntenta de nuevo:");
            }
            intentos += 1;
            numeroElegido = scanner.nextInt();
        }
        System.out.println("Correcto! Adivinaste en " + intentos + " intento/s.");
    }
}

