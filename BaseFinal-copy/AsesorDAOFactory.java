public class AsesorDAOFactory {
    public static AsesorDao creaAsesorDAO() throws DAOException {
        return new AsesorDaoImpl();
    }
}