package ProyectoCodigo.objetosRentables;

/**
 * ObjetoRentable
 */
public class ObjetoRentable {

    protected String titulo;
    protected int annio;
    protected String genero;

    public ObjetoRentable(){}
    public ObjetoRentable(String ti, int ann, String gen){
        titulo= ti;
        annio= ann;
        genero= gen;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setTItulo(String ti){
        titulo= ti;
    }
    public int getAnnio(){
        return annio;
    }
    public void setAnnio(int ann){
        annio= ann;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String gen) {
        genero = gen;
    }
    @Override
    public String toString() {
        return "Titulo: " + titulo + "\nAnnio: " + annio + "\nGenero: " + genero;
    }
    
}