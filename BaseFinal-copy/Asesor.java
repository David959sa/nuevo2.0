public class Asesor {
    private int id;
    private String identiasesor;
    private String nombreasesor;
    private String nombresede;
    private double prest1;
    private double prest2;
    private double prest3;

    public Asesor(int id, String identiasesor, String nombreasesor, String nombresede, double prest1, double prest2, double prest3) {
        this.id = id;
        this.identiasesor = identiasesor;
        this.nombreasesor = nombreasesor;
        this.nombresede = nombresede;
        this.prest1 = prest1;
        this.prest2 = prest2;
        this.prest3 = prest3;
    }
    
    public Asesor(String identiasesor, String nombreasesor, String nombresede, double prest1, double prest2, double prest3) {
        this.identiasesor = identiasesor;
        this.nombreasesor = nombreasesor;
        this.nombresede = nombresede;
        this.prest1 = prest1;
        this.prest2 = prest2;
        this.prest3 = prest3;
    }

    public int getId() {
        return id;
    }   

    public String getIdentiasesor() {
        return identiasesor;
    }

    public String getNombreasesor() {
        return nombreasesor;
    }

    public String getNombresede() {
        return nombresede;
    }

    public double getPrest1() {
        return prest1;
    }

    public double getPrest2() {
        return prest2;
    }

    public double getPrest3() {
        return prest3;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIdentiasesor(String identiasesor) {
        this.identiasesor = identiasesor;
    }

    public void setNombreasesor(String nombreasesor) {
        this.nombreasesor = nombreasesor;
    }

    public void setNombresede(String nombresede) {
        this.nombresede = nombresede;
    }

    public void setPrest1(double prest1) {
        this.prest1 = prest1;
    }

    public void setPrest2(double prest2) {
        this.prest2 = prest2;
    }

    public void setPrest3(double prest3) {
        this.prest3 = prest3;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ").append(id)
          .append("\nIdentificación de Asesor: ").append(identiasesor)
          .append("\nNombre de Asesor: ").append(nombreasesor)
          .append("\nNombre de Sede: ").append(nombresede)
          .append("\nPrestamo de Vivienda 1: ").append(prest1)
          .append("\nPrestamo de Estudio 2: ").append(prest2)
          .append("\nPrestamo de Automovil 3: ").append(prest3);
        return sb.toString();
    }
}