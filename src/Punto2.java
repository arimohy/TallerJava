import java.util.Scanner;

public class Punto2 {
    //punto 1
    /*
    Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos. Si son iguales indicarlo también. Ve cambiando los valores para comprobar que funciona.
     */
    public static void comparar(){
        Scanner escaner = new Scanner (System.in); //Creación de un objeto Scanner

        System.out.println ("Ingrese Primer numero:");
        int nro1 = escaner.nextInt();
        System.out.println ("Ingrese segundo numero:");
        int nro2 = escaner.nextInt();
        if(nro1>nro2)
            System.out.println("El nro "+nro1+" es mayor que el nro "+nro2);
        else if(nro1==nro2)
            System.out.println("Los numeros son iguales");
        else
            System.out.println("El nro "+nro2+" es mayor que el nro "+nro1);
    }

    public static void main() {
        comparar();
    }
}
