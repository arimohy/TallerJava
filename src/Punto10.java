import java.util.Scanner;

public class Punto10 {
    public static void quitarespacios(){
        System.out.println ("Ingrese una frase para eliminar espacios :");
        Scanner scanner=new Scanner(System.in);
        String cadena=scanner.nextLine();
        cadena=cadena.replace(" ","");
        System.out.println("La frase quedo asi:");
        System.out.println(cadena);
    }
    public static void main() {
        quitarespacios();
    }
}
