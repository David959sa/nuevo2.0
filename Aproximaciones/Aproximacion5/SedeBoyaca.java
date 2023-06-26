public class SedeBoyaca{
    private final String identificacionSede;
    private String nombreAsesor;
    private String identificacionASESOR;
    private double prestamoUNO;
    private double prestamoDOS;
    private double prestamoTRES;
    private double prestamoCUATRO;
    
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
    
    public String identificacionASESOR(){
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
    
    public double getprestamoTRES(){
        return prestamoTRES;
    }
    public void setprestamoTRES(double prestamoTRES){
        if(prestamoTRES >= 0) this.prestamoTRES = prestamoTRES;
        else this.prestamoTRES = 0;
    }
    
    public double getprestamoCUATRO(){
        return prestamoCUATRO;
    }
    public void setprestamoCUATRO(double prestamoCUATRO){
        if(prestamoCUATRO >= 0) this.prestamoCUATRO = prestamoCUATRO;
        else this.prestamoCUATRO = 0;
    }
    
    SedeBoyaca(String identificacionSede, String nombreAsesor, String identificacionASESOR, double prestamoUNO, double prestamoDOS, double prestamoTRES, double prestamoCUATRO){
        if(identificacionSede != null) this.identificacionSede = identificacionSede;
        else this.identificacionSede = "";
        setnombreAsesor(nombreAsesor);
        setidentificacionASESOR(identificacionASESOR);
        setprestamoUNO(prestamoUNO);
        setprestamoDOS(prestamoDOS);
        setprestamoTRES(prestamoTRES);
        setprestamoCUATRO(prestamoCUATRO);        
    }
    
    double calcularPromedio(){
        return (prestamoUNO + prestamoDOS + prestamoTRES + prestamoCUATRO) / 4;
    }
}