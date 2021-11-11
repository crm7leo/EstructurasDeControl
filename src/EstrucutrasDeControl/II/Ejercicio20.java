package EstrucutrasDeControl.II;

import java.util.Scanner;

public class Ejercicio20 {
        public static void main(String[] args) {
       /*
       20. Realizar un programa que lea cuatro valores numéricos e imprima su suma y su
media. Ten en cuenta que la media puede contener decimales.

            Scanner sc = new Scanner(System.in);
            int número = 0;
            int número2 = 0;
            int número3 = 0;
            int número4 = 0;
            int suma = 0;
            double media = 0;
            for (int i = 0; i < 4; i++ ) {
                System.out.println("Número");
                número = sc.nextInt();
                número2 = sc.nextInt();
                número3 = sc.nextInt();
                número4 = sc.nextInt();
                suma = suma + número + número2 + número3 + número4;
                media = (media + suma) / 4;
                System.out.println("suma: " + suma);
                System.out.println("media: " + media);

            } */

                Scanner sc = new Scanner(System.in);
                int a = 0;
                int contador = 0;

                for (int i = 1; i <= 4; i++){
                        System.out.println("Inserte número:");
                        a= sc.nextInt();
                        contador = contador + a;
                }
                float media = contador / 4;
                System.out.printf( "La media de los cuatro anteriores numeros es de: ", media);;


        }}
