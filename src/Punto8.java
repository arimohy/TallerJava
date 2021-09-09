import java.util.Scanner;

public class Punto8 {
    public static void diaslaboral(){
        Scanner escaner = new Scanner (System.in); //Creación de un objeto Scanner

        System.out.println ("Ingrese un dia de la semana(lunes,martes,...,etc):");
        String dia = escaner.nextLine();
        String respuesta="Es un dia laboral";
        dia=dia.toUpperCase();
        switch (dia){
            case "LUNES":
            case "MARTES":
            case "MIERCOLES":
            case "JUEVES":
            case "VIERNES":
                respuesta="es un dia laboral";
                break;
            case "SABADO":
            case "DOMINGO":
                respuesta="no es un dia labora";
                break;
            default: respuesta="no es un dia valido valido";
        }
        System.out.println("El dia "+dia.toLowerCase()+" "+respuesta);
    }
    public static void main(String[] args) {
        diaslaboral();
    }
}
