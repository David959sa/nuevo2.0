public class Sede
{
    String identificacionSede;
    String nombreAsesor;
    String identificacionASESOR;
    double prestamoUNO;
    double prestamoDOS;
    double prestamoTRES;
    
    Sede(String identificacionSede, String nombreAsesor, String identificacionASESOR, double prestamoUNO, double prestamoDOS, double prestamoTRES){
        this.identificacionSede = identificacionSede;
        this.nombreAsesor = nombreAsesor;
        this.identificacionASESOR = identificacionASESOR;
        this.prestamoUNO = prestamoUNO;
        this.prestamoDOS = prestamoDOS;
        this.prestamoTRES = prestamoTRES;
    }
    
    double calcularPromedio(){
        return (prestamoUNO + prestamoDOS + prestamoTRES) / 3;
    }
}