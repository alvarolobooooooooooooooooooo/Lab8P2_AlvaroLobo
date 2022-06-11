
import java.awt.Color;


public class Mascota {
    private String nombre;
    private int pts_vida;
    private int delay;
    private int costo;
    private Color color;

    public Mascota(String nombre, int pts_vida, int delay, int costo, Color color) {
        this.nombre = nombre;
        this.pts_vida = pts_vida;
        this.delay = delay;
        this.costo = costo;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPts_vida() {
        return pts_vida;
    }

    public void setPts_vida(int pts_vida) {
        this.pts_vida = pts_vida;
    }

    public int getDelay() {
        return delay;
    }

    public void setDelay(int delay) {
        this.delay = delay;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", pts_vida=" + pts_vida + ", delay=" + delay + ", costo=" + costo + ", color=" + color + '}';
    }
    
}
