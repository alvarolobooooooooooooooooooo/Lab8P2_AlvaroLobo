
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author agln7
 */
public class AdministrarBarraVidaMascotas extends Thread{
    private JProgressBar pb_vida;
    private boolean vidaHilo;
    private boolean retroceder;
    public AdministrarBarraVidaMascotas(JProgressBar pb_vida) {
        this.pb_vida = pb_vida;
        vidaHilo = true;
        retroceder = true;
        
    }

    public JProgressBar getPb_vida() {
        return pb_vida;
    }

    public void setPb_vida(JProgressBar pb_vida) {
        this.pb_vida = pb_vida;
    }

    public boolean isVidaHilo() {
        return vidaHilo;
    }

    public void setVidaHilo(boolean vidaHilo) {
        this.vidaHilo = vidaHilo;
    }

    public boolean isRetroceder() {
        return retroceder;
    }

    public void setRetroceder(boolean retroceder) {
        this.retroceder = retroceder;
    }

    @Override
    public void run() {
        JOptionPane.showMessageDialog(null, pb_vida.getValue());
        while (vidaHilo) {
            if (retroceder) {
                JOptionPane.showMessageDialog(null, pb_vida.getValue());
            }//FIN IF
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        }
    }
    
}
