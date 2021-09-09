import java.util.Scanner;

public class Punto3 {
    static void areaCirculo(){
        Scanner escaner = new Scanner (System.in); //Creación de un objeto Scanner

        System.out.println ("Ingrese el radio del circulo:");
        double radio = Double.parseDouble(escaner.nextLine());
        double area=Math.PI*Math.pow(radio,2);
        System.out.println ("El area del circulo es:");
        System.out.println(area);

    }

    public static void main(String[] args) {
        areaCirculo();

    }
}
