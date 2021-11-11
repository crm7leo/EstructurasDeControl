package Evaluacion1EstructurasDeControl;

import java.util.Scanner;
/*
 * Ejercicio  11
 * @author:  Leonardo Velásquez Monserrate*/
public class Ejercicio11 {
    public static void main(String[] args) {
        /*11. Dado un número de dos cifras, escribe un programa que permita obtener el número
        invertido. Ejemplo, si se introduce 23 que muestre 32.*/
        Scanner sc = new Scanner(System.in);
        int digi= sc.nextInt();
        if ((digi>=10)&&(digi<100)){
            System.out.println( (digi%10)+ "" + (digi/10) );

        }
    }
}
