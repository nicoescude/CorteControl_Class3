package Clases_3;
import java.util.Scanner;

public class MenuControl {
    static Scanner sc;
    

    public static void run(){
        String input,comida;
        int mesa,personas;

        boolean flag=false;
        Restaurant myResto = new Restaurant(5);

        sc = new Scanner(System.in);

        while(!flag){
            showOptionMenu();
            System.out.print("Elija una opción: ");
            input = sc.nextLine();
            System.out.println("<------------------>");

            switch(input){
                case "1":
                    myResto.mostrarMesas();
                    break;
                case "2":
                    System.out.print("¿Qué mesa desea tomar?: ");
                    mesa = Integer.parseInt(sc.nextLine());
                    System.out.print("¿Cuantas Personas?: ");
                    personas = Integer.parseInt(sc.nextLine());
                    myResto.tomarMesa(mesa, personas);
                    break;
                case "3":
                    System.out.print("¿Qué mesa desea pedir?: ");
                    mesa = Integer.parseInt(sc.nextLine());

                    System.out.print("¿Qué comida desea ordenar?: ");
                    comida = sc.nextLine();

                    Comida c = ComidaBuilder.build(comida);
                    if (c!=null){
                        myResto.pedirComida(mesa, c);
                        System.out.println("Pedido Registrado!");
                    }
                    else
                        System.out.println("Comida no disponible.");
                    break;
                case "4":
                    System.out.print("¿Qué mesa desea pagar?: ");
                    mesa = Integer.parseInt(sc.nextLine());
                    myResto.pagarCuenta(mesa);
                    break;
                case "5":
                    myResto.mostrarTotalDiario();
                    break;
                default:
                    flag = true;
            }
            System.out.println("<------------------>");
        }
        sc.close();
    }
    private static void showOptionMenu() {
        System.out.println("Opciones Disponibles:");
        System.out.println("1: Ver Mesas");
        System.out.println("2: Tomar Mesa");
        System.out.println("3: Pedir Comida");
        System.out.println("4: Pagar Cuenta");
        System.out.println("5: Caja Diaria");
        System.out.println("Otro: Salir");
    }
}
