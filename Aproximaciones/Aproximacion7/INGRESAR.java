import java.util.Scanner;
public class INGRESAR{
    public static void main(String Args[]) throws Exception{
        Scanner sc = new Scanner(System.in);        
        Banco miSEDE = new Banco("123456","BANCOLOMBIA","TOBERIN-BOGOTA");
        String identificacion, nombre, identiAsesor;
        double prest1, prest2, prest3, prest4;
        double promedio = 0;
        int opcionMenu = 0;
        
        do{
            System.out.println("\nMenu de Opciones");
            System.out.println("[1]- Adicionar total Prestamos Meta: ");
            System.out.println("[2]- Adicopnar total Prestamos Cundinamarca: ");
            System.out.println("[3]- Adicionar total Prestamos Boyaca: ");
            System.out.println("[4]- Calcular Promedio ");
            System.out.println("[5]- Salir \n");
            System.out.println("Escoja una Opcion: ");
            opcionMenu = sc.nextInt();
            switch(opcionMenu){
                case 1:
                        sc.nextLine();
                        System.out.println("Digite el identificador Sede Bacaria: ");
                        identificacion = sc.next();
                        System.out.println("Digite su nombre Asesor: ");
                        nombre = sc.next();
                        System.out.println("Digite su identifación Asesor: ");
                        identiAsesor = sc.next();
                        System.out.println("Por favor, ingrese el valor total de mes de PRESTAMOS DE VIVIENDA: ");
                        prest1 = sc.nextDouble();
                        System.out.println("Por favor, ingrese el valor total de mes de PRESTAMOS DE ESTUDIO: ");
                        prest2 = sc.nextDouble();
                        try{
                            miSEDE.adicionarSede(identificacion, nombre, identiAsesor, prest1, prest2);
                        }catch(Exception e){
                            System.out.println(e.getMessage());
                        }
                        System.out.println("********************");
                        break;
                case 2:
                        sc.nextLine();
                        System.out.println("Digite el identificador Sede Bacaria: ");
                        identificacion = sc.next();
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
                        try{                        
                        miSEDE.adicionarSede(identificacion, nombre, identiAsesor, prest1, prest2, prest3);
                        }catch(Exception e){
                            System.out.println(e.getMessage());
                        }
                        System.out.println("********************");
                        break;
                case 3:
                        sc.nextLine();
                        System.out.println("Digite el identificador Sede Bacaria: ");
                        identificacion = sc.next();
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
                        try{                         
                        miSEDE.adicionarSede(identificacion, nombre, identiAsesor, prest1, prest2, prest3, prest4);
                        }catch(Exception e){
                            System.out.println(e.getMessage());
                        }
                        System.out.println("********************");
                        break;
                case 4:
                        sc.nextLine();
                        promedio = miSEDE.calcularPromedioGeneral();
                        System.out.println("\n El promedio de INGRESAR es: " + promedio); 
                        break;
                default:
                        System.out.println("Ha Seleccionado Salir");
                        
            }
        }while(opcionMenu != 5);
    }
}
