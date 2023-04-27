package modelo;


public class Temporada {
    private String fecProduc;
    private String fecEstreno;
    private Capitulo[] capitulos=new Capitulo[50];
    private int numCapitulos=0;

    public Temporada(String fP, String fE){
        fecEstreno= fE;
        fecProduc= fP;
        capitulos= new Capitulo[50];
    }
    public String getFecProduc(){
        return fecProduc;
    } 
    public void setFecProduc(String fP){
        fecProduc= fP;
    }
    public String getFecEstreno(){
        return fecEstreno;
    }
    public void setFecEstreno(String fE){
        fecEstreno= fE;
    }
    public Capitulo getCapitulo(int i){
        return capitulos[i];
    }
    public int getNumCapitulos(){
        return numCapitulos;
    }
    public String toString(){
        return super.toString()+" Fecha de produccion: "+fecProduc+"\nFecha de estreno: "+fecEstreno+"\nNumero de capitulos: "+numCapitulos;
    }

}
