package servtest;
 
import java.awt.AWTException;
 
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
 
/**
 *
 * @author Esteban Fuentealba
 */
//## Creamos una Clase llamada ScreenShot
public class ScreenShot {
 
    public ScreenShot() {
    }
    public Image get() throws AWTException {
        //## Creamos una instancia a la Clase RObot
        Robot robot = new Robot();
        //## Tomamos una fotografía (Screen Shot) del Escritorio
        BufferedImage bufferedImage = robot.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
        //## Retornamos una Image
        return Toolkit.getDefaultToolkit().createImage(bufferedImage.getSource());
    }
 
}