import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AsesorDaoImpl implements AsesorDao {

    private static final String INSERT_QUERY = "INSERT INTO sedes (identiasesor, nombreasesor, nombresede, prest1, prest2, prest3) VALUES (?, ?, ?, ?, ?, ?)";
    private static final String SELECT_ALL_QUERY = "SELECT * FROM sedes ORDER BY id";
    private static final String UPDATE_QUERY = "UPDATE sedes SET identiasesor=?, nombreasesor=?, nombresede=?, prest1=?, prest2=?, prest3=? WHERE id=?";
    private static final String DELETE_QUERY = "DELETE FROM sedes WHERE id=?";
    private static final String SELECT_BY_ID_QUERY = "SELECT * FROM sedes WHERE id = ?";

    @Override
    public boolean registrarAsesor(Asesor sedes) throws DAOException {
        try (Connection con = Conexion.conectar();
             PreparedStatement pstmt = con.prepareStatement(INSERT_QUERY)) {
            pstmt.setString(1, sedes.getIdentiasesor());
            pstmt.setString(2, sedes.getNombreasesor());
            pstmt.setString(3, sedes.getNombresede());
            pstmt.setDouble(4, sedes.getPrest1());
            pstmt.setDouble(5, sedes.getPrest2());
            pstmt.setDouble(6, sedes.getPrest3());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw new DAOException("Error al registrar las sedes", e);
        }
    }
    
    @Override
    public List<Asesor> obtenerAsesor() throws DAOException {
        List<Asesor> listaAsesor = new ArrayList<>();

        try (Connection con = Conexion.conectar();
             Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(SELECT_ALL_QUERY)) {
            while (rs.next()) {
                Asesor sedes = obtenerAsesorDesdeResultSet(rs);
                listaAsesor.add(sedes);
            }
        } catch (SQLException e) {
            throw new DAOException("Error al obtener la Sedes", e);
        }

        return listaAsesor;
    }
    
    @Override
    public boolean actualizarAsesor(Asesor sedes) throws DAOException {
        try (Connection con = Conexion.conectar();
             PreparedStatement pstmt = con.prepareStatement(UPDATE_QUERY)) {
            pstmt.setString(1, sedes.getIdentiasesor());
            pstmt.setString(2, sedes.getNombreasesor());
            pstmt.setString(3, sedes.getNombresede());
            pstmt.setDouble(4, sedes.getPrest1());
            pstmt.setDouble(5, sedes.getPrest2());
            pstmt.setDouble(6, sedes.getPrest3());
            pstmt.setInt(7, sedes.getId());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw new DAOException("Error al actualizar la Sede", e);
        }
    }
    
    @Override
    public boolean eliminarAsesor(Asesor sedes) throws DAOException {
        try (Connection con = Conexion.conectar();
             PreparedStatement pstmt = con.prepareStatement(DELETE_QUERY)) {
            pstmt.setInt(1, sedes.getId());
            pstmt.executeUpdate();
            return true;
        } catch (SQLException e) {
            throw new DAOException("Error al eliminar la Sede", e);
        }
    }
    
    @Override
    public Asesor obtenerAsesorPorId(int id) throws DAOException {
        try (Connection con = Conexion.conectar();
             PreparedStatement pstmt = con.prepareStatement(SELECT_BY_ID_QUERY)) {
            pstmt.setInt(1, id);
            try (ResultSet rs = pstmt.executeQuery()) {
                if (rs.next()) {
                    return obtenerAsesorDesdeResultSet(rs);
                }
            }
        } catch (SQLException e) {
            throw new DAOException("Error al obtener la Sede por ID", e);
        }
        return null;
    }
    
    private Asesor obtenerAsesorDesdeResultSet(ResultSet rs) throws SQLException {
        int id = rs.getInt("id");
        String identiasesor = rs.getString("Identiasesor");
        String nombreasesor = rs.getString("Nombreasesor");
        String nombresede = rs.getString("Nombresede");
        double prest1 = rs.getDouble("Prest1");
        double prest2 = rs.getDouble("Prest2");
        double prest3 = rs.getDouble("Prest3");
        return new Asesor(id, identiasesor, nombreasesor, nombresede, prest1, prest2, prest3);
    }
    
}
