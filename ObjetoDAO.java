
import java.sql.*;
import java.util.ArrayList;

public class ObjetoDAO implements ObjetoDAOInt {

    Mensajes ms = new Mensajes();

    @Override
    public boolean create(Objeto obj) {
        boolean created = false;
        Connection con = null;
        Statement stm = null;
        String sql = "INSERT INTO inventario VALUES( NULL, '" + obj.getNombre() + "', '" + obj.getDescripcion() + "', " + obj.getCantidad()
                      + ", '" + obj.getUnidad() + "', " + obj.getPrecio() + ")";
        ConexionDB cdb = new ConexionDB();

        try {
            con = cdb.conectarMySQL();
            stm = con.createStatement();
            stm.execute(sql);
            created = true;
        } catch (SQLException e) {
            System.out.println("ERROR: No se pudo agregar objeto");
            e.printStackTrace();
        } finally {
            try {
                stm.close();
                con.close();
            } catch (SQLException e2) {
                System.out.println("ERROR: No se pudo cerrar la coneccion");
                e.printStackTrace();
            }
        }
        return created;
    }

    @Override
    public boolean delete(int id) {

        boolean deleted = false;
        Connection con = null;
        Statement stm = null;
        String sql = "DELETE FROM inventario WHERE id=" + id + " ORDER BY id;";
        ConexionDB cdb = new ConexionDB();

        try {
            con = cdb.conectarMySQL();
            stm = con.createStatement();
            stm.execute(sql);
            deleted = true;
        } catch (SQLException e) {
            System.out.println("ERROR: No se pudo borrar articulo");
            e.printStackTrace();
        } finally {
            try {
                stm.close();
                con.close();
            } catch (SQLException e2) {
                System.out.println("ERROR: No se pudo cerrar la coneccion");
                e.printStackTrace();
            }
        }
        return deleted;
    }

    @Override
    public Objeto read(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public ArrayList<Objeto> readAll() {
        
        Connection con = null;
        Statement stm = null;
        ResultSet rs = null;
        String sql = "SELECT * FROM inventario ORDER BY ID;";
        ConexionDB cdb = new ConexionDB();

        ArrayList<Objeto> objetos = new ArrayList<Objeto>();

        try {
            con = cdb.conectarMySQL();
            stm = con.createStatement();
            rs = stm.executeQuery(sql);

            while (rs.next) {
                Objeto obj = new Objeto(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getString(5), rs.getDouble(6);
                objetos.add(obj);
            }

        } catch (SQLException e) {
            System.out.println("ERROR: Problema en metodo ReadAll()");
            e.printStackTrace();
        } finally {

            try {
                stm.close();
                rs.close();
                con.close();
            } catch (SQLException e2) {
                System.out.println("ERROR: No se pudo cerrar la coneccion");
                e2.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public boolean update(int id, int opcion) {

        String cambio = "";
        String decision = "";
        boolean updated = false;
        Connection con = null;
        Statement stm = null;

        switch (opcion) {
            case 1: //cambiar nombre
                cambio = ms.leerCadena("Nombre");
                decision = "Nombre";
            case 2: //cambiar descripcion
                cambio = ms.leerCadena("Descripcion");
                decision = "Descripcion";
            case 3: //cambiar cantidad
                cambio = ms.leerCantidad();
                decision = "Cantidad";
            case 4: //cambiar unidad
                cambio = ms.leerCadena("Unidad");
                decision = "Unidad";
            case 5: //cambiar precio
                cambio = ms.leerPrecio();
                decision = "Precio";
        }
        String sql = "UPDATE inventario SET " + decision + "='" + cambio + "' WHERE id=" + id + ";";
        ConexionDB cdb = new ConexionDB();

        try {
            con = cdb.conectarMySQL();
            stm = con.createStatement();
            stm.executeUpdate(sql);
            updated = true;
        } catch (SQLException e) {
            System.out.println("ERROR: No se pudo borrar articulo");
            e.printStackTrace();
        } finally {
            try {
                stm.close();
                con.close();
            } catch (SQLException e2) {
                System.out.println("ERROR: No se pudo cerrar la coneccion");
                e.printStackTrace();
            }
        }
        
        return updated;
    }

    
}