public class BANCO
{
    private final String nit;
    private String nombreBANCO;
    private String direccion;
    private SedeMETA[] sede1;
    private SedeCundinamarca[] sede2;
    private SedeBoyaca[] sede3;    
    private int numSEDE1;
    private int numSEDE2;
    private int numSEDE3;    
    
    public BANCO(String nit,String nombreBANCO,String direccion){
        if(nit != null) this.nit = nit;
        else this.nit = ""; 
        setnombreBANCO(nombreBANCO);
        setDireccion(direccion);        
        sede1 = new SedeMETA[50];
        sede2 = new SedeCundinamarca[50];
        sede3 = new SedeBoyaca[50];        
        numSEDE1 = 0;
        numSEDE2 = 0;
        numSEDE3 = 0;        
    }
    
    public String getNit(){
        return nit;
    }
    
    public String getnombreBANCO(){
        return nombreBANCO;
    }
    public void setnombreBANCO(String nombreBANCO){
        if(nombreBANCO != null){
            this.nombreBANCO = nombreBANCO;
        }else{
            this.nombreBANCO = "";
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
    
    public int getnumSEDE1(){
        return numSEDE1;
    }
    
    public int getnumSEDE2(){
        return numSEDE2;
    }
    
    public int getnumSEDE3(){
        return numSEDE3;
    }    
    
    public double calcularPromedioGeneral(){
        double promedio = 0;
        for(int i = 0; i < numSEDE1; i++){
            promedio = promedio + sede1[i].calcularPromedio() / numSEDE1;
        }
        for(int i = 0; i < numSEDE2; i++){
            promedio = promedio + sede2[i].calcularPromedio() / numSEDE2;
        }
        for(int i = 0; i < numSEDE3; i++){
            promedio = promedio + sede3[i].calcularPromedio() / numSEDE3;
        }
        return promedio / 3;
    }
    public void adicionarSedeMETA(String identificacionSede, String nombreAsesor, String identificacionASESOR, double prestamoUNO, double prestamoDOS){
        sede1[numSEDE1] = new SedeMETA(identificacionSede, nombreAsesor, identificacionASESOR, prestamoUNO, prestamoDOS);
        numSEDE1++;
    }
    
    public void adicionarSedeCundinamarca(String identificacionSede, String nombreAsesor, String identificacionASESOR, double prestamoUNO, double prestamoDOS, double prestamoTRES){
        sede2[numSEDE2] = new SedeCundinamarca(identificacionSede, nombreAsesor, identificacionASESOR, prestamoUNO, prestamoDOS, prestamoTRES);
        numSEDE2++;
    }
    
    public void adicionarSedeBoyaca(String identificacionSede, String nombreAsesor, String identificacionASESOR, double prestamoUNO, double prestamoDOS, double prestamoTRES, double prestamoCUATRO){
        sede3[numSEDE3] = new SedeBoyaca(identificacionSede, nombreAsesor, identificacionASESOR, prestamoUNO, prestamoDOS, prestamoTRES, prestamoCUATRO);
        numSEDE3++;
    }
}    