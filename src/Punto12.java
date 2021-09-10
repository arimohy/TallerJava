import java.util.Locale;
import java.util.Scanner;

public class Punto12 {
    public static void compararletras(String p1 ,String p2){
        String menor=p1;
        String mayor=p2;
        if(p1.length()>p2.length()){
            menor=p2;
            mayor=p1;
        }
        for (int i=0;i<menor.length();i++){
            if(menor.charAt(i)!=mayor.charAt(i)){
                System.out.println("Letra "+(i+1)+" de la palabra 1 ["+p1.charAt(i)+"] es diferente a la Letra "+(i+1)+" de la palabra 2 ["+p2.charAt(i)+"]");
            }
        }

    }
    public static void compararpalabras(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("==========COMPARACION DE PARABRAS===========");
        System.out.println ("Ingrese primera palabra :");
        String palabra1=scanner.nextLine();
        System.out.println ("Ingrese segunda palabra :");
        String palabra2=scanner.nextLine();
        if(palabra1.compareTo(palabra2)==0)
            System.out.println(palabra1+" y "+palabra2+"SON IGUALES");
        else {

            System.out.println("***las diferencias entre las 2 palabras***");
            if(palabra1.length()!=palabra2.length()){
                System.out.println("tienen diferente tamaño la palabra 1 tiene: "+palabra1.length()+" y la palabra 2 tiene "+palabra2.length());
                compararletras(palabra1,palabra2);
            }
            else{
                compararletras(palabra1,palabra2);
            }

        }
    }
    public static void main() {
        compararpalabras();
    }
}
