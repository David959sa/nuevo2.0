public class banco
{
 private final String nit;
 private String nombresede;
 private String direccion;
 private Asesor[] sede;
 private int numeroEst;
 
 public banco (String nit, String nombresede, String direccion){
  if (nit != null) this.nit = nit;
 else this.nit = "";
 setnombresede(nombresede);
 setDireccion(direccion);
 sede = new Asesor [50];
 numeroEst = 0;
 }
 public String getNit(){
 return nit;
 }
 
 public String getnombresede(){
 return nombresede;
 }
 public void setnombresede(String nombresede){
 if (nombresede != null){
 this.nombresede = nombresede;
 }
 else{
 this.nombresede = "";
 }
 }
 
 public String getDireccion(){
 return direccion;
 }
 public void setDireccion(String Direccion){
 if (direccion != null){
 this.direccion = direccion;
 }
 else{
 this.direccion = "";
 }
 }
 public double calcularpromediogeneral(){
 double promedio = 0;    
 for(int i = 0; i < numeroEst; i++){
   promedio = promedio + sede[i].calcularpromedio();  
 }
 return promedio / 3;
 }

 public void adicionarMETA(String identisede, String nombre, String identiAsesor, double prest1, double prest2){
     sede[numeroEst] = new Cundinamarca(identisede, nombre, identiAsesor, prest1, prest2);
     numeroEst++;
 }
 public void adicionarCUNDI(String identisede, String nombre, String identiAsesor, double prest1, double prest2, double prest3){
     sede[numeroEst] = new Metasede(identisede, nombre, identiAsesor, prest1, prest2, prest3);
     numeroEst++;
 }
 public void adicionarBOYACA(String identisede, String nombre, String identiAsesor, double prest1, double prest2, double prest3, double notacuatro){
     sede[numeroEst] = new Boyaca(identisede, nombre, identiAsesor, prest1, prest2, prest3, notacuatro);
     numeroEst++;
 }
 
}
