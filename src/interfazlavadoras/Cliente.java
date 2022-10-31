package interfazlavadoras;

import java.util.Scanner;

/**
 *
 * @author Juan Orozco
 */
public class Cliente {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int opcion;
        IEstrategia operacion=null;
        do{
            opcion = Menu();
            switch(opcion){
                case 1:{
                    operacion=new EstrategiaEncender();
                    break;}
                case 2:{
                    operacion=new EstrategiaLavar();
                    break;}
                case 3:{
                    operacion=new EstrategiaSecar();
                    break;}
                case 4:{
                    operacion=new EstrategiaApagar();
                    break;}
            }
            if(opcion!=5){
                operacion.algoritmo();
            }
        }while(opcion!=5);
    }
    public static int Menu(){
        int opcion = 0;
        in = new Scanner(System.in);
        do{
            System.out.println("Seleccione una de las siguientes opciones:");
            System.out.println("1. Encender");
            System.out.println("2. Lavar");
            System.out.println("3. Secar");
            System.out.println("4. Apagar");
            System.out.println("5. Salir");
            opcion = in.nextInt();
            if(opcion < 1 || opcion > 5){
                System.out.println("Opcion incorrecta, intente nuevamente");}
        }while(opcion < 1 || opcion > 5);
        return opcion;
    }
}

