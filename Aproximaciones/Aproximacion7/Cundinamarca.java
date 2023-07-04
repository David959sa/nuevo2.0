public class Cundinamarca extends Asesor{
    private double prest1;
    private double prest2;
    private double prest3;
    private double prest4;
    
    Cundinamarca(String identificacion, String nombre, String identiAsesor, double prest1, double prest2, double prest3, double prest4)throws Exception{
        super(identificacion, nombre, identiAsesor);
        setprest1(prest1);
        setprest2(prest2);
        setprest3(prest3);
        setprest4(prest4);        
    }
    
    public double calcularPromedio(){
        return (prest1 + prest2 + prest3 + prest4) / 4;
    }
    
    public double getprest1(){
        return prest1;
    }
    public void setprest1(double prest1){
        if(prest1 >= 0) this.prest1 = prest1;
        else this.prest1 = 0;
    }
    
    public double getprest2(){
        return prest2;
    }
    public void setprest2(double prest2){
        if(prest2 >= 0) this.prest2 = prest2;
        else this.prest2 = 0;
    }
    
    public double getprest3(){
        return prest3;
    }
    public void setprest3(double prest3){
        if(prest3 >= 0) this.prest3 = prest3;
        else this.prest3 = 0;
    }
    
    public double getprest4(){
        return prest4;
    }
    public void setprest4(double prest4){
        if(prest4 >= 0) this.prest4 = prest4;
        else this.prest4 = 0;
    }
    
}