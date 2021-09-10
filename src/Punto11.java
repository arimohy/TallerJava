import java.util.Locale;
import java.util.Scanner;

public class Punto11 {
    public static void contarvocales(){
        System.out.println ("Ingrese una frase para saber tamaño y contar vocales:");
        Scanner scanner=new Scanner(System.in);
        String cadena=(scanner.nextLine()).toLowerCase();
        int tamaño=cadena.length();
        int a=0;
        int e=0;
        int i=0;
        int o=0;
        int u=0;
        for (int c=0;c<tamaño;c++){
            switch (cadena.charAt(c)){
                case 'a':
                    a+=1;
                    break;
                case 'e':
                    e+=1;
                    break;
                case 'i':
                    i+=1;
                    break;
                case 'o':
                    o+=1;
                    break;
                case 'u':
                    u+=1;
                    break;
            }
        }
        System.out.println("La longitud de la frase es: "+tamaño);
        System.out.println("En total la frase tiene "+(a+e+i+o+u)+" Vocales");
        System.out.println("La frase tienes vocales 'a' = "+a);
        System.out.println("La frase tienes vocales 'e' = "+e);
        System.out.println("La frase tienes vocales 'i' = "+i);
        System.out.println("La frase tienes vocales 'o' = "+o);
        System.out.println("La frase tienes vocales 'u' = "+u);
    }
    public static void main() {
        contarvocales();
    }
}
