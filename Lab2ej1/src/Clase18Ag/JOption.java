package Clase18Ag;


import javax.swing.*;

public class JOption {


    public static void main(String[] args) {


        int n1 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));

        int n2 = Integer.parseInt(JOptionPane.showInputDialog("Introduzca un numero"));

        int suma = n1 + n2;

        System.out.println("La suma de " + n1 + " y " + n2 + " es: "+ suma);

        JOptionPane.showMessageDialog(null, "La suma es: "+ suma);

    }

}