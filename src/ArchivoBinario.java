
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;


public class ArchivoBinario {
    File archivo;

    public ArchivoBinario(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "ArchivoBinario{" + "archivo=" + archivo + '}';
    }
    
    public void cargarArchivo() {
        /*try {            
            listaAlumnos = new ArrayList();
            Alumno temp;
            if (archivo.exists()) {
                FileInputStream entrada
                    = new FileInputStream(archivo);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Alumno) objeto.readObject()) != null) {
                        listaAlumnos.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }*/
    }
    
    
    
}
