package modelo;

public class Videojuego extends ObjetoRentable {
    private String consola;

    public Videojuego(){}
    public Videojuego(String ti, int ann, String gen, String cons){
        super(ti, ann, gen);
        consola= cons;
    }
    public String getConsola(){
        return consola;
    }
    public void setConsola(String cons){
        consola= cons;
    }
    public String toString(){
        return super.toString()+" Consola: "+consola;
    }
    
}

