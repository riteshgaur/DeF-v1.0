
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author RiteshGaur (gaur.ritesh@gmail.com)
 */
public class DEF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             try {
            // Set System L&F
        UIManager.setLookAndFeel(
            UIManager.getSystemLookAndFeelClassName());
    } 
    catch (  ClassNotFoundException | IllegalAccessException | InstantiationException | UnsupportedLookAndFeelException exp) {}
        DEFScreen obj = new DEFScreen();
        obj.setVisible(true);
  
    }
}
