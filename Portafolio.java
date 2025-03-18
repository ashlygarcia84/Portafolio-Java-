import java.util.Scanner;

public class Portafolio {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int opcion;

    }
    do{
        System.out.println("\n \n");
        System.out.println("Bienvenido a mi Garcia java [garcia version 1.0]");
        
         System.out.println("  ____    _    ____   ____  __    _ ");
        System.out.println("/ ___|  / \\  |  _ \\ / ___|/_/   / \\");
        System.out.println("| |  _  / _ \\ | |_) | |   |_ _| / _ \\ ");
        System.out.println("| |_| |/ ___ \\|  _ <| |___ | | / ___ \\");
        System.out.println("\\____/_/   \\_\\_| \\_\\\\____|___/_/   \\_\\");
        System.out.println("");
        System.out.println("");


        System.out.println("[?] Selecciona una opcion para continuar");
        System.out.println("Proyecto iniciado ---->> Mar 18 8:45 am 2025");
        System.out.println("getClass");

        //MENÚ
        System.out.println("[1] la suma de dos números");
        System.out.println("[2] ");
        System.out.println("[3] ");
        System.out.println("[0] Salir");
        System.out.println("[?] ");
        opcion = scanner.nextInt();

        //OPCIÓN
        switch (opcion) {
                case 1:
                    System.out.print("Ingrese el primer numero: ");
                    int num1 = scanner.nextInt();
                    System.out.print("Ingrese el segundo numero: ");
                    int num2 = scanner.nextInt();
                    int suma = num1 + num2;
                    System.out.println("La suma es: " + suma);
                    break;
                case 2:
                    System.out.println("Opcion-2");
                    break;
                case 3:
                    System.out.println("Opcion-3");
                    break;
                case 4:
                    System.out.println("Opcion-4");
                    break;
                case 5:
                    System.out.println("Saliendo del programa!!!");

                    return;
            }
            System.out.println();
    }while (opcion == 5); {
        
    }
}