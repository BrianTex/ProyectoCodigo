package modelo;

public class Serie extends ObjetoRentable{
    private Temporada[] temporadas;
    private int numTemporadas=0;

    public Serie(String ti, int ann, String gen){
        super(ti, ann, gen);
        temporadas= new Temporada[20];
    }
    public Temporada getTemporada(int i){
        return temporadas[i];
    }
    public int getNumTemporadas(){
        return numTemporadas;
    }
    public String toString(){
        return super.toString()+"\nNumero de temporadas: "+numTemporadas;
    }
}
