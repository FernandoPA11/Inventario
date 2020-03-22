
import java.util.InputMismatchException;
import java.util.Scanner;

public class Teclado {

    public Teclado(){
        
    }

    public int leerEntero() {
        int entero = 0;
        boolean salir = false;
        Scanner sc = new Scanner(System.in);

        do {
            try {
                entero = sc.nextInt();
                salir = true;
            } catch (InputMismatchException e) {
                System.out.println("Por favor introduce una opcion valida");
            }
        } while (salir);
        return entero;
    }

    public String leerCadena() {
        String cadena = "";
        boolean salir = false;
        Scanner sc = new Scanner(System.in);

        do {
            try {
                cadena = sc.nextLine();
                salir = true;
            } catch (InputMismatchException e) {
                System.out.println("Por favor introduce una opcion valida");
            }
        } while (salir);
        return cadena;
    }

    public double leerDouble() {
        double decimal = 0;
        boolean salir = false;
        Scanner sc = new Scanner(System.in);

        do {
            try {
                decimal = sc.nextDouble();
                salir = true;
            } catch (InputMismatchException e) {
                System.out.println("Por favor introduce una opcion valida");
            }
        } while (salir);
        return decimal;
    }
}