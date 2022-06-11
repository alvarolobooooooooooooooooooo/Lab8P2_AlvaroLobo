
public class Item {
    private int id;
    private String nombre;
    private boolean alimento;
    private int prob_obtencion;
    private int precio;

    public Item(int id, String nombre, boolean alimento, int prob_obtencion, int precio) {
        this.id = id;
        this.nombre = nombre;
        this.alimento = alimento;
        this.prob_obtencion = prob_obtencion;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isAlimento() {
        return alimento;
    }

    public void setAlimento(boolean alimento) {
        this.alimento = alimento;
    }

    public int getProb_obtencion() {
        return prob_obtencion;
    }

    public void setProb_obtencion(int prob_obtencion) {
        this.prob_obtencion = prob_obtencion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Item{" + "id=" + id + ", nombre=" + nombre + ", alimento=" + alimento + ", prob_obtencion=" + prob_obtencion + ", precio=" + precio + '}';
    }
    
}
