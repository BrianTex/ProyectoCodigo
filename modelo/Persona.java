package modelo;

public class Persona {
    protected String nombre;
    
    public Persona(String n){
        nombre= n;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String n){
        nombre= n;
    }
    public String toString(){
        return "Nombre: "+nombre;
    }
}
