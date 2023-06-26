import java.util.Scanner;
public class INGRESO
{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numeroSedes = 0, opcionMenu = 0;
        Sede[] lasSEDES = new Sede[50];
        String identificacionSede, nombreAsesor, identificacionASESOR;
        double prestamoUNO, prestamoDOS, prestamoTRES;
        double promedio = 0;
        while(opcionMenu != 3){
            System.out.println("\nMenu de Opciones: ");
            System.out.println("1. Adicionar un nueva Sede");
            System.out.println("2. Calcular Promedio de total de prestamos Sede Bancaria");
            System.out.println("3. Salir ");
            System.out.println("Escoja una opcion.... ");
            opcionMenu = sc.nextInt();
            if(opcionMenu== 1){
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
                Sede unaSede = new Sede(identificacionSede, nombreAsesor, identificacionASESOR,prestamoUNO,prestamoDOS,prestamoTRES);
                lasSEDES[numeroSedes] = unaSede;
                numeroSedes++;
            }
            else if(opcionMenu==2){
                for(int i = 0; i < numeroSedes; i++){
                    promedio = promedio + lasSEDES[i].calcularPromedio() / numeroSedes;    
                }
                System.out.println("\n El Promedio de Prestamos de la Sedes es: "+ promedio+" $");
            }
        }
    
    }

}