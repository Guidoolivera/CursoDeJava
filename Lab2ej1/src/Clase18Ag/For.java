package Clase18Ag;

import javax.swing.*;
import java.util.Scanner;

public class For {

    public static void main(String[] args) {

        int cant = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese cantidad de numeros a sumar"));

        String[] arr1 = new String[100];

        String numIngresado;
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un número");
        numIngresado = s.nextLine();
        int i = 0;

        while (!numIngresado.equals("f")){
            System.out.println("Ingrese un número");
            numIngresado = s.nextLine();
            arr1[i] = numIngresado;
            i++;
        }
        i = 0;
        while (i<cant){
            System.out.println("Pos : "+ arr1[i]);
            i++;
        }

    }
}
