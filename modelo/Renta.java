package modelo;
public class Renta implements Rentable{
    private int dia;
    private int mes;
    private int annio;
    private ObjetoRentable objRentable;
    private Cliente cliente;

    public Renta(int di, int m, int ann){
        dia=di;
        mes=m;
        annio=ann;
    }
    public void rentar(){
     
    }
    public void devolver(){
        
    }
    public ObjetoRentable getObjRentable(){
        return objRentable; 
    }
    public void setObjRentable(ObjetoRentable objR){
        objRentable=objR;
    }
    public int getDia(){
        return dia;
    }
    public int getMes(){
        return mes;
    }
    public int getAnnio(){
        return annio;
    }
    public void setDia(int d){
        dia=d;
    }
    public void setMes(int m){
        mes= m;
    }
    public void setAnnion(int a){
        annio= a;
    }
    public Cliente getCliente(){
        return cliente;
    }
    public void setCliente(Cliente c){
        cliente= c;
    }
    
}
