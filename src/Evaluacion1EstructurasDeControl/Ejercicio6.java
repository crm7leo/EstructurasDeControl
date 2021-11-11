package Evaluacion1EstructurasDeControl;

import java.util.Scanner;
/*
* Ejercicio 6
* @author:  Leonardo Velásquez Monserrate*/
public class Ejercicio6 {
    public static void main(String[] args) {
        /* N ardillas encuentran K nueces y deciden dividirlas equitativamente. Escribe un
programa que calcule (y muestre) cuántas nueces corresponden a cada ardilla y
cuántas sobrarán tras el reparto.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca Numero de ardillas");
        int n = sc.nextInt();
        System.out.println("Introduzca número de nueces");
        int k = sc.nextInt();
        int calc = k/n ;
        int calc2 = k%n;
        if (((n > 0)&&(k > 0))&&(k>n)){
            System.out.println(k + " nueces divididas entre " + n + " ardillas, daran a " +
                    calc + " nueces por ardilla y sobraran " + calc2 + " nueces");
        } else System.out.println("error");
    }
}
