package modelo;

public class Director extends Persona{
    private Pelicula[] peliculas=new Pelicula[30];
    private int numPelicula=0;
    private String nacionalidad;
    private String fechaNac;

    public Director(String nom, String na, String fN){
        super(nom);
        nacionalidad= na;
        fechaNac= fN;
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
        nacionalidad= na;
    }
    public Pelicula getPelicula(int i){
        return peliculas[i];
    }
    public int getNumPelicula(){
        return numPelicula;
    }
    public String toString() {
        return super.toString()+" Nacionalidad: "+nacionalidad+" fecha de nacimiento: "+fechaNac;
    }
}
