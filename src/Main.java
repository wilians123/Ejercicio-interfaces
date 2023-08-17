import java.util.Scanner;

import static java.lang.System.in;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Llamar tipos= new Llamar();
        Scanner sc = new Scanner(in);


            System.out.println("1. Vehiculos terrestres");
            System.out.println("2. Vehiculos acuaticos");
            System.out.println("3. Vehiculos aereos");
        System.out.println("Ingrese el numero de opcion: ");
            int opcion = sc.nextInt();

        switch (opcion){

            case 1:
                System.out.println("LOS SIGUIENTES VEHICULOS SON TERRESTRES");
                System.out.println("Automovil: "+tipos.automovil());
                System.out.println("Motocicleta: "+tipos.motocicleta());
                System.out.println("Camion: "+tipos.camion());
                break;

            case 2:

                System.out.println("LOS SIGUIENTES VEHICULOS SON ACUATICOS");
                System.out.println("Barco: "+tipos.barco());
                System.out.println("Lancha: "+tipos.lancha());
                System.out.println("Velero: "+tipos.velero());
                break;

            case 3:
                System.out.println("LOS SIGUIENTES VEHICULOS SON AEREOS");
                System.out.println("Avioneta: "+tipos.avioneta());
                System.out.println("Avion: "+tipos.avion());
                System.out.println("Helicoptero: "+tipos.helicoptero());
                break;

            default:
                System.out.println("Numero de opcion invalida");
        }


        }
}
