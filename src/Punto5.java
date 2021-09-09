public class Punto5 {
    public static void ParesImpares(){
        int c=1;
        String pares="Los numeros pares son: ";
        String impares="Los numeros impares son: ";
        while (c<=100){
            if(c%2==0)
                pares+=String.valueOf(c)+",";
            else
                impares+=String.valueOf(c)+",";
            c+=1;
        }
        System.out.println(pares);
        System.out.println(impares);
    }
    public static void main(String[] args) {
        ParesImpares();
    }
}
