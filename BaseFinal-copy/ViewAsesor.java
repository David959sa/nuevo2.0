import java.util.List;

public class ViewAsesor {

    public void verAsesor(Asesor sedes) {
        System.out.println("Datos del Asesor:");
        System.out.println("ID Banco: " + sedes.getId());
        System.out.println("Identificación del Asesor: " + sedes.getIdentiasesor());
        System.out.println("Nombre del Asesor: " + sedes.getNombreasesor());
        System.out.println("Nombre de la Sede: " + sedes.getNombresede());
        System.out.println("Prestamo de Vivienda 1: " + sedes.getPrest1());
        System.out.println("Prestamo de Estudio 2: " + sedes.getPrest2());
        System.out.println("Prestamo de Automovil 3: " + sedes.getPrest3());
    }

    public void verAsesors(List<Asesor> sedess) {
        System.out.println("Datos de las Sedes:");
        for (Asesor sedes : sedess) {
            verAsesor(sedes);
            System.out.println();
        }
    }
}