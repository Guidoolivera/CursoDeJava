package TPS;

import java.util.Scanner;

public class TP9 {
    public static void main(String[] args) {

        int genero = 0;
        int altura;
        int pesoIdeal;

        Scanner scanner = new Scanner(System.in);

        System.out.println("A continuación, especifique su género, ingresando 1 si es hombre, 2 si es mujer: ");
        genero = scanner.nextInt();
        while (genero != 1 && genero != 2){
            System.out.println("Opción no válida, especifique nuevamente su género, ingresando 1 si es hombre, 2 si es mujer: ");
            genero = scanner.nextInt();
        }

        System.out.println("Ingrese su altura en centímetros: ");
        altura = scanner.nextInt();
        while (altura < 140 && altura > 250){
            System.out.println("Número fuera de los rangos aceptados, ingrese nuevamente la altura: ");
            altura = scanner.nextInt();
        }

        if (genero == 1){
            pesoIdeal = altura - 120;
            System.out.println("El peso ideal para un hombre de " + altura + " centímetros es de: " + pesoIdeal + " kilogramos");
        }else{
            pesoIdeal = altura - 110;
            System.out.println("El peso ideal para una mujer de " + altura + " centímetros es de: " + pesoIdeal + " kilogramos");
        }
    }
}
