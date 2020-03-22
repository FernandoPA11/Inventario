
import java.util.ArrayList;
import java.util.Iterator;

public class Mensajes {

    Teclado teclado;

    public Mensajes() {
        this.teclado = new Teclado();
    }

    public int opcionEntero() {
        int opcion = 0;
        System.out.println("Seleccione la opcion deseada: ");
        opcion = teclado.leerEntero();
        return opcion;
    }

    public void menu() {
        System.out.println("Seleccione la opcion deseada:");
        System.out.println("    1) Agregar articulo al inventario");
        System.out.println("    2) Modificar articulo");
        System.out.println("    3) Eliminar articulo");
        System.out.println("    4) Mostrar articulos");
        System.out.println("    5) Salir");
    }

    public void agregarMsj() {
        System.out.println("Agregando objeto: ");
    }

    public String leerCadena(String cadena) {

        String cadena2 = "";

        if (cadena.equals("Nombre"))
            System.out.println("Introduzca el nombre:");
        else if (cadena.equals("Descripcion"))
            System.out.println("Introduzaca la descripcion del articulo:");
        else if (cadena.equals("Unidad"))
            System.out.println("Introduzaca unidad:");
        else
            System.out.println("Introduzca texto:");

        cadena2 = teclado.leerCadena();
        return cadena2;
    }

    public void leerID() {
        int id = 0;
        System.out.println("Introduzca el ID: ");
        id = teclado.leerEntero();
    }

    public double leerPrecio() {
        double precio = 0;
        System.out.println("Ingrese el precio:");
        precio = teclado.leerDouble();
        return precio;
    }

    public int leerCantidad() {
        int cantidad = 0;
        System.out.println("Ingrese la cantidad de articulos: ");
        cantidad = teclado.leerEntero();
        return cantidad;
    }

    public void updateMsj() {
        System.out.println("Seleccione la opcion deseada: ");
        System.out.println("/t /t 1) Cambiar nombre");
        System.out.println("/t /t 2) Cambiar descripcion");
        System.out.println("/t /t 3) Cambiar cantidad");
        System.out.println("/t /t 4) Cambiar unidad");
        System.out.println("/t /t 5) Cambiar precio");
    }

    public void mostrarObjetos(ArrayList<Objeto> objetos) {
        System.out.println("Los articulos en inventario son:");
        Iterator<Objeto> iteratorO = objetos.iterator();

        while (iteratorO.hasNext()) {
            System.out.println("/t /t" + iteratorO.next());
        }
    }

    public void resultadoOperacion(boolean resultado, String operacion){
        if (resultado){
            System.out.println("\n Resultado Exitoso al "+ operacion + "\n");
        }else{
            System.out.println("\n Resultado Fallido al "+ operacion + "\n");
        }
    }

    public void opcionInvalida() {
        System.out.println("Error: Opcion invalida");
        System.out.println("Seleccione de nuevo");
    }

}