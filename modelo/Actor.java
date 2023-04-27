package modelo;
public class Actor extends Persona{
    private String papel;
    private Pelicula[] peliculas= new Pelicula[30];
    private int numPelicula=0;
    private String nacionalidad;
    private String fechaNac;

    public Actor(String nom, String pa, String na, String fN){
        super(nom);
        papel= pa;
        nacionalidad=na;
        fechaNac=fN;
    }
    public String getPapel(){
        return papel;
    }
    public void setPapel(String pa){
        papel=pa;
    }
    public String getFechaNac(){
        return fechaNac;
    }
    public void setFechaNac(String fN){
        fechaNac=fN;
    }
    public String getNacionalidad(){
        return nacionalidad;
    }
    public void setNacionalidad(String na){
        nacionalidad=na;
    }
    public int getNumPelicula(){
        return numPelicula;
    }
    public Pelicula getPelicula(int i){
        return peliculas[i];
    }
}
