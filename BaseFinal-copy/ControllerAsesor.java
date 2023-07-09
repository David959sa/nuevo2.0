import java.util.List;

public class ControllerAsesor {
    private final ViewAsesor vista;
    private final AsesorDao dao;

    public ControllerAsesor() throws DAOException {
        this.vista = new ViewAsesor();
        this.dao = AsesorDAOFactory.creaAsesorDAO();
    }

    public void registrar(Asesor sedes) {
        try {
            dao.registrarAsesor(sedes);
        } catch (DAOException e) {
            mostrarError("Error al registrar la Sede", e);
        }
    }

    public void actualizar(Asesor sedes) {
        try {
            dao.actualizarAsesor(sedes);
        } catch (DAOException e) {
            mostrarError("Error al actualizar la Sede", e);
        }
    }

    public void eliminar(Asesor sedes) {
        try {
            dao.eliminarAsesor(sedes);
        } catch (DAOException e) {
            mostrarError("Error al eliminar la Sede", e);
        }
    }
    
    public void verAsesors() {
        try {
            List<Asesor> sedess = dao.obtenerAsesor();
            vista.verAsesors(sedess);
        } catch (DAOException e) {
            mostrarError("Error al obtener las Sedes", e);
        }
    }

    public Asesor obtenerAsesorPorId(int id) {
        try {
            return dao.obtenerAsesorPorId(id);
        } catch (DAOException e) {
            mostrarError("Error al obtener las Sedes por ID", e);
            return null;
        }
    }

    private void mostrarError(String mensaje, Exception e) {
        System.out.println(mensaje);
        e.printStackTrace();
    }
}