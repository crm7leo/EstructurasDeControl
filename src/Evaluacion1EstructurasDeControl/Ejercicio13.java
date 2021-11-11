package Evaluacion1EstructurasDeControl;

import java.util.Scanner;
/*
 * Ejercicio 13
 * @author:  Leonardo Velásquez Monserrate*/
public class Ejercicio13 {
    public static void main(String[] args) {
        /*13. Escribe un programa que, dado un importe en euros, indique el número mínimo de
billetes y la cantidad sobrente que se pueden utilizar para obtener dicha cantidad.
Por ejemplo:

232 euros: 1 billete de 200, 1 billete de 20, un billete de 10, y sobren 2 euros.*/

        Scanner sc = new Scanner(System.in);
        System.out.println("introduzca una cantidad en euros");
        int euros= sc.nextInt();
        int calc1 = euros /5;
        int calc2 = euros/10;
        int calc3 = euros/20;
        int calc4 = euros/50;
        int calc5 = euros/100;
        int calc6 = euros/200;
        int calc7 = euros/500;
        if (euros >=500){
            System.out.print(calc7 +" Billete/s de 500 "+ ((euros%500)/200)+ " Billete/s de 200 " +((euros%200)/100)+ " Billete/s de 100 " +((euros%100)/50)+ " Billete/s de 50 " +((euros%50)/20)
                    + " Billete/s de 20 " + ((euros%20)/10) + "  billete/s de 10 " +((euros%10)/5)+ " Billete/s de5 y sobran"+ (euros%5)+ "euros");
        }else if ((euros <500)&&(euros>=200) ){
            System.out.println( calc6 +" Billete/s de 200 " +((euros%200)/100)+ " Billete/s de 100 " +((euros%100)/50)+ " Billete/s de 50 " +((euros%50)/20)
                    + " Billete/s de 20 " + ((euros%20)/10) + "  billete/s de 10 " +((euros%10)/5)+ " Billete/s de5 y sobran"+ (euros%5)+ "euros" );
        }else if ((euros<200)&&(euros>=100)){
            System.out.printf(calc5+" Billete/s de 100 " +((euros%100)/50)+ " Billete/s de 50 " +((euros%50)/20)
                    + " Billete/s de 20 " + ((euros%20)/10) + "  billete/s de 10 " +((euros%10)/5)+ " Billete/s de5 y sobran"+ (euros%5)+ "euros" );
        }else if ((euros<100)&&(euros>=50)){
            System.out.println(calc4+" Billete/s de 50 " +((euros%50)/20)
                    + " Billete/s de 20 " + ((euros%20)/10) + "  billete/s de 10 " +((euros%10)/5)+ " Billete/s de5 y sobran"+ (euros%5)+ "euros");
        }else if ((euros<50)&&(euros>=20)){
            System.out.println(calc3+ " Billete/s de 20 " + ((euros%20)/10) + "  billete/s de 10 " +((euros%10)/5)+ " Billete/s de5 y sobran"+ (euros%5)+ "euros");
        }
        else if ((euros<20)&&(euros>=10)){
            System.out.println(calc2+ "  billete/s de 10 " +((euros%10)/5)+ " Billete/s de5 y sobran"+ (euros%5)+ "euros");
        }
        else if ((euros<10)&&(euros>=5)){
            System.out.println(calc1+" Billete de5 y sobran"+ (euros%5)+ "euros");
    }else{
            System.out.println("error");
        }


    }}




