public class Asesor
{
 protected final String identisede;
 private String nombre;
 private String identiAsesor;
 
 public Asesor (String identisede, String nombre, String identiAsesor){
 if (identisede != null) this. identisede = identisede;
 else this.identisede = "";
 setNombre(nombre);
 setidentiAsesor(identiAsesor);
 }
 double calcularpromedio(){
return 0;
}
 
public String getidentisede(){
return identisede;
}
public String getNombre(){
return nombre;
}
public void setNombre(String nombre){
if (nombre != null) this.nombre = nombre;
else this.nombre = "";
}
public String getidentiAsesor(){
return identiAsesor;
}
public void setidentiAsesor(String identiAsesor){
if (identiAsesor != null) this.identiAsesor = identiAsesor;
else this.identiAsesor = "";
}

}
