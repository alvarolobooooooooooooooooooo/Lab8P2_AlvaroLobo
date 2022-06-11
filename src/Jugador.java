
import java.util.ArrayList;


public class Jugador {
    private ArrayList <Item> items = new ArrayList();
    private ArrayList <Mascota> mascotas = new ArrayList();
    private int dinero;
    private int dinero_banco;

    public Jugador(int dinero, int dinero_banco) {
        this.dinero = dinero;
        this.dinero_banco = dinero_banco;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public ArrayList<Mascota> getMascotas() {
        return mascotas;
    }

    public void setMascotas(ArrayList<Mascota> mascotas) {
        this.mascotas = mascotas;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public int getDinero_banco() {
        return dinero_banco;
    }

    public void setDinero_banco(int dinero_banco) {
        this.dinero_banco = dinero_banco;
    }

    @Override
    public String toString() {
        return "Jugador{" + "items=" + items + ", mascotas=" + mascotas + ", dinero=" + dinero + ", dinero_banco=" + dinero_banco + '}';
    }
    
}
