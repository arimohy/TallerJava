package Punto17;

public class Television extends Electrodomestico {
    protected double resolucion=20;
    protected boolean sintonizadortdt=false;
    //*****constructores

    public Television() {
        super();

    }

    public Television(double preciobase, double peso) {
        super(preciobase, peso);


    }

    public Television(double resolucion, boolean sintonizadortdt) {
        super();
        this.resolucion = resolucion;
        this.sintonizadortdt = sintonizadortdt;

    }
    //******

    public double getResolucion() {
        return resolucion;
    }

    public boolean isSintonizadortdt() {
        return sintonizadortdt;
    }

    @Override
    public double precioFinal() {
        double v=super.precioFinal();
        if(this.resolucion>40)v+=preciobase*0.3;
        if (this.sintonizadortdt)v+=50;
        return v;
    }

    @Override
    public String toString() {
        return "Television{" +
                "preciobase=" + preciobase +
                ", color='" + color + '\'' +
                ", consumoEnergetico=" + consumoEnergetico +
                ", peso=" + peso +
                ", resolucion=" + resolucion +
                ", sintonizadortdt=" + sintonizadortdt +
                '}';
    }
}
