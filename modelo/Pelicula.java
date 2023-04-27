package modelo;

public class Pelicula extends ObjetoRentable {
    private String sipnosis;
    private String pais;
    private Director director;
    private Actor[] actores= new Actor[30];
    private int numActores= 0;  

    public Pelicula(String ti, int ann, String gen, String sip, String pa){
        super(ti, ann, gen);
        sipnosis= sip;
        pais= pa;
    }
    public String getSipnosis(){
        return sipnosis;
    }
    public void setSipnosis(String sip){
        sipnosis= sip;
    }
    public String getPais(){
        return pais;
    }
    public void setPais(String pa){
        pais= pa;
    }
    public Director getDirector(){
        return director;
    }
    public void setDirector(Director d){
        director= d;
    }
    public Actor getActor(int i){
        return actores[i];
    }
    public String toString(){
        return super.toString()+"Sipnois: "+sipnosis+"\nPais: "+pais+"\nDirector: "+director +"\nNumero de actores: "+numActores;
    }
}
