import java.util.Scanner;
public class ingresar{
    public static void main(String Args[]){
        Scanner sc = new Scanner(System.in);
        int numSEDES;
        BANCO misede = new BANCO("123456","BANCOLOMBIA","TOBERIN");
        String identificacionSede, nombreAsesor, identificacionASESOR;
        double prestamoUNO, prestamoDOS, prestamoTRES;
        double promedio = 0;
        
        System.out.println("Digite el numero de Sedes a promediar: ");
        numSEDES = sc.nextInt();
        
        for(int i = 0; i < numSEDES; i++){
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
            misede.adicionarsede(identificacionSede, nombreAsesor, identificacionASESOR, prestamoUNO, prestamoDOS, prestamoTRES);
        }
        
        promedio = misede.calcularPromedioGeneral();        
        System.out.println("El promedio total de prestamos realizados en las Sedes es de: "+ promedio);
    }
}
