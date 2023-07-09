import java.util.InputMismatchException;
import java.util.Scanner;

public class AsesorCRUD {
    private static final ControllerAsesor controller;
    private static final Scanner scanner = new Scanner(System.in);

    static {
        try {
            controller = new ControllerAsesor();
        } catch (DAOException e) {
            System.out.println("Error al inicializar el controlador");
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        String action;
        while (true) {
            System.out.println("-------------------------");
            System.out.println("[L]istar Sedes | [C]onsultar por ID Sedes | [R]egistrar Sede | [A]ctualizar Sede | [E]liminar Sede | [S]alir: ");
            action = scanner.next().toUpperCase();
            try {
                switch (action) {
                    case "L":
                        listarAsesors();
                        break;
                    case "C":
                        consultarAsesorPorID();
                        break;
                    case "R":
                        registrarAsesor();
                        break;
                    case "A":
                        actualizarAsesor();
                        break;
                    case "E":
                        eliminarAsesor();
                        break;
                    case "S":
                        return;
                    default:
                        System.out.println("Acción inválida");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void registrarAsesor() {
        Asesor sedes = guardarAsesor();
        controller.registrar(sedes);
        System.out.println("Asesor Ingresado Correctamente");
        System.out.println("Registro exitoso: " + sedes.getId());
    }

    private static void actualizarAsesor() {
        int id = leerId();
        Asesor sedes = controller.obtenerAsesorPorId(id);
        if (sedes != null) {
            System.out.println("------------Datos originales------------");
            System.out.println(sedes);
            System.out.println("Ingrese los nuevos datos");

            String identiasesor = leerString("Ingrese el número de identificación del Asesor: ");
            String nombreasesor = leerString("Ingrese el nombre del Asesor: ");
            String nombresede = leerString("Ingrese el nombre de la Sede: ");
            double prest1 = leerValor("Ingrese la Prestamo de Vivienda 1: ");
            double prest2 = leerValor("Ingrese la Prestamo de Estudio 2: ");
            double prest3 = leerValor("Ingrese la Prestamo de Automovil 3: ");

            sedes = new Asesor(id, identiasesor, nombreasesor, nombresede, prest1, prest2, prest3);
            controller.actualizar(sedes);
            System.out.println("Actualización exitosa");
        } else {
            System.out.println("Asesor no encontrado.");

        }
    }

    private static void eliminarAsesor() {
        int id = leerId();
        Asesor sedes = controller.obtenerAsesorPorId(id);
        if (sedes != null) {
            controller.eliminar(sedes);
            System.out.println("Asesor eliminado: " + sedes.getId());
        } else {
            System.out.println("Asesor no encontrado.");
        }
    }

    private static void listarAsesors() {
        controller.verAsesors();
    }

    private static void consultarAsesorPorID() {
        int id = leerId();
        Asesor sedes = controller.obtenerAsesorPorId(id);
        if (sedes != null) {
            System.out.println("Asesor encontrado:");
            System.out.println(sedes);
        } else {
            System.out.println("Asesor no encontrado.");
        }
    }

    private static Asesor guardarAsesor() {
        String identiasesor = leerString("Ingrese el número de identificación del Asesor: ");
        String nombreasesor = leerString("Ingrese el nombre del Asesor: ");
        String nombresede = leerString("Ingrese el nombre de la Sede: ");
        double prest1 = leerValor("Ingrese la Prestamo de Vivienda 1: ");
        double prest2 = leerValor("Ingrese la Prestamo de Estudio 2: ");
        double prest3 = leerValor("Ingrese la Prestamo de Automovil 3: ");

        return new Asesor(identiasesor, nombreasesor, nombresede, prest1, prest2, prest3);
    }

    private static int leerId() {
        int id;
        while (true) {
            try {
                System.out.println("Ingrese un valor entero para el ID de la Sede: ");
                id = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error de formato de número");
                scanner.next();
            }
        }
        return id;
    }

    private static double leerValor(String message) {
        double valor;
        while (true) {
            try {
                System.out.println(message);
                valor = scanner.nextDouble();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Error de formato de valor númerico");
                scanner.next();
            }
        }
        return valor;
    }

    private static String leerString(String message) {
        String l;
        while (true) {
            System.out.println(message);
            l = scanner.next().trim();
            if (l.length() <= 2) {
                System.out.println("La longitud de la cadena debe ser >= 2");
            } else {
                break;
            }
        }
        return l;
    }
}
