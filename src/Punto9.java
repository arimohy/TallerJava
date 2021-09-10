import java.util.Scanner;

public class Punto9 {
    public static void frase(){
        /*Del texto, “La sonrisa sera la mejor arma contra la tristeza” Reemplaza todas las a del String anterior
        por una e, adicionalmente concatenar a esta frase una adicional que ustedes quieran incluir por consola y
         las muestre luego unidas.*/

        String cadena="La sonrisa sera la mejor arma contra la tristeza";
        cadena=cadena.replace('a','e');
        Scanner scanner=new Scanner(System.in);
        System.out.println ("Ingrese una frase que quiera agregar :");
        cadena+=", "+scanner.nextLine();
        System.out.println("La frase quedo asi:");
        System.out.println(cadena);
    }
    public static void main() {
        frase();
    }
}
