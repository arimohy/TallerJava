import java.util.Scanner;

public class Punto14 {
    public static void salto2por2(){
        /*Crear un programa que pida un numero por teclado y que imprima por pantalla los números desde
         el numero introducido hasta 1000 con saldos de 2 en 2.*/
        Scanner scanner=new Scanner(System.in);
        System.out.println("==========SALTOS DE 2 EN 2 HASTA 1000===========");
        System.out.println ("Ingrese el numero del que quiere comenzar a saltar :");
        int nro=scanner.nextInt();
        while (nro<=1000){
            System.out.println(nro);
            nro+=2;
        }

    }
    public static void main() {
        salto2por2();
    }
}
