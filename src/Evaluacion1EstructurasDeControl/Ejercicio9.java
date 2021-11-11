package Evaluacion1EstructurasDeControl;

import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Momento inicial");
        System.out.println("introduce la hora");
        int h1 = sc.nextInt();
        System.out.println("introduce los minutos");
        int m1= sc.nextInt();
        System.out.println("introduce los segundos");
        int s1 = sc.nextInt();
        System.out.println();
        System.out.println("MOmento Final");
        System.out.println("introduce la hora");
        int h2 = sc.nextInt();
        System.out.println("introduce los minutos");
        int m2= sc.nextInt();
        System.out.println("introudce los segundos");
        int s2 = sc.nextInt();
       if ( (h1<h2)&&(h1>0&&h1<24)&&( h2>0 && h2<24)&&(m1>0&&m1<60)&&(m2>0&&m2<60)&&
               (s1>0&&s1<60)&&(s2>0&&s2<60)) {
           int segs = h1 * 3600 + m1 * 60 + s1;
           int segs2 = h2 * 3600 + m2 * 60 + s2;
           int f = segs2 - segs;
           int hf = f / 3600;
           int mf = (f % 3600) / 60;
           int sf = mf % 60;
           System.out.println(hf + ":" + mf + ":" + sf);
       }else System.out.println("error");
    }}