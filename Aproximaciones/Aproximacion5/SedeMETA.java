public class SedeMETA{
    private final  String identificacionSede;
    private String nombreAsesor;
    private String identificacionASESOR;
    private double prestamoUNO;
    private double prestamoDOS;
    
    public String getidentificacionSede(){
        return identificacionSede;
    }
    
    public String getnombreAsesor(){
        return nombreAsesor;
    }
    public void setnombreAsesor(String nombreAsesor){
        if(nombreAsesor != null) this.nombreAsesor = nombreAsesor;
        else this.nombreAsesor = "";
    }
    
    public String getidentificacionASESOR(){
        return identificacionASESOR;
    }
    public void setidentificacionASESOR(String identificacionASESOR){
        if(identificacionASESOR != null) this.identificacionASESOR = identificacionASESOR;
        else this.identificacionASESOR = "";
    }
    
    public double getprestamoUNO(){
        return prestamoUNO;
    }
    public void setprestamoUNO(double prestamoUNO){
        if(prestamoUNO >= 0) this.prestamoUNO = prestamoUNO;
        else this.prestamoUNO = 0;
    }
    
    public double getprestamoDOS(){
        return prestamoDOS;
    }
    public void setprestamoDOS(double prestamoDOS){
        if(prestamoDOS >= 0) this.prestamoDOS = prestamoDOS;
        else this.prestamoDOS = 0;
    }
    
    SedeMETA(String identificacionSede, String nombreAsesor, String identificacionASESOR, double prestamoUNO, double prestamoDOS){
        if(identificacionSede != null) this.identificacionSede = identificacionSede;
        else this.identificacionSede = "";
        setnombreAsesor(nombreAsesor);
        setidentificacionASESOR(identificacionASESOR);
        setprestamoUNO(prestamoUNO);
        setprestamoDOS(prestamoDOS);
    }
    
    double calcularPromedio(){
        return (prestamoUNO + prestamoDOS) / 2;
    }
}