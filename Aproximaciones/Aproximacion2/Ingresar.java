import java.util.Scanner;
public class Ingresar
{
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int numeroSEDES;
            Sede[] losEstudiantes = new Sede[50];
            String identificacionSede, nombreAsesor, identificacionASESOR;
            double prestamoUNO, prestamoDOS, prestamoTRES;
            double promedio = 0;
            System.out.println("Digite la cantidad la cantidad de Sedes a realizar promedio: ");
            numeroSEDES = sc.nextInt();
            
            for(int i = 0; i < numeroSEDES; i++){
                System.out.println("Digite el identificador de la Sede Bacaria: ");
                identificacionSede = sc.next();
                System.out.println("Digite su nombre Asesor:  ");
                nombreAsesor = sc.next();
                System.out.println("Digite su identifación Asesor: ");
                identificacionASESOR = sc.next();
                System.out.println("Por favor, ingrese el valor total de mes de PRESTAMOS DE VIVIENDA: ");
                prestamoUNO = sc.nextDouble();
                System.out.println("Por favor, ingrese el valor total de mes de PRESTAMOS DE ESTUDIO: ");
                prestamoDOS = sc.nextDouble();
                System.out.println("Por favor, ingrese el valor total de mes de PRESTAMOS DE COMPRA DE CARTERA: ");
                prestamoTRES = sc.nextDouble();
                Sede unaSede = new Sede();
                unaSede.identificacionSede = identificacionSede;
                unaSede.nombreAsesor = nombreAsesor;
                unaSede.identificacionASESOR = identificacionASESOR;
                unaSede.prestamoUNO = prestamoUNO;
                unaSede.prestamoDOS = prestamoDOS;
                unaSede.prestamoTRES = prestamoTRES;
                losEstudiantes[i] = unaSede;
            }
            for(int i = 0; i < numeroSEDES; i++){
                double sum =(losEstudiantes[i].prestamoUNO +losEstudiantes[i].prestamoDOS +losEstudiantes[i].prestamoTRES)/3;
                promedio = promedio + sum / numeroSEDES;
            }
            System.out.println("El promedio total de prestamos realizados en las Sedes es de: "+ promedio);
    }
}