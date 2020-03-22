
import Inventario.Vista.Mensajes;
import java.util.ArrayList;

public class Operaciones{
    
    Mensajes ms;
    Objeto obj;
    ObjetoDAO objDAO;

    public Operaciones() {
        this.ms = new Mensajes();
        this.obj = new Objeto();
    }

    public void ejecutarApp() {
        int opcion = 0;
        int opcion2 = 0;
        do {
            ms.menu();
            opcion = ms.opcionEntero();
            switch (opcion) {
                case 1:
                    ms.agregarMsj();
                    String nombre = ms.leerCadena("Nombre");
                    String desc = ms.leerCadena("Descripcion");
                    int cantidad = ms.leerCantidad();
                    String unidad = ms.leerCadena("Unidad");
                    double precio = ms.leerPrecio();
                    obj = new Objeto(nombre, desc, cantidad, unidad, precio);
                    boolean exito = objDAO.create(obj);
                    ms.resultadoOperacion(exito, "ingresar articulo");
                    break;
                case 2:
                    ms.updateMsj();
                    do {
                        opcion2 = ms.opcionEntero();
                        if (opcion2 < 1 || opcion2 > 5)
                            ms.opcionInvalida();
                    } while (opcion2 < 1 || opcion2 > 5);
                    int id = ms.leerID();
                    boolean exito = objDAO.update(id, opcion2);
                    ms.resultadoOperacion(exito, "modificar articulo");
                    break;
                case 3:
                    int id = ms.leerID();
                    boolean exito = objDAO.delete(id);
                    ms.resultadoOperacion(exito, "borrar articulo");
                    break;
                case 4:
                    ArrayList<Objeto> objetos = this.objDAO.readAll();
                    ms.mostrarObjetos(objetos);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    System.out.println("Hasta luego");
                    break;
                default:
                    ms.opcionInvalida();
                    break;
            } 
        } while (opcion != 5);
    }

}