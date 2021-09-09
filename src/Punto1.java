public class Punto1 {

    //punto 1
    /*
    Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos. Si son iguales indicarlo también. Ve cambiando los valores para comprobar que funciona.
     */
    public static void comparar(int nro1, int nro2){
        if(nro1>nro2)
            System.out.println("El nro "+nro1+" es mayor que el nro "+nro2);
        else if(nro1==nro2)
            System.out.println("Los numeros son iguales");
        else
            System.out.println("El nro "+nro2+" es mayor que el nro "+nro1);
    }

    public static void main(String[] args) {
        int nro1=18;
        int nro2=15;
        comparar(nro1,nro2);
        nro1=18;
        nro2=18;
        comparar(nro1,nro2);
    }
}
