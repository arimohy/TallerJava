import java.util.Scanner;

public class Main {
    public static  void menu(){
        String menu="""
        *******TALLER DE JAVA ********
        Escriba el numero de punto a ejecutar (1 al 18) o 19 para salir:
        """;
        System.out.println(menu);
    }
    public static void main(String[] args) {
        menu();
        System.out.println("Escoja el nro de punto que desea ver");
        Scanner scanner=new Scanner(System.in);
        System.out.println ("Escriba el numero de la opcion escogida :");
        int nro=scanner.nextInt();
        while (nro!=19){
            switch (nro){
                case 1:
                    Punto1.main();
                    break;
                case 2:
                    Punto2.main();
                    break;
                case 3:
                    Punto3.main();
                    break;
                case 4:
                    Punto4.main();
                    break;
                case 5:
                    Punto5.main();
                    break;
                case 6:
                    Punto6.main();
                    break;
                case 7:
                    Punto7.main();
                    break;
                case 8:
                    Punto8.main();
                    break;
                case 9:
                    Punto9.main();
                    break;
                case 10:
                    Punto8.main();
                    break;
                case 11:
                    Punto8.main();
                    break;
                case 12:
                    Punto8.main();
                    break;
                case 13:
                    Punto8.main();
                    break;
                case 14:
                    Punto8.main();
                    break;
                case 15:
                    Punto15.main();
                    break;
                case 16:
                    Punto16.Main.main();
                    break;
                case 17:
                    Punto17.Main.main();
                    break;
                case 18:
                    Punto18.Main.main();
                    break;
                default:
                    System.out.println("No seleciono correctamente tiene las opciones de 1 al 8");
                    break;
            }
            menu();
            System.out.println ("Escriba el numero de la opcion escogida :");
            nro=scanner.nextInt();
        }
        System.out.println("GRACIAS ,CHAU...");
    }
}
