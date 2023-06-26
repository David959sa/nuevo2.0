public class BANCO
{
    private final String nit;
    private String nombreSEDE;
    private String direccion;
    private sede[] SEDE;
    private int numSEDES;
    
    public BANCO(String nit,String nombreSEDE,String direccion){
        if(nit != null) this.nit = nit;
        else this.nit = ""; 
        setnombreSEDE(nombreSEDE);
        setDireccion(direccion);        
        SEDE = new sede[50];
        numSEDES = 0;
    }
    
    public String getNit(){
        return nit;
    }
    
    public String getnombreSEDE(){
        return nombreSEDE;
    }
    public void setnombreSEDE(String nombreSEDE){
        if(nombreSEDE != null){
            this.nombreSEDE = nombreSEDE;
        }else{
            this.nombreSEDE = "";
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
    
    public int getnumSEDES(){
        return numSEDES;
    }
    
    public double calcularPromedioGeneral(){
        double promedio = 0;
        for(int i = 0; i < numSEDES; i++){
            promedio = promedio + SEDE[i].calcularPromedio() / numSEDES;
        }
        return promedio;
    }
    
    public void adicionarsede(String identificacion, String nombre, String curso, double notauno, double notados, double notatres){
        sede e = new sede(identificacion, nombre, curso, notauno, notados, notatres);
        SEDE[numSEDES] = e;
        numSEDES++;
    }
}   