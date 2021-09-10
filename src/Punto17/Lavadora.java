package Punto17;

public class Lavadora extends Electrodomestico{
    protected double carga=5;

    //***constructores


    public Lavadora() {
        super();
    }

    public Lavadora(double preciobase, double peso) {
        super(preciobase, peso);


    }

    public Lavadora(double carga) {
        super();
        this.carga = carga;
    }
    //*****get

    public double getCarga() {
        return carga;
    }

    @Override
    public double precioFinal() {
        double v=super.precioFinal();
        if(this.carga>30)v+=50;
        return v;
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "preciobase=" + preciobase +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                ", carga=" + carga +
                '}';
    }
}
