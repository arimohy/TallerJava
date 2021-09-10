package Punto18;

public class VideoJuego implements Entregable{
    private String titulo="";
    private int horas=10;
    private boolean entregado=false;
    private String genero="";
    private  String compañia="";
    //*****CONSTRUCTORES

    public VideoJuego() {
    }

    public VideoJuego(String titulo, int horas) {
        this.titulo = titulo;
        this.horas = horas;
    }

    public VideoJuego(String titulo, int horas, String genero, String compañia) {
        this.titulo = titulo;
        this.horas = horas;
        this.genero = genero;
        this.compañia = compañia;
    }
    //***GETTER Y SETTER

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }
    public void setEntregado(boolean entregado) {
        this.entregado = entregado;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }
    //****METODOS*********

    @Override
    public String toString() {
        return "VideoJuego{" +
                "titulo='" + titulo + '\'' +
                ", horas=" + horas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", compañia='" + compañia + '\'' +
                '}';
    }
    @Override
    public void entregar() {
        this.entregado=true;

    }

    @Override
    public void devolver() {
        this.entregado=false;
    }

    public boolean isEntregado() {
        return this.entregado;
    }

    @Override
    public int compareTo(Object a) {
        return 0;
    }

}
