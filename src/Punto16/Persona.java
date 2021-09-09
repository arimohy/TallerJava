package Punto16;

public class Persona {
    //**********ATRIBUTOS***********
    private String nombre="";
    private int edad=0;
    private String dni;
    private char sexo='H';
    private double peso=0;
    private double altura=0;
    //**********COSNTRUCTORES*********

    public Persona() {
        generaDNI();
    }

    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        generaDNI();
    }

    public Persona(String nombre, int edad,char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        generaDNI();
    }
    //************GETERS Y SETERS

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //************METODOS********************
    public final int IMC(){
        final int v1 = -1;
        final int v2= 0;
        final int v3= 1;
        double peso=this.peso/(this.altura*this.altura);
        if(peso<20)return v1;
        else if (peso>=20 && peso<=25)return v2;
        else return v3;
    }
    public boolean esMayorDeEdad(){
        boolean esmayor=true;
        if (this.edad<18)
            esmayor= false;
        return esmayor;
    }
    public void comprobarSexo(char sexo){
        if (sexo!=this.sexo)
            this.sexo='H';
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura +
                '}';
    }
    public void generaDNI(){
        int number = (int)(100000000 * Math.random());
        String letras="TRWAGMYFPDXBNJZSQVHLCKE";
        this.dni=String.valueOf(number)+letras.charAt(number%23);
    }

}
