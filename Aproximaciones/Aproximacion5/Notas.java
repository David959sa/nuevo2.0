import java.util.Scanner;
public class Notas{
    public static void main(String Args[]) throws Exception{
        Scanner sc = new Scanner(System.in);        
        BANCO miSEDE = new BANCO("123456","BANCOLOMBIA","TOBERIN-BOGOTA");
        String identificacionSede, nombreAsesor, identificacionASESOR;
        
        double promedio = 0;
        
        System.out.println("------------Digite el numero de Sedes a promediar del Departamento de Meta: -----------");
        int numSEDE1 = sc.nextInt();
        for(int i = 0; i < numSEDE1; i++){
            double prestamoUNO, prestamoDOS;
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
            miSEDE.adicionarSedeMETA(identificacionSede, nombreAsesor, identificacionASESOR, prestamoUNO, prestamoDOS);
        }
                
        System.out.println("---------Digite el numero de Sedes a promediar del Departamento de Cundinamarca: -------");
        int numSEDE2 = sc.nextInt();
        for(int i = 0; i < numSEDE2; i++){
            double prestamoUNO, prestamoDOS, prestamoTRES;
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
            miSEDE.adicionarSedeCundinamarca(identificacionSede, nombreAsesor, identificacionASESOR, prestamoUNO, prestamoDOS, prestamoTRES);
        }
        
        System.out.println("-------------Digite el numero de Sedes a promediar del Departamento de Boyacá: -----------");
        int numSEDE3 = sc.nextInt();
        for(int i = 0; i < numSEDE3; i++){
            double prestamoUNO, prestamoDOS, prestamoTRES, prestamoCUATRO;            
            System.out.println("Digite la Identificacion del Estudiante: ");
            identificacionSede = sc.next();
            System.out.println("Digite el nombre del Estudiante: ");
            nombreAsesor = sc.next();
            System.out.println("Digite su identifación Asesor: ");
            identificacionASESOR = sc.next();
            System.out.println("Por favor, ingrese el valor total de mes de PRESTAMOS DE VIVIENDA: ");
            prestamoUNO = sc.nextDouble();
            System.out.println("Por favor, ingrese el valor total de mes de PRESTAMOS DE ESTUDIO: ");
            prestamoDOS = sc.nextDouble();            
            System.out.println("Por favor, ingrese el valor total de mes de PRESTAMOS DE COMPRA DE CARTERA: ");
            prestamoTRES = sc.nextDouble();
            System.out.println("Por favor, ingrese el valor total de mes de PRESTAMOS DE VEHICULO: ");
            prestamoCUATRO = sc.nextDouble();            
            miSEDE.adicionarSedeBoyaca(identificacionSede, nombreAsesor, identificacionASESOR, prestamoUNO, prestamoDOS, prestamoTRES, prestamoCUATRO);
        }
        
        promedio = miSEDE.calcularPromedioGeneral();
        System.out.println("\n El promedio de notas es: " + promedio); 
    }
}