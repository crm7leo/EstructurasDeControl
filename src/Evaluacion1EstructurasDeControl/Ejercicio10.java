package Evaluacion1EstructurasDeControl;

import java.util.Scanner;
/*
 * Ejercicio 10
 * @author:  Leonardo Velásquez Monserrate*/
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*10. Dado un número de dos dígitos, imprime su primer número (las decenas).*/
        System.out.println("introduzca un número de dos dígitos");
        int digi= sc.nextInt();
        if ((digi>=10)&&(digi<100)){
            System.out.println((digi/10) + " decenas " + (digi%10) +" unidades.");

        }else System.out.println("introduza un número de dos digitos");
    }
}
