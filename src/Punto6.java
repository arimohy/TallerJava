public class Punto6 {
    public static void ParesImpares(){
        String pares="Los numeros pares son: ";
        String impares="Los numeros impares son: ";
        for (int c=1;c<=100;c++){
            if(c%2==0)
                pares+=String.valueOf(c)+",";
            else
                impares+=String.valueOf(c)+",";
        }
        System.out.println(pares);
        System.out.println(impares);
    }
    public static void main(String[] args) {
        ParesImpares();
    }
}
