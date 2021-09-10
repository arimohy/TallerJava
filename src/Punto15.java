import java.util.Scanner;

public class Punto15 {
    public static void imprimemenu() {
        String menu="""
        ****** GESTION CINEMATOGRÁFICA ********
        1-NUEVO ACTOR
        2-BUSCAR ACTOR
        3-ELIMINAR ACTOR
        4-MODIFICAR ACTOR
        5-VER TODOS LOS ACTORES
        6-VER PELICULAS DE LOS ACTORES
        7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES
        8-SALIR
        """;
        System.out.println(menu);

    }
    public static void selecionOpcion(){
        imprimemenu();
        Scanner scanner=new Scanner(System.in);
        System.out.println ("Escriba el numero de la opcion escogida :");
        int nro=scanner.nextInt();
        while (nro!=8){
            switch (nro){
                case 1:
                    System.out.println("Selecciono la opcion 1");
                    break;
                case 2:
                    System.out.println("Selecciono la opcion 2");
                    break;
                case 3:
                    System.out.println("Selecciono la opcion 3");
                    break;
                case 4:
                    System.out.println("Selecciono la opcion 4");
                    break;
                case 5:
                    System.out.println("Selecciono la opcion 5");
                    break;
                case 6:
                    System.out.println("Selecciono la opcion 6");
                    break;
                case 7:
                    System.out.println("Selecciono la opcion 7");
                    break;
                case 8:
                    System.out.println("Selecciono la opcion 8");
                    break;
                default:
                    System.out.println("No seleciono correctamente tiene las opciones de 1 al 8");
                    break;
            }
            imprimemenu();
            System.out.println ("Escriba el numero de la opcion escogida :");
            nro=scanner.nextInt();
        }
        System.out.println("GRACIAS ,CHAU...");


    }
    public static void main() {
        selecionOpcion();
    }


}
