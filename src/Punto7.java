import java.util.Scanner;

public class Punto7 {
    public static  void mayoracero(){
        double nro;
        do{
            Scanner escaner = new Scanner (System.in); //Creación de un objeto Scanner
            System.out.println ("Ingrese un numero:");
            nro = Double.parseDouble(escaner.nextLine());
        }while (nro<0);
        System.out.println("El numero mayor a cero es : "+nro);

    }
    public static void main() {
        mayoracero();
    }
}
