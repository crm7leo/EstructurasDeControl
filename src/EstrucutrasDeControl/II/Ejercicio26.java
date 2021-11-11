package EstrucutrasDeControl.II;
import java.util.Scanner;
public class Ejercicio26 {

        public static void main(String[] args) {
        /*
        26. Un vendedor recibe un sueldo base mas un 10% extra por comisión de sus ventas, el
vendedor desea saber cuanto dinero obtendrá por concepto de comisiones por las
tres ventas que realiza en el mes y el total que recibirá en el mes tomando en cuenta
su sueldo base y comisiones.
         */

            // Empezamos pidiendo datos
            Scanner sc = new Scanner(System.in);
            System.out.println("Sueldo base:");
            double sueldo1 = sc.nextDouble();
            System.out.println("Cuantas ventas?");
            double venta1 = sc.nextDouble();
            System.out.println("Precio");
            double suma = 0;

            for (int i = 1; i <= venta1; i++){
                double n = sc.nextDouble();
                suma = suma + n;
            }
            double ventasfinal = (suma * 10) /100;
            double sueldoginal = (ventasfinal + sueldo1);
            System.out.println("Sueldo =" + sueldoginal );


        }
    }


