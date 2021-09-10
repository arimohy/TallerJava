package Punto16;

import java.util.Scanner;

public class Main {
    public static void esmayor(boolean edad){
        if (edad==true) System.out.println("Es mayor de edad");
        else System.out.println("No es mayor de edad");
    }
    public static void pesoideal(int ideal){
        if(ideal==-1) System.out.println("por debajo de su peso ideal");
        if(ideal==0) System.out.println("Su peso es ideal");
        if(ideal==1) System.out.println("Tiene sobrepeso");
    }
    public static void main() {
        Scanner scanner=new Scanner(System.in);
        System.out.println ("Escriba el nombre de la persona :");
        String nombre=scanner.nextLine();
        System.out.println ("Escriba la edad de la persona :");
        int edad =scanner.nextInt();;
        System.out.println ("Escriba el sexo de la persona :");
        char sexo=scanner.next().toUpperCase().charAt(0);
        System.out.println ("Escriba el peso de la persona :");
        double peso=Double.parseDouble(scanner.next());
        System.out.println ("Escriba la altura de la persona :");
        double altura=Double.parseDouble(scanner.next());

        Persona persona1=new Persona(nombre,edad,sexo,peso,altura);
        Persona persona2=new Persona(nombre,edad,sexo);
        Persona persona3=new Persona();
        //usando set para completar persona3
        persona3.setNombre("Yhomira");
        persona3.setEdad(25);
        persona3.setSexo('M');
        persona3.setPeso(65);
        persona3.setAltura(1.55);

        System.out.println("Pesos de las personas");
        pesoideal(persona1.IMC());
        pesoideal(persona2.IMC());
        pesoideal(persona3.IMC());
        System.out.println("Son mayores de edad?");
        esmayor(persona1.esMayorDeEdad());
        esmayor(persona2.esMayorDeEdad());
        esmayor(persona3.esMayorDeEdad());
        System.out.println("Usando el tostring para ver datos");
        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        System.out.println(persona3.toString());

    }
}
