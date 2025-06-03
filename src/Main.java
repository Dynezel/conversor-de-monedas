import Servicios.Menu;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        boolean seguirEjecutando = true;
        int eleccion;
        double cantidad;
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();

        while(seguirEjecutando) {
            System.out.println("------------------------------------------------------------");
            System.out.println("      **CONVERTIDOR DE MONEDAS**");
            System.out.println("Bienvenido, que moneda quieres convertir?");
            System.out.println("1) Convertir Dolares a Pesos Argentinos");
            System.out.println("2) Convertir Pesos Argentinos a Dolares");
            System.out.println("3) Convertir Dolares a Reales Brasileños");
            System.out.println("4) Convertir Reales Brasileños a Dolares");
            System.out.println("5) Convertir Dolares a Pesos Colombianos");
            System.out.println("6) Convertir Pesos Colombianos a Dolares");
            System.out.println("7) Convertir Dolares a Pesos Mexicanos");
            System.out.println("8) Convertir Pesos Mexicanos a Dolares");
            System.out.println("9) Convertir Dolares a Bolivares Venezolanos");
            System.out.println("10) Convertir Bolivares Venezolanos a Dolares");
            System.out.println("11) Salir del programa");
            System.out.println("------------------------------------------------------------");
            eleccion = scanner.nextInt();
            switch (eleccion) {
                case (1):
                    System.out.println("Cuantos Dolares deseas convertir a Pesos Argentinos?");
                    cantidad = scanner.nextInt();
                    menu.convertirMoneda("USD","ARS",cantidad);
                    break;
                case (2):
                    System.out.println("Cuantos Pesos Argentinos deseas convertir a Dolares?");
                    cantidad = scanner.nextInt();
                    menu.convertirMoneda("ARS","USD",cantidad);
                    break;
                case (3):
                    System.out.println("Cuantos Dolares deseas convertir a Reales Brasileños?");
                    cantidad = scanner.nextInt();
                    menu.convertirMoneda("USD","BRL" ,cantidad);
                    break;
                case (4):
                    System.out.println("Cuantos Reales Brasileños deseas convertir a Dolares?");
                    cantidad = scanner.nextInt();
                    menu.convertirMoneda("BRL","USD" ,cantidad);
                    break;
                case (5):
                    System.out.println("Cuantos Dolares deseas convertir a Pesos Colombianos?");
                    cantidad = scanner.nextInt();
                    menu.convertirMoneda("USD", "COP", cantidad);
                    break;
                case (6):
                    System.out.println("Cuantos Pesos Colombianos deseas convertir a Dolares?");
                    cantidad = scanner.nextInt();
                    menu.convertirMoneda("COP", "USD", cantidad);
                    break;
                case (7):
                    System.out.println("Cuantos Dolares deseas convertir a Pesos Mexicanos?");
                    cantidad = scanner.nextInt();
                    menu.convertirMoneda("USD", "MXN", cantidad);
                    break;
                case (8):
                    System.out.println("Cuantos Pesos Mexicanos deseas convertir a Dolares?");
                    cantidad = scanner.nextInt();
                    menu.convertirMoneda("MXN", "USD", cantidad);
                    break;
                case (9):
                    System.out.println("Cuantos Dolares deseas convertir a Bolivares Venezolanos?");
                    cantidad = scanner.nextInt();
                    menu.convertirMoneda("USD", "VES", cantidad);
                    break;
                case (10):
                    System.out.println("Cuantos Bolivares Venezolanos deseas convertir a Dolares?");
                    cantidad = scanner.nextInt();
                    menu.convertirMoneda("VES", "USD", cantidad);
                    break;
                case (11):
                    seguirEjecutando = false;
                    break;
                default:
                    System.out.println("Numero o codigo invalido");
                    seguirEjecutando = false;
            }
        }
        System.out.println("    **Fin Del Programa**");
    }
}