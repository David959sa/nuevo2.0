import java.util.ArrayList;
public class Banco
{
    private final String nit;
    private String nombreBanco;
    private String direccion;
    private ArrayList sede;
    
    public Banco(String nit,String nombreBanco,String direccion){
        if(nit != null) this.nit = nit;
        else this.nit = ""; 
        setNombreBanco(nombreBanco);
        setDireccion(direccion);        
        sede = sede = new ArrayList();
    }
    
    public String getNit(){
        return nit;
    }
    
    public String getNombreBanco(){
        return nombreBanco;
    }
    public void setNombreBanco(String nombreBanco){
        if(nombreBanco != null){
            this.nombreBanco = nombreBanco;
        }else{
            this.nombreBanco = "";
        }        
    }
    
    public String getDireccion(){
        return direccion;
    }
    public void setDireccion(String direccion){
        if(direccion != null){
            this.direccion = direccion;
        }else{
            this.direccion = "";
        }        
    }
        
    public double calcularPromedioGeneral(){
        double promedio = 0;
        for(int i = 0; i < sede.size(); i++){
            promedio += ((Asesor)sede.get(i)).calcularPromedio();
        }

        return promedio / 3;
    }
    
    public void adicionarSede(String identificacion, String nombre, String identiAsesor, double prest1, double prest2)throws Exception{
        sede.add(new Meta(identificacion, nombre, identiAsesor, prest1, prest2));
    }
    
    public void adicionarSede(String identificacion, String nombre, String identiAsesor, double prest1, double prest2, double prest3)throws Exception{
        sede.add(new Boyaca(identificacion, nombre, identiAsesor, prest1, prest2, prest3));
    }
    
    public void adicionarSede(String identificacion, String nombre, String identiAsesor, double prest1, double prest2, double prest3, double prest4)throws Exception{
        sede.add(new Cundinamarca(identificacion, nombre, identiAsesor, prest1, prest2, prest3, prest4));
    }
}    
