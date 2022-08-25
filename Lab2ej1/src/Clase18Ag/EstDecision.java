package Clase18Ag;

import javax.swing.*;
import java.sql.Struct;
import java.util.Scanner;

public class EstDecision {

    public static void main(String[] args) {

        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));

        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));

        int suma = n1 + n2;

        System.out.println("La suma de " + n1 + " y " + n2 + " es: "+ suma);

    //    JOptionPane.showMessageDialog(null, "La suma es: "+ suma);

        //Si n1 == 100, "es cien"
        //Si n1 >= 100, "es mayor a cien, pq es...n1"
        //Si n1 < 0, "no es real"

        if (suma == 100){
            JOptionPane.showMessageDialog(null, "La suma es cien");
        }else if (suma >= 100){
                JOptionPane.showMessageDialog(null, "La suma es mayor a cien, porque es " + suma);
            }
            else if (suma < 0){
            JOptionPane.showMessageDialog(null, "Es negativo");
        }


//Estructura while
        String clave = "Guido";

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la clave");

        String claveIngresada = entrada.nextLine();

        while (!claveIngresada.equals(clave)){
            /**
             * Se ejecutará mientras la condición sea verdadera
             */
            System.out.println("Clave incorrecta, vuelva a ingresar");
            claveIngresada = entrada.nextLine();
        }

        System.out.println("Clave correcta");
    }
}
