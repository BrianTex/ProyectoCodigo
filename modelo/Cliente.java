package modelo;

public class Cliente extends Persona{
    private String direccion;
    private String telefono;
    private int numRenta=0;
    private Renta[] rentas= new Renta[3];
    
    public Cliente(String nom, String di, String tel){
        super(nom);
        direccion=di;
        telefono= tel;
    }
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String di){
        direccion=di;
    }
    public String getTelefono(){
        return telefono;
    }
    public void setTelefono(String tel){
        telefono=tel;
    }
    public int getNumRentas(){
        return numRenta;
    }
    public Renta getRenta(int i){
        return rentas[i];
    }
    public void eliminarRenta(int i){
        numRenta=numRenta-1;
    }
    public String toString(){
        return super.toString()+" Direccion: "+direccion+" Telefono: "+telefono+" Objetos en renta: "+numRenta;
    }
}
