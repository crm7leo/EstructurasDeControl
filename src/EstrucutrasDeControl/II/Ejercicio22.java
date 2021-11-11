package EstrucutrasDeControl.II;
import java.util.Scanner;
public class Ejercicio22 {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
       /*
       22. Realiza un programa que pida las notas finales de todos los módulos de 1o y muestre
la nota final del curso. La nota final es la media de las notas de todos los módulos,
redondeada a un número entero (por ejemplo, si la media es 7,5, la nota final es 8; si
es 7,4, la nota final es 7).
            }*/
            int a = 0;
            int contador = 0;
            String b1 = "Bases de datos";
            String c2 = "Programación";
            String d3 = "Lenguaje de marcas";
            String e4 = "Sistemas Informaticos";
            String f5 = "FOL";
            String g6 = "Entornos de Desarrollo";
            double n1 = 0;
            double n2 = 0;
            double n3 = 0;
            double n4 = 0;
            double n5 = 0;
            double n6 = 0;


            for (int i = 0; i <= 6; i++ ) {
                if (i == 1) {
                    System.out.println(b1);
                    n1 = sc.nextDouble();
                } else if (i == 2) {
                    System.out.println(c2);
                    n2 = sc.nextDouble();
                } else if (i == 3) {
                    System.out.println(d3);
                    n3 = sc.nextDouble();
                } else if (i == 4) {
                    System.out.println(e4);
                    n4 = sc.nextDouble();
                } else if (i == 5) {
                    System.out.println(f5);
                    n5 = sc.nextDouble();
                } else if (i == 6) {
                    System.out.println(g6);
                    n6 = sc.nextDouble();
                }
            }double media = (n1+n2+n3+n4+n5+n6)/6;
            System.out.println(media);
        }}



