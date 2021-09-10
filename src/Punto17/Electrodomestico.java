package Punto17;

public class Electrodomestico {
    protected double preciobase=100;
    protected String color="blanco";
    protected char consumoEnergetico='F';
    protected double peso=5;
    //********Constructores**********

    public Electrodomestico() {

    }


    public Electrodomestico(double preciobase, double peso) {
        this.preciobase = preciobase;
        this.peso = peso;

    }

    public Electrodomestico(double preciobase, String color, char consumoEnergetico, double peso) {
        this.preciobase = preciobase;
        this.color = color;

        this.peso = peso;
        comprobarConsumoEnergetico(consumoEnergetico);

    }
    //********metodos get de todos los atributos

    public double getPreciobase() {
        return preciobase;
    }

    public String getColor() {
        return color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }
    //****Metodos********
    protected void comprobarConsumoEnergetico(char letra){
        if(letra=='A' || letra=='B' || letra=='C' || letra=='D' || letra=='E' || letra=='F'){
            this.consumoEnergetico=letra;
        }
    }
    protected void comprobarColor(String color){
        String c=color.toLowerCase();
        if(c=="blanco" || c=="negro" || c=="rojo" || c=="azul" || c=="gris"){
            this.color=color;
        }
    }
    public double aumentarPorConsumo(){
        double v=0;
        switch (this.consumoEnergetico){
            case 'A':
                v= 100;
                break;
            case 'B':
                v= 80;
                break;
            case 'C':
                v= 60;
                break;
            case 'D':
                v= 50;
                break;
            case 'E':
                v= 30;
                break;
            case 'F':
                v= 10;
                break;
        }
        return v;
    }
    public double aumentarPorPeso(){
        double v=0;
        double peso=this.peso;
        if(peso<20)v=10;
        else if(peso>=20 && peso<50)v=50;
        else if(peso>=50 && peso<80)v=80;
        else if (peso>=80)v=100;
        return v;
    }
    public double precioFinal(){
        return this.preciobase+ aumentarPorConsumo()+aumentarPorPeso();

    }

    @Override
    public String toString() {
        return "Electrodomestico{" +
                "preciobase=" + preciobase +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                '}';
    }
}
