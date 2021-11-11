package Evaluacion1EstructurasDeControl;

import java.util.Scanner;
/*
 * Ejercicio 7
 * @author:  Leonardo Velásquez Monserrate*/
public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*
        * 7. Realiza un programa que reciba una cantidad de minutos y muestre por pantalla a
        cuantas horas y minutos corresponde. Por ejemplo: 1000 minutos son 16 horas y 40
        minutos.
*       */
        System.out.println("introduzca una cantidad de minutos");
        int min = sc.nextInt();
        int horas = min / 60;
        int min2 = min % 60;

        if ( min > 0){
            System.out.println(min + " minutos son exactamente " + horas + " horas y " + min2 +" minutos ");
        } else System.out.println("Error");
    }
}
