package Evaluacion1EstructurasDeControl;

import java.util.Scanner;
/*
 * Ejercicio 8
 * @author:  Leonardo Velásquez Monserrate*/
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* 8. Escribe un programa que reciba un tiempo en segundos y muestre por pantalla este
        tiempo pero expresado en horas, minutos y segundos. Por ejemplo, 12.610 segundos
        son 3 horas, 30 minutos y 10 segundos.*/
        System.out.println("introduzca una cantidad de Segundos");
        int seg = sc.nextInt();

        int horas = seg / 3600;
        int segsrest = seg % 3600;
        int min = segsrest / 60;
        int seg2 = segsrest % 60;
        if ( seg > 0){
            System.out.println(seg + " Segundos, son exactamente "+ horas +" Horas "+min+" minutos y "+seg2+" Segundos.");
        } else System.out.println("Error");
    }
    }

