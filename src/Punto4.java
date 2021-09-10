import java.util.Scanner;

public class Punto4 {
    //CALCULAR PRECIO FINAL

    public static void preciofinal(){
        double IVA=0.21;
        Scanner escaner = new Scanner (System.in); //Creación de un objeto Scanner
        System.out.println ("Ingrese el precio del producto:");
        double precioproducto = Double.parseDouble(escaner.nextLine());
        double preciofinal=precioproducto+precioproducto*IVA;

    }
    public static void main() {
        preciofinal();
    }
}
