package modelo;

public class Capitulo {
    private String titulo;
    private String sipnosis;
    private double duracion;
    private Actor[] actores=new Actor[30];
    private int numActores=0;

    public Capitulo(String t, String sip, double dura){
        titulo= t;
        sipnosis= sip;
        duracion= dura;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String ti){
        titulo= ti;
    }
    public String getSipnosis(){
        return sipnosis;
    }
    public void setSipnosis(String sip){
        sipnosis= sip;
    }
    public double getDuracion(){
        return duracion;
    }
    public void setDuracion(double dura){
        duracion= dura;
    }
    public Actor getActor(int i){
        return actores[i];
    }
    public int getNumActores(){
        return numActores;
    }

}
