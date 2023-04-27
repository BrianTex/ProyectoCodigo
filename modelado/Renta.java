package modelado;
import java.util.Scanner;

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
    public void rentar(Renta renta){
        if(cliente.getNumRentas()<3){
            cliente.addRenta(renta);
        }else{
            System.out.println("LLego a su limite de rentas");
        }
    }
    public void devolver(int dia, int i){
        int dias= dia-cliente.getRenta(i).getDia();
        String pago;
        Scanner sc= new Scanner(System.in);
        System.out.println("¿Ya pago?");
        pago=sc.nextLine();
        if(pago=="si"){
            cliente.eliminarRenta(i);
        }
        else{
            System.out.println("No ha pagado");
        }
        
        
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
    public double pagar(int d, int i){
        double pago;
        int diasPago= d-cliente.getRenta(i).getDia();
        if(diasPago>2){
            if(cliente.getRenta(i).getObjRentable() instanceof Videojuego){
                pago= precioJuego*diasPago;
            }else{
                pago= precioEntretenimiento*diasPago;
            }
        }else{
            if(cliente.getRenta(i).getObjRentable() instanceof Videojuego){
                pago= precioJuego;
            }else{
                pago= precioEntretenimiento;
            }
        }
        return pago;
    }


}
