import java.util.List;

public interface AsesorDao {
    boolean registrarAsesor(Asesor sedes) throws DAOException;
    List<Asesor> obtenerAsesor() throws DAOException;
    boolean actualizarAsesor(Asesor sedes) throws DAOException;
    boolean eliminarAsesor(Asesor sedes) throws DAOException;
    Asesor obtenerAsesorPorId(int id) throws DAOException;
}