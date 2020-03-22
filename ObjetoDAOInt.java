
import java.util.ArrayList;

public interface ObjetoDAOInt {

    public boolean create (Objeto obj);
    public ArrayList<Objeto> readAll();
    public Objeto read(int id);
    public boolean update(Objeto obj);
    public boolean delete(int id);
}