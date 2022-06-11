
import java.util.ArrayList;


public class Zona {
    private int id_zona;
    private String nombre;
    private ArrayList items = new ArrayList();
    private int remuneracion;
    private int prob_derrumbe;
    private int prob_atacado;

    public Zona(int id_zona, String nombre, int remuneracion, int prob_derrumbe, int prob_atacado) {
        this.id_zona = id_zona;
        this.nombre = nombre;
        this.remuneracion = remuneracion;
        this.prob_derrumbe = prob_derrumbe;
        this.prob_atacado = prob_atacado;
    }

    public int getId_zona() {
        return id_zona;
    }

    public void setId_zona(int id_zona) {
        this.id_zona = id_zona;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList getItems() {
        return items;
    }

    public void setItems(ArrayList items) {
        this.items = items;
    }

    public int getRemuneracion() {
        return remuneracion;
    }

    public void setRemuneracion(int remuneracion) {
        this.remuneracion = remuneracion;
    }

    public int getProb_derrumbe() {
        return prob_derrumbe;
    }

    public void setProb_derrumbe(int prob_derrumbe) {
        this.prob_derrumbe = prob_derrumbe;
    }

    public int getProb_atacado() {
        return prob_atacado;
    }

    public void setProb_atacado(int prob_atacado) {
        this.prob_atacado = prob_atacado;
    }

    @Override
    public String toString() {
        return "Zona{" + "id_zona=" + id_zona + ", nombre=" + nombre + ", items=" + items + ", remuneracion=" + remuneracion + ", prob_derrumbe=" + prob_derrumbe + ", prob_atacado=" + prob_atacado + '}';
    }
    
}
