    public abstract class Asesor{
        protected final String identificacion;
        private String nombre;
        private String identiAsesor;
        
        public Asesor(String identificacion, String nombre, String identiAsesor)throws Exception{
            if(identificacion.trim().equals(""))
                throw new Exception("valor invalido en la identificacion");
            
            if(identificacion.matches(".*[a-zA-Z].*"))
                throw new Exception("La identificacion no puede tener caracteres");
            
            this.identificacion = identificacion;
            setNombre(nombre);
            setidentiAsesor(identiAsesor);
            
        }
        
        public abstract double calcularPromedio();
        
        public String getIdentificacion(){
            return identificacion;
        }
        
        public String getNombre(){
            return nombre;
        }
        public void setNombre(String nombre){
            if(nombre != null) this.nombre = nombre;
            else this.nombre = "";
        }
        
        public String getidentiAsesor(){
            return identiAsesor;
        }
        public void setidentiAsesor(String identiAsesor){
            if(identiAsesor != null) this.identiAsesor = identiAsesor;
            else this.identiAsesor = "";
        }
        
    }