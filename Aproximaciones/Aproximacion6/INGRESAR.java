import java.util.Scanner;
public class INGRESAR{
    public static void main(String[] arg){
         Scanner sc = new Scanner (System.in);
         banco miSEDE = new banco ("123456","BANCOLOMBIA","TOBERIN-BOGOTA");
         String identisede, nombre, identiAsesor;
         double promedio = 0;
         
         System.out.println("----------Digite el numero de Sedes a promediar del Departamento de Meta: -------");
         int numEstudiantes1 = sc.nextInt();
         
         for(int i=0; i < numEstudiantes1; i++){
             double prest1,prest2;
             System.out.println("Digite el identificador Sede Bacaria: ");
             identisede = sc.next();
             System.out.println("Digite su nombre Asesor: ");
             nombre = sc.next();
             System.out.println("Digite su identifación Asesor: ");
             identiAsesor = sc.next();
             System.out.println("Por favor, ingrese el valor total de mes de PRESTAMOS DE VIVIENDA: ");
             prest1 = sc.nextDouble();
             System.out.println("Por favor, ingrese el valor total de mes de PRESTAMOS DE ESTUDIO: ");
             prest2 = sc.nextDouble();
             miSEDE.adicionarMETA(identisede, nombre, identiAsesor, prest1, prest2);
         }
         System.out.println("--Digite el numero de Sedes a promediar del Departamento de Cundinamarca: --");
         int numEstudiantes2 = sc.nextInt();
             for(int i = 0; i < numEstudiantes2; i++){
                double prest1, prest2, prest3;
                System.out.println("Digite el identificador Sede Bacaria: ");
                identisede = sc.next();
                System.out.println("Digite su nombre Asesor: ");
                nombre = sc.next();
                System.out.println("Digite su identifación Asesor: ");
                identiAsesor = sc.next();
                System.out.println("Por favor, ingrese el valor total de mes de PRESTAMOS DE VIVIENDA: ");
                prest1 = sc.nextDouble();
                System.out.println("Por favor, ingrese el valor total de mes de PRESTAMOS DE ESTUDIO: ");
                prest2 = sc.nextDouble();           
                System.out.println("Por favor, ingrese el valor total de mes de PRESTAMOS DE COMPRA DE CARTERA: ");
                prest3 = sc.nextDouble();
                miSEDE.adicionarCUNDI(identisede, nombre, identiAsesor, prest1, prest2, prest3);
                }
         System.out.println("----Digite el numero de Sedes a promediar del Departamento de Boyacá: ---");
         int numEstudiantes3 = sc.nextInt();
                for(int i = 0; i < numEstudiantes3; i++){
                    double prest1, prest2, prest3, prest4;            
                System.out.println("Digite el identificador Sede Bacaria: ");
                    identisede = sc.next();
                System.out.println("Digite su nombre Asesor: ");
                    nombre = sc.next();
                System.out.println("Digite su identifación Asesor: ");
                    identiAsesor = sc.next();
                System.out.println("Por favor, ingrese el valor total de mes de PRESTAMOS DE VIVIENDA: ");
                    prest1 = sc.nextDouble();
                System.out.println("Por favor, ingrese el valor total de mes de PRESTAMOS DE ESTUDIO: ");
                    prest2 = sc.nextDouble();            
                System.out.println("Por favor, ingrese el valor total de mes de PRESTAMOS DE COMPRA DE CARTERA: ");
                    prest3 = sc.nextDouble();
                    System.out.println("Por favor, ingrese el valor total de mes de PRESTAMOS DE VEHICULO: ");
                    prest4 = sc.nextDouble();            
                    miSEDE.adicionarBOYACA(identisede, nombre, identiAsesor, prest1, prest2, prest3, prest4);
                }
          promedio = miSEDE.calcularpromediogeneral();
                System.out.println("\n El promedio de notas es: " + promedio);
     }
    }
